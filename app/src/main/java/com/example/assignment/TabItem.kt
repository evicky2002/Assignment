package com.example.assignment

import androidx.compose.runtime.Composable

typealias ComposableFun = @Composable () -> Unit
sealed class TabItem(val title: String, val screens:ComposableFun){

    object Charcha: TabItem(title = "Charcha", screens = { CharchaScreen()})
    object Bazaar: TabItem(title = "Bazaar", screens = { BazaarScreen()})
    object Profile: TabItem(title = "Profile", screens = { ProfileScreen()})
}
