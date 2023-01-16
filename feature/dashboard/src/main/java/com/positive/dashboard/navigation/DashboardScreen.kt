package com.positive.dashboard.navigation

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun DashboardRoute() {
    MaterialTheme {
        Column {
            Text(text = "Dashboard screen")
        }
    }
}