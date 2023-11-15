package com.example.weatherapp.fragments

data class DailyItems(
    val city: String,
    val country: String,
    val condition: String,
    val imageUrl: String,
    val currentTemp: String,
    val maxTemp: String,
    val minTemp: String,
    val hours: String
)
