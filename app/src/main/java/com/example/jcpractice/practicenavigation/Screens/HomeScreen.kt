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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.jcpractice.practicenavigation.navigation.AUTHENTICATION_ROUTE
import com.example.jcpractice.practicenavigation.navigation.Routs
@Composable
fun HomeScreen(
    navController: NavController
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
                    navController.navigate(route = Routs.Detail.rout)
                },
                text = "Home",
                color = Color.Blue,
                fontSize = 35.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                modifier = Modifier.clickable {
                    navController.navigate(AUTHENTICATION_ROUTE)
                },
                text = "Login/SignUp",
                color = Color.Blue,
                fontSize = 20.sp,
            )
        }

    }
}