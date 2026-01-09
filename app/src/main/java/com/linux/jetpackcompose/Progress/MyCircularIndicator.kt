package com.linux.jetpackcompose.Progress

import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ProgressIndicatorDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun MyCircularIndicator(modifier: Modifier = Modifier) {
    CircularProgressIndicator(
        // color = MaterialTheme.colorScheme.secondary // Para definir el color del circulo
        color = Color(0xFF7EE31F), // Igualmente para definir color pero con codigos,
        strokeWidth = 4.dp, // para definir el grosor del circulo
        // trackColor = ProgressIndicatorDefaults.circularColor // para definir el color del riel
        strokeCap =ProgressIndicatorDefaults.CircularIndeterminateStrokeCap // para definir si es circular o cuadrado
    )
}