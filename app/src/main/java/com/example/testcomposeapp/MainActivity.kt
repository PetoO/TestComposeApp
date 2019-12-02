package com.example.testcomposeapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.core.setContent
import androidx.ui.foundation.shape.border.Border
import androidx.ui.graphics.Color
import androidx.ui.layout.Column
import androidx.ui.layout.Spacing
import androidx.ui.material.MaterialTheme
import androidx.ui.material.surface.Surface
import androidx.ui.tooling.preview.Preview

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DefaultPreview()
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!", modifier = Spacing(24.dp)  )
}

@Preview
@Composable
fun DefaultPreview() {
    MaterialTheme {
        Column() {
            Surface(color = Color.Cyan, border = Border(color = Color.Red, width = 2.dp) ) {
                Greeting("Android")
            }
            Surface(color = Color.Cyan, border = Border(color = Color.Red, width = 2.dp) ) {
                Greeting("Android")
            }
            Surface(color = Color.Cyan, border = Border(color = Color.Red, width = 2.dp) ) {
                Greeting("Android")
            }
        }
    }
}
