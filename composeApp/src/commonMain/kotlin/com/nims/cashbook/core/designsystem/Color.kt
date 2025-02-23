package com.nims.cashbook.core.designsystem

import androidx.compose.material.Colors
import androidx.compose.material.lightColors
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Color

fun lightColors(
    primary: Color = Color(0xFF0048C0),
    primaryVariant: Color = primary,
    secondary: Color = Color(0xFF475C9A),
    secondaryVariant: Color = secondary,
    background: Color = Color(0xFFF9F9F9),
    surface: Color = Color(0xFFFFFFFF),
    error: Color = Color(0xFFBA1A1A),
    onPrimary: Color = Color(0xFFFFFFFF),
    onSecondary: Color = Color(0xFFFFFFFF),
    onBackground: Color = Color(0xFF191B24),
    onSurface: Color = Color(0xFF191B24),
    onError: Color = Color(0xFFFFFFFF),
): Colors =
    Colors(
        primary,
        primaryVariant,
        secondary,
        secondaryVariant,
        background,
        surface,
        error,
        onPrimary,
        onSecondary,
        onBackground,
        onSurface,
        onError,
        true,
    )

fun darkColors(
    primary: Color = Color(0xFFB4C5FF),
    primaryVariant: Color = primary,
    secondary: Color = Color(0xFFB4C5FF),
    secondaryVariant: Color = secondary,
    background: Color = Color(0xFF11131B),
    surface: Color = Color(0xFF11131B),
    error: Color = Color(0xFFFFB4AB),
    onPrimary: Color = Color(0xFF002A77),
    onSecondary: Color = Color(0xFF142D68),
    onBackground: Color = Color(0xFFE1E2EE),
    onSurface: Color = Color(0xFFE1E2EE),
    onError: Color = Color(0xFF690005),
): Colors =
    Colors(
        primary,
        primaryVariant,
        secondary,
        secondaryVariant,
        background,
        surface,
        error,
        onPrimary,
        onSecondary,
        onBackground,
        onSurface,
        onError,
        false,
    )

internal val LocalColors = compositionLocalOf { lightColors() }
