package com.nims.cashbook.app

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.nims.cashbook.core.designsystem.CashBookTheme
import com.nims.cashbook.feature.main.MainScreen

@Composable
fun App() {
    CashBookTheme {
        Box(
            modifier =
                Modifier
                    .fillMaxSize()
                    .background(CashBookTheme.colors.background)
                    .safeDrawingPadding(),
        ) {
            MainScreen()
        }
    }
}
