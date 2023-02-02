package com.example.jetpackconposecourseprofiledog.course2

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackconposecourseprofiledog.R
import com.example.jetpackconposecourseprofiledog.course2.ui.theme.JetpackConposeCourseProfileDogTheme

class RowsColumnsMainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackConposeCourseProfileDogTheme() {
                Surface(modifier = Modifier.fillMaxSize()) {
                    MessageCard(Message("Android", "Jetpack Compose"))
                }
            }
//            Column(horizontalAlignment = Alignment.CenterHorizontally) {
//            }
        }
    }
}


@Composable
fun MessageCard(name: String) {
    Text(text = "Hello $name!")
}

@Preview(name = "Light Mode")
@Preview(
    showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES, name = "Dark Mode"
) //  bật chế độ tối
@Composable
fun PreviewMessageCard() {
    JetpackConposeCourseProfileDogTheme() {
        Surface(modifier = Modifier.fillMaxSize()) { // màn hình
            MessageCard(Message("Android", "Jetpack Compose"))
        }
    }
}

data class Message(val author: String, val body: String)

@Composable
fun MessageCard(msg: Message) {
    // all thể hiện cách lề trong là 8 dp
    Row(modifier = Modifier.padding(all = 8.dp)) {
        Image(
            painter = painterResource(R.drawable.imagegirl),
            contentDescription = null,
            modifier = Modifier
                .size(40.dp) // size ảnh
                .clip(CircleShape) // bo ảnh
                .border(
                    1.5.dp, MaterialTheme.colors.secondary, CircleShape
                ),// viền vòng tròn và màu của nó
            contentScale = ContentScale.Crop // style ảnh
        )

        Spacer(modifier = Modifier.width(8.dp))// cách 1 khoảng 8 dm

        var isExpanded by remember { mutableStateOf(false) }


        Column(modifier = Modifier.clickable {
            isExpanded = !isExpanded
        }) {
            Text(
                text = msg.author,
                color = MaterialTheme.colors.secondaryVariant,
                style = MaterialTheme.typography.subtitle2
            )
            Spacer(modifier = Modifier.width(4.dp))
            Surface(shape = MaterialTheme.shapes.medium, elevation = 1.dp) {
                Text(
                    text = msg.body,
                    style = MaterialTheme.typography.body2,
                    maxLines = if (isExpanded) Int.MAX_VALUE else 1,
                )
            }
        }

    }
}

@Composable
fun Conversation(messages: List<Message>) {
    LazyColumn {
        items(messages) { message ->
            MessageCard(message)
        }
    }
}