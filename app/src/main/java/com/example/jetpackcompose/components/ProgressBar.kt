package com.example.jetpackcompose.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.unit.dp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.jetpackcompose.R

@Composable
fun MyProgressBar(modifier: Modifier) {
    Column(
        modifier = modifier.fillMaxSize(),
        Arrangement.Center,
        Alignment.CenterHorizontally
    ) {
        Progress()
        Spacer(Modifier.height(10.dp))
        LinerProgress()
        Spacer(Modifier.height(10.dp))
        ProgressAnimation()
    }

}

@Composable
fun Progress() {
    CircularProgressIndicator(
        progress = { 0.5f },
        Modifier.size(50.dp),
        color = Color.Red,
        strokeWidth = 5.dp,
        trackColor = Color.Green
    )
}

@Composable
fun LinerProgress() {
    LinearProgressIndicator(
        color = Color.Green,
        trackColor = Color.Blue,
        strokeCap = StrokeCap.Round
    )
}

@Composable
fun ProgressAnimation(modifier: Modifier = Modifier) {
    val composition by  rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.sharingan_loader))

    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        LottieAnimation(
            composition = composition,
            iterations = LottieConstants.IterateForever
        )
    }
}
