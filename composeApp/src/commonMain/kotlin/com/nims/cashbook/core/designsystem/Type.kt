package com.nims.cashbook.core.designsystem

import androidx.compose.runtime.Composable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import cashbook.composeapp.generated.resources.Res
import cashbook.composeapp.generated.resources.pretendard_bold
import cashbook.composeapp.generated.resources.pretendard_medium
import cashbook.composeapp.generated.resources.pretendard_regular
import org.jetbrains.compose.resources.Font

data class CashBookTypography(
    val displayLargeBold: TextStyle,
    val displayLargeMedium: TextStyle,
    val displayLargeRegular: TextStyle,
    val displayMediumBold: TextStyle,
    val displayMediumMedium: TextStyle,
    val displayMediumRegular: TextStyle,
    val displaySmallBold: TextStyle,
    val displaySmallMedium: TextStyle,
    val displaySmallRegular: TextStyle,
    val headlineLargeBold: TextStyle,
    val headlineLargeMedium: TextStyle,
    val headlineLargeRegular: TextStyle,
    val headlineMediumBold: TextStyle,
    val headlineMediumMedium: TextStyle,
    val headlineMediumRegular: TextStyle,
    val headlineSmallBold: TextStyle,
    val headlineSmallMedium: TextStyle,
    val headlineSmallRegular: TextStyle,
    val titleLargeBold: TextStyle,
    val titleLargeMedium: TextStyle,
    val titleLargeRegular: TextStyle,
    val titleMediumBold: TextStyle,
    val titleMediumMedium: TextStyle,
    val titleMediumRegular: TextStyle,
    val titleSmallBold: TextStyle,
    val titleSmallMedium: TextStyle,
    val titleSmallRegular: TextStyle,
    val bodyLargeBold: TextStyle,
    val bodyLargeMedium: TextStyle,
    val bodyLargeRegular: TextStyle,
    val bodyMediumBold: TextStyle,
    val bodyMediumMedium: TextStyle,
    val bodyMediumRegular: TextStyle,
    val bodySmallBold: TextStyle,
    val bodySmallMedium: TextStyle,
    val bodySmallRegular: TextStyle,
    val labelLargeBold: TextStyle,
    val labelLargeMedium: TextStyle,
    val labelLargeRegular: TextStyle,
    val labelMediumBold: TextStyle,
    val labelMediumMedium: TextStyle,
    val labelMediumRegular: TextStyle,
    val labelSmallBold: TextStyle,
    val labelSmallMedium: TextStyle,
    val labelSmallRegular: TextStyle,
)

@Composable
fun PretendardFontFamily() =
    FontFamily(
        Font(Res.font.pretendard_bold, weight = FontWeight.W700),
        Font(Res.font.pretendard_medium, weight = FontWeight.W500),
        Font(Res.font.pretendard_regular, weight = FontWeight.W400),
    )

@Composable
fun CashBookTypography(): CashBookTypography {
    val fontFamily = PretendardFontFamily()
    return cashBookTypography(fontFamily)
}

