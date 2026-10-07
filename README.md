# Tasks 🚀

![Kotlin](https://img.shields.io/badge/Kotlin-2.2.10-7F52FF?logo=kotlin\&logoColor=white)
![Jetpack Compose](https://img.shields.io/badge/Jetpack%20Compose-Material%203-4285F4?logo=android\&logoColor=white)
![Min SDK](https://img.shields.io/badge/Min%20SDK-26%20\(Android%208.0\)-3DDC84?logo=android\&logoColor=white)
![License](https://img.shields.io/badge/License-MIT-yellow.svg)

**Tasks** is a modern Android productivity platform built with **Kotlin, Jetpack Compose, and Material 3**.

It goes beyond basic task management with categories, search and filtering, focus sessions, reminders, personalization, dynamic theming, and persistent offline data — all designed around a clean and focused user experience.

> **From a simple To-Do app to a complete productivity experience.**

---

## 📱 Screenshots

<table>
<tr>
<td><img src="Screenshots/Home.png" alt="Tasks Home" /></td>
<td><img src="Screenshots/Focus.png" alt="Focus Session" /></td>
<td><img src="Screenshots/Categories.png" alt="Categories" /></td>
<td><img src="Screenshots/Profile.png" alt="Profile" /></td>
</tr>
</table>

<table>
<tr>
<td><img src="Screenshots/Settings.png" alt="Settings" /></td>
<td><img src="Screenshots/Add.png" alt="Add Task" /></td>
<td><img src="Screenshots/Details.png" alt="Task Details" /></td>
</tr>
</table>

---

## ✨ Features

### 📋 Task Management

* Create, edit, complete, and delete tasks
* Undo deleted tasks
* Task validation with ViewModel-level safeguards
* Organize tasks with categories

### 🔎 Search & Organization

* Case-insensitive search across titles and descriptions
* Combine search with category filters
* Create and manage custom categories
* Safely move tasks when categories are deleted

### ⏱️ Focus Sessions

* Pomodoro-style focus timer
* Presets: **15, 25, 45, and 60 minutes**
* Custom sessions from **1–120 minutes**
* Daily focus-session tracking
* Completion feedback and celebration

### 👤 Personalization

* Custom display name and motivational bio
* Real-time productivity statistics
* All-time and daily task statistics
* Daily focus-session statistics

### 🎨 Theming & UI

* System Default and Light themes
* Custom **Deep Sea** dark theme
* Theme preferences persist across app restarts
* Material 3 components
* Custom animations and transitions
* Floating bottom navigation with center task-action FAB
* Edge-to-edge UI and splash screen

### 🔔 Reminders

* Persisted Smart Reminders preference
* Notification scheduling planned for a future release

### 💾 Local & Offline Data

* Room database for tasks and categories
* DataStore Preferences for user settings
* Persistent data across app restarts
* Daily focus-session rollover

---

## 🛠️ Tech Stack

| Area                     | Technology                        |
| ------------------------ | --------------------------------- |
| **Language**             | Kotlin 2.2.10                     |
| **UI**                   | Jetpack Compose + Material 3      |
| **Architecture**         | MVVM + Repository Pattern         |
| **State**                | ViewModel + StateFlow + Flow      |
| **Navigation**           | Navigation Compose                |
| **Database**             | Room                              |
| **Preferences**          | DataStore Preferences             |
| **Async**                | Kotlin Coroutines + Flow          |
| **Dependency Injection** | Manual AppContainer               |
| **Testing**              | JUnit 4 + kotlinx-coroutines-test |
| **Minimum SDK**          | Android 8.0 (API 26)              |
| **Build**                | Gradle + Android Gradle Plugin    |

### Core Android Technologies

`Kotlin` · `Jetpack Compose` · `Material 3` · `Room` · `DataStore` · `Navigation Compose` · `ViewModel` · `StateFlow` · `Coroutines` · `JUnit`

---

## 🏗️ Architecture

Tasks follows **MVVM**, the **Repository Pattern**, and **unidirectional data flow**.

```text
┌──────────────────────────────┐
│        Compose UI            │
│  Screens · Components · UI   │
└──────────────┬───────────────┘
               │ UI Events
               ▼
┌──────────────────────────────┐
│         ViewModels           │
│     StateFlow · UI State     │
└──────────────┬───────────────┘
               │
               ▼
┌──────────────────────────────┐
│         Repositories         │
│  ToDoRepository              │
│  PreferenceRepository        │
└──────────────┬───────────────┘
               │
       ┌───────┴────────┐
       ▼                ▼
┌─────────────┐  ┌───────────────┐
│    Room     │  │   DataStore   │
│ Tasks +     │  │ Preferences   │
│ Categories  │  │ & Settings    │
└─────────────┘  └───────────────┘
```

### Architecture Highlights

* **Presentation:** Compose screens observe UI state from ViewModels.
* **State:** `StateFlow`, `Flow`, and lifecycle-aware state collection.
* **Data access:** Repositories abstract Room and DataStore operations.
* **Persistence:** Room handles structured local data while DataStore handles preferences.
* **Navigation:** Centralized Navigation Compose flow within a single activity.
* **Testing:** Business logic and ViewModel behavior are covered with JVM unit tests.

---

## 📂 Project Structure

```text
app/
├── src/main/java/com/example/todovsn/
│   ├── data/
│   │   ├── ToDoItem.kt
│   │   ├── Category.kt
│   │   ├── ToDoDao.kt
│   │   ├── CategoryDao.kt
│   │   ├── ToDoDatabase.kt
│   │   ├── ToDoRepository.kt
│   │   ├── OfflineToDoRepository.kt
│   │   ├── AppContainer.kt
│   │   └── preference/
│   │
│   ├── ui/
│   │   ├── home/
│   │   ├── screens/
│   │   ├── components/
│   │   ├── navigation/
│   │   ├── theme/
│   │   └── AppViewModelProvider.kt
│   │
│   ├── ToDoApp.kt
│   ├── MainActivity.kt
│   └── ToDoApplication.kt
│
└── src/test/
    └── java/com/example/todovsn/
```

---

## 🧪 Testing

Tasks currently includes **38 JVM unit tests across 7 test classes**.

Run the test suite with:

```bash
./gradlew :app:testDebugUnitTest
```

| Test                   | Coverage                                    |
| ---------------------- | ------------------------------------------- |
| `ToDoValidationTest`   | Task title validation and trimming          |
| `ToDoMappingTest`      | Task model ↔ database model mapping         |
| `FocusUiStateTest`     | Timer formatting and progress calculations  |
| `CategoryFilterTest`   | Search and category filtering               |
| `PreferencesLogicTest` | Daily focus rollover and name normalization |
| `DateConvertersTest`   | Room date conversion and null handling      |
| `HomeViewModelTest`    | Delete, undo, and completion behavior       |

---

## 🚀 Getting Started

### Requirements

* **Android Studio** Ladybug or newer
* JDK compatible with the project's Android Gradle Plugin
* Android device or emulator running **Android 8.0 / API 26+**

### Clone

```bash
git clone https://github.com/SamratVsn/Todovsn.git
cd Todovsn
```

### Open

Open the project in Android Studio and allow Gradle to sync.

### Build

```bash
./gradlew assembleDebug
```

### Run Tests

```bash
./gradlew :app:testDebugUnitTest
```

Then run the app on a connected device or emulator from Android Studio.

---

## 🗺️ Roadmap

Planned improvements include:

* 🔔 Reminder notification scheduling
* ☁️ Firebase cloud synchronization
* 🏷️ Custom task tags
* 📱 Interactive home-screen widgets
* 📊 Detailed productivity analytics
* 🔄 Improved category operations and data integrity

---

## 🤝 Contributing

Contributions, ideas, and improvements are welcome.

1. Fork the repository.
2. Create a feature branch:

```bash
git checkout -b feature/my-change
```

3. Make your changes.
4. Add or update tests where appropriate.
5. Run the test suite:

```bash
./gradlew :app:testDebugUnitTest
```

6. Open a pull request with a clear description of your changes.

---

## 👨‍💻 Author

**Samrat Parajuli**

Android Developer focused on **Kotlin, Jetpack Compose, and modern Android development**.

* GitHub: [@SamratVsn](https://github.com/SamratVsn)
* Portfolio: [samratparajuli0.com.np](https://www.samratparajuli0.com.np/)
* LinkedIn: [Samrat Parajuli](https://linkedin.com/in/samratvsn)

---

## 📄 License

This project is licensed under the **MIT License**. See [`LICENSE`](LICENSE) for details.

---

<div align="center">

**Built with Kotlin & Jetpack Compose ❤️**

</div>
