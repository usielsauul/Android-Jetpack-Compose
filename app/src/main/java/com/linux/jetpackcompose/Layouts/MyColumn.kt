package com.linux.jetpackcompose.Layouts

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun MyColumn(modifier: Modifier = Modifier, onItemClick:(String) -> Unit) {
    val names = listOf("Juan", "Pepe", "Andres","Juan", "Pepe", "Andres","Juan", "Pepe", "Andres","Juan", "Pepe", "Andres")
    LazyColumn {
        items(names) {
            Text(it, modifier = modifier.padding(24.dp).clickable { onItemClick(it) })
        }
    }
}