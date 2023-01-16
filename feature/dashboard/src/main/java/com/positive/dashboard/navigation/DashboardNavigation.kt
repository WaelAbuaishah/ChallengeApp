package com.positive.dashboard.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable

const val dashboardNavigationRoute = "dashboard_navigation"

fun NavController.navigateToDashboard(navOptions: NavOptions? = null) {
    this.navigate(dashboardNavigationRoute, navOptions)
}

fun NavGraphBuilder.dashboardScreen() {
    composable(route = dashboardNavigationRoute) {
        DashboardRoute()
    }
}