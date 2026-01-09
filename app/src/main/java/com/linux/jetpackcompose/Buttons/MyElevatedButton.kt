package com.linux.jetpackcompose.Buttons

import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun MyElevatedButton(modifier: Modifier = Modifier) {
    ElevatedButton(onClick = {},
        elevation = ButtonDefaults.elevatedButtonElevation()
    ) {
        Text("Android!")
    }
}