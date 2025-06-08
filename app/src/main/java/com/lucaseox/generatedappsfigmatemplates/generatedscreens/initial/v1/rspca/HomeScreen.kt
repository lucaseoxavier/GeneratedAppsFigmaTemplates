package com.lucaseox.generatedappsfigmatemplates.generatedscreens.initial.v1.rspca// Required Imports

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lucaseox.generatedappsfigmatemplates.R

@Composable
fun HomeScreen() {
    val scrollState = rememberScrollState()

    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        // Background image
        Image(
            painter = painterResource(id = R.drawable.ic_placeholder),
            contentDescription = "Background Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

        // Content with scroll
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(scrollState)
                .padding(vertical = 32.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Logo placeholder
            Image(
                painter = painterResource(id = R.drawable.ic_placeholder),
                contentDescription = "App Logo",
                modifier = Modifier
                    .size(120.dp)
                    .padding(top = 16.dp)
            )

            Spacer(modifier = Modifier.height(24.dp))

            // Main navigation buttons
            HomeScreenButton(
                label = "Home",
                isPrimary = true
            )

            HomeScreenButton(label = "Current Pets")
            HomeScreenButton(label = "Registering a New Pet")
            HomeScreenButton(label = "Services")
            HomeScreenButton(label = "Adopt")
            HomeScreenButton(label = "Log Out")
        }
    }
}

@Composable
private fun HomeScreenButton(
    label: String,
    isPrimary: Boolean = false
) {
    val buttonColors = if (isPrimary) {
        ButtonDefaults.buttonColors(
            containerColor = Color(0xFF00B0EA),
            contentColor = Color.White
        )
    } else {
        ButtonDefaults.outlinedButtonColors(
            contentColor = Color(0xFF00B0EA)
        )
    }

    val buttonModifier = Modifier
        .fillMaxWidth(0.8f)
        .height(50.dp)
        .padding(vertical = 8.dp)

    if (isPrimary) {
        Button(
            onClick = { /* Handle click */ },
            modifier = buttonModifier,
            colors = buttonColors,
            shape = MaterialTheme.shapes.large
        ) {
            Text(text = label, fontSize = 16.sp, fontWeight = FontWeight.Bold)
        }
    } else {
        OutlinedButton(
            onClick = { /* Handle click */ },
            modifier = buttonModifier,
            colors = buttonColors,
            shape = MaterialTheme.shapes.large,
            border = ButtonDefaults.outlinedButtonBorder
        ) {
            Text(text = label, fontSize = 16.sp, fontWeight = FontWeight.Bold)
        }
    }
}
