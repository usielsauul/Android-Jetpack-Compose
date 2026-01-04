package com.linux.jetpackcompose.Layouts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.AndroidUiMode
import androidx.compose.ui.tooling.preview.Devices.PIXEL
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(
    device = PIXEL,
)
@Composable
fun MyBox(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Box(modifier = Modifier
            .size(50.dp)
            .background(Color.Red)
            .align(Alignment.TopStart)
        )
        Box(modifier = Modifier
            .size(50.dp)
            .background(Color.Blue)
            .align(Alignment.TopEnd)
        )
        Box(modifier = Modifier
            .size(50.dp)
            .background(Color.Green)
            .align(Alignment.BottomStart)
        )
        Box(modifier = Modifier
            .size(50.dp)
            .background(Color.Yellow)
            .align(Alignment.BottomEnd)
        )
    }
}