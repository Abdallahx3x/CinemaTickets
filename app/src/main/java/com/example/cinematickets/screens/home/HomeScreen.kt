package com.example.cinematickets.screens.home


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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.BottomAppBar
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
import com.example.cinematickets.R
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.rememberPagerState
import androidx.navigation.NavController


@Composable
fun HomeScreen(navController: NavController){
    HomeContent {
        navController.navigate("movieDetailsScreen")
    }

}

@OptIn( ExperimentalPagerApi::class)
@Composable
private fun HomeContent(onClickMovie:()->Unit){

    Box(modifier = Modifier.fillMaxSize()) {
        val list= listOf(R.drawable.secretsecond,R.drawable.secretzero,
            R.drawable.secretthird)
        val state = rememberPagerState (1 )

        BlurImage(list[state.currentPage])

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 24.dp)
        ) {

            Chips()
            


            Pager(state,list){onClickMovie()}

            Spacer(modifier = Modifier.height(38.dp))


            Box(modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .width(90.dp)
                .height(30.dp)

                .background(Color(0x5D7075))
            ) {
                IconButton(onClick = { /*TODO*/ },modifier = Modifier.fillMaxWidth()) {
                    Row(modifier = Modifier.fillMaxWidth()) {
                        Icon(painterResource(id = R.drawable.iconmonn_time),
                            contentDescription ="null" ,
                            modifier = Modifier.padding(start = 4.dp),
                            tint = Color(0x86000000)
                        )
                        Spacer(modifier = Modifier.size(8.dp))
                        Text(text = "2h 33m", textAlign = TextAlign.Center)
                    }

                }

            }

         Title()

            Spacer(Modifier.weight(1f))

            BottomAppBar(
                modifier = Modifier.fillMaxWidth(), Color(0xFFFFFF)
            ) {
                Row(  modifier = Modifier.fillMaxWidth(),horizontalArrangement = Arrangement.SpaceEvenly) {

                    Box(modifier = Modifier
                        .clip(CircleShape)
                        .background(
                            Color(0xFFFF5522),
                        )) {
                        IconButton(onClick = { /*TODO*/ }) {
                            Icon(painterResource(id = R.drawable.iconamoon_park_outline_video_two),
                                contentDescription ="null" ,
                                tint = Color.White)
                        }
                    }


                    IconButton(onClick = { /*TODO*/ }, modifier = Modifier) {
                        Icon(painterResource(id = R.drawable.iconamoon_search_2_line), contentDescription ="null" )
                    }

                    IconButton(onClick = { /*TODO*/ }, modifier = Modifier) {
                        Icon(painterResource(id = R.drawable.iconamoon_tabler_ticket), contentDescription ="null" )
                    }

                    IconButton(onClick = { /*TODO*/ }, modifier = Modifier) {
                        Icon(painterResource(id = R.drawable.iconamoon_profile_light), contentDescription ="null" )
                    }
                }

            }

        }
    }

}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewProfileScreen(){
    HomeContent {}
}