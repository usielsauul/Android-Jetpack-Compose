package com.linux.jetpackcompose.images

import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.linux.jetpackcompose.R

@Composable
fun MyIcon(modifier: Modifier = Modifier) {
    Icon(
        painter = painterResource(R.drawable.outline_bug_report_24),
        contentDescription = "Icon",
        modifier = modifier
    )
}