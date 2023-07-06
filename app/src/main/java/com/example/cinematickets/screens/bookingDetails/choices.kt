package com.example.cinematickets.screens.bookingDetails

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Choices(){
    Row(Modifier.fillMaxWidth().padding(top = 42.dp),horizontalArrangement = Arrangement.SpaceEvenly)
    {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .width(14.dp)
                    .height(14.dp)
                    .clip(CircleShape)
                    .background(Color(0xCBFFFFFF))
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = "Available",
                color = Color(0x9FFFFFFF)
            )

        }

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .width(14.dp)
                    .height(14.dp)
                    .clip(CircleShape)
                    .background(Color(0x61FFFFFF))
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = "Taken",
                color = Color(0x9FFFFFFF)
            )
        }


        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .width(14.dp)
                    .height(14.dp)
                    .clip(CircleShape)
                    .background(Color(0xFFFF5522))
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = "Selected",
                color = Color(0x9FFFFFFF)
            )

        }
    }

}