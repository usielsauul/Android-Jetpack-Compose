package com.linux.jetpackcompose.Texts

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.sp

/**
 * Documentacion sobre el curso de Jetpack Compose de Udemy
 * esta documentacion es sobre el componente componible:
 * Text()
 */

@Composable
fun MyText(modifier: Modifier) {
    Column(modifier = modifier) {
        // normal text
        Text(
            text = "Android!",
        )
        // text with color (example: Red)
        Text(
            text = "Android!",
            color = Color.Red
        )
        // text with font size (example: 25.sp)
        Text(
            text = "Android!",
            fontSize = 25.sp
        )
        // text with font style (example: Italic)
        Text(
            text = "Android!",
            fontStyle = FontStyle.Italic
        )
        // text with font weight (example: Bold)
        Text(
            text = "Android!",
            fontWeight = FontWeight.ExtraBold
        )
        //  text with letter spacing (example: 1.sp)
        Text(
            text = "Android!",
            letterSpacing = 1.sp
        )
        // text decoration (example: Underline + LineThrough)
        Text(
            text = "Android!",
            textDecoration = TextDecoration.Underline + TextDecoration.LineThrough
        )
        // text clickable (example: text is blue)
        Text(
            text = "Android!",
            textDecoration = TextDecoration.Underline,
            color = Color.Blue,
            modifier = Modifier.clickable {}
        )
        // text with elipsis
        Text(
            text = "Android!, Android!, Android!, Android!, Android!, Android!, Android!, Android!, Android!, Android!, Android!, Android!, Android!, Android!, Android!, Android!, Android!, Android!, Android!, Android!, Android!, Android!, Android!,",
            modifier = Modifier.fillMaxWidth(),
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
            /**
             * text with elipsis: to fine-tune the elements thath are not visible
             * text with clip: cut the text
             * text with visible: show the text
             */
        )
    }
}