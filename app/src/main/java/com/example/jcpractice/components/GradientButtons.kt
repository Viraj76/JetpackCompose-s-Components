package com.example.jcpractice.components

import android.view.RoundedCorner
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun GradientButton(
     text : String,
     gradient : Brush,
     textColor : Color
){
    Button(
        onClick = { /*TODO*/ },
        colors =  ButtonDefaults.buttonColors(containerColor = Color.Transparent),
        shape = RoundedCornerShape(10.dp),
        modifier = Modifier
            .padding(horizontal = 25.dp, vertical = 20.dp)
            .fillMaxWidth()

    ) {
        Box(
            modifier = Modifier
                .padding(horizontal = 25.dp, vertical = 20.dp)
                .background(gradient, RoundedCornerShape(10.dp))
                .fillMaxWidth()
                ,
            contentAlignment = Alignment.Center
        ){
            Text(text = text , color = textColor , modifier = Modifier.padding(10.dp))
        }
    }
}