package com.rudra.smallshopkeeper.ui.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Assessment
import androidx.compose.material.icons.filled.Dashboard
import androidx.compose.material.icons.filled.Inventory
import androidx.compose.material.icons.filled.PointOfSale
import androidx.compose.material.icons.filled.Receipt
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

data class BottomNavItem(
    val label: String,
    val icon: ImageVector,
    val route: String,
)

object BottomNavItems {
    val items = listOf(
        BottomNavItem(
            label = "Dashboard",
            icon = Icons.Filled.Dashboard,
            route = Screen.Dashboard.route
        ),
        BottomNavItem(
            label = "Products",
            icon = Icons.Filled.Inventory,
            route = Screen.Products.route
        ),
        BottomNavItem(
            label = "Sales",
            icon = Icons.Filled.PointOfSale,
            route = Screen.Sales.route
        ),
        BottomNavItem(
            label = "Expenses",
            icon = Icons.Filled.Receipt,
            route = Screen.Expenses.route
        ),
        BottomNavItem(
            label = "Reports",
            icon = Icons.Filled.Assessment,
            route = Screen.Reports.route
        ),
        BottomNavItem(
            label = "Settings",
            icon = Icons.Filled.Settings,
            route = Screen.Settings.route
        ),
    )
}