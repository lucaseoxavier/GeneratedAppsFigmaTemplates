package com.lucaseox.generatedappsfigmatemplates.generatedscreens.accessiblerspca

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Home
//import androidx.compose.material.icons.filled.Pets
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lucaseox.generatedappsfigmatemplates.R

@Composable
fun DietScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(horizontal = 16.dp, vertical = 8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = { /* TODO: Handle back navigation */ }) {
                Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Back")
            }
        }

        Spacer(modifier = Modifier.height(8.dp))

        Image(
            painter = painterResource(id = R.drawable.ic_placeholder),
            contentDescription = "RSPCA Logo",
            modifier = Modifier
                .height(60.dp)
                .padding(vertical = 8.dp),
            contentScale = ContentScale.Fit
        )

        Button(
            onClick = { /* TODO: Handle click */ },
            shape = MaterialTheme.shapes.large,
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF007ABF)),
            modifier = Modifier
                .fillMaxWidth(0.7f)
                .height(48.dp)
        ) {
            Text(text = "Diet", color = Color.Black, fontSize = 18.sp)
        }

        Spacer(modifier = Modifier.height(24.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp),
            verticalAlignment = Alignment.Bottom,
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Column(
                modifier = Modifier.weight(1f),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                repeat(6) {
                    Box(
                        modifier = Modifier
                            .height((20 + it * 10).dp)
                            .fillMaxWidth()
                            .background(Color(0xFF003F87 + it * 0x000F0F0F))
                    )
                }
            }

            Column(
                modifier = Modifier.weight(1f),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                repeat(6) {
                    Box(
                        modifier = Modifier
                            .height(1.dp)
                            .fillMaxWidth()
                            .background(Color(0xFF007ABF))
                    )
                    Spacer(modifier = Modifier.height(24.dp))
                }
            }
        }

        Spacer(modifier = Modifier.height(8.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(text = "Food", fontSize = 16.sp, color = Color.Black)
            Text(text = "Water", fontSize = 16.sp, color = Color.Black)
        }

        Spacer(modifier = Modifier.height(48.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = { /* TODO: Handle home click */ }) {
                Icon(imageVector = Icons.Default.Home, contentDescription = "Home", tint = Color(0xFF007ABF))
            }
            IconButton(onClick = { /* TODO: Handle add click */ }) {
                Icon(imageVector = Icons.Default.AddCircle, contentDescription = "Add", tint = Color(0xFF007ABF))
            }
            IconButton(onClick = { /* TODO: Handle pet click */ }) {
                Icon(imageVector = Icons.Default.AddCircle, contentDescription = "Pets", tint = Color(0xFF007ABF))
            }
        }
    }
}
