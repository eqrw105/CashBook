package com.nims.cashbook.app

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import com.nims.cashbook.feature.main.MainScreen

@Composable
fun App() {
    MaterialTheme {
        MainScreen()
    }
}