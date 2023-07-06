package com.example.cinematickets.screens.movieDetails

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun RateDetails(){
    Row(modifier = Modifier.fillMaxWidth().padding(top = 16.dp)
        , horizontalArrangement = Arrangement.SpaceEvenly) {
        Column() {
            Text(text = "6.8/10", modifier = Modifier
                .padding(bottom = 4.dp),
                color= Color(0xAD000000),
                textAlign = TextAlign.Center, fontSize = 16.sp
            )
            Text(text = "IMDb", modifier = Modifier.align(Alignment.CenterHorizontally),
                color= Color(0xAD000000),
                textAlign = TextAlign.Center, fontSize = 16.sp
            )
        }
        Column() {
            Text(text = "63%", modifier = Modifier.align(Alignment.CenterHorizontally)
                .padding(bottom = 4.dp),
                color= Color(0xAD000000),
                textAlign = TextAlign.Center, fontSize = 16.sp
            )
            Text(text = "Rotten Tomatoes",
                color= Color(0xAD000000),
                textAlign = TextAlign.Center, fontSize = 16.sp
            )
        }

        Column() {
            Text(text = "4/10", modifier = Modifier
                .padding(bottom = 4.dp),
                color= Color(0xAD000000),
                textAlign = TextAlign.Center, fontSize = 16.sp
            )
            Text(text = "IGN",
                modifier = Modifier.align(Alignment.CenterHorizontally),
                color= Color(0xAD000000),
                textAlign = TextAlign.Center, fontSize = 16.sp
            )
        }

    }

}