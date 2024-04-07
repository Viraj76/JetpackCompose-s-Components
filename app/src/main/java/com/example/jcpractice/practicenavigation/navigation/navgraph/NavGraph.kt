package com.example.jcpractice.practicenavigation.navigation.navgraph

import android.media.metrics.LogSessionId
import android.util.Log
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import androidx.navigation.navigation
import com.example.jcpractice.practicenavigation.navigation.AUTHENTICATION_ROUTE
import com.example.jcpractice.practicenavigation.navigation.DETAIL_ARGUMENT_KEY
import com.example.jcpractice.practicenavigation.navigation.DETAIL_ARGUMENT_KEY1
import com.example.jcpractice.practicenavigation.navigation.HOME_ROUTE
import com.example.jcpractice.practicenavigation.navigation.ROOT_ROUTE
import com.example.jcpractice.practicenavigation.navigation.Routs
import com.example.jcpractice.practicenavigation.screens.DetailScreen
import com.example.jcpractice.practicenavigation.screens.HomeScreen
import com.example.jcpractice.practicenavigation.screens.LoginScreen
import com.example.jcpractice.practicenavigation.screens.SignUpScreen
import okhttp3.Route


@Composable
fun SetupNavGraph(
    navHostController: NavHostController
) {
    NavHost(
        navController = navHostController,
        startDestination = HOME_ROUTE,
        route = ROOT_ROUTE
    ) {

        homeNavGraph(navHostController)

        authNavGraph(navHostController)

    }
}