fun cashBookTypography(fontFamily: FontFamily?): CashBookTypography =
    CashBookTypography(
        displayLargeBold =
            TextStyle(
                fontFamily = fontFamily,
                fontSize = 57.sp,
                lineHeight = 64.sp,
                fontWeight = FontWeight.W700,
            ),
        displayLargeMedium =
            TextStyle(
                fontFamily = fontFamily,
                fontSize = 57.sp,
                lineHeight = 64.sp,
                fontWeight = FontWeight.W500,
            ),
        displayLargeRegular =
            TextStyle(
                fontFamily = fontFamily,
                fontSize = 57.sp,
                lineHeight = 64.sp,
                fontWeight = FontWeight.W400,
            ),
        displayMediumBold =
            TextStyle(
                fontFamily = fontFamily,
                fontSize = 45.sp,
                lineHeight = 52.sp,
                fontWeight = FontWeight.W700,
            ),
        displayMediumMedium =
            TextStyle(
                fontFamily = fontFamily,
                fontSize = 45.sp,
                lineHeight = 52.sp,
                fontWeight = FontWeight.W500,
            ),
        displayMediumRegular =
            TextStyle(
                fontFamily = fontFamily,
                fontSize = 45.sp,
                lineHeight = 52.sp,
                fontWeight = FontWeight.W400,
            ),
        displaySmallBold =
            TextStyle(
                fontFamily = fontFamily,
                fontSize = 36.sp,
                lineHeight = 44.sp,
                fontWeight = FontWeight.W700,
            ),
        displaySmallMedium =
            TextStyle(
                fontFamily = fontFamily,
                fontSize = 36.sp,
                lineHeight = 44.sp,
                fontWeight = FontWeight.W500,
            ),
        displaySmallRegular =
            TextStyle(
                fontFamily = fontFamily,
                fontSize = 36.sp,
                lineHeight = 44.sp,
                fontWeight = FontWeight.W400,
            ),
        headlineLargeBold =
            TextStyle(
                fontFamily = fontFamily,
                fontSize = 32.sp,
                lineHeight = 40.sp,
                fontWeight = FontWeight.W700,
            ),
        headlineLargeMedium =
            TextStyle(
                fontFamily = fontFamily,
                fontSize = 32.sp,
                lineHeight = 40.sp,
                fontWeight = FontWeight.W500,
            ),
        headlineLargeRegular =
            TextStyle(
                fontFamily = fontFamily,
                fontSize = 32.sp,
                lineHeight = 40.sp,
                fontWeight = FontWeight.W400,
            ),
        headlineMediumBold =
            TextStyle(
                fontFamily = fontFamily,
                fontSize = 28.sp,
                lineHeight = 36.sp,
                fontWeight = FontWeight.W700,
            ),
        headlineMediumMedium =
            TextStyle(
                fontFamily = fontFamily,
                fontSize = 28.sp,
                lineHeight = 36.sp,
                fontWeight = FontWeight.W500,
            ),
        headlineMediumRegular =
            TextStyle(
                fontFamily = fontFamily,
                fontSize = 28.sp,
                lineHeight = 36.sp,
                fontWeight = FontWeight.W400,
            ),
        headlineSmallBold =
            TextStyle(
                fontFamily = fontFamily,
                fontSize = 24.sp,
                lineHeight = 32.sp,
                fontWeight = FontWeight.W700,
            ),
        headlineSmallMedium =
            TextStyle(
                fontFamily = fontFamily,
                fontSize = 24.sp,
                lineHeight = 32.sp,
                fontWeight = FontWeight.W500,
            ),
        headlineSmallRegular =
            TextStyle(
                fontFamily = fontFamily,
                fontSize = 24.sp,
                lineHeight = 32.sp,
                fontWeight = FontWeight.W400,
            ),
        titleLargeBold =
            TextStyle(
                fontFamily = fontFamily,
                fontSize = 22.sp,
                lineHeight = 28.sp,
                fontWeight = FontWeight.W700,
            ),
        titleLargeMedium =
            TextStyle(
                fontFamily = fontFamily,
                fontSize = 22.sp,
                lineHeight = 28.sp,
                fontWeight = FontWeight.W500,
            ),
        titleLargeRegular =
            TextStyle(
                fontFamily = fontFamily,
                fontSize = 22.sp,
                lineHeight = 28.sp,
                fontWeight = FontWeight.W400,
            ),
        titleMediumBold =
            TextStyle(
                fontFamily = fontFamily,
                fontSize = 16.sp,
                lineHeight = 24.sp,
                fontWeight = FontWeight.W700,
            ),
        titleMediumMedium =
            TextStyle(
                fontFamily = fontFamily,
                fontSize = 16.sp,
                lineHeight = 24.sp,
                fontWeight = FontWeight.W500,
            ),
        titleMediumRegular =
            TextStyle(
                fontFamily = fontFamily,
                fontSize = 16.sp,
                lineHeight = 24.sp,
                fontWeight = FontWeight.W400,
            ),
        titleSmallBold =
            TextStyle(
                fontFamily = fontFamily,
                fontSize = 14.sp,
                lineHeight = 20.sp,
                fontWeight = FontWeight.W700,
            ),
        titleSmallMedium =
            TextStyle(
                fontFamily = fontFamily,
                fontSize = 14.sp,
                lineHeight = 20.sp,
                fontWeight = FontWeight.W500,
            ),
        titleSmallRegular =
            TextStyle(
                fontFamily = fontFamily,
                fontSize = 14.sp,
                lineHeight = 20.sp,
                fontWeight = FontWeight.W400,
            ),
        bodyLargeBold =
            TextStyle(
                fontFamily = fontFamily,
                fontSize = 16.sp,
                lineHeight = 24.sp,
                fontWeight = FontWeight.W700,
            ),
        bodyLargeMedium =
            TextStyle(
                fontFamily = fontFamily,
                fontSize = 16.sp,
                lineHeight = 24.sp,
                fontWeight = FontWeight.W500,
            ),
        bodyLargeRegular =
            TextStyle(
                fontFamily = fontFamily,
                fontSize = 16.sp,
                lineHeight = 24.sp,
                fontWeight = FontWeight.W400,
            ),
        bodyMediumBold =
            TextStyle(
                fontFamily = fontFamily,
                fontSize = 14.sp,
                lineHeight = 20.sp,
                fontWeight = FontWeight.W700,
            ),
        bodyMediumMedium =
            TextStyle(
                fontFamily = fontFamily,
                fontSize = 14.sp,
                lineHeight = 20.sp,
                fontWeight = FontWeight.W500,
            ),
        bodyMediumRegular =
            TextStyle(
                fontFamily = fontFamily,
                fontSize = 14.sp,
                lineHeight = 20.sp,
                fontWeight = FontWeight.W400,
            ),
        bodySmallBold =
            TextStyle(
                fontFamily = fontFamily,
                fontSize = 12.sp,
                lineHeight = 16.sp,
                fontWeight = FontWeight.W700,
            ),
        bodySmallMedium =
            TextStyle(
                fontFamily = fontFamily,
                fontSize = 12.sp,
                lineHeight = 16.sp,
                fontWeight = FontWeight.W500,
            ),
        bodySmallRegular =
            TextStyle(
                fontFamily = fontFamily,
                fontSize = 12.sp,
                lineHeight = 16.sp,
                fontWeight = FontWeight.W400,
            ),
        labelLargeBold =
            TextStyle(
                fontFamily = fontFamily,
                fontSize = 14.sp,
                lineHeight = 20.sp,
                fontWeight = FontWeight.W700,
            ),
        labelLargeMedium =
            TextStyle(
                fontFamily = fontFamily,
                fontSize = 14.sp,
                lineHeight = 20.sp,
                fontWeight = FontWeight.W500,
            ),
        labelLargeRegular =
            TextStyle(
                fontFamily = fontFamily,
                fontSize = 14.sp,
                lineHeight = 20.sp,
                fontWeight = FontWeight.W400,
            ),
        labelMediumBold =
            TextStyle(
                fontFamily = fontFamily,
                fontSize = 12.sp,
                lineHeight = 16.sp,
                fontWeight = FontWeight.W700,
            ),
        labelMediumMedium =
            TextStyle(
                fontFamily = fontFamily,
                fontSize = 12.sp,
                lineHeight = 16.sp,
                fontWeight = FontWeight.W500,
            ),
        labelMediumRegular =
            TextStyle(
                fontFamily = fontFamily,
                fontSize = 12.sp,
                lineHeight = 16.sp,
                fontWeight = FontWeight.W400,
            ),
        labelSmallBold =
            TextStyle(
                fontFamily = fontFamily,
                fontSize = 11.sp,
                lineHeight = 16.sp,
                fontWeight = FontWeight.W700,
            ),
        labelSmallMedium =
            TextStyle(
                fontFamily = fontFamily,
                fontSize = 11.sp,
                lineHeight = 16.sp,
                fontWeight = FontWeight.W500,
            ),
        labelSmallRegular =
            TextStyle(
                fontFamily = fontFamily,
                fontSize = 11.sp,
                lineHeight = 16.sp,
                fontWeight = FontWeight.W400,
            ),
    )

internal val LocalTypography = compositionLocalOf { cashBookTypography(fontFamily = null) }
