package com.example.jcpractice.practicenavigation.navigation.navgraph

import android.util.Log
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import androidx.navigation.navigation
import com.example.jcpractice.practicenavigation.navigation.DETAIL_ARGUMENT_KEY
import com.example.jcpractice.practicenavigation.navigation.HOME_ROUTE
import com.example.jcpractice.practicenavigation.navigation.Routs
import com.example.jcpractice.practicenavigation.navigation.DETAIL_ARGUMENT_KEY1
import com.example.jcpractice.practicenavigation.screens.DetailScreen
import com.example.jcpractice.practicenavigation.screens.HomeScreen


fun NavGraphBuilder.homeNavGraph(
    navHostController: NavHostController
) {

    navigation(
        startDestination = Routs.Home.rout,
        route = HOME_ROUTE
    ){
        composable(
            Routs.Home.rout
        ) {
            HomeScreen(navHostController)
        }

        composable(
            Routs.Detail.rout,
//            arguments = listOf(
//                navArgument(DETAIL_ARGUMENT_KEY) {
//                    type = NavType.IntType
//                },
//                navArgument(DETAIL_ARGUMENT_KEY1) {
//                    type = NavType.StringType
//                    defaultValue = "viraj"
//                }
//            )
        ) {
            Log.d("args", it.arguments?.getInt(DETAIL_ARGUMENT_KEY).toString())
            Log.d("args", it.arguments?.getString(DETAIL_ARGUMENT_KEY1).toString())
            DetailScreen(navHostController)
        }
    }


}