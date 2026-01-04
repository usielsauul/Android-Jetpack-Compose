package com.linux.jetpackcompose.Texts

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

/**
 * Documentacion sobre el curso de Jetpack Compose de Udemy
 * esta documentacion es sobre el componente componible:
 * OutlinedTextField()
 */

@Composable
fun MyOutlinedTextField(modifier: Modifier = Modifier) {
    var text by rememberSaveable { mutableStateOf("") }
    Column() {
        TextField(
            value = text,
            // replace is for replace a character or a number or any element.
            onValueChange = { text = it.replace("a", "") }
        )
    }
}