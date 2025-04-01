package dev.himanshu.imagesearchapp.model.remote.dtos

data class PixabayResponse(
    val hits: List<Hit>,
    val total: Int,
    val totalHits: Int
)