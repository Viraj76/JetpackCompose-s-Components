package com.example.jcpractice.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import coil.compose.AsyncImage


@Preview
@Composable
fun PracticeCoil(){

   AsyncImage(
       model = "https://www.google.com/url?sa=i&url=https%3A%2F%2Fletsenhance.io%2F&psig=AOvVaw0D_5OZrpUNQ6g9fVBs9mV-&ust=1711030084681000&source=images&cd=vfe&opi=89978449&ved=0CBIQjRxqFwoTCID7g76Ug4UDFQAAAAAdAAAAABAE"
        ,contentDescription = "Image",
    )

//    Image(painter = painter, contentDescription = "Image")
}