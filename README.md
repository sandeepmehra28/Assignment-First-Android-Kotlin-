# Assignment-First-Android-Kotlin

> This is my first Android assignment using Kotlin — a learning project to solidify fundamentals.

---

## 🧩 Overview

This project is built to practice core Android development concepts.  
It demonstrates how to structure a simple Android app using activities, layouts, and navigation between screens.

**Key goals:**
- Get comfortable with Kotlin in Android context  
- Understand Activities, Intents, and layout XMLs  
- Set up a minimal, working Android app from scratch  

---

## 📐 Tech Stack & Tools

| Layer | Technology / Tool |
|-------|-------------------|
| Language | Kotlin |
| IDE | Android Studio |
| Build system | Gradle (Kotlin DSL) |
| Android SDK | (Specify version used, e.g. API 30 / 31 etc.) |
| UI | XML Layouts, standard Android widgets |

---

## 📁 Project Structure

Assignment-First-Android-Kotlin/
├── app/
│ ├── src/
│ │ ├── main/
│ │ │ ├── java/ ← Kotlin source files (activities, logic)
│ │ │ ├── res/ ← Resources (layouts, drawables, values)
│ │ │ └── AndroidManifest.xml
├── gradle/ ← Gradle wrapper files
├── build.gradle.kts ← Project-level build script (Kotlin DSL)
├── settings.gradle.kts ← Settings for Gradle modules
├── gradlew / gradlew.bat ← Gradle wrapper executables
├── gradle.properties ← Project-wide properties
└── .gitignore ← Files/folders to ignore in Git


A few notes:
- Your Kotlin code lies in **app/src/main/java/** (or equivalent package).  
- Layouts and UI resources are under **app/src/main/res/**.  
- The `AndroidManifest.xml` defines the app’s entry point and permissions.

---

## 🚀 Setup & Run Instructions

Follow these steps to run this project:

1. **Clone the repo**
   ```bash
   git clone https://github.com/sandeepmehra28/Assignment-First-Android-Kotlin-.git

2.Open in Android Studio

Use “Open” or “Import project” and select the root folder.

3.Sync Gradle

Android Studio should prompt you; if not, click “Sync Project with Gradle Files”.

4.Set up emulator or connect device

Use an Android emulator or plug in a physical Android device (USB + developer mode).

5.Build & Run

Use Run > Run 'app' or press the “play” button.

The app should launch on the chosen device.

# App Screenshots

![Home Screen]([android_app_dev_ui.png](https://github.com/sandeepmehra28/Assignment-First-Android-Kotlin-/blob/d4559e2167cd8045d628998c727c9ddcbb7ca760/Screenshot%202025-09-25%20231850.png))
![Development Screen]([development_activity_ui.png](https://github.com/sandeepmehra28/Assignment-First-Android-Kotlin-/blob/d4559e2167cd8045d628998c727c9ddcbb7ca760/Screenshot%202025-09-25%20231912.png))
![Android App Dev Screen]([android_app_dev_ui.png](https://github.com/sandeepmehra28/Assignment-First-Android-Kotlin-/blob/d4559e2167cd8045d628998c727c9ddcbb7ca760/Screenshot%202025-09-25%20231932.png))
![Web Dev Screen]([web_dev_ui.png](https://github.com/sandeepmehra28/Assignment-First-Android-Kotlin-/blob/d4559e2167cd8045d628998c727c9ddcbb7ca760/Screenshot%202025-09-25%20231952.png))
![IOS App Screen]([ios_app_dev_ui.png](https://github.com/sandeepmehra28/Assignment-First-Android-Kotlin-/blob/d4559e2167cd8045d628998c727c9ddcbb7ca760/Screenshot%202025-09-25%20232009.png))
![Machine Learning Screen]([machine_learning_ui.png](https://github.com/sandeepmehra28/Assignment-First-Android-Kotlin-/blob/d4559e2167cd8045d628998c727c9ddcbb7ca760/Screenshot%202025-09-25%20232020.png))

✅Features / What Works

1.Basic UI design in XML

2.Navigation between multiple screens (Activities)

3.Using Intents to pass data (if applicable)

4.Simple but correct app lifecycle handling

5.Organized folder and package structure

🔮 Future Enhancements (Possible Next Steps)

1.Use Fragments and Navigation Component instead of multiple activities

2.Introduce ViewModel + LiveData / StateFlow for better logic-UI separation

3.Add data persistence (e.g., Room, SharedPreferences)

4.Clean up UI using Material Design components

5.Add tests (unit tests / instrumentation tests)

6.Integrate network calls or an API (if relevant)

🧠Challenges & Learnings

You can include a short section here (optional) to reflect on what you struggled with or what you learned. E.g.:

“I found managing activity lifecycles tricky at first; passing data via Intents helped me see how screens communicate. Also, layout inflation in Kotlin was unfamiliar.”

📜 License

This project is open for learning and reference. Use at your own risk.
You can include a license file (e.g., MIT, Apache 2.0) if you want to formalize reuse.

🛡️ Acknowledgments

-(Optional) Any tutorials, blog posts, or references you followed

-Your own notes or inspiration
