package com.positive.settings

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun SettingsRoute() {
    MaterialTheme {
        Column {
            Text(text = "Settings screen")
        }
    }
}