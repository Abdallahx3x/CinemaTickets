package com.example.cinematickets.screens.bookingDetails

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Calendar(){
    LazyRow(modifier = Modifier.fillMaxWidth()
        , contentPadding = PaddingValues(16.dp)
    ){
        items(8){
            Button(onClick = { /*TODO*/ }, modifier = Modifier
                .height(70.dp)
                .padding(horizontal = 4.dp)
                ,
                colors = ButtonDefaults.buttonColors(Color.White),
                shape = RoundedCornerShape(16.dp)
                , border = BorderStroke(1.dp, Color(0x4D000000))
            ) {
                Column( verticalArrangement = Arrangement.SpaceEvenly
                    , horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(text = "14", color = Color.Black, fontSize = 24.sp)
                    Text(text = "Thus", color = Color(0x4D000000), textAlign = TextAlign.Center)
                }


            }
        }

    }


    LazyRow(modifier = Modifier.fillMaxWidth()
        , contentPadding = PaddingValues(horizontal = 16.dp)
    ) {

        items(10){
            Button(onClick = { /*TODO*/ }, modifier = Modifier
                .height(32.dp)
                .width(90.dp)
                .padding(horizontal = 3.dp),
                colors = ButtonDefaults.buttonColors(Color.White)
                , border = BorderStroke(1.dp, Color(0x4D000000))
            ) {
                Text(text = "10:00", modifier = Modifier,
                    textAlign = TextAlign.Center, color = Color.Black
                    , fontSize = 12.sp
                )
            }
        }
    }

}