package com.lucaseox.generatedappsfigmatemplates.generatedscreens.initial.v3.animalwiki// Required imports

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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lucaseox.generatedappsfigmatemplates.R

@Composable
fun AnimalWikiScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .background(
                Brush.verticalGradient(
                    colors = listOf(Color.White, Color(0xFF005BEA))
                )
            )
            .padding(16.dp)
    ) {
        TopBar()
        Spacer(modifier = Modifier.height(24.dp))
        Text(
            text = "Animal Wiki",
            style = MaterialTheme.typography.headlineMedium.copy(
                fontWeight = FontWeight.Bold,
                color = Color(0xFF4A90E2)
            )
        )
        Spacer(modifier = Modifier.height(24.dp))
        CategoryChips()
        Spacer(modifier = Modifier.height(24.dp))
        AnimalCard(title = "Lions", subtitle = "Mammifère")
        AnimalCard(title = "Tigre", subtitle = "Mammifère")
        AnimalCard(title = "Tortue", subtitle = "Mammifère")
        AnimalCard(title = "Elephant", subtitle = "Mammifère")
    }
}

@Composable
private fun TopBar() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = Icons.Default.AddCircle,
            contentDescription = "Search Icon",
            tint = Color(0xFF4A90E2)
        )
        Icon(
            imageVector = Icons.Default.AddCircle,
            contentDescription = "Menu Icon",
            tint = Color(0xFF4A90E2)
        )
    }
}

@Composable
private fun CategoryChips() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        AssistChip(onClick = {}, label = {
            Text(text = "Popular")
        })
        TextButton(onClick = {}) {
            Text(text = "Mammalians")
        }
        TextButton(onClick = {}) {
            Text(text = "Amphibiens")
        }
        TextButton(onClick = {}) {
            Text(text = "Oiseaux")
        }
    }
}

@Composable
private fun AnimalCard(title: String, subtitle: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Row(
            modifier = Modifier
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = subtitle,
                    style = MaterialTheme.typography.bodySmall.copy(
                        color = Color(0xFF4A90E2),
                        fontWeight = FontWeight.Medium
                    )
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = title,
                    style = MaterialTheme.typography.titleLarge.copy(
                        color = Color(0xFF4A90E2),
                        fontWeight = FontWeight.Bold
                    )
                )
            }
            Spacer(modifier = Modifier.width(16.dp))
            Image(
                painter = painterResource(id = R.drawable.ic_placeholder),
                contentDescription = "$title image",
                modifier = Modifier
                    .size(80.dp)
                    .clip(RoundedCornerShape(12.dp))
            )
        }
    }
}
