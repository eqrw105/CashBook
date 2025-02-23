package com.nims.cashbook.app

import androidx.compose.runtime.Composable
import com.nims.cashbook.core.designsystem.CashBookTheme
import com.nims.cashbook.feature.main.MainScreen

@Composable
fun App() {
    CashBookTheme {
        MainScreen()
    }
}
