package com.example.ameliabusinesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Build
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ameliabusinesscard.ui.theme.AmeliaBusinesscardTheme



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AmeliaBusinesscardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun BusinessCard() {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(color = Color(0xFF406451))
        .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.weight(1f))

        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            val image = painterResource(R.drawable.android_logo)
            Box(
                modifier = Modifier
                    .background(
                        color = Color(0xFF9AB799),
                        shape = RoundedCornerShape(14.dp)
                    )
                    .padding(10.dp)
            ) {
                Image(
                    painter = image,
                    contentDescription = null,
                    modifier = Modifier.size(100.dp)
                )
            }

            Text(
                text = "Amelia Cortez",
                color = Color(0xFFC4F25C),
                modifier = Modifier.padding(top = 24.dp, bottom = 8.dp),
                fontWeight = FontWeight.Bold,
                fontSize = 36.sp
            )
            Text(
                text = "Reluctant Android Developer",
                color = Color(0xFFE6F5E0),
                fontStyle = FontStyle.Italic,
                fontSize = 18.sp
            )
        }


        Spacer(modifier = Modifier.weight(0.5f))
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Icon(
                    imageVector = Icons.Rounded.Call,
                    contentDescription = "phone",
                    tint = Color(0xFFC4F25C),
                    modifier = Modifier.size(24.dp)
                )
                Text(text = "989.482.1723", color = Color(0xFFE6F5E0))
            }
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Icon(
                    imageVector = Icons.Rounded.Email,
                    contentDescription = "email",
                    tint = Color(0xFFC4F25C),
                    modifier = Modifier.size(24.dp)
                )
                Text(text ="corte1al@gmail.com", color = Color(0xFFE6F5E0))
            }
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Icon(
                    imageVector = Icons.Rounded.Build,
                    contentDescription = "github",
                    tint = Color(0xFFC4F25C),
                    modifier = Modifier.size(24.dp)
                )
                Text(text = "floatingparanoia", color = Color(0xFFE6F5E0))
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    AmeliaBusinesscardTheme {
        BusinessCard()
    }
}