https://github.com/user-attachments/assets/f960b816-2ddf-4f4e-9ea2-adf51c4afe2f

<h1>SpaceX Launch App</h1>

<p>Welcome to the <strong>SpaceX Launch App</strong> for exploring the latest SpaceX flight missions! Built with modern Android development practices, this app provides detailed information on various SpaceX launches, including mission details, rocket information, and embedded videos for each flight.</p>

<h2>Key Features</h2>
<ul>
    <li><strong>Flight Information:</strong> Displays flight number, mission name, rocket name, rocket type, launch site, and flight details for each SpaceX launch.</li>
    <li><strong>Video Integration:</strong> Watch YouTube videos associated with specific launches, seamlessly embedded within the app's UI.</li>
    <li><strong>Lazy Loading and Pagination:</strong> Efficiently loads flight data from a local database and API, with smooth pagination for a seamless browsing experience.</li>
    <li><strong>Room Database:</strong> Stores SpaceX launch data locally for offline access, ensuring that users can explore flights without an active internet connection.</li>
</ul>

<h2>Tech Stack & Architecture</h2>
<ul>
    <li><strong>MVVM Architecture:</strong> Follows the <em>Model-View-ViewModel (MVVM)</em> pattern for clean separation of concerns and scalability.</li>
    <li><strong>Dependency Injection:</strong> Powered by <em>Hilt</em> for efficient and modular dependency management.</li>
    <li><strong>Coroutines & LiveData:</strong> Uses Kotlin <em>coroutines</em> for asynchronous tasks and <em>LiveData</em> for observing UI-related data.</li>
    <li><strong>Jetpack Compose:</strong> Built with <em>Jetpack Compose</em>, Android's modern declarative UI toolkit, for responsive and dynamic UIs.</li>
    <li><strong>Retrofit:</strong> Makes efficient API calls to fetch SpaceX data using <em>Retrofit</em>.</li>
    <li><strong>Room Database:</strong> Handles local data persistence using <em>Room</em> for storing and retrieving flight information.</li>
    <li><strong>WebView:</strong> Embeds YouTube videos within the app using <em>WebView</em>.</li>
</ul>

<h2>Libraries & Dependencies</h2>
<ul>
    <li><strong>Jetpack Compose</strong>: Declarative UI</li>
    <li><strong>Retrofit</strong>: API calls</li>
    <li><strong>Hilt</strong>: Dependency injection</li>
    <li><strong>Room</strong>: Local database</li>
    <li><strong>Coil</strong>: Image loading</li>
    <li><strong>Mockito</strong>: Unit testing</li>
    <li><strong>Coroutines</strong>: Asynchronous programming</li>
  <li><strong>And more...</strong></li>
</ul>

