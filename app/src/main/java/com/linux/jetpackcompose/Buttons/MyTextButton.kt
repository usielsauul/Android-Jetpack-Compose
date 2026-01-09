package com.linux.jetpackcompose.Buttons

import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun MyTextButton(modifier: Modifier = Modifier) {
    TextButton(onClick = {}) {
        Text("Android!")
    }
}