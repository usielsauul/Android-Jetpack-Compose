package com.linux.jetpackcompose.Selection

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.material3.TriStateCheckbox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(name = "device", showSystemUi = true)
@Composable
fun MyCheckBox(modifier: Modifier = Modifier) {
    var isChecked by remember { mutableStateOf(false) }
    var isChecked2 by remember { mutableStateOf(false) }
    var isChecked3 by remember { mutableStateOf(ToggleableState.Off) } // Se usa para TriStateBox, si las dos variables son falsas, esta ira en off

    LaunchedEffect(isChecked, isChecked2) {
        isChecked3 = when{
            isChecked && isChecked2 -> ToggleableState.On
            !isChecked && !isChecked2 -> ToggleableState.Off
            else -> ToggleableState.Indeterminate
        }
    }

    /**
     * Basicamente, este swithc nos dice que si isChecked y isChecked2 son iguales, isChecked3 (Que es el tristate) aparecera como determinado
     * sino, si son diferentes, aparecera como indeterminado representado por un -
     */

    Column {
        Row(
            modifier = modifier
                .padding(start = 8.dp, top = 19.dp)
                .clickable(onClick = { isChecked = !isChecked }),
            verticalAlignment = Alignment.CenterVertically
        ) {
            TriStateCheckbox(
                state = isChecked3,
                onClick = {
                    val newState = isChecked3 != ToggleableState.On
                    isChecked = newState
                    isChecked2 = isChecked
                }

                /**
                 * Aqui no lleva checked = boolean
                 * sino, state, que es la variable que lleva el ToggleableState
                 */

            )

            Text(
                text = "Seleccionar todo.",
                fontStyle = FontStyle.Italic,
                fontWeight = FontWeight.ExtraBold
            )

        }
        Row(
            modifier = modifier
                .padding(horizontal = 8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Checkbox(
                checked = isChecked2,
                onCheckedChange = { isChecked2 = it }
            )

            Text(
                text = "Acepto enviar mis datos de uso.",
                fontStyle = FontStyle.Italic,
                fontWeight = FontWeight.ExtraBold
            )
        }

        Row(
            modifier = modifier
                .padding(horizontal = 8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Checkbox(
                checked = isChecked,
                onCheckedChange = { isChecked = it }
            )

            Text(
                text = "Acepto los terminos y condiciones.",
                fontStyle = FontStyle.Italic,
                fontWeight = FontWeight.ExtraBold
            )
        }
    }
}