package com.example.jcpractice.practicenavigation.screens

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.jcpractice.practicenavigation.screens.routs.Routs


@Composable
fun SetupNavGraph(
    navHostController: NavHostController
){
    NavHost(navController = navHostController , startDestination = Routs.Home.rout){

        composable(
            Routs.Home.rout
        ){
            HomeScreen(navHostController)
        }

        composable(
            Routs.Detail.rout
        ){
            DetailScreen(navHostController)
        }

    }
}
