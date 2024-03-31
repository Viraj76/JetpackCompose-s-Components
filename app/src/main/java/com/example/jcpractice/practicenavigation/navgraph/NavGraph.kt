package com.example.jcpractice.practicenavigation.navgraph

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.jcpractice.practicenavigation.routs.DETAIL_ARGUMENT_KEY
import com.example.jcpractice.practicenavigation.routs.DETAIL_ARGUMENT_KEY1
import com.example.jcpractice.practicenavigation.routs.Routs
import com.example.jcpractice.practicenavigation.screens.DetailScreen
import com.example.jcpractice.practicenavigation.screens.HomeScreen


@Composable
fun SetupNavGraph(
    navHostController: NavHostController
) {
    NavHost(navController = navHostController, startDestination = Routs.Home.rout) {

        composable(
            Routs.Home.rout
        ) {
            HomeScreen(navHostController)
        }

        composable(
            Routs.Detail.rout,
            arguments = listOf(
                navArgument(DETAIL_ARGUMENT_KEY) {
                    type = NavType.IntType
                    defaultValue = 45
                }
                ,
                navArgument(DETAIL_ARGUMENT_KEY1) {
                    type = NavType.StringType
                    defaultValue = "viraj"
                }
            )
        ) {
            Log.d("args", it.arguments?.getInt(DETAIL_ARGUMENT_KEY).toString())
            Log.d("args", it.arguments?.getString(DETAIL_ARGUMENT_KEY1).toString())
            DetailScreen(navHostController)
        }

    }
}
