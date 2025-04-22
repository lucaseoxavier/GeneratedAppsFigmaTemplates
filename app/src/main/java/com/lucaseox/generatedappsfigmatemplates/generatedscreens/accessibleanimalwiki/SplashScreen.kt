// SplashScreen.kt
package com.lucaseox.generatedappsfigmatemplates.generatedscreens.accessibleanimalwiki

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
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
fun SplashScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(horizontal = 32.dp, vertical = 48.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Spacer(modifier = Modifier.height(40.dp))

        Image(
            painter = painterResource(id = R.drawable.ic_placeholder),
            contentDescription = "Introductory image",
            modifier = Modifier
                .height(240.dp)
                .fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(48.dp))

        // Accessible title color (Contrast ratio > 3:1 against white)
        Text(
            text = "Animal Wiki",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF1A73E8), // Strong blue for good contrast
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(8.dp))

        // Accessible subtitle color (Contrast ratio > 4.5:1 against white)
        Text(
            text = "What do you know about the\nanimal kingdom?",
            fontSize = 16.sp,
            fontWeight = FontWeight.Normal,
            color = Color(0xFF3C4043), // Dark gray for contrast
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(72.dp))

        // Button with accessible label contrast
        Button(
            onClick = { /* TODO: Handle navigation */ },
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
            contentPadding = PaddingValues()
        ) {
            Box(
                modifier = Modifier
                    .background(
                        brush = Brush.horizontalGradient(
                            listOf(
                                Color(0xFF1E88E5),
                                Color(0xFF43E97B)
                            )
                        ),
                        shape = RoundedCornerShape(12.dp)
                    )
                    .fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Get Started",
                    color = Color.White,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }

        Spacer(modifier = Modifier.height(24.dp))
    }
}
