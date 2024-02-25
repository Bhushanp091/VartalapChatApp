package com.example.encrychatapp.ChatApp.util

sealed class Screen(val route:String){
    object SignIn : Screen("signin")
    object HomeNav : Screen("homenav")
    object Chat : Screen("chat")
    object Search : Screen("search")
    object Posts : Screen("post")
    object Profile : Screen("profile")
}