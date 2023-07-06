package com.example.cinematickets.screens.bookingDetails


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
import androidx.compose.foundation.layout.padding
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
fun BookingDetailsScreen(navController: NavController){
     BookingDetailsContent()
}

@Composable
fun BookingDetailsContent(){
    Box(Modifier.fillMaxSize()) {
        Box() {
            Box( modifier = Modifier
                .fillMaxSize()
                .background(Color.Black) )
            Column(Modifier.fillMaxSize()) {
                Box() {
                    Image(
                        painter = painterResource(id = R.drawable.imagemovie)
                        , contentDescription =null,
                        modifier= Modifier
                            .fillMaxWidth()
                            .background(Color.Black))
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
                }
                Seats()
                Choices()
            }
        }

        Box(modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(topStart = 24.dp, topEnd = 24.dp))
            .height(270.dp)
            .align(Alignment.BottomCenter)
            .background(Color.White)
        ){
            Column(modifier = Modifier.fillMaxSize()) {
                Calendar()
                Spacer(modifier = Modifier.weight(1f))
                Row(
                    Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp)
                ,Arrangement.SpaceBetween) {
                    Text(text = "$100000.0", modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .padding(bottom = 16.dp, top = 32.dp),
                        textAlign = TextAlign.Start, fontSize = 24.sp
                    )
                    Box(modifier = Modifier
                        .padding(bottom = 16.dp, top = 42.dp)
                        .width(160.dp)
                        .height(50.dp)
                        .clip(RoundedCornerShape(24.dp))

                        .background(Color(0xFFFF5522)), contentAlignment = Alignment.Center
                    ) {
                        IconButton(onClick = { /*TODO*/ },modifier = Modifier.fillMaxWidth()) {
                            Row(modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceEvenly) {
                                Icon(painterResource(id = R.drawable.iconmoon_solar_card_outline),
                                    contentDescription ="null" ,
                                    modifier = Modifier,
                                    tint = Color.White,
                                )
                                Text(text = "Buy tickets", fontSize = 18.sp,
                                    color = Color.White
                                )
                            }

                        }

                    }
                }

            }

        }

    }

 }



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewBookingDetailsScreen(){
    BookingDetailsContent()
}
