package com.example.jetpackcompose.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.example.jetpackcompose.R

@Composable
fun MyImageScreen(modifier: Modifier) {

    Column(modifier = modifier) {
        MyImage()
        NetworkImage()
        MyIcon()
    }
}

@Composable
fun MyImage() {
    Image(
        painter = painterResource(
            R.drawable.ic_launcher_foreground
        ),
        contentDescription = null,
        contentScale = ContentScale.FillBounds,
        modifier = Modifier
            .size(200.dp)
            .clip(RoundedCornerShape(50))
            .background(Color.Black)
            .border(
                width = 10.dp, shape = CircleShape, brush = Brush.linearGradient(
                    colors = listOf(
                        Color.Red,
                        Color.Blue,
                        Color.Green,
                        Color.Yellow
                    )
                )
            )
    )
}

@Composable
fun NetworkImage() {

    val sharingan = "https://w7.pngwing.com/pngs/543/49/png-transparent-kakashi-hatake-sasuke-uchiha-itachi-uchiha-orochimaru-uchiha-clan-naruto-manga-smiley-cartoon.png"
    AsyncImage(model = sharingan, contentDescription = "")
}

@Composable
fun MyIcon() {
    Icon(
        painter = painterResource(R.drawable.ic_launcher_foreground),
        contentDescription = null,
        modifier = Modifier.size(200.dp),
        tint = Color.Gray
    )
}
