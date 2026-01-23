package com.linux.jetpackcompose.Exercices

import android.content.res.Configuration
import android.graphics.Paint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material3.AlertDialogDefaults.shape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices.PIXEL_6A
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.linux.jetpackcompose.R



@Composable
fun MyProfile(modifier: Modifier = Modifier) {
    var name by remember { mutableStateOf("Android") }
    var isEditing by remember { mutableStateOf(true) }
    var story: Boolean = true

    Column(
        modifier = Modifier
            .fillMaxSize()
            .blur(if (isEditing) 10.dp else 0.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Spacer(modifier = Modifier.height(30.dp))


        Box(
            contentAlignment = Alignment.TopCenter
        ) {

            Image(
                painter = painterResource(R.drawable.bg_compose_background),
                contentDescription = "Imagen de fondo"
            )

            Image(
                painter = painterResource(R.drawable.profile),
                contentDescription = "Profile image",
                modifier = Modifier
                    .padding(top = 16.dp)
                    .size(140.dp)
                    .clip(CircleShape)
                    .border(
                        width = if (story) 3.dp else 0.dp,
                        brush = if (story) {
                            Brush.linearGradient(
                                colors = listOf(
                                    Color.Yellow,
                                    Color.Red,
                                    Color.Magenta
                                )
                            )
                        } else {
                            Brush.linearGradient(colors = listOf(Color.White, Color.White))
                        },
                        shape = CircleShape
                    )
            )
        }

        Text(
            text = name,
            fontSize = 34.sp,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary
        )

        Text(
            text = "example@gmail.com",
            color = MaterialTheme.colorScheme.secondary
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Description"
        )

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {

            Button(
                onClick = {
                    isEditing = true
                },
                modifier = Modifier
                    .padding(start = 8.dp)
                    .weight(1f)
            ) {
                Text(text = "Modificar descripcion")
            }






                Button(
                    onClick = {},
                    modifier = Modifier
                        .padding(end = 8.dp)
                        .weight(1f)
                ) {
                    Text(text = "Modificar foto")
                }
            }

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Datos personales",
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
                color = MaterialTheme.colorScheme.primary
            )

            Spacer(modifier = Modifier.height(16.dp))

            Row(
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Icon(
                    painter = painterResource(R.drawable.rounded_apartment_24),
                    contentDescription = "Ciudad de residencia",
                    modifier = Modifier.weight(1f)
                )

                Text(
                    text = "Ciudad de residencia",
                    modifier = Modifier.weight(1f)

                )
            }

            Spacer(modifier = Modifier.height(8.dp))


            Row(
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Icon(
                    painter = painterResource(R.drawable.outline_code_24),
                    contentDescription = "Ocupacion",
                    modifier = Modifier.weight(1f)
                )

                Text(
                    text = "Android Developer",
                    modifier = Modifier.weight(1f)
                )
            }

            Spacer(modifier = Modifier.height(8.dp))

            Row(
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Icon(
                    painter = painterResource(R.drawable.rounded_call_24),
                    contentDescription = "Telefono de contacto",
                    modifier = Modifier.weight(1f)
                )

                Text(
                    text = "Telefono de contacto",
                    modifier = Modifier.weight(1f)
                )

            }

            Spacer(modifier = Modifier.height(16.dp))

            Box(
                Modifier
                    .fillMaxWidth()
                    .height(5.dp)
                    .background(Color.LightGray)
            )

            Spacer(modifier = Modifier.height(4.dp))


            Column(
                modifier = Modifier
                    .width(400.dp)
                    .height(410.dp)
                    .verticalScroll(rememberScrollState())
            ) {
                Image(
                    painter = painterResource(R.drawable.bg_compose_background),
                    contentDescription = "Imagen de fondo"
                )

                Spacer(modifier = Modifier.height(8.dp))

                Image(
                    painter = painterResource(R.drawable.bg_compose_background),
                    contentDescription = "Imagen de fondo"
                )

                Spacer(modifier = Modifier.height(8.dp))

                Image(
                    painter = painterResource(R.drawable.bg_compose_background),
                    contentDescription = "Imagen de fondo"
                )

                Spacer(modifier = Modifier.height(8.dp))

                Image(
                    painter = painterResource(R.drawable.bg_compose_background),
                    contentDescription = "Imagen de fondo"
                )

                Spacer(modifier = Modifier.height(8.dp))

                Image(
                    painter = painterResource(R.drawable.bg_compose_background),
                    contentDescription = "Imagen de fondo"
                )

                Spacer(modifier = Modifier.height(8.dp))

                Image(
                    painter = painterResource(R.drawable.bg_compose_background),
                    contentDescription = "Imagen de fondo"
                )

                Spacer(modifier = Modifier.height(8.dp))


            }

            Spacer(modifier = Modifier.weight(1f))

        }

    if (isEditing) {
        Box(
            Modifier
                .fillMaxSize()
                .background(Color.Black.copy(alpha = 0.5f)),
            contentAlignment = Alignment.Center
        ) {
            Column(
                modifier = Modifier
                    .padding(32.dp)
                    .background(
                        Color.White,
                        shape = RoundedCornerShape(16.dp)
                    )
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(text = "Modificar descripcion")

                Spacer(modifier = Modifier.height(8.dp))

                TextField(
                    value = name,
                    onValueChange = { name = it }
                )

                Button(
                    onClick = {
                        isEditing = false
                    }
                ) {
                    Text("Guardar")
                }
            }
        }
    }

    }





@Preview(device = PIXEL_6A, uiMode = Configuration.UI_MODE_NIGHT_YES, showSystemUi = true)
@Composable
fun MyProfilePreview() {
    Surface(
        color = MaterialTheme.colorScheme.background
    ) {
        MyProfile()
    }
}