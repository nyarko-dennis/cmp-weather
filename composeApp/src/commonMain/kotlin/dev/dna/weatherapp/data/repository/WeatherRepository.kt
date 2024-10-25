package dev.dna.weatherapp.data.repository

import dev.dna.weatherapp.data.remote.ApiService
import dev.icerock.moko.geo.LatLng

class WeatherRepository {

    private val apiService = ApiService()

    suspend fun fetchWeather(location: LatLng) = apiService.getWeather(location)
    suspend fun fetchForecast(location: LatLng) = apiService.getForecast(location)
}