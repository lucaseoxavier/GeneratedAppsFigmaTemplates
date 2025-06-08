package com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v1.refactoredrspca// Necessary imports

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lucaseox.generatedappsfigmatemplates.R

@Composable
fun WalkScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(horizontal = 16.dp, vertical = 24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(24.dp))

        Image(
            painter = painterResource(id = R.drawable.ic_placeholder),
            contentDescription = "RSPCA Logo",
            modifier = Modifier
                .height(48.dp)
                .padding(bottom = 16.dp)
        )

        Button(
            onClick = { /* TODO */ },
            shape = RoundedCornerShape(50),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF00AEEF)),
            modifier = Modifier
                .fillMaxWidth()
                .height(48.dp)
        ) {
            // Use dark text for better contrast
            Text(text = "Walk", fontSize = 16.sp, color = Color.Black)
        }

        Spacer(modifier = Modifier.height(24.dp))

        // First card - distinct description
        PrivateImageCard(
            title = "Walk",
            description = "Single dog on a leash card"
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Second card - distinct description
        PrivateImageCard(
            title = "Dog Walker",
            description = "Multiple dogs with dog walker card"
        )

        Spacer(modifier = Modifier.height(48.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 32.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(
                onClick = { /* TODO */ },
                modifier = Modifier.semantics {
                    contentDescription = "Home Navigation"
                }
            ) {
                Icon(Icons.Default.AddCircle, contentDescription = null, tint = Color(0xFF00AEEF))
            }
            IconButton(
                onClick = { /* TODO */ },
                modifier = Modifier.semantics {
                    contentDescription = "Add New Entry"
                }
            ) {
                Icon(Icons.Default.AddCircle, contentDescription = null, tint = Color(0xFF00AEEF))
            }
            IconButton(
                onClick = { /* TODO */ },
                modifier = Modifier.semantics {
                    contentDescription = "Help or Support"
                }
            ) {
                Icon(Icons.Default.AddCircle, contentDescription = null, tint = Color(0xFF00AEEF))
            }
        }
    }
}

@Composable
private fun PrivateImageCard(title: String, description: String) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .border(width = 1.dp, color = Color(0xFF00AEEF), shape = RoundedCornerShape(12.dp))
            .clip(RoundedCornerShape(12.dp))
            .semantics { contentDescription = description }
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_placeholder),
            contentDescription = "$title Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .height(140.dp)
        )
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = title,
                fontSize = 16.sp,
                color = Color.Black,
                fontWeight = FontWeight.Medium,
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}
