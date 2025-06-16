package com.example.jetpackcompose.components

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun MyRow(modifier: Modifier) {
    Row (modifier = modifier.fillMaxSize().horizontalScroll(rememberScrollState())) {
        Text("Hola",modifier = Modifier.weight(1f))
        Text("Hola2", modifier = Modifier.weight(1f))
        Text("Hola3", modifier = Modifier.weight(1f))
        Text("Hola4", modifier = Modifier.weight(1f))
        Text("Hola5", modifier = Modifier.weight(1f))
        Text("Hola6", modifier = Modifier.weight(1f))
    }
}