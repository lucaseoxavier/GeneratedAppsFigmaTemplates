package com.lucaseox.generatedappsfigmatemplates.generatedscreens.accessibleanimalwiki

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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lucaseox.generatedappsfigmatemplates.R

@Composable
fun AnimalCardScreen() {
    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_placeholder),
            contentDescription = "Tiger image",
            modifier = Modifier
                .size(240.dp)
                .clip(RoundedCornerShape(120.dp))
        )

        Spacer(modifier = Modifier.height(24.dp))

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "Tiger",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF0077CC) // Updated for better contrast
            )

            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    imageVector = Icons.Default.AddCircle,
                    contentDescription = "Favorite icon",
                    tint = Color(0xFF0077CC),
                    modifier = Modifier.size(24.dp)
                )
                Spacer(modifier = Modifier.width(12.dp))
                Icon(
                    imageVector = Icons.Default.AddCircle,
                    contentDescription = "Share icon",
                    tint = Color(0xFF0077CC),
                    modifier = Modifier.size(24.dp)
                )
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Box(modifier = Modifier.fillMaxWidth()) {
            Text(
                text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Dolor vulputate duis velit accumsan. Non, dolor amet, eleifend elit. Nisl leo ac morbi feugiat in in elit. Mattis eget augue dolor aliquam. Ultrices eget bibendum dis id parturient purus arcu. Congue tellus cras in ac elementum augue. Sed integer accumsan suscipit malesuada.",
                fontSize = 14.sp,
                color = Color(0xFF4D4D4D), // Better contrast than #888888
                modifier = Modifier
                    .padding(end = 8.dp)
                    .align(Alignment.CenterStart)
            )

            Box(
                modifier = Modifier
                    .width(2.dp)
                    .fillMaxHeight()
                    .background(Color(0xFF0077CC))
                    .align(Alignment.CenterEnd)
            )
        }

        Spacer(modifier = Modifier.height(32.dp))

        Button(
            onClick = { /* TODO: Handle click */ },
            shape = RoundedCornerShape(16.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
            contentPadding = PaddingValues()
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp)
                    .background(
                        brush = Brush.horizontalGradient(
                            listOf(Color(0xFF377DFF), Color(0xFF2AF598))
                        ),
                        shape = RoundedCornerShape(16.dp)
                    ),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Get started",
                    color = Color.White, // Pure white for max contrast
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp
                )
            }
        }

        Spacer(modifier = Modifier.height(32.dp))
    }
}
