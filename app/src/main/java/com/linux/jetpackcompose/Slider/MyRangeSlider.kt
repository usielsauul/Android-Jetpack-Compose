@file:OptIn(ExperimentalMaterial3Api::class)

package com.linux.jetpackcompose.Slider

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.RangeSlider
import androidx.compose.material3.RangeSliderState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MyRangeSlider(modifier: Modifier = Modifier) {
    var state = remember { RangeSliderState(
        activeRangeStart = 3f,
        activeRangeEnd = 6f,
        valueRange = 0f..10f,
        steps = 8,
        onValueChangeFinished = {}
    ) }
    RangeSlider(
        state = state,
        startThumb = {
            Box(Modifier.size(30.dp)) {
                Text(it.activeRangeStart.toString())
            }
        }
    )
}