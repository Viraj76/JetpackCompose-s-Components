package com.example.jcpractice.components

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.DefaultAlpha
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp



/*
should be custamizale
 */
@Preview
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ExpandableCard(){

    var expandableState by remember { mutableStateOf(false) }
    val rotationState by animateFloatAsState(targetValue = if (expandableState) 180f else 0f, label = "rotating button")


    Card(
        onClick = { expandableState = !expandableState },
        modifier = Modifier.fillMaxWidth()
            .animateContentSize (
                animationSpec = tween(
                    durationMillis = 300,
                    easing = LinearOutSlowInEasing
                )
            ),
        shape = RoundedCornerShape(7.dp),
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
            ){
                Text(
                    modifier = Modifier.weight(9f),
                    text = "Hii Viraj",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Normal,
                    maxLines = 1,
                    color = Color.Blue,
                    overflow = TextOverflow.Ellipsis
                )
                IconButton(
                    modifier = Modifier.weight(1f)
                        .rotate(rotationState),
                    onClick ={
                        expandableState = !expandableState
                    }
                ) {
                    Icon(imageVector = Icons.Default.KeyboardArrowDown, contentDescription = "Drop down menu")
                }
            }

            if(expandableState){
                Text(
                    text = "how  vaj bpqeirbpqejr bpqije bpqijrnpqioervnpqijf qpieurb pqijef bpqiuef b bpqejr bpqije bpqijrnpqioervnpqijf qpieurb pqijef bpqiu" ,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Normal,
                    color = Color.Blue,
                )
            }
        }
    }

}

@Preview
@Composable
fun ECPreview(){
    ExpandableCard()
}