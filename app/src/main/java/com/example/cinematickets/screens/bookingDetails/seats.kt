package com.example.cinematickets.screens.bookingDetails

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.cinematickets.R

@Composable
fun Seats(){
    Row(
        Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
        , Arrangement.SpaceBetween) {
        LazyColumn(){
            items(5) {
                Image(
                    painter = painterResource(id = R.drawable.full_seat)
                    , contentDescription =null,
                    modifier= Modifier
                        .padding(vertical = 12.dp)
                        .rotate(20f)
                        .background(Color.Black))
            }
        }

        LazyColumn(modifier = Modifier.padding(top = 16.dp)){
            items(5) {
                Image(
                    painter = painterResource(id = R.drawable.full_seat)
                    , contentDescription =null,
                    modifier= Modifier
                        .padding(vertical = 12.dp)
                        .background(Color.Black))
            }
        }
        LazyColumn(){
            items(5) {
                Image(
                    painter = painterResource(id = R.drawable.full_seat)
                    , contentDescription =null,
                    modifier= Modifier
                        .padding(vertical = 12.dp)
                        .rotate(-20f)
                        .background(Color.Black))
            }
        }

    }
}