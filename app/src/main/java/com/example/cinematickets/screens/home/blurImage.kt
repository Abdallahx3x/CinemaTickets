package com.example.cinematickets.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.scale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.cinematickets.R

@Composable
fun BlurImage(image:Int){
    Box(
        Modifier
            .fillMaxSize()
            .blur(20.dp)) {
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .height(170.dp)
                .scale(scaleX = 5f, scaleY = 3f)
                .blur(25.dp)
            ,
            alignment = Alignment.TopCenter,
            painter = painterResource(id = image),
            contentDescription = null
        )
    }
}