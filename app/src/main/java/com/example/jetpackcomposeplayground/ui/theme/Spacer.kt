package com.example.jetpackcomposeplayground.ui.theme

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp


@Composable
fun HeightSpacer(value: Dp) {
    Spacer(modifier = Modifier.height(value))
}

@Composable
fun WidthSpacer(value: Dp) {
    Spacer(modifier = Modifier.width(value))
}
