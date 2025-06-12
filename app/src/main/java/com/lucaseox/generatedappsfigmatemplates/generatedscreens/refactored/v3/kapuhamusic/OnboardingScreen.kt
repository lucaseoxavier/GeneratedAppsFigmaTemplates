package com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v3.kapuhamusic// Imports

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
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
                Brush.verticalGradient(
                    colors = listOf(
                        Color(0xFFF84A99),
                        Color(0xFF3A4076)
                    )
                )
            )
            .padding(24.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("social network", color = Color.White, fontSize = 14.sp)
            Text("for people", color = Color.White, fontSize = 14.sp)
            Text("who wants to find", color = Color.White, fontSize = 14.sp)
            Text("soulmates", color = Color.White, fontSize = 14.sp, modifier = Modifier.padding(bottom = 16.dp))
            Text("music", color = Color.White, fontSize = 12.sp)
            Text(
                text = "KAPUHA",
                color = Color.White,
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 24.dp)
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 24.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                OnboardingStepCard(
                    number = "1",
                    description = "add your favorite music",
                    contentDescription = "Person adding favorite music"
                )
                OnboardingStepCard(
                    number = "2",
                    description = "find friends, who likes the same music",
                    contentDescription = "Person finding friends with same music"
                )
                OnboardingStepCard(
                    number = "3",
                    description = "chat with them",
                    contentDescription = "Chatting with friends"
                )
            }

            Button(
                onClick = { /* TODO */ },
                shape = RoundedCornerShape(50),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFC2185B)),
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .height(48.dp)
                    .padding(horizontal = 32.dp)
            ) {
                Text(text = "start", color = Color.White)
                Icon(
                    imageVector = Icons.Default.AddCircle,
                    contentDescription = "Start",
                    modifier = Modifier.padding(start = 8.dp)
                )
            }
        }
    }
}

@Composable
private fun OnboardingStepCard(
    number: String,
    description: String,
    contentDescription: String
) {
    Column(
        modifier = Modifier
            .width(180.dp)
            .background(Color.White, RoundedCornerShape(16.dp))
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_placeholder),
            contentDescription = contentDescription,
            modifier = Modifier
                .height(100.dp)
                .fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = number,
            color = Color(0xFFC2185B), // Darker pink for contrast
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = description,
            fontSize = 14.sp,
            color = Color(0xFF4B4B4B), // Better contrast than #888888
            textAlign = TextAlign.Center
        )
    }
}
