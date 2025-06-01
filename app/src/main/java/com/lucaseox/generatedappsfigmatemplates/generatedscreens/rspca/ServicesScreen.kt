package com.lucaseox.generatedappsfigmatemplates.generatedscreens.rspca// Necessary imports

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Home
//import androidx.compose.material.icons.filled.Pets
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lucaseox.generatedappsfigmatemplates.R

@Composable
fun ServicesScreen() {
    Scaffold(
        bottomBar = { BottomNavigationBar() }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .verticalScroll(rememberScrollState())
                .padding(16.dp)
        ) {
            HeaderSection()
            Spacer(modifier = Modifier.height(16.dp))
            TitleButton(title = "Services")
            Spacer(modifier = Modifier.height(16.dp))
            ServiceCard(
                title = "Veterinary Services",
                image = painterResource(id = R.drawable.ic_placeholder)
            )
            Spacer(modifier = Modifier.height(16.dp))
            ServiceCard(
                title = "Grooming Services",
                image = painterResource(id = R.drawable.ic_placeholder)
            )
        }
    }
}

@Composable
private fun HeaderSection() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxWidth()
    ) {
        Icon(
            imageVector = Icons.Default.ArrowBack,
            contentDescription = "Back",
            modifier = Modifier
                .size(24.dp)
                .clickable { }
        )
        Spacer(modifier = Modifier.width(8.dp))
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "RSPCA",
                color = Color(0xFF00AEEF),
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "for all creatures great & small",
                fontSize = 12.sp,
                color = Color.Gray
            )
        }
    }
}

@Composable
private fun TitleButton(title: String) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(48.dp)
            .background(
                color = Color(0xFF00AEEF),
                shape = RoundedCornerShape(24.dp)
            ),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = title,
            color = Color.White,
            fontSize = 18.sp,
            fontWeight = FontWeight.Medium
        )
    }
}

@Composable
private fun ServiceCard(title: String, image: Painter) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .border(2.dp, color = Color(0xFF00AEEF), shape = RoundedCornerShape(16.dp))
    ) {
        Image(
            painter = image,
            contentDescription = title,
            modifier = Modifier
                .fillMaxWidth()
                .height(180.dp)
                .clip(RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp))
        )
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    color = Color.White,
                    shape = RoundedCornerShape(bottomStart = 16.dp, bottomEnd = 16.dp)
                )
                .padding(8.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = title,
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color.Black,
                textAlign = TextAlign.Center
            )
        }
    }
}

@Composable
private fun BottomNavigationBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconButton(onClick = { }) {
            Icon(
                imageVector = Icons.Default.Home,
                contentDescription = "Home",
                tint = Color(0xFF00AEEF)
            )
        }
        IconButton(onClick = { }) {
            Icon(
                imageVector = Icons.Default.AddCircle,
                contentDescription = "Add",
                tint = Color(0xFF00AEEF)
            )
        }
        IconButton(onClick = { }) {
            Icon(
                imageVector = Icons.Default.AddCircle,
                contentDescription = "Pets",
                tint = Color(0xFF00AEEF)
            )
        }
    }
}
