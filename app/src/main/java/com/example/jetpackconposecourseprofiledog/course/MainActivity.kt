package com.example.jetpackconposecourseprofiledog.course

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.jetpackconposecourseprofiledog.ProfilePage
import com.example.jetpackconposecourseprofiledog.course.theme.JetpackConposeCourseProfileDogTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // body nằm ở đây
        setContent {
            JetpackConposeCourseProfileDogTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background
                ) {
                    ProfilePage()
                }
            }
        }
    }
}

@Composable
fun MyApp() {
    Text(text = "Hello Dinh Minh" ,
        fontSize = 30.sp
        )
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyApp()
//    JetpackConposeCourseProfileDogTheme {
//        Greeting("Android")
//    }
}
