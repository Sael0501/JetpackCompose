package com.example.jetpackcompose.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MyButtonParent(modifier: Modifier) {

    Column(modifier = modifier) {
        MyButton()
        MyOutlinedButton()
        MyTextButton()
        MyElevatedButton()
        MyFilledTonalButton()
    }
}

@Composable
fun MyButton() {
    Button(
        onClick = { },
        enabled = true,
        border = BorderStroke(3.dp, Color.Red),
        shape = RoundedCornerShape(30),
        colors = ButtonDefaults.buttonColors(
            contentColor = Color.Red,
            containerColor = Color.Black
        )
    ) {
        Text("Button")
    }
}

@Composable
fun MyOutlinedButton() {
    OutlinedButton(
        onClick = {},
        enabled = true,
        shape = RoundedCornerShape(30),
        border = BorderStroke(3.dp, Color.Red),
        colors = ButtonDefaults.outlinedButtonColors(
            contentColor = Color.Red,
            containerColor = Color.Black
        )
    ) { Text("OutlinedButton") }
}

@Composable
fun MyTextButton() {
    TextButton(
        onClick = {}
    ) {Text("TextButton") }
}

@Composable
fun MyElevatedButton() {
    ElevatedButton(
        onClick = {}
    ) { Text("ElevatedButton") }
}

@Composable
fun MyFilledTonalButton() {
    FilledTonalButton(onClick = {}) {Text("FilledTonalButton") }
}