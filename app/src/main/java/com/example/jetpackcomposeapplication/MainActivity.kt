package com.example.jetpackcomposeapplication

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposeapplication.ui.theme.JetpackComposeApplicationTheme
import com.example.jetpackcomposeapplication.ui.theme.Purple700

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeApplicationTheme {
                // A surface container using the 'background' color from the theme
//                Surface(color = MaterialTheme.colors.background) {
//                    Greeting("Android")
//                }
                Scaffold(
                    topBar = {
                        TopAppBar(
                            title = {
                                Text(text = "TopAppBar")
                            },
                            navigationIcon = {
                                IconButton(onClick = { }) {
                                    Icon(Icons.Filled.Menu, "")
                                }
                            },
                            backgroundColor = Color.Blue,
                            contentColor = Color.White,
                            elevation = 12.dp
                        )
                    }, content = {
                        Greeting("Android")
                    })
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!",
        color = Purple700,
        fontSize = 16.0.sp,
        modifier = Modifier
            .clickable {
                Log.e("my", "click")
            }
            .padding(16.dp)
    )
}


//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview() {
//    JetpackComposeApplicationTheme {
//        Greeting("Android")
//    }
//}