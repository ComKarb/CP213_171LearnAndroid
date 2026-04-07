package com.example.a171lablearnandroid

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


class MenuActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)
            ) {

                Button(onClick = {
                    startActivity(
                        Intent(this@MenuActivity, RPGCardActivity::class.java)
                    )
                }) {
                    Text(text = "RPGCardActivity")
                }

                Button(onClick = {
                    startActivity(
                        Intent(this@MenuActivity, PokedexActivity::class.java)
                    )
                }) {
                    Text(text = "PokedexActivity")
                }

                Button(onClick = {
                    startActivity(
                        Intent(this@MenuActivity, LifeCycleComposeActivity::class.java)
                    )
                }) {
                    Text(text = "LifeCycleComposeActivity")
                }
                Button(onClick = {
                    startActivity(
                        Intent(this@MenuActivity, SharePreferencesActivity::class.java)
                    )
                }) {
                    Text(text = "SharePreferencesActivity")
                }
                
                Button(onClick = {
                    startActivity(
                        Intent(this@MenuActivity, GalleryPermissionActivity::class.java)
                    )
                }) {
                    Text(text = "GalleryPermissionActivity")
                }

                Button(onClick = {
                    startActivity(
                        Intent(this@MenuActivity, SensorActivity::class.java)
                    )
                }) {
                    Text(text = "SensorActivity")
                }
                Button(onClick = {
                    startActivity(
                        Intent(this@MenuActivity, Part1AnimationActivity::class.java)
                    )
                }) {
                    Text(text = "Part1AnimationActivity")
                }
                Button(onClick = {
                    startActivity(
                        Intent(this@MenuActivity, Part2Activity::class.java)
                    )
                }) {
                    Text(text = "Part2Activity")
                }
                Button(onClick = {
                    startActivity(
                        Intent(this@MenuActivity, Part3Activity::class.java)
                    )
                }) {
                    Text(text = "Part3Activity")
                }
                Button(onClick = {
                    startActivity(
                        Intent(this@MenuActivity, Part4Activity::class.java)
                    )
                }) {
                    Text(text = "Part4Activity")
                }
                Button(onClick = {
                    startActivity(
                        Intent(this@MenuActivity, Part5Activity::class.java)
                    )
                }) {
                    Text(text = "Part5Activity")
                }
                Button(onClick = {
                    startActivity(
                        Intent(this@MenuActivity, Part6Activity::class.java)
                    )
                }) {
                    Text(text = "Part6Activity")
                }
            }
        }
    }
}