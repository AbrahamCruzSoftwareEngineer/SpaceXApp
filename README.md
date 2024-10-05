https://github.com/user-attachments/assets/f960b816-2ddf-4f4e-9ea2-adf51c4afe2f

App Description:

The SpaceX Launch Explorer is a modern Android application that showcases the latest and historical SpaceX launches, 
offering detailed insights and multimedia integration. Built with cutting-edge technologies and following best practices in Android development, 
this app is designed for both performance and scalability.

Key Features:
Flight Information: Displays flight number, mission name, rocket name, rocket type, launch site, and flight details for each SpaceX launch.
Video Integration: Watch YouTube videos associated with specific launches, seamlessly embedded within the app's UI.
Lazy Loading and Pagination: Efficiently loads flight data from a local database and API, with smooth pagination for a seamless browsing experience.
Room Database: Stores SpaceX launch data locally for offline access, ensuring that users can explore flights without an active internet connection.

Tech Stack & Architecture:
Architecture: The app follows the MVVM (Model-View-ViewModel) architecture, ensuring separation of concerns, easier maintenance, and scalability.
Dependency Injection: Powered by Hilt for efficient and modular dependency management.
Coroutines & LiveData: The app leverages Kotlin coroutines for asynchronous tasks and LiveData for observing UI-related data in a lifecycle-conscious way.
Jetpack Compose: Built with Jetpack Compose, Android's modern declarative UI toolkit, providing a responsive, dynamic, and beautiful user interface.
Retrofit: Retrofit is used for making efficient API calls to fetch SpaceX data from the official SpaceX API.
Room Database: Local data is handled using Room, ensuring persistent storage and efficient retrieval of data.
WebView: YouTube videos are embedded within a WebView, allowing users to watch related mission videos directly inside the app.

Libraries & Dependencies:
Jetpack Compose: Used for building the app's UI in a declarative and reactive manner.
Retrofit: For making network requests to the SpaceX API and parsing the JSON responses.
Hilt: For dependency injection, ensuring easy management of app components.
Room: As the local database solution to store flight information.
Coil: For loading images efficiently from the web.
and more...

