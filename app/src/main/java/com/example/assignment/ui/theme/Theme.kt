package com.example.assignment.ui.theme

import android.annotation.SuppressLint
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import com.google.accompanist.systemuicontroller.rememberSystemUiController

@SuppressLint("ConflictingOnColor")
private val DarkColorPalette = darkColors(
    primary = Black200,
    onPrimary = Gray100,
    primaryVariant = Blue500,
    secondary = Gray100,
    background = Black200,
    onBackground = Gray100

)

@SuppressLint("ConflictingOnColor")
private val LightColorPalette = lightColors(
    primary = Gray100,
    onPrimary = Black100,
    primaryVariant = Blue500,
    secondary = Black100,
    background = Gray100,
    onBackground = Black100

    //Custom



    /* Other default colors to override
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)

@Composable
fun AssignmentTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val systemUiController = rememberSystemUiController()
    if(darkTheme){
        systemUiController.setSystemBarsColor(
            color = Color(0xFF737377)
        )
    }else{
        systemUiController.setSystemBarsColor(
            color = Color(0xFF737377)
        )
    }
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}