package dev.himanshu.imagesearchapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dev.himanshu.imagesearchapp.model.remote.ImageRepository
import dev.himanshu.imagesearchapp.model.remote.dtos.Hit
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.debounce
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class ImageViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(UiState())
    val uiState = _uiState.asStateFlow()

    private val _query = MutableStateFlow("")

    fun updateQuery(query:String){
        _query.update { query }
    }

    init {
        viewModelScope.launch {
            _query
                .filter { it.isNotEmpty() }
                .distinctUntilChanged()
                .debounce(500)
                .collectLatest { query-> getImages(query) }
        }

    }

    private val repository:ImageRepository by lazy {
        ImageRepository()
    }

    fun getImages(query:String) = viewModelScope.launch{
        _uiState.update { UiState(isLoading = true) }
        val result = repository.getImages(query)
        if(result.isSuccess){
            _uiState.update { UiState(data = result.getOrThrow()) }
        }else{
            _uiState.update { UiState(error = result.exceptionOrNull()?.message.toString()) }
        }
    }

}

data class UiState(
    val isLoading: Boolean = false,
    val error: String = "",
    val data: List<Hit>? = null
)