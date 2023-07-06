package com.example.cinematickets

import android.annotation.SuppressLint
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.cinematickets.screens.bookingDetails.BookingDetailsScreen
import com.example.cinematickets.screens.home.HomeScreen
import com.example.cinematickets.screens.movieDetails.MovieDetailsScreen

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun CinemaApp(){

    Scaffold {
        val navController= rememberNavController()
        NavHost(navController = navController, startDestination = "homeScreen"){
            composable("homeScreen"){ HomeScreen(navController) }
            composable("bookingDetailsScreen"){ BookingDetailsScreen(navController) }
            composable("movieDetailsScreen"){ MovieDetailsScreen(navController) }
        }
    }

}