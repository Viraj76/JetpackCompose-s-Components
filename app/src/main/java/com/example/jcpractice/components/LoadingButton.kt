package com.example.jcpractice.components

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Preview
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoadingButton() {

    var onClick by remember {
        mutableStateOf(false)
    }

    Surface(
        onClick = { onClick = !onClick },
        border = BorderStroke(width = 1.dp, Color.Cyan),
        color = MaterialTheme.colorScheme.primary,
        shadowElevation = 10.dp,
        shape = RoundedCornerShape(10.dp)

    ) {
        Row(
            modifier = Modifier.padding(8.dp)
                .animateContentSize (
                    animationSpec = tween(
                        durationMillis = 300,
                        easing = LinearOutSlowInEasing
                    )
                ),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,

        ) {

            Icon(
                Icons.Default.CheckCircle,
                contentDescription = "Icon",
                tint = Color.Blue
            )
            Spacer(modifier = Modifier.width(6.dp))

            Text(text =  if(onClick) "Questions are generating.." else "Generate Questions")

            Spacer(modifier = Modifier.width(16.dp))

            if(onClick){
                CircularProgressIndicator(
                    modifier = Modifier
                        .width(16.dp)
                        .height(16.dp),
                    color = Color.Blue,
                    strokeWidth = 2.dp,

                    )
            }



        }
    }
}

