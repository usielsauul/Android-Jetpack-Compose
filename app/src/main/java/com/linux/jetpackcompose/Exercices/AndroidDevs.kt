package com.linux.jetpackcompose.Exercices

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TriStateCheckbox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Devices.PIXEL_XL
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.google.firebase.firestore.core.ComponentProvider
import com.linux.jetpackcompose.R
import com.linux.jetpackcompose.ui.theme.JetpackComposeTheme


@Composable
fun MyFirstExercise(modifier: Modifier = Modifier) {

    var isCheck2 by remember { mutableStateOf(false) }
    var isCheck3 by remember { mutableStateOf(false) }
    var isCheck by remember { mutableStateOf(ToggleableState.Off) }


    Column(modifier = modifier) {
        Image(
            painter = painterResource(R.drawable.bg_compose_background),
            contentDescription = "Imagen de fondo",
            modifier = modifier,
            contentScale = ContentScale.Inside
        )
        Box(modifier = Modifier.fillMaxWidth()) {
            Text(
                "Lee los terminos y condiciones para continuar",
                modifier = Modifier
                    .clickable(onClick = {})
                    .align(Alignment.Center)
                    .padding(top = 16.dp),
                color = Color.Blue,
                fontStyle = FontStyle.Normal,
                textDecoration = TextDecoration.Underline,
            )
        }

        /**
         * Son los checkboxes
         */

        Row(
            verticalAlignment = Alignment.CenterVertically
        ){
            TriStateCheckbox(
                /**
                 * Este checkbox controla los otros dos
                 */
                state = isCheck,
                onClick = {
                    val newState = isCheck != ToggleableState.On
                    isCheck2 = newState
                    isCheck3 = isCheck2
                }
            )

            Text(
                text = "Seleccionar todo.",
            )
        }

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Checkbox(
                checked = isCheck2,
                onCheckedChange = { isCheck2 = it }
            )

            Text(
                text = "Acepto los terminos y condiciones."
            )
        }

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Checkbox(
                checked = isCheck3,
                onCheckedChange = { isCheck3 = it }
            )

            Text(
                text = "Acepto enviar mis datos de uso (opcional)"
            )
        }

        Box(
            modifier = Modifier.fillMaxSize()
        ) {
            Button(
                onClick = {},
                enabled = if (isCheck2 == true) {
                    true
                } else {
                    false
                },
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(bottom = 24.dp)
            ) {
                Text(
                    text = "Continuar"
                )
            }
        }
    }
}

@Preview(
    name = "Modo claro",
    device = PIXEL_XL,
    uiMode = Configuration.UI_MODE_NIGHT_NO,
    showSystemUi = true
)
@Preview(
    name = "Modo oscuro",
    device = PIXEL_XL,
    showSystemUi = true,
    uiMode = Configuration.UI_MODE_NIGHT_YES,
)
@Composable
fun PreviewApp() {
    JetpackComposeTheme {
        Surface(
            color = MaterialTheme.colorScheme.background
        ) {
            MyFirstExercise()
        }
    }
}