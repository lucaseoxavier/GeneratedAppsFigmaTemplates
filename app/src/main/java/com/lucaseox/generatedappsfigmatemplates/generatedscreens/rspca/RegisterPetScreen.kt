package com.lucaseox.generatedappsfigmatemplates.generatedscreens.rspca// Necessary imports

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Home
//import androidx.compose.material.icons.filled.Pets
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lucaseox.generatedappsfigmatemplates.R

@Composable
fun RegisterPetScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(vertical = 16.dp, horizontal = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Top back icon
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Default.AddCircle,
                contentDescription = "Back",
                tint = Color(0xFF00B0EA),
                modifier = Modifier
                    .size(24.dp)
                    .clickable { /* Handle back action */ }
            )
        }

        // Logo placeholder
        Image(
            painter = painterResource(id = R.drawable.ic_placeholder),
            contentDescription = "RSPCA Logo",
            modifier = Modifier
                .height(48.dp)
                .padding(vertical = 8.dp)
        )

        // Header button
        Button(
            onClick = { /* Handle new pet registration */ },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF00B0EA)),
            shape = RoundedCornerShape(50),
            modifier = Modifier
                .padding(vertical = 12.dp)
                .height(48.dp)
        ) {
            Text(
                text = "Registering a New Pet",
                fontSize = 16.sp,
                color = Color.White,
                fontWeight = FontWeight.Bold
            )
        }

        // Pet card options
        PetOptionCard(title = "Dog")
        Spacer(modifier = Modifier.height(16.dp))
        PetOptionCard(title = "Cat")

        Spacer(modifier = Modifier.height(32.dp))

        // Bottom navigation
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            IconButton(onClick = { /* Navigate to home */ }) {
                Icon(
                    imageVector = Icons.Default.Home,
                    contentDescription = "Home",
                    tint = Color(0xFF00B0EA)
                )
            }
            IconButton(onClick = { /* Add new */ }) {
                Icon(
                    imageVector = Icons.Default.AddCircle,
                    contentDescription = "Add",
                    tint = Color(0xFF00B0EA)
                )
            }
            IconButton(onClick = { /* Show pet hand */ }) {
                Icon(
                    imageVector = Icons.Default.AddCircle,
                    contentDescription = "Pets",
                    tint = Color(0xFF00B0EA)
                )
            }
        }
    }
}

@Composable
private fun PetOptionCard(title: String) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                color = Color.White,
                shape = RoundedCornerShape(16.dp)
            )
            .clickable { /* Handle pet selection */ }
            .wrapContentHeight(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_placeholder),
            contentDescription = "$title Image",
            modifier = Modifier
                .fillMaxWidth()
                .height(180.dp)
                .padding(4.dp),
            contentScale = ContentScale.Crop
        )
        Surface(
            shape = RoundedCornerShape(bottomStart = 16.dp, bottomEnd = 16.dp),
            tonalElevation = 1.dp,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = title,
                fontSize = 18.sp,
                fontWeight = FontWeight.Medium,
                color = Color.Black,
                modifier = Modifier
                    .padding(vertical = 12.dp)
                    .fillMaxWidth(),
                textAlign = TextAlign.Center
            )
        }
    }
}
