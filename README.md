# 🎬 MovieHub - Android Movie Discovery App

[![Kotlin](https://img.shields.io/badge/Kotlin-1.9.0-blue.svg)](https://kotlinlang.org/)
[![Android](https://img.shields.io/badge/Android-API%2024+-green.svg)](https://developer.android.com/)
[![Jetpack Compose](https://img.shields.io/badge/Jetpack%20Compose-1.4.3-orange.svg)](https://developer.android.com/jetpack/compose)
[![License](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)

A modern Android movie discovery application built with **Jetpack Compose** and **MVVM architecture**. Discover trending movies, TV series, search for your favorite content, and watch trailers - all in one beautiful, intuitive app.

## ✨ Features

### 🏠 Home Screen
- **Trending Content**: Auto-swiping carousel of trending movies and TV shows
- **Special Collections**: Curated movie collections with stunning visuals
- **TV Series Section**: Latest and popular TV series
- **Top Rated**: Highest-rated content across all categories
- **Recommended**: Personalized recommendations based on your preferences
- **Pull-to-refresh**: Smooth refresh functionality

### 🔍 Search & Discovery
- **Real-time Search**: Search across movies, TV shows, and actors
- **Grid Layout**: Beautiful 2-column grid display for search results
- **Infinite Scrolling**: Pagination for seamless browsing
- **Smart Filtering**: Find exactly what you're looking for

### 📱 Media Details
- **Rich Information**: Cast, crew, ratings, genres, and release dates
- **Movie Trailers**: Watch official trailers and videos
- **Similar Content**: Discover related movies and TV shows
- **Beautiful UI**: Dynamic color extraction from movie posters
- **Responsive Design**: Optimized for all screen sizes

### 🎯 Popular & TV Series
- **Dedicated Sections**: Separate tabs for popular movies and TV series
- **Category Filtering**: Browse by different categories (popular, top-rated, etc.)
- **Smooth Navigation**: Bottom navigation with Material Design 3

## 🛠 Technology Stack

### Core Technologies
- **Kotlin**: Primary programming language
- **Jetpack Compose**: Modern UI toolkit
- **Material Design 3**: Latest design system
- **MVVM Architecture**: Clean architecture pattern

### Libraries & Dependencies
- **Dagger Hilt**: Dependency injection
- **Retrofit**: HTTP client for API calls
- **Room Database**: Local data persistence
- **Coil**: Image loading and caching
- **Navigation Compose**: Navigation between screens
- **Coroutines**: Asynchronous programming
- **Timber**: Logging utility
- **YouTube Player**: Video playback

### APIs & Services
- **TMDB API**: Movie and TV show data
- **YouTube API**: Video content integration

## 📱 Screenshots

*[Screenshots will be added here]*

## 🚀 Getting Started

### Prerequisites
- Android Studio Hedgehog or later
- Android SDK API 24+
- Kotlin 1.9.0+
- TMDB API key

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/Sidd2004Shukla/The-Movies-Info.git
   cd The-Movies-Info
   ```

2. **Get TMDB API Key**
   - Visit [The Movie Database](https://www.themoviedb.org/settings/api)
   - Create an account and request an API key
   - Copy your API key

3. **Configure API Key**
   - Open `app/build.gradle`
   - Add your API key to the `buildConfigField`:
   ```gradle
   buildConfigField("String", "api_key", "YOUR_API_KEY_HERE")
   ```

4. **Build and Run**
   ```bash
   ./gradlew build
   ```
   - Open the project in Android Studio
   - Connect your device or start an emulator
   - Click "Run" to install the app

## 🏗 Project Structure

```
app/src/main/java/com/siddapps/moviehub/
├── di/                          # Dependency injection modules
├── main/                        # Main app module
│   ├── data/                    # Data layer
│   │   ├── local/              # Room database
│   │   ├── remote/             # API services
│   │   └── repository/         # Repository implementations
│   ├── domain/                 # Domain layer
│   │   ├── models/             # Data models
│   │   └── repository/         # Repository interfaces
│   └── presentation/           # UI layer
│       ├── home/               # Home screen
│       ├── main/               # Main activity
│       └── popularAndTvSeries/ # Popular/TV screens
├── media_details/              # Media details module
├── search/                     # Search functionality
├── theme/                      # App theming
└── util/                       # Utilities and shared components
```

## 🎨 UI/UX Features

- **Dark/Light Theme**: Automatic theme switching
- **Edge-to-Edge**: Modern edge-to-edge design
- **Shimmer Effects**: Loading animations
- **Pull-to-Refresh**: Smooth refresh gestures
- **Responsive Layout**: Adapts to different screen sizes
- **Material You**: Dynamic color theming

## 🔧 Architecture

The app follows **Clean Architecture** principles with **MVVM** pattern:

- **Presentation Layer**: Jetpack Compose UI components
- **Domain Layer**: Business logic and use cases
- **Data Layer**: Repository pattern with local and remote data sources

## 📊 Performance Optimizations

- **Lazy Loading**: Efficient list rendering
- **Image Caching**: Coil for optimized image loading
- **Pagination**: Infinite scrolling for large datasets
- **Memory Management**: Proper lifecycle handling

## 🤝 Contributing

Contributions are welcome! Please feel free to submit a Pull Request.

1. Fork the project
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 👨‍💻 Developer

**Siddharth Shukla**
- GitHub: [@Sidd2004Shukla](https://github.com/Sidd2004Shukla)
- LinkedIn: [Siddharth Shukla](https://www.linkedin.com/in/siddharth-shukla-4a2a0b292)

## 🙏 Acknowledgments

- [The Movie Database (TMDB)](https://www.themoviedb.org/) for providing the API
- [Jetpack Compose](https://developer.android.com/jetpack/compose) team for the amazing UI toolkit
- [Material Design](https://material.io/) for design guidelines

---

⭐ **Star this repository if you found it helpful!**

