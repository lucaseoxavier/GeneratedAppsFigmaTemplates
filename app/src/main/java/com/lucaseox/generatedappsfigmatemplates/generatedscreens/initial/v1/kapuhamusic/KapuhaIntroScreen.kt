package com.lucaseox.generatedappsfigmatemplates.generatedscreens.initial.v1.kapuhamusic// Imports

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.ui.draw.clip
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import com.lucaseox.generatedappsfigmatemplates.R

@Composable
fun KapuhaIntroScreen() {
    val gradient = Brush.verticalGradient(
        colors = listOf(Color(0xFFF85888), Color(0xFF3A506B))
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(brush = gradient)
            .verticalScroll(rememberScrollState())
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(32.dp))

        // Title Section
        Text(
            text = "social network\nfor people\nwho wants to find\nsoulmates",
            fontSize = 16.sp,
            color = Color.White,
            lineHeight = 20.sp,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "music",
            fontSize = 12.sp,
            color = Color.White
        )
        Text(
            text = "KAPUHA",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White
        )

        Spacer(modifier = Modifier.height(32.dp))

        // Step Cards
        StepCard(
            step = "1",
            description = "add your favorite music"
        )
        Spacer(modifier = Modifier.height(16.dp))
        StepCard(
            step = "2",
            description = "find friends, who likes the same music"
        )
        Spacer(modifier = Modifier.height(16.dp))
        StepCard(
            step = "3",
            description = "chat with them"
        )

        Spacer(modifier = Modifier.height(32.dp))

        // Start Button
        Button(
            onClick = { /* TODO: Handle start click */ },
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp),
            shape = RoundedCornerShape(32.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF85888))
        ) {
            Text(text = "start", fontSize = 16.sp, color = Color.White)
            Spacer(modifier = Modifier.width(8.dp))
            Icon(
                imageVector = Icons.Default.AddCircle,
                contentDescription = "Start",
                tint = Color.White
            )
        }

        Spacer(modifier = Modifier.height(32.dp))
    }
}

@Composable
private fun StepCard(step: String, description: String) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(16.dp))
            .background(Color.White)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_placeholder),
            contentDescription = null,
            modifier = Modifier
                .height(120.dp)
                .fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(8.dp))
        Row(verticalAlignment = Alignment.Bottom) {
            Text(
                text = step,
                color = Color(0xFFF85888),
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = description,
                color = Color(0xFFF85888),
                fontSize = 14.sp,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}
