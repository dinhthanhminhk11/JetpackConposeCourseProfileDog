package com.example.jetpackconposecourseprofiledog

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun ProfilePage() {
    Card(
        elevation = 5.dp,
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 100.dp, horizontal = 16.dp)
            .border(width = 2.dp, color = Color.White, shape = RoundedCornerShape(30.dp))
    ) {
        Column(
            Modifier.verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.imagegirl),
                contentDescription = "imagegirl",
                modifier = Modifier // chiều dài so với colums
                    .size(200.dp) //
                    .clip(
                        CircleShape
                    )
                    .border(width = 2.dp, color = Color.Blue, shape = CircleShape),
                contentScale = ContentScale.Crop // style image
            ) /// painterResource giong src contentDescription nooi jdung cua anh

            Text(text = "Dinh MInh")
            Text(text = "Dinh MInh")

            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp)
            ) {
/*            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "150", fontWeight = FontWeight.Bold)
                Text(text = "test1")
            }
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "110", fontWeight = FontWeight.Bold)
                Text(text = "test2")
            }
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "140", fontWeight = FontWeight.Bold)
                Text(text = "test3")
            }*/
                ProfileStatus("140", "test3")
                ProfileStatus("140", "test3")
                ProfileStatus("140", "test3")
            }

            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp)
            ) {
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Click1")
                }
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Click1")
                }
            }
        }
    }
}

@Composable
fun ProfileStatus(count: String, title: String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = count, fontWeight = FontWeight.Bold)
        Text(text = title)
    }
}

@Preview(showBackground = true)
@Composable
fun ProfilePagePreview() {
    ProfilePage()
}