package com.example.jetpackcompose.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ChainStyle
import androidx.constraintlayout.compose.ConstraintLayout

@Composable
fun MyConstraintLayout(modifier: Modifier){
    ConstraintLayout(modifier = modifier.fillMaxSize()) {
        val (boxYellow, boxCyan, boxGray, boxGreen, boxBlack, boxBlue, boxMagenta, boxDarkGray, boxRed) = createRefs()
        Box(Modifier.size(170.dp).background(Color.Cyan).constrainAs(boxCyan){
            start.linkTo(parent.start)
            end.linkTo(boxMagenta.end)
            bottom.linkTo(boxMagenta.top)
        })
        Box(Modifier.size(170.dp).background(Color.DarkGray).constrainAs(boxDarkGray){
            end.linkTo(parent.end)
            bottom.linkTo(boxGreen.top)
            start.linkTo(boxGreen.start)
        })
        Box(Modifier.size(75.dp).background(Color.Black).constrainAs(boxBlack) {
            start.linkTo(boxCyan.end)
            end.linkTo(boxDarkGray.start)
            top.linkTo(boxCyan.top)
            bottom.linkTo(boxCyan.bottom)
        })
        Box(Modifier.size(75.dp).background(Color.Magenta).constrainAs(boxMagenta) {
            bottom.linkTo(boxYellow.top)
            end.linkTo(boxYellow.start)
        })
        Box(Modifier.size(75.dp).background(Color.Green).constrainAs(boxGreen) {
            start.linkTo(boxYellow.end)
            bottom.linkTo(boxYellow.top)
        })
        Box(Modifier.size(150.dp).background(Color.Blue).constrainAs(boxBlue){
            top.linkTo(boxYellow.bottom)
            end.linkTo(parent.end)
            start.linkTo(parent.start)
        })
        Box(Modifier.size(75.dp).background(Color.Gray).constrainAs(boxGray){
            top.linkTo(boxYellow.bottom)
            end.linkTo(boxYellow.start)
        })
        Box(Modifier.size(75.dp).background(Color.Red).constrainAs(boxRed) {
            top.linkTo(boxYellow.bottom)
            start.linkTo(boxYellow.end)
        })
        Box(Modifier.size(75.dp).background(Color.Yellow).constrainAs(boxYellow) {
            top.linkTo(parent.top)
            bottom.linkTo(parent.bottom)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
        })
    }
}

@Composable
fun ConstrainGuide(modifier: Modifier){
    ConstraintLayout(Modifier.fillMaxSize()) {
        val boxRed = createRef()
        val topGuide = createGuidelineFromTop(0.1f)

        Box(Modifier.size(150.dp).background(Color.Red).constrainAs(boxRed) {
            top.linkTo(topGuide)
        })
    }
}

@Composable
fun ConstraintBarrier(modifier: Modifier) {
    ConstraintLayout(modifier.fillMaxSize()) {
        val (boxRed, boxBlue, boxMagenta) = createRefs()
        val barrier = createEndBarrier(boxRed, boxBlue)

        Box(Modifier.size(50.dp).background(Color.Red).constrainAs(boxRed) {
            top.linkTo(parent.top)
            start.linkTo(parent.start)
        })
        Box(Modifier.size(200.dp).background(Color.Blue).constrainAs(boxBlue) {
            top.linkTo(boxRed.bottom)
            start.linkTo(parent.start, margin = 20.dp)

        })
        Box(Modifier.size(70.dp).background(Color.Magenta).constrainAs(boxMagenta) {
            start.linkTo(barrier)
        })
    }
}

@Composable
fun ConstraintsChain(modifier: Modifier) {
    ConstraintLayout(modifier.fillMaxSize()) {
        val (boxRed, boxBlue, boxMagenta) = createRefs()

        Box(Modifier.size(100.dp).background(Color.Red).constrainAs(boxRed) {

        })
        Box(Modifier.size(100.dp).background(Color.Blue).constrainAs(boxBlue) {
            start.linkTo(parent.start)
            end.linkTo(parent.end)
        })
        Box(Modifier.size(100.dp).background(Color.Magenta).constrainAs(boxMagenta) {
        })

        createVerticalChain(boxRed, boxBlue, boxMagenta, chainStyle = ChainStyle.Packed)
    }
}