package com.example.jcpractice.practicenavigation.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.jcpractice.practicenavigation.screens.routs.Routs


@Composable
fun DetailScreen(
    navController: NavController
){
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Text(
            modifier = Modifier.clickable {
//                navController.navigate(route = Routs.Home.rout)   // detail screen will remain in the backstack
//                navController.popBackStack()   // it will pop the detail screen but can not pass arguments from detail to home

                // now we can pop , also we can pass some arguments
                navController.navigate(route = Routs.Home.rout){
                    popUpTo(Routs.Home.rout){
                        inclusive = true
                    }
                }

            },
            text = "Go to Home Screen",
            color = Color.Blue,
            fontSize = 18.sp,
        )
    }
}
