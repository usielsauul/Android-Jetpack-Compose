@file:OptIn(ExperimentalMaterial3Api::class)

package com.linux.jetpackcompose.Slider

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.SliderState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Devices.PIXEL_9
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.linux.jetpackcompose.R
import com.linux.jetpackcompose.ui.theme.JetpackComposeTheme

@Composable
fun MySlider(modifier: Modifier) {
    var sliderPosition by remember { mutableFloatStateOf(0.5f) }
    Column(modifier = modifier) {
        Slider(
            enabled = true,
            value = sliderPosition,
            onValueChange = { sliderPosition = it },
            colors = SliderDefaults.colors(
                // Color del thumb del slider
                thumbColor = Color.Red,
                disabledThumbColor = Color.DarkGray,

                // Todo el slider
                activeTrackColor = Color.Red,
                disabledActiveTrackColor = Color.Green,

                // Los steps del slider (son palitos que estan en la linea)
                activeTickColor = Color.Blue,
                disabledActiveTickColor = Color.DarkGray,

                // Ahora la parte sin seleccionar del track
                inactiveTrackColor = Color.Green,
                disabledInactiveTrackColor = Color.Red,

                // Ahora la parte sin seleccionar del tick
                inactiveTickColor = Color.Blue,
                disabledInactiveTickColor = Color.DarkGray,
            )
        )
        Text(text = sliderPosition.toString())
    }
}

@Composable
fun MySliderAdvance(modifier: Modifier = Modifier) {
    var example by remember { mutableStateOf(":)") }

    val state = remember { SliderState(
        value = 5f,
        valueRange = 0f..10f,
        steps = 3,
        onValueChangeFinished = {
            example = "Feliz"
        }
    ) }

    Column(modifier = modifier.padding(horizontal = 30.dp)) {
        Slider(state = state, thumb = {
            Image(
                painter = painterResource(R.drawable.outline_android_28),
                contentDescription = "Thumb android!"
            )
        })
        Text(example)

    }
}