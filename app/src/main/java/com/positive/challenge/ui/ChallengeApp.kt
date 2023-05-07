package com.positive.challenge.ui

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SmallTopAppBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.positive.dashboard.navigation.dashboardNavigationRoute
import com.positive.dashboard.navigation.dashboardScreen
import com.positive.settings.settingsScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ChallengeApp() {
    Scaffold(
        containerColor = Color.Transparent,
        contentColor = MaterialTheme.colorScheme.onBackground,
        topBar = { SmallTopAppBar(title = { Text(text = "Challenge App") }) },
    ) {
        ChallengeNavigationHost()
    }
}

@Composable
fun ChallengeNavigationHost(navController: NavHostController = rememberNavController()) {
    NavHost(
        navController = navController,
        startDestination = dashboardNavigationRoute
    ) {
        dashboardScreen()
        settingsScreen()
    }
}