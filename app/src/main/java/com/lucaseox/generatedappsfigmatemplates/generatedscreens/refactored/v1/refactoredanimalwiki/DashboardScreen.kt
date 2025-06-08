package com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v1.refactoredanimalwiki

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
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
            .background(Color.White)
            .padding(16.dp)
    ) {
        TopBar()
        Spacer(modifier = Modifier.height(24.dp))
        Title()
        Spacer(modifier = Modifier.height(16.dp))
        CategoryTabs()
        Spacer(modifier = Modifier.height(24.dp))
        AnimalList()
    }
}

@Composable
private fun TopBar() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconButton(
            onClick = {},
            modifier = Modifier.size(48.dp)
        ) {
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = "Search animals",
                tint = Color(0xFF004A99)
            )
        }
        IconButton(
            onClick = {},
            modifier = Modifier.size(48.dp)
        ) {
            Icon(
                imageVector = Icons.Default.Menu,
                contentDescription = "Menu options",
                tint = Color(0xFF004A99)
            )
        }
    }
}

@Composable
private fun Title() {
    Text(
        text = "Animal Wiki",
        fontSize = 32.sp,
        fontWeight = FontWeight.Bold,
        color = Color(0xFF004A99)
    )
}

@Composable
private fun CategoryTabs() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        CategoryTab(text = "Popular", selected = true)
        CategoryTab(text = "Mammalians", selected = false)
        CategoryTab(text = "Amphibiens", selected = false)
        CategoryTab(text = "Oiseaux", selected = false)
    }
}

@Composable
private fun CategoryTab(text: String, selected: Boolean) {
    val backgroundColor = if (selected) Color(0xFF395C6B) else Color.Transparent
    val contentColor = if (selected) Color.White else Color(0xFF004A99)

    TextButton(
        onClick = {},
        colors = ButtonDefaults.textButtonColors(contentColor = contentColor),
        modifier = Modifier
            .defaultMinSize(minHeight = 48.dp)
            .background(backgroundColor, shape = RoundedCornerShape(20.dp))
            .padding(horizontal = 12.dp, vertical = 4.dp)
    ) {
        Text(text = text)
    }
}

@Composable
private fun AnimalList() {
    val animals = listOf("Lions", "Tigre", "Tortue", "Elephant")
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(Color(0xFF61D4F5), Color(0xFF3758F9))
                ),
                shape = RoundedCornerShape(20.dp)
            )
            .padding(16.dp)
    ) {
        animals.forEach { name ->
            AnimalCard(name = name)
            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}

@Composable
private fun AnimalCard(name: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White, shape = RoundedCornerShape(16.dp))
            .padding(12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = "Mammifère",
                fontSize = 14.sp,
                color = Color(0xFF004A99)
            )
            Text(
                text = name,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF004A99)
            )
        }
        Spacer(modifier = Modifier.width(12.dp))
        Image(
            painter = painterResource(id = R.drawable.ic_placeholder),
            contentDescription = "$name thumbnail image",
            modifier = Modifier
                .size(80.dp)
                .clip(RoundedCornerShape(12.dp)),
            contentScale = ContentScale.Crop
        )
    }
}
