package com.lucaseox.generatedappsfigmatemplates.generatedscreens.initial.v2.rspca

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lucaseox.generatedappsfigmatemplates.R

@Composable
fun VetServicesScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Back Arrow Placeholder
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Start) {
            Icon(
                imageVector = Icons.Default.AddCircle,
                contentDescription = "Back",
                tint = Color.Black,
                modifier = Modifier.size(24.dp)
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Logo Placeholder
        Image(
            painter = painterResource(id = R.drawable.ic_placeholder),
            contentDescription = "Logo",
            modifier = Modifier
                .height(60.dp)
        )

        Spacer(modifier = Modifier.height(24.dp))

        // Vet Services Button
        Button(
            onClick = {},
            shape = RoundedCornerShape(30.dp),
            modifier = Modifier
                .fillMaxWidth(0.8f)
                .height(48.dp)
        ) {
            Text(text = "Vet Services")
        }

        Spacer(modifier = Modifier.height(24.dp))

        VetCard("94 Carlisle Street", true, true)
        VetCard("97 Walpole Avenue", true, true)
        VetCard("49 Creedon Street", false, true)
        VetCard("24 McLachlan Street", false, false)

        Spacer(modifier = Modifier.height(48.dp))

        // Bottom Navigation Icons
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Icon(imageVector = Icons.Default.AddCircle, contentDescription = null, modifier = Modifier.size(40.dp))
            Icon(imageVector = Icons.Default.AddCircle, contentDescription = null, modifier = Modifier.size(40.dp))
            Icon(imageVector = Icons.Default.AddCircle, contentDescription = null, modifier = Modifier.size(40.dp))
        }
    }
}

@Composable
private fun VetCard(address: String, isOnline: Boolean, isOpen: Boolean) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
            .background(Color.White, shape = RoundedCornerShape(12.dp))
            .border(2.dp, Color(0xFF00BCD4), shape = RoundedCornerShape(12.dp))
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(modifier = Modifier.weight(1f)) {
            Text(text = address, fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.height(4.dp))
            Row(verticalAlignment = Alignment.CenterVertically) {
                StatusDot(isOnline)
                Text(
                    text = if (isOnline) "Online" else "Offline",
                    color = if (isOnline) Color(0xFF4CAF50) else Color(0xFFF44336),
                    fontSize = 16.sp
                )
                Spacer(modifier = Modifier.width(8.dp))
                Icon(
                    imageVector = Icons.Default.AddCircle,
                    contentDescription = null,
                    tint = if (isOpen) Color(0xFF4CAF50) else Color(0xFFF48FB1),
                    modifier = Modifier.size(16.dp)
                )
                Spacer(modifier = Modifier.width(4.dp))
                Text(
                    text = if (isOpen) "Open" else "Close",
                    color = if (isOpen) Color(0xFF4CAF50) else Color(0xFFF48FB1),
                    fontSize = 16.sp
                )
            }
        }
        Spacer(modifier = Modifier.width(8.dp))
        Image(
            painter = painterResource(id = R.drawable.ic_placeholder),
            contentDescription = "Vet Image",
            modifier = Modifier
                .size(64.dp)
                .clip(RoundedCornerShape(8.dp))
        )
    }
}

@Composable
private fun StatusDot(isOnline: Boolean) {
    Box(
        modifier = Modifier
            .size(12.dp)
            .clip(CircleShape)
            .background(if (isOnline) Color(0xFF4CAF50) else Color(0xFFF44336))
            .padding(end = 4.dp)
    )
}
