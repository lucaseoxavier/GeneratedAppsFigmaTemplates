package com.lucaseox.generatedappsfigmatemplates.generatedscreens.accessiblerspca// Necessary imports

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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lucaseox.generatedappsfigmatemplates.R

@Composable
fun RegisterPetScreen() {
    val contrastSafeBlue = Color(0xFF007DC3) // Darker blue with better contrast

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(vertical = 16.dp, horizontal = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Top back icon (contrast adjusted)
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Default.AddCircle,
                contentDescription = "Back",
                tint = contrastSafeBlue,
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

        // Button with better contrast
        Button(
            onClick = { /* Handle registration */ },
            colors = ButtonDefaults.buttonColors(containerColor = contrastSafeBlue),
            shape = RoundedCornerShape(50),
            modifier = Modifier
                .padding(vertical = 12.dp)
                .height(48.dp)
        ) {
            Text(
                text = "Registering a New Pet",
                fontSize = 16.sp,
                color = Color.White
            )
        }

        PetOptionCard(title = "Dog")
        Spacer(modifier = Modifier.height(16.dp))
        PetOptionCard(title = "Cat")
        Spacer(modifier = Modifier.height(32.dp))

        // Bottom navigation
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            IconButton(onClick = {}) {
                Icon(
                    imageVector = Icons.Default.Home,
                    contentDescription = "Home",
                    tint = contrastSafeBlue
                )
            }
            IconButton(onClick = {}) {
                Icon(
                    imageVector = Icons.Default.AddCircle,
                    contentDescription = "Add",
                    tint = contrastSafeBlue
                )
            }
            IconButton(onClick = {}) {
                Icon(
                    imageVector = Icons.Default.AddCircle,
                    contentDescription = "Pets",
                    tint = contrastSafeBlue
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
            .clickable { /* Handle click */ },
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
                color = Color.Black,
                modifier = Modifier
                    .padding(vertical = 12.dp)
                    .fillMaxWidth(),
                textAlign = androidx.compose.ui.text.style.TextAlign.Center
            )
        }
    }
}
