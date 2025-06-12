package com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v3.rspca// Required imports

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lucaseox.generatedappsfigmatemplates.R

@Composable
fun VetScreen() {
    Scaffold(
        bottomBar = { VetBottomBar() }
    ) { innerPadding ->
        LazyColumn(
            contentPadding = innerPadding,
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            item { VetHeader() }
            item { VetButton() }
            item { Spacer(modifier = Modifier.height(8.dp)) }
            item {
                VetCard(
                    address = "94 Carlisle Street",
                    statusText = "Online",
                    statusColor = Color(0xFF1B5E20), // Dark green
                    openText = "Open",
                    openColor = Color(0xFF2E7D32),
                    imageDescription = "Vet 1 Profile Photo"
                )
            }
            item {
                VetCard(
                    address = "97 Walpole Avenue",
                    statusText = "Online",
                    statusColor = Color(0xFF1B5E20),
                    openText = "Open",
                    openColor = Color(0xFF2E7D32),
                    imageDescription = "Vet 2 Profile Photo"
                )
            }
            item {
                VetCard(
                    address = "49 Creedon Street",
                    statusText = "Offline",
                    statusColor = Color(0xFFB71C1C), // Dark red
                    openText = "Open",
                    openColor = Color(0xFF2E7D32),
                    imageDescription = "Vet 3 Profile Photo"
                )
            }
            item {
                VetCard(
                    address = "24 McLachlan Street",
                    statusText = "Offline",
                    statusColor = Color(0xFFB71C1C),
                    openText = "Close",
                    openColor = Color(0xFFC2185B), // Dark pink
                    imageDescription = "Vet 4 Profile Photo"
                )
            }
        }
    }
}

@Composable
private fun VetHeader() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth()
    ) {
        Icon(
            imageVector = Icons.Default.AddCircle,
            contentDescription = "Back Button",
            modifier = Modifier
                .align(Alignment.Start)
                .padding(top = 16.dp)
        )
        Text(
            text = "RSPCA",
            color = Color(0xFF1565C0),
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "for all creatures great & small",
            fontSize = 12.sp,
            color = Color(0xFF616161)
        )
        Spacer(modifier = Modifier.height(16.dp))
    }
}

@Composable
private fun VetButton() {
    Button(
        onClick = { /*TODO*/ },
        shape = RoundedCornerShape(50),
        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF0288D1)),
        modifier = Modifier
            .fillMaxWidth()
            .height(48.dp)
    ) {
        Text(text = "Vet Services", fontSize = 16.sp, color = Color.White)
    }
}

@Composable
private fun VetCard(
    address: String,
    statusText: String,
    statusColor: Color,
    openText: String,
    openColor: Color,
    imageDescription: String
) {
    Card(
        shape = RoundedCornerShape(12.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 6.dp)
            .border(1.dp, color = Color(0xFF0288D1), shape = RoundedCornerShape(12.dp)),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Row(
            modifier = Modifier
                .padding(12.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = address,
                    fontWeight = FontWeight.Medium,
                    fontSize = 16.sp,
                    color = Color.Black
                )
                Spacer(modifier = Modifier.height(4.dp))
                Row(verticalAlignment = Alignment.CenterVertically) {
                    StatusDot(color = statusColor, description = "$statusText status")
                    Text(
                        text = statusText,
                        color = statusColor,
                        modifier = Modifier
                            .padding(start = 4.dp)
                            .semantics { contentDescription = "Status is $statusText" }
                    )
                    Spacer(modifier = Modifier.width(12.dp))
                    StatusDot(color = openColor, description = "$openText status")
                    Text(
                        text = openText,
                        color = openColor,
                        modifier = Modifier
                            .padding(start = 4.dp)
                            .semantics { contentDescription = "Clinic is $openText" }
                    )
                }
            }
            Spacer(modifier = Modifier.width(8.dp))
            Image(
                painter = painterResource(id = R.drawable.ic_placeholder),
                contentDescription = imageDescription,
                modifier = Modifier
                    .size(56.dp)
                    .clip(RoundedCornerShape(12.dp))
            )
        }
    }
}

@Composable
private fun StatusDot(color: Color, description: String) {
    Box(
        modifier = Modifier
            .size(10.dp)
            .background(color = color, shape = CircleShape)
            .semantics { contentDescription = description }
    )
}

@Composable
private fun VetBottomBar() {
    NavigationBar(containerColor = Color.White) {
        NavigationBarItem(
            selected = false,
            onClick = { /*TODO*/ },
            icon = {
                Icon(
                    Icons.Default.AddCircle,
                    contentDescription = "Navigation: Home"
                )
            }
        )
        NavigationBarItem(
            selected = false,
            onClick = { /*TODO*/ },
            icon = {
                Icon(
                    Icons.Default.AddCircle,
                    contentDescription = "Navigation: Add"
                )
            }
        )
        NavigationBarItem(
            selected = false,
            onClick = { /*TODO*/ },
            icon = {
                Icon(
                    Icons.Default.AddCircle,
                    contentDescription = "Navigation: Help"
                )
            }
        )
    }
}
