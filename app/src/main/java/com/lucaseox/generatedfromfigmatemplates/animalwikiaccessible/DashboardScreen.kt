package com.lucaseox.generatedfromfigmatemplates.animalwikiaccessible

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lucaseox.generatedfromfigmatemplates.R

@Composable
fun DashboardScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .verticalScroll(rememberScrollState())
    ) {
        TopBar()
        Spacer(modifier = Modifier.height(16.dp))
        TitleSection()
        Spacer(modifier = Modifier.height(16.dp))
        CategoryTabs()
        Spacer(modifier = Modifier.height(16.dp))
        AnimalCards()
    }
}

@Composable
private fun TopBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = Icons.Default.Search,
            contentDescription = "Search icon",
            tint = Color(0xFF1E88E5)
        )
        Icon(
            imageVector = Icons.Default.Menu,
            contentDescription = "Menu icon",
            tint = Color(0xFF1E88E5)
        )
    }
}

@Composable
private fun TitleSection() {
    Text(
        text = "Animal Wiki",
        color = Color(0xFF1E88E5),
        fontSize = 32.sp,
        fontWeight = FontWeight.Bold,
        modifier = Modifier.padding(horizontal = 16.dp)
    )
}

@Composable
private fun CategoryTabs() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        TabItem(text = "Popular", isSelected = true)
        TabItem(text = "Mammalians")
        TabItem(text = "Amphibiens")
        TabItem(text = "Oiseaux")
    }
}

@Composable
private fun TabItem(text: String, isSelected: Boolean = false) {
    Text(
        text = text,
        color = if (isSelected) Color.White else Color(0xFF1E88E5),
        fontSize = 14.sp,
        fontWeight = FontWeight.Bold,
        modifier = Modifier
            .background(
                color = if (isSelected) Color(0xFF1E88E5) else Color.Transparent,
                shape = RoundedCornerShape(16.dp)
            )
            .padding(horizontal = 16.dp, vertical = 8.dp)
    )
}

@Composable
private fun AnimalCards() {
    Column(
        modifier = Modifier.padding(horizontal = 16.dp)
    ) {
        AnimalCard(title = "Lions", subtitle = "Mammifère - Le roi de la savane", imageRes = R.drawable.lion_image)
        Spacer(modifier = Modifier.height(16.dp))
        AnimalCard(title = "Tigre", subtitle = "Mammifère - Le plus grand félin", imageRes = R.drawable.tiger_image)
        Spacer(modifier = Modifier.height(16.dp))
        AnimalCard(title = "Tortue", subtitle = "Mammifère - Une créature préhistorique", imageRes = R.drawable.turtle_image)
        Spacer(modifier = Modifier.height(16.dp))
        AnimalCard(title = "Elephant", subtitle = "Mammifère - Le géant sage", imageRes = R.drawable.elephant_image)
    }
}

@Composable
private fun AnimalCard(title: String, subtitle: String, imageRes: Int) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFEEEEEE), RoundedCornerShape(16.dp))
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = imageRes),
            contentDescription = "$title image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(80.dp)
                .background(Color.Gray, RoundedCornerShape(8.dp))
        )
        Spacer(modifier = Modifier.width(16.dp))
        Column {
            Text(
                text = subtitle,
                color = Color(0xFF1E88E5),
                fontSize = 14.sp
            )
            Text(
                text = title,
                color = Color(0xFF1E88E5),
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}
