package com.linux.jetpackcompose.Dropdown

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.linux.jetpackcompose.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyExposedDropDownMenu(modifier: Modifier = Modifier) {

    var expanded by remember { mutableStateOf(false) }
    var selection by remember { mutableStateOf("") }

    ExposedDropdownMenuBox(
        modifier = modifier,
        expanded = expanded,
        onExpandedChange = { expanded = !expanded }
    ) {
        TextField(
            value = selection,
            onValueChange = {},
            readOnly = true,
            label = { Text("Label") },
            modifier = Modifier
                .menuAnchor()
                .fillMaxWidth(),
            trailingIcon = {
                ExposedDropdownMenuDefaults.TrailingIcon(expanded)
            }
        )

        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false }
        ) {
            DropdownMenuItem(
                onClick = {
                    selection = "Options"
                    expanded = false
                },
                text = { Text("Options") },
                leadingIcon = {
                    Icon(
                        painter = painterResource(R.drawable.rounded_settings_24),
                        contentDescription = "Settings icon"
                    )
                },

            )
            DropdownMenuItem(
                onClick = {
                    selection = "Refresh"
                    expanded = false
                },
                text = { Text("Refresh") },
                leadingIcon = {
                    Icon(
                        painter = painterResource(R.drawable.rounded_refresh_24),
                        contentDescription = "Refresh icon"
                    )
                }
            )
            DropdownMenuItem(
                onClick = {
                    selection = "Send"
                    expanded = false
                },
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