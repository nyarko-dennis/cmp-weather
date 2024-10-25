package dev.dna.weatherapp.data.models

import kotlinx.serialization.Serializable

@Serializable
data class Weather(
    val description: String?,
    val icon: String?,
    val id: Int?,
    val main: String?
)