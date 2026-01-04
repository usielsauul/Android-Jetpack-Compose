package com.linux.jetpackcompose.Texts

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation

/**
 * Documentacion sobre el curso de Jetpack Compose de Udemy
 * esta documentacion es sobre el componente componible:
 * TextField() but advance
 */

@Composable
fun MyTextAdvance(modifier: Modifier = Modifier) {
    var text by rememberSaveable { mutableStateOf("") }
    Column() {
        TextField(
            value = text,
            onValueChange = { text = it.replace("a", "") }
        )
    }
}

@Composable
fun GenericFunction(modifier: Modifier = Modifier) {
    var value by rememberSaveable { mutableStateOf("") }
    var password by rememberSaveable { mutableStateOf(false) }

    Column() {
        TextField(
            value = value,
            onValueChange = { value = it },
            singleLine = true,
            label = { Text("Introduce tu contraseña") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            /**
             * we can hide the passwords for example
             * and
             * add the icon for show or hide the password
             */
            visualTransformation = if(password) PasswordVisualTransformation() else VisualTransformation.None, // for hidde or show the passwor
            trailingIcon = {
                Text(text = if(password) "Show" else "Hide",
                    modifier = Modifier.clickable{password = !password}
                    )
            }
        )
    }
}
/**
 * Whit this parameter we are can a choose keyboard (for example: password)
 * keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
 */

