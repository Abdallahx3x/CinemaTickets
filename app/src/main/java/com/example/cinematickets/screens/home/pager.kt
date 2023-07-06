package com.example.cinematickets.screens.home

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.util.lerp
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.PagerState
import kotlin.math.absoluteValue


@OptIn(ExperimentalPagerApi::class)
@Composable
fun Pager(state:PagerState,list:List<Int>,onClickMovie:()->Unit,){
    HorizontalPager(
        state = state,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 16.dp)
            .height(350.dp),
        contentPadding = PaddingValues(horizontal =  80.dp),
        count = 3
    ) { page ->
        Card(
            Modifier
                .height(350.dp).padding(top=28.dp)
                .scale(scaleY = 1.2f, scaleX = 1f)
                .clickable {
                    onClickMovie()
                }
                .graphicsLayer {
                    val pageOffset = (
                            (state.currentPage - page) + state
                                .currentPageOffset
                            ).absoluteValue

                    lerp(
                        start = 0.8f,
                        stop = 1f,
                        fraction = 1f - pageOffset.coerceIn(0f, 1f)
                    ).also {
                        scaleX = it
                        scaleY = it
                    }
                    // We animate the alpha, between 50% and 100%
                    alpha = lerp(
                        start = 0.8f,
                        stop = 1f,
                        fraction = 1f - pageOffset.coerceIn(0f, 1f)
                    )
                },colors= CardDefaults.cardColors(Color(0xFFFFFF)),

            )
        {

            Image(
                painter = painterResource(id = list[page])
                , contentDescription =null,
                Modifier.
                clip(
                    RoundedCornerShape(16.dp)
                ),
            )

        }
    }
}