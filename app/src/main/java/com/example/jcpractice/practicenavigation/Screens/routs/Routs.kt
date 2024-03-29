package com.example.jcpractice.practicenavigation.screens.routs

sealed class Routs(val rout : String) {

    object Home : Routs(rout = "home_screen")
    object Detail : Routs(rout = "detail_screen")
}