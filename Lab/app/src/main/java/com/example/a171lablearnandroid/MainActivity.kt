package com.example.a171lablearnandroid

import android.app.ListActivity
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.a171lablearnandroid.ui.theme._171LabLearnAndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            RPGCardview()
        }
    }
    @Composable
    fun RPGCardview(){
        Column(modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Gray)
            .padding(32.dp)
        ){
            //hp
            Box(modifier = Modifier
                .fillMaxWidth()
                .height(32.dp)
                .background(color = Color.White)
            ) {
                Text(
                    text = "hp",
                    modifier = Modifier
                        .align(alignment=Alignment.CenterStart)
                        .fillMaxWidth(fraction = 0.71f)
                        .background(color = Color.Red)
                        .padding(8.dp)
                )
            }
            //image
            Image(
                painter = painterResource(id = R.drawable.profile),
                contentDescription = "profile",
                modifier = Modifier
                    .size(300.dp)
                    .align(Alignment.CenterHorizontally)
                    .padding(top = 8.dp)
                    .clickable {
                        startActivity(Intent(this@MainActivity,com.example.a171lablearnandroid.ListActivity::class.java))
                    }
            )

            var str by remember { mutableStateOf(value = 90) }
            var agi by remember { mutableStateOf(value = 10) }
            var int by remember { mutableStateOf(value = 10) }

            //status
            Row(modifier = Modifier.fillMaxSize(),
                horizontalArrangement = Arrangement.SpaceBetween) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    IconButton(onClick = {
                        str = str +1
                    }){
                        Image(
                            painter = painterResource(id = R.drawable.baseline_arrow_drop_up_24),
                            contentDescription = "up",
                            modifier = Modifier.size(32.dp)
                        )
                    }
                    Text(text = "Str", fontSize = 32.sp)
                    Text(text = str.toString(), fontSize=32.sp)
                    IconButton(onClick = {
                        str = str -1
                    }){
                        Image(
                            painter = painterResource(id = R.drawable.outline_arrow_drop_down_24),
                            contentDescription = "up",
                            modifier = Modifier.size(32.dp)
                        )
                    }
                }
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    IconButton(onClick = {
                        agi = agi +1
                    }){
                        Image(
                            painter = painterResource(id = R.drawable.baseline_arrow_drop_up_24),
                            contentDescription = "up",
                            modifier = Modifier.size(32.dp)
                        )
                    }
                    Text(text = "Agi", fontSize = 32.sp)
                    Text(text = agi.toString(), fontSize=32.sp)
                    IconButton(onClick = {
                        agi = agi -1
                    }){
                        Image(
                            painter = painterResource(id = R.drawable.outline_arrow_drop_down_24),
                            contentDescription = "up",
                            modifier = Modifier.size(32.dp)
                        )
                    }
                }
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    IconButton(onClick = {
                        int = int +1
                    }){
                        Image(
                            painter = painterResource(id = R.drawable.baseline_arrow_drop_up_24),
                            contentDescription = "up",
                            modifier = Modifier.size(32.dp)
                        )
                    }
                    Text(text = "Int", fontSize = 32.sp)
                    Text(text = int.toString(), fontSize=32.sp)
                    IconButton(onClick = {
                        int = int -1
                    }){
                        Image(
                            painter = painterResource(id = R.drawable.outline_arrow_drop_down_24),
                            contentDescription = "up",
                            modifier = Modifier.size(32.dp)
                        )
                    }
                }
            }
        }
    }

    @Preview
    @Composable
    fun previewScreen(){
        RPGCardview()
    }
}