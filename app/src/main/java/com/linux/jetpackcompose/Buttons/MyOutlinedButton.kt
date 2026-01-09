package com.linux.jetpackcompose.Buttons

import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun MyOutlinedButton(modifier: Modifier = Modifier) {
    OutlinedButton(onClick = {}) {
        Text("Android!")
    }
}