package com.example.surfaceexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.surfaceexample.ui.theme.SurfaceExampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SurfaceExampleTheme {
                // A surface container using the 'background' color from the theme
                Surface(                  // Surface can have one child directly
                    modifier = Modifier.fillMaxSize(),
                    color = Color.Green
                ) {
                    Row (
                        modifier = Modifier.fillMaxSize(),
                        horizontalArrangement = Arrangement.SpaceEvenly,
                        verticalAlignment = Alignment.CenterVertically
                            ){
                        HorizontalBar(color = Color.Red)
                        HorizontalBar(color = Color.Yellow)
                        HorizontalBar(color = Color.Blue)
                    }
                }

            }
        }
    }
}
@Composable
fun HorizontalBar(color: Color){
    Surface (
        color = color,
        modifier = Modifier
            .height(400.dp)
            .width(50.dp)
    ){
    }

    }

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    SurfaceExampleTheme {
        Greeting("Android")
    }
}