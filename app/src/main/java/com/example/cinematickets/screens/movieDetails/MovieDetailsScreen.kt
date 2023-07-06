package com.example.cinematickets.screens.movieDetails

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.cinematickets.R

@Composable
fun MovieDetailsScreen(navController: NavController){
    MovieDetailsContent{
        navController.navigate("bookingDetailsScreen")}
}

@Composable
fun MovieDetailsContent(onClickBooking:()->Unit){
    Box(Modifier.fillMaxSize()) {
        Box() {
            Image(painter = painterResource(id = R.drawable.secret1_1 ),
                contentDescription =null, modifier = Modifier.fillMaxSize(), alignment = Alignment.TopCenter )
            Box(modifier = Modifier
                .align(Alignment.TopCenter)
                .offset(y = 170.dp)
                .clip(CircleShape)

                .background(Color(0xFFFF5522))
            ) {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(painterResource(id = R.drawable.iconmoon_video),
                        contentDescription ="null" ,
                        tint = Color.White)
                }
            }

            Box(modifier = Modifier
                .align(Alignment.TopStart)
                .padding(start = 16.dp, top = 32.dp)
                .clip(CircleShape)

                .background(Color(0xC15D7075))
            ) {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(painterResource(id = R.drawable.iconmoon_close),
                        contentDescription ="null" ,
                        tint = Color.White,
                    )
                }
            }

            Box(modifier = Modifier
                .align(Alignment.TopEnd)
                .padding(end = 16.dp, top = 42.dp)
                .width(110.dp)
                .height(35.dp)
                .clip(RoundedCornerShape(18.dp))
                .background(Color(0xC15D7075))
            ) {
                IconButton(onClick = { /*TODO*/ },modifier = Modifier.fillMaxWidth()) {
                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 8.dp)) {
                        Icon(painterResource(id = R.drawable.iconmonn_time),
                            contentDescription ="null" ,
                            modifier = Modifier.padding(start = 4.dp),
                            tint = Color.White
                        )
                        Spacer(modifier = Modifier.size(8.dp))
                        Text(text = "2h 33m", textAlign = TextAlign.Center
                            , color = Color.White, modifier = Modifier.align(Alignment.CenterVertically))
                    }

                }

            }
        }

        Box(modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(topStart = 24.dp, topEnd = 24.dp))
            .height(460.dp)
            .align(Alignment.BottomCenter)
            .background(Color.White)
        ){

            Column(modifier = Modifier.fillMaxSize()) {

                RateDetails()
                Title()
                Actors()
                Description()

                Spacer(modifier = Modifier.weight(1f))

                Box(modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(bottom = 16.dp, end = 16.dp)
                    .clip(RoundedCornerShape(24.dp))
                    .width(150.dp)
                    .height(50.dp)
                    .background(Color(0xFFFF5522)), contentAlignment = Alignment.Center
                ) {
                    IconButton(onClick = { onClickBooking() },modifier = Modifier.fillMaxWidth()) {
                        Row(modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceEvenly) {
                            Icon(painterResource(id = R.drawable.iconmoon_solar_card_outline),
                                contentDescription ="null" ,
                                modifier = Modifier,
                                tint = Color.White,
                            )
                            Text(text = "Booking", fontSize = 18.sp,
                                color = Color.White
                            )
                        }

                    }

                }


            }


        }
    }

}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewMovieDetailsScreen(){
    MovieDetailsContent{}
}