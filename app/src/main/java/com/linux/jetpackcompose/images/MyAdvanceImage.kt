package com.linux.jetpackcompose.images

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.linux.jetpackcompose.R

@Preview
@Composable
fun MyAdvanceImage(modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(R.drawable.ic_launcher_foreground),
        contentDescription = null,
        modifier = Modifier
            .size(300.dp)
            /**
             * Modificador para redondear por ejemplo una imagen
             * si no hay .dp entonces es un %
             */
            .clip(RoundedCornerShape(50))
            .border(
                width = 5.dp, // ahora necesita un brush o un color shape
                color = Color.Red,
                shape = RoundedCornerShape(50)
            )
        /**
         * Si ponemos shape y brush:
         * brush = Brush.linearGradient(
         *      colors = listOf(Color.Red, Color.Green, Color.Blue)
         *      )
         *
         * entonces se crea un gradiente lineal
         * y se puede usar en cualquier elemento composable
         * sin importar si es un botton, texto o imagen
         */
    )
}