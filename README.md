# Android Interactive UI Application

## Description

This project is a simple Android application developed in Android Studio using Java and XML. It demonstrates the use of Android user interface components, including text views, buttons, checkboxes, radio buttons, and a Floating Action Button (FAB).

The interface is built using `ConstraintLayout`, which allows the components to be positioned relative to one another and to the screen.

## Features

* **TextViews:** Display headings or other text defined in the application's string resources.
* **RadioButtons:** Allow the user to select one option from a group.
* **CheckBox:** Allows the user to select or deselect an option.
* **Button:** Calls the `showSnackbar()` method when clicked.
* **Floating Action Button:** Calls the `showToast()` method when clicked.

## Technologies Used

* **Programming language:** Java
* **Development environment:** Android Studio
* **Layout language:** XML
* **Layout system:** AndroidX ConstraintLayout
* **UI component library:** Google Material Components

## Project Structure

```text
app/
└── src/
    └── main/
        ├── java/
        │   └── [package]/
        │       └── MainActivity.java
        ├── res/
        │   ├── layout/
        │   │   └── activity_main.xml
        │   └── values/
        │       └── strings.xml
        └── AndroidManifest.xml
```

## User Interface Components

| Component            | ID                     | Purpose                        |
| -------------------- | ---------------------- | ------------------------------ |
| TextView             | `textView`             | Displays the first heading     |
| TextView             | `textView2`            | Displays the second heading    |
| Button               | `button`               | Calls `showSnackbar()`         |
| CheckBox             | `checkBox`             | Allows an option to be checked |
| RadioButton          | `radioButton4`         | First selection option         |
| RadioButton          | `radioButton3`         | Second selection option        |
| FloatingActionButton | `floatingActionButton` | Calls `showToast()`            |

## How It Works

1. The application displays the interface defined in `activity_main.xml`.
2. The user can interact with the checkbox and radio buttons.
3. Pressing the main button invokes the `showSnackbar()` method.
4. Pressing the Floating Action Button invokes the `showToast()` method.

The Java methods must be implemented in `MainActivity.java` for both button actions to work correctly.

## How to Run

1. Open the project in Android Studio.
2. Allow Gradle to sync and download the required dependencies.
3. Connect an Android device or start an emulator.
4. Click **Run** to build and launch the application.

## Learning Objectives

* Creating Android layouts using XML.
* Positioning elements with `ConstraintLayout`.
* Using buttons and selection controls.
* Connecting XML event handlers to Java methods.
* Working with Android Material Design components.

## Notes

* Text displayed in the interface is defined through string resources in `res/values/strings.xml`.
* The `showSnackbar()` and `showToast()` methods must have the correct implementation in `MainActivity.java`.
* The project requires the appropriate AndroidX ConstraintLayout and Material Components dependencies.

## Author

Created as a learning project for practicing Android application development with Java and XML.
