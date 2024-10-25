package dev.dna.weatherapp

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dev.dna.weatherapp.ui.forecast.ForecastScreen
import dev.dna.weatherapp.ui.home.HomeScreen
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        val navController = rememberNavController()
        NavHost(navController = navController, startDestination = "home") {
            composable("home") {
                HomeScreen(navController)
            }
            composable("forecast") {
                ForecastScreen(navController)
            }
        }
    }
}