package com.example.cinematickets.screens.movieDetails

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Description(){
    Text(text = "Professor Albus Dumbledore " +
            "(Jude Law) knows the powerful Dark wizard " +
            "Gellert Grindelwald (Mads Mikkelsen) is moving to" +
            " seize control of the wizarding world. Unable to stop him alone, " +
            "he entrusts..."
        , modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
            .padding(vertical = 8.dp),
        textAlign = TextAlign.Center, fontSize = 16.sp
        , maxLines = 3

    )
}