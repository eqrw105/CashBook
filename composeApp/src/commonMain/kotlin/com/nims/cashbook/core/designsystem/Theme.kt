package com.nims.cashbook.core.designsystem

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.Colors
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable

object CashBookTheme {
    val colors: Colors
        @Composable
        @ReadOnlyComposable
        get() = LocalColors.current

    val typography: CashBookTypography
        @Composable
        @ReadOnlyComposable
        get() = LocalTypography.current
}

@Composable
fun CashBookTheme(
    typography: CashBookTypography = CashBookTypography(),
    content: @Composable () -> Unit,
) {
    val isDarkMode = isSystemInDarkTheme()
    val colors =
        if (isDarkMode) {
            darkColors()
        } else {
            lightColors()
        }

    CompositionLocalProvider(
        LocalColors provides colors,
        LocalTypography provides typography,
    ) {
        MaterialTheme(
            colors = colors,
            content = content,
        )
    }
}
