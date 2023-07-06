package com.example.cinematickets.screens.home

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Title(){
    Text(text = "Fantastic Beasts:The\n secret of Dumbledore ", modifier = Modifier
        .fillMaxWidth()
        .padding(start = 8.dp, bottom = 24.dp,top=16.dp),
        textAlign = TextAlign.Center, fontSize = 24.sp
    )


    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
        Button(onClick = { /*TODO*/ }, modifier = Modifier.height(32.dp),
            colors = ButtonDefaults.buttonColors(Color.White)
            , border = BorderStroke(1.dp, Color(0x4D000000))
        ) {
            Text(text = "Fantasy", modifier = Modifier,
                textAlign = TextAlign.Center, color = Color.Black
                , fontSize = 12.sp
            )
        }
        Spacer(Modifier.size(8.dp))

        Button(onClick = { /*TODO*/ }, modifier = Modifier.height(32.dp),
            colors = ButtonDefaults.buttonColors(Color.White)
            , border = BorderStroke(1.dp, Color(0x4D000000))
        ) {
            Text(text = "Adventure", modifier = Modifier,
                textAlign = TextAlign.Center, color = Color.Black
                , fontSize = 12.sp
            )
        }
    }



}