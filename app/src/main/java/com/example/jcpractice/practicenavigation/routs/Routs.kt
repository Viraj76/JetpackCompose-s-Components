package com.example.jcpractice.practicenavigation.routs

const val DETAIL_ARGUMENT_KEY = "id"
const val DETAIL_ARGUMENT_KEY1 = "name"
sealed class Routs(val rout : String) {

    object Home : Routs(rout = "home_screen")
    object Detail : Routs(rout = "detail_screen/{$DETAIL_ARGUMENT_KEY}/{$DETAIL_ARGUMENT_KEY1}"){
        fun passId(id : Int): String{
            return this.rout.replace(oldValue = "{$DETAIL_ARGUMENT_KEY}" , newValue = id.toString())
        }

        fun passIdAndName(id : Int, name : String) : String{
            return this.rout.replace(oldValue = "{$DETAIL_ARGUMENT_KEY}/{$DETAIL_ARGUMENT_KEY1}", newValue = "$id/$name")
        }
    }


}