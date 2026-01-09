package com.linux.jetpackcompose.Buttons

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun MyButton(modifier: Modifier = Modifier) {
    Column {
        Button(
            onClick = { },
            enabled = false,
            colors = ButtonDefaults.buttonColors(
                contentColor = Color.Red, // contenido habilitado
                containerColor = Color.Blue, // fondo habilitado
                disabledContentColor = Color.Yellow, // contenido deshabilitado
                disabledContainerColor = Color.Green // fondo deshabilitado
            )
        ) {
            Text(text = "Android")
        }
    }
}