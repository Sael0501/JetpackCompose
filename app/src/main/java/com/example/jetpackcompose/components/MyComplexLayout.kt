package com.example.jetpackcompose.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MyComplexLayout(modifier: Modifier) {
    Row(modifier = modifier.fillMaxSize()) {
        Column(modifier = modifier.weight(1f).background(Color.Red)) {
            Box(modifier = Modifier.weight(1f).width(50.dp).background(Color.Gray))
            Box(modifier = Modifier.weight(1f).width(50.dp).background(Color.Yellow))
        }
        Column(modifier = modifier.weight(1f).background(Color.Green)) {
            Box(modifier = Modifier.weight(1f).width(25.dp).background(Color.Yellow))
            Box(modifier = Modifier.weight(1f).width(25.dp).background(Color.Black))
        }
    }
}