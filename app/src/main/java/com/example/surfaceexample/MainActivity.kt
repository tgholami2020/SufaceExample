package com.example.surfaceexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.surfaceexample.ui.theme.SurfaceExampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           MainScreen()
        }
    }
}
@Composable
fun MainScreen(){
    Surface (
        color = Color.Cyan,
        modifier = Modifier.fillMaxSize(),
        elevation = 2.dp,
        border = BorderStroke(1.dp, color = Color.Red)

            ){
        Column(modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceAround,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                ImageSection(resource = R.drawable.mint)
                ImageSection(resource = R.drawable.keratin)
                
            }
            Row(modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
                ) {
               ImageSection(resource = R.drawable.argan)
                ImageSection(resource = R.drawable.pepper)
            }
            Row(modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                ImageSection(resource = R.drawable.keratin)
                ImageSection(resource = R.drawable.wheat_q10)
            }
        }

    }
}
@Composable
fun ImageSection(resource:Int){
    Surface(modifier = Modifier
        .height(120.dp)
        .width(120.dp),
        border = BorderStroke(1.dp, color = Color.Black),
        elevation = 2.dp,
        shape = RectangleShape

    ) {
        Image(painter = painterResource(id = resource), contentDescription =null )
    }


}
@Composable
fun SquareBar(color: Color){
    Surface (
        color = color,
        modifier = Modifier
            .height(120.dp)
            .width(120.dp)
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