# Image Search App

## 📌 Overview
This is an **Image Search App** built using **MVVM Architecture** in Android. The app fetches images from the [Pixabay API](https://pixabay.com/api/docs/) and displays them in a modern UI using **Jetpack Compose**. It follows clean architecture principles, ensuring maintainability and scalability.

## 🎥 Video Tutorial
I have created a **detailed video tutorial** explaining **MVVM Architecture in Android** using this app. Watch it here: [YouTube Link](#) *(Replace with actual link)*

## ✨ Features
- Search images using the **Pixabay API**
- **MVVM Architecture** for clean code structure
- **Jetpack Compose** for modern UI development
- **Retrofit** for network requests
- **Coroutines & LiveData** for async operations
- **Coil** for image loading

## 🏗️ Tech Stack
- **Language:** Kotlin
- **Architecture:** MVVM (Model-View-ViewModel)
- **UI Framework:** Jetpack Compose
- **Networking:** Retrofit
- **Concurrency:** Coroutines, FLow
- **Image Loading:** Coil

## 🚀 Getting Started
### Prerequisites
- Android Studio **Arctic Fox or later**
- Minimum API Level **23 (Android 6.0)**
- Internet connection for API calls

### Installation
1. Clone the repository:
   ```sh
   git clone https://github.com/yourusername/ImageSearchApp.git
   ```
2. Open in **Android Studio**
3. Add your **Pixabay API Key** in `local.properties`:
   ```properties
   PIXABAY_API_KEY=your_api_key_here
   ```
4. Sync Gradle and run the app

## 📂 Project Structure
```
app/
│── data/
│   ├── api/        # Retrofit API service
│   ├── model/      # Data models
│   ├── repository/ # Data handling
│── ui/
│   ├── components/  # Jetpack Compose UI Components
│   ├── screens/     # Screens using Compose
│   ├── viewmodel/   # ViewModels
│── utils/           # Utility classes
```

## 📝 API Usage
- Sign up at [Pixabay](https://pixabay.com/api/docs/) and get an **API Key**
- Base URL: `https://pixabay.com/api/`
- Example API Call:
  ```sh
  https://pixabay.com/api/?key=YOUR_API_KEY&q=flowers&image_type=photo
  ```

## 📷 Screenshots
![Home Screen](https://via.placeholder.com/400x800.png?text=Home+Screen)

## 🤝 Contribution
Feel free to open issues or submit PRs to improve the project.

## 📜 License
This project is licensed under the **MIT License**.

---
🚀 Happy Coding! 😊

