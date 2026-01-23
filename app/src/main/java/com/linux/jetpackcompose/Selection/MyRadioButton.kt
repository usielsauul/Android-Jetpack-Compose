package com.linux.jetpackcompose.Selection

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun MyRadioButton(modifier: Modifier = Modifier) {

    var state by remember { mutableStateOf(false) }

    Row(modifier = modifier,
        verticalAlignment = Alignment.CenterVertically) {
        RadioButton(
            selected = state,
            onClick = {state = !state},
            enabled = true,
            colors = RadioButtonDefaults.colors(
                selectedColor = Color.Red,
                unselectedColor = Color.Yellow,
                disabledSelectedColor = Color.Green,
                disabledUnselectedColor = Color.Magenta
            )
        )

        Text("Android")
    }
}

@Composable
fun MyRadioButtonList(modifier: Modifier = Modifier) {
    var selectedName by remember { mutableStateOf("") }
    Column(modifier = modifier) {
        RadioButtonComponent(name = "Pepe", selectedName = selectedName) { selectedName = it }
        RadioButtonComponent(name = "Juan", selectedName = selectedName) { selectedName = it }
        RadioButtonComponent(name = "Jose", selectedName = selectedName) { selectedName = it }
        RadioButtonComponent(name = "Andres", selectedName = selectedName) { selectedName = it }
        RadioButtonComponent(name = "Pedro", selectedName = selectedName) { selectedName = it }
        RadioButtonComponent(name = "Mario", selectedName = selectedName) { selectedName = it }
    }
}

@Composable
fun RadioButtonComponent(name:String, selectedName: String, onItemSelected:(String) -> Unit) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        RadioButton(selected = name == selectedName, onClick = { onItemSelected(name) })
        Text(name)
    }
}










