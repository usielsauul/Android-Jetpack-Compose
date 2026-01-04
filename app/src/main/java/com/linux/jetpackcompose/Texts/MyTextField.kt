package com.linux.jetpackcompose.Texts

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

/**
 * Documentacion sobre el curso de Jetpack Compose de Udemy
 * esta documentacion es sobre el componente componible:
 * TextField()
 */

@Composable
fun MyTextFieldParent(modifier: Modifier) {
    var text by rememberSaveable { mutableStateOf("") }
    Column() {
        MyTextField(text = text) {text = it}

    }
}

@Composable
fun MyTextField(text: String, onUserChange: (String) -> Unit) {
    // Variable que almacena el contenido
    Column() {
        TextField(
            // value to write
            text,
            // function lambda for change the value
            onValueChange = {onUserChange(it)},
            // parameter for block the Text field
            readOnly = true,
            // parameter that sets a value and is removed
            placeholder = { Text("Android") },
            // parameter that sets a value and is place at the top
            label = { Text("Android!") }
        )
    }
}

@Composable
fun MyTextFieldPuro(modifier: Modifier = Modifier) {
    var text by rememberSaveable { mutableStateOf("") }
    Column() {
        TextField(
            value = text,
            onValueChange = {text = it}
        )
    }
}