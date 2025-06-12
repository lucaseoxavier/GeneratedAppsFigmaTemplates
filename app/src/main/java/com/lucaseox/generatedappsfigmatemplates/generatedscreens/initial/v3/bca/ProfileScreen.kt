package com.lucaseox.generatedappsfigmatemplates.generatedscreens.initial.v3.bca

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lucaseox.generatedappsfigmatemplates.R

@Composable
fun ProfileScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .background(Color.White)
    ) {
        HeaderSection()
        ProfileInfoSection()
        CardImageSection()
        CardNumberSection()
        ActionButtonsSection()
        BottomNavigationBar()
    }
}

@Composable
private fun HeaderSection() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(180.dp)
            .background(Color(0xFF0D47A1))
    ) {
        Row(
            modifier = Modifier
                .align(Alignment.TopEnd)
                .padding(16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Icon(imageVector = Icons.Default.AddCircle, contentDescription = "Notification Icon", tint = Color.Red)
            Icon(imageVector = Icons.Default.AddCircle, contentDescription = "Settings Icon", tint = Color.Blue)
        }
        Image(
            painter = painterResource(id = R.drawable.ic_placeholder),
            contentDescription = "Profile Picture",
            modifier = Modifier
                .size(100.dp)
                .align(Alignment.BottomCenter)
                .offset(y = 50.dp)
                .background(Color.Gray, shape = CircleShape),
            contentScale = ContentScale.Crop
        )
    }
}

@Composable
private fun ProfileInfoSection() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 60.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Andhika Putra", fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color.Black)
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(text = "Paspor BCA  ", fontSize = 14.sp, color = Color.Gray)
            Text(text = "9087890908  ", fontSize = 14.sp, color = Color(0xFF0D47A1))
            Icon(imageVector = Icons.Default.AddCircle, contentDescription = "Copy Icon", tint = Color.Gray)
        }
    }
}

@Composable
private fun CardImageSection() {
    Image(
        painter = painterResource(id = R.drawable.ic_placeholder),
        contentDescription = "Card Image",
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 16.dp)
            .height(200.dp),
        contentScale = ContentScale.Crop
    )
}

@Composable
private fun CardNumberSection() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 24.dp),
        colors = CardDefaults.cardColors(containerColor = Color(0xFF448AFF)),
        shape = RoundedCornerShape(12.dp)
    ) {
        Row(
            modifier = Modifier
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column {
                Text(text = "Card Number", fontSize = 12.sp, color = Color.White)
                Text(text = "4691 5112 3456 7890", fontSize = 16.sp, fontWeight = FontWeight.Bold, color = Color.White)
            }
            Icon(imageVector = Icons.Default.AddCircle, contentDescription = "Copy Icon", tint = Color.White)
        }
    }
}

@Composable
private fun ActionButtonsSection() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 24.dp),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        ActionButton(label = "Control")
        ActionButton(label = "Set Limit")
        ActionButton(label = "Block")
    }
}

@Composable
private fun ActionButton(label: String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Box(
            modifier = Modifier
                .size(64.dp)
                .background(color = Color(0xFFBBDEFB), shape = CircleShape),
            contentAlignment = Alignment.Center
        ) {
            Icon(imageVector = Icons.Default.AddCircle, contentDescription = label, tint = Color(0xFF0D47A1))
        }
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = label, fontSize = 14.sp, color = Color(0xFF0D47A1))
    }
}

@Composable
private fun BottomNavigationBar() {
    NavigationBar(containerColor = Color(0xFFE3F2FD)) {
        NavigationBarItem(
            icon = { Icon(Icons.Default.AddCircle, contentDescription = "Home") },
            label = { Text("Home") },
            selected = false,
            onClick = {}
        )
        NavigationBarItem(
            icon = { Icon(Icons.Default.AddCircle, contentDescription = "Transaction") },
            label = { Text("Transaction") },
            selected = false,
            onClick = {}
        )
        NavigationBarItem(
            icon = {
                Box(
                    modifier = Modifier
                        .offset(y = (-12).dp)
                        .background(Color(0xFF0D47A1), shape = CircleShape)
                        .padding(8.dp)
                ) {
                    Icon(Icons.Default.AddCircle, contentDescription = "Center Action", tint = Color.White)
                }
            },
            label = {},
            selected = false,
            onClick = {}
        )
        NavigationBarItem(
            icon = { Icon(Icons.Default.AddCircle, contentDescription = "Notification") },
            label = { Text("Notification") },
            selected = false,
            onClick = {}
        )
        NavigationBarItem(
            icon = { Icon(Icons.Default.AddCircle, contentDescription = "Profile") },
            label = { Text("Profile") },
            selected = true,
            onClick = {}
        )
    }
}
