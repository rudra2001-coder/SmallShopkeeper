package com.rudra.smallshopkeeper.ui.navigation

sealed class Screen(val route: String) {
    object Dashboard : Screen("dashboard")
    object Products : Screen("products")
    object Sales : Screen("sales")
    object Expenses : Screen("expenses")
    object Reports : Screen("reports")
    object Settings : Screen("settings")
}