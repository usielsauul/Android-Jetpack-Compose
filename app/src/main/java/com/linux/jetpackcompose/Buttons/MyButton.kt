package com.linux.jetpackcompose.Buttons

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun MyButton(modifier: Modifier = Modifier) {
    Column {
        Button(onClick = {}) {
            Text(text = "Hola")
        }
    }
}