package com.linux.jetpackcompose.Dropdown

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.linux.jetpackcompose.R

@Composable
fun MyDropDownnMenu(modifier: Modifier = Modifier) {

    var expanded by remember { mutableStateOf(false) }

    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box {
            IconButton(
                onClick = { expanded = true }
            ) {
                Icon(
                    painter = if (expanded) {
                        painterResource(R.drawable.outline_unfold_less_24)
                    } else {
                        painterResource(R.drawable.outline_unfold_more_24)
                    },
                    contentDescription = "Menu desplegable"
                )
            }

            DropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded = false }
            ) {
                DropdownMenuItem(
                    onClick = {},
                    text = { Text("Options") },
                    leadingIcon = {
                        Icon(
                            painter = painterResource(R.drawable.rounded_settings_24),
                            contentDescription = "Settings icon"
                        )
                    }
                )
                DropdownMenuItem(
                    onClick = {},
                    text = { Text("Refresh") },
                    leadingIcon = {
                        Icon(
                            painter = painterResource(R.drawable.rounded_refresh_24),
                            contentDescription = "Refresh icon"
                        )
                    }
                )
                DropdownMenuItem(
                    onClick = {},
                    text = { Text("Send") },
                    leadingIcon = {
                        Icon(
                            painter = painterResource(R.drawable.rounded_send_24),
                            contentDescription = "Send icon"
                        )
                    }
                )
            }
        }
    }

}

