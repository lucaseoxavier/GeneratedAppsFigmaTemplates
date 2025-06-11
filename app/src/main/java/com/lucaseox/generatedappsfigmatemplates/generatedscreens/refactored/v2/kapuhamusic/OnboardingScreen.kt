package com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v2.kapuhamusic// Necessary imports

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lucaseox.generatedappsfigmatemplates.R

@Composable
fun OnboardingScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(Color(0xFFDD2A7B), Color(0xFF673AB7))
                )
            )
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp)
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "social network\nfor people\nwho wants to find\nsoulmates",
                color = Color.White,
                fontSize = 16.sp,
                lineHeight = 22.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(top = 24.dp)
            )

            Text(
                text = "music",
                color = Color(0xFFFDEEF4),
                fontSize = 14.sp,
                modifier = Modifier.padding(top = 12.dp)
            )

            Text(
                text = "KAPUHA",
                color = Color.White,
                fontSize = 36.sp,
                fontWeight = FontWeight.ExtraBold,
                modifier = Modifier.padding(vertical = 16.dp)
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 24.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                OnboardingCard(
                    number = "1",
                    description = "add your favorite music",
                    imageContentDescription = "Illustration: add music"
                )
                OnboardingCard(
                    number = "2",
                    description = "find friends, who likes the same music",
                    imageContentDescription = "Illustration: find friends"
                )
                OnboardingCard(
                    number = "3",
                    description = "chat with them",
                    imageContentDescription = "Illustration: chat with friends"
                )
            }

            Button(
                onClick = { /* TODO: Handle start click */ },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFE91E63)),
                shape = RoundedCornerShape(50),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(48.dp)
            ) {
                Text(
                    text = "start",
                    color = Color.White,
                    fontSize = 16.sp
                )
                Spacer(modifier = Modifier.width(8.dp))
                Icon(
                    imageVector = Icons.Default.AddCircle,
                    contentDescription = "Start Icon",
                    tint = Color.White
                )
            }
        }
    }
}

@Composable
private fun OnboardingCard(
    number: String,
    description: String,
    imageContentDescription: String
) {
    Column(
        modifier = Modifier
            .width(200.dp)
            .background(Color.White, shape = RoundedCornerShape(16.dp))
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_placeholder),
            contentDescription = imageContentDescription,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .height(120.dp)
                .fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(12.dp))

        Text(
            text = number,
            fontSize = 28.sp,
            color = Color(0xFFD81B60),
            fontWeight = FontWeight.Bold
        )

        Text(
            text = description,
            fontSize = 14.sp,
            color = Color(0xFF333333), // Higher contrast
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(top = 8.dp)
        )
    }
}
