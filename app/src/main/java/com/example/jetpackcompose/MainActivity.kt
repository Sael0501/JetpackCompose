package com.example.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
        }
    }
}

@Preview
@Composable
fun app() {
    LazyColumn(
        modifier =
            Modifier
                .fillMaxSize()
                .background(Color.LightGray)
                .padding(16.dp),
    ) {
        item {
            Text(
                text = "CrowDev",
                fontSize = 40.sp,
                textAlign = TextAlign.Center,
                color = Color.Red,
                modifier = Modifier.fillMaxWidth(),
            )
            Row {
                Image(
                    modifier =
                        Modifier
                            .fillMaxWidth()
                            .fillMaxHeight(),
                    painter = painterResource(id = R.drawable.crow_logo),
                    contentDescription = "Crow dev logo",
                )
            }
            Row(Modifier.padding(top = 8.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.ic_favorite),
                    contentDescription = "crowLike",
                )
                Text(
                    text = "1",
                    color = Color.Red,
                    modifier =
                        Modifier
                            .padding(start = 4.dp)
                            .align(Alignment.CenterVertically)
                            .clickable {
                                
                            }
                )
            }
        }
    }
}
