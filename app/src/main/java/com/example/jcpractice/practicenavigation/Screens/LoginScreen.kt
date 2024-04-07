package com.example.jcpractice.practicenavigation.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.jcpractice.practicenavigation.navigation.HOME_ROUTE
import com.example.jcpractice.practicenavigation.navigation.Routs


@Composable
fun LoginScreen(
    navController: NavController?
) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column (
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Text(
                modifier = Modifier.clickable {
                    navController?.navigate(route = Routs.SignUp.rout)
                },
                text = "Login",
                color = Color.Blue,
                fontSize = 35.sp,
            )
            Text(
                modifier = Modifier.clickable {
                    navController?.navigate(HOME_ROUTE){
                        popUpTo(HOME_ROUTE)
                    }
                },
                text = "Go back",
                color = Color.Blue,
                fontSize = 20.sp,
            )
        }

    }
}



@Preview(showSystemUi = true)
@Composable
fun PreviewLogin(){
    LoginScreen(navController = null)
}