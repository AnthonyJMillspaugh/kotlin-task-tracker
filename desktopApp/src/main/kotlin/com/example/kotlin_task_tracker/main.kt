package com.example.kotlin_task_tracker

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "kotlin-task-tracker",
    ) {
        App()
    }
}