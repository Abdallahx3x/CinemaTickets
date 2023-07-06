package com.example.cinematickets.screens.movieDetails

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.cinematickets.R

@Composable
fun Actors(){
    LazyRow(modifier = Modifier.fillMaxWidth()
        , contentPadding = PaddingValues(16.dp)
    ){
        items(8){
            Image(painter = painterResource(id = R.drawable.john)
                , contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .padding(horizontal = 4.dp)
                    .size(64.dp)
                    .clip(CircleShape)
            )
        }

    }
}