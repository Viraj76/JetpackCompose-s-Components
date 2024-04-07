package com.example.jcpractice.practicenavigation.navigation.navgraph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.jcpractice.practicenavigation.navigation.AUTHENTICATION_ROUTE
import com.example.jcpractice.practicenavigation.navigation.Routs
import com.example.jcpractice.practicenavigation.screens.LoginScreen
import com.example.jcpractice.practicenavigation.screens.SignUpScreen


fun NavGraphBuilder.authNavGraph(
    navHostController : NavHostController
){
    navigation(
        startDestination = Routs.Login.rout,
        route = AUTHENTICATION_ROUTE
    ){
        composable(
            Routs.Login.rout
        ){
            LoginScreen(navController = navHostController)
        }
        composable(
            Routs.SignUp.rout
        ){
            SignUpScreen(navController = navHostController)
        }
    }
}