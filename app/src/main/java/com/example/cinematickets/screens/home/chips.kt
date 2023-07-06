package com.example.cinematickets.screens.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AssistChip
import androidx.compose.material3.AssistChipDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Chips(){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 16.dp)
            .padding(16.dp), horizontalArrangement = Arrangement.Center
    ) {

        AssistChip(
            onClick = { /* Do something! */ },
            label = { Text("Now Showing",color = Color(0xA6FFFFFF)) },
            colors = AssistChipDefaults.assistChipColors(Color(0xFFFF5522)),
            border = AssistChipDefaults.assistChipBorder(Color(0xFFFF5522)),
            shape = RoundedCornerShape(16.dp)

        )
        Spacer(Modifier.size(16.dp))
        AssistChip(
            onClick = { /* Do something! */ },
            label = { Text("Coming Soon",color = Color(0xA6FFFFFF)) },
            colors = AssistChipDefaults.assistChipColors(Color(0xFFFFFFF)),
            border = AssistChipDefaults.assistChipBorder( Color(0x5EFFFFFF)),
            shape = RoundedCornerShape(16.dp)
        )

    }
}