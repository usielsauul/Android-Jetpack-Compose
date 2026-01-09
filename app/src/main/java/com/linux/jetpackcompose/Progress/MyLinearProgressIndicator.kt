package com.linux.jetpackcompose.Progress

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun MyLinearProgessIndicator(modifier: Modifier = Modifier) {

    var progress by remember { mutableFloatStateOf(0.5f) }
    val animatedProgress by animateFloatAsState(targetValue = progress)
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        LinearProgressIndicator(
            /*
            Se pone el progress con {} porque es una funcion lambda que devuelve un float
             */
            progress = { animatedProgress },
        )

        Spacer(modifier.height(24.dp))

        Row( modifier = Modifier.padding(24.dp)) {
            Button(onClick = {progress-=0.1f}) { }
            Spacer(modifier.width(24.dp))
            Button(onClick = {progress+=0.1f}) { }
        }
        /*
       Spacer(modifier.height(24.dp)) vertical
       Spacer(modifier.width(24.dp)) horizontal

         */
        Button(onClick = {}) { Text("show/hide") }
    }
}