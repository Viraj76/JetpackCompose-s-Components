package com.example.jcpractice.practicenavigation.navigation
const val DETAIL_ARGUMENT_KEY = "id"
const val DETAIL_ARGUMENT_KEY1 = "name"


const val ROOT_ROUTE = "root"
const val AUTHENTICATION_ROUTE = "authentication"
const val HOME_ROUTE = "home"

/*
required value
detail_screen/{$DETAIL_ARGUMENT_KEY}/{$DETAIL_ARGUMENT_KEY1}

optional value
detail_screen?id={$DETAIL_ARGUMENT_KEY}

 */
sealed class Routs(val rout : String) {

    object Home : Routs(rout = "home_screen")
    object Login : Routs(rout = "login_screen")
    object SignUp : Routs(rout = "signup_screen")
    object Detail : Routs(rout = "detail_screen?id={$DETAIL_ARGUMENT_KEY}&name={$DETAIL_ARGUMENT_KEY1}"){
        fun passId(id : Int = 0 ): String{
            return this.rout.replace(oldValue = DETAIL_ARGUMENT_KEY, newValue = id.toString())
        }

        fun passIdAndName(id : Int = 0, name : String  = "viraj") : String{
            return this.rout.replace(oldValue = "$DETAIL_ARGUMENT_KEY&name=$DETAIL_ARGUMENT_KEY1", newValue = "$id?name=$name")
        }
    }




}