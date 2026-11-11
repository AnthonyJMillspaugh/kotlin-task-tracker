package com.example.kotlin_task_tracker

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform