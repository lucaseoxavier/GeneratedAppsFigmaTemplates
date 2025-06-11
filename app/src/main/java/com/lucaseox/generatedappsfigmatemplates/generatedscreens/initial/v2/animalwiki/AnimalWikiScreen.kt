package com.lucaseox.generatedappsfigmatemplates.generatedscreens.initial.v2.animalwiki// Required Imports

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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lucaseox.generatedappsfigmatemplates.R

@Composable
fun AnimalWikiScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .background(Color.White)
            .padding(horizontal = 24.dp, vertical = 16.dp)
    ) {
        HeaderSection()
        TitleSection()
        CategoryTabs()
        AnimalListSection()
    }
}

@Composable
private fun HeaderSection() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Icon(
            imageVector = Icons.Default.AddCircle,
            contentDescription = "Search Icon",
            tint = Color(0xFF68B5E8),
            modifier = Modifier.size(28.dp)
        )
        Icon(
            imageVector = Icons.Default.AddCircle,
            contentDescription = "Menu Icon",
            tint = Color(0xFF68B5E8),
            modifier = Modifier.size(28.dp)
        )
    }
}

@Composable
private fun TitleSection() {
    Text(
        text = "Animal Wiki",
        fontSize = 32.sp,
        fontWeight = FontWeight.Bold,
        color = Color(0xFF68B5E8),
        modifier = Modifier.padding(top = 24.dp)
    )
}

@Composable
private fun CategoryTabs() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 24.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        FilterTab(text = "Popular", selected = true)
        FilterTab(text = "Mammalians", selected = false)
        FilterTab(text = "Amphibiens", selected = false)
        FilterTab(text = "Oiseaux", selected = false)
    }
}

@Composable
private fun FilterTab(text: String, selected: Boolean) {
    val background = if (selected) Color(0xFF4B8EA8) else Color.Transparent
    val textColor = if (selected) Color.White else Color(0xFF4B8EA8)
    Surface(
        color = background,
        shape = RoundedCornerShape(20.dp),
        tonalElevation = 0.dp
    ) {
        Text(
            text = text,
            color = textColor,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp),
            fontSize = 14.sp
        )
    }
}

@Composable
private fun AnimalListSection() {
    val animals = listOf("Lions", "Tigre", "Tortue", "Elephant")
    animals.forEach { animal ->
        AnimalCard(animalName = animal)
        Spacer(modifier = Modifier.height(16.dp))
    }
}

@Composable
private fun AnimalCard(animalName: String) {
    Surface(
        shape = RoundedCornerShape(16.dp),
        color = Color.White,
        tonalElevation = 4.dp,
        shadowElevation = 4.dp,
        modifier = Modifier
            .fillMaxWidth()
            .background(
                brush = Brush.verticalGradient(
                    listOf(Color(0xFF64D3FF), Color(0xFF3A6DDF))
                )
            )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column {
                Text(
                    text = "Mammifère",
                    color = Color(0xFF4B8EA8),
                    fontSize = 12.sp
                )
                Text(
                    text = animalName,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    color = Color(0xFF4B8EA8)
                )
            }
            Image(
                painter = painterResource(id = R.drawable.ic_placeholder),
                contentDescription = "Animal Image",
                modifier = Modifier
                    .size(width = 100.dp, height = 60.dp)
                    .padding(start = 8.dp),
                contentScale = ContentScale.Crop
            )
        }
    }
}
