package com.lucaseox.generatedappsfigmatemplates.generatedscreens.accessiblebca

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lucaseox.generatedappsfigmatemplates.R

@Composable
fun QRScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        HeaderSection()
        Spacer(modifier = Modifier.height(24.dp))
        Text("QRku", fontSize = 24.sp, fontWeight = FontWeight.Bold, color = Color.Black)
        Text(
            "Scan-Transfer-Beres!",
            fontSize = 14.sp,
            color = Color(0xFF666666)
        )
        Spacer(modifier = Modifier.height(24.dp))
        QRCodeSection()
        Spacer(modifier = Modifier.height(16.dp))
        UserInfoSection()
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            "Enjoy easy transactions by simply scanning the QR code!",
            fontSize = 12.sp,
            color = Color(0xFF666666),
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(24.dp))
        ToggleButtonSection()
    }
}

@Composable
private fun HeaderSection() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFF1C3A8E), RoundedCornerShape(bottomEnd = 20.dp, bottomStart = 20.dp))
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column {
            Text("Hello,", color = Color.White, fontSize = 12.sp)
            Text("Andhika Putra", color = Color.White, fontWeight = FontWeight.Bold, fontSize = 18.sp)
            Text("9087890908", color = Color.White, fontSize = 12.sp)
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(Icons.Default.AddCircle, contentDescription = "Add Notification", tint = Color.White)
            Spacer(modifier = Modifier.width(8.dp))
            Icon(Icons.Default.AddCircle, contentDescription = "Add Settings", tint = Color.White)
            Spacer(modifier = Modifier.width(8.dp))
            Icon(Icons.Default.AddCircle, contentDescription = "Profile Settings", tint = Color.White)
        }
    }
}

@Composable
private fun QRCodeSection() {
    Image(
        painter = painterResource(id = R.drawable.ic_placeholder),
        contentDescription = "QR Code Placeholder",
        modifier = Modifier
            .size(250.dp)
            .clip(RoundedCornerShape(8.dp))
    )
}

@Composable
private fun UserInfoSection() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFDDE7FF), RoundedCornerShape(8.dp))
            .padding(vertical = 12.dp)
    ) {
        Text(
            "Andhika Putra",
            fontWeight = FontWeight.Bold,
            color = Color(0xFF2A5DFF)
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            "BCA  9087890908",
            color = Color(0xFF555555)
        )
    }
}

@Composable
private fun ToggleButtonSection() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFDDE7FF), RoundedCornerShape(12.dp)),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Button(
            onClick = { /* TODO: Scan QR Action */ },
            modifier = Modifier
                .weight(1f)
                .padding(4.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF2A5DFF))
        ) {
            Text("Scan QR", color = Color.White)
        }

        Button(
            onClick = { /* TODO: Show QR Action */ },
            modifier = Modifier
                .weight(1f)
                .padding(4.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF4D80FF))
        ) {
            Icon(Icons.Default.AddCircle, contentDescription = "Show QR Code", tint = Color.White)
            Spacer(modifier = Modifier.width(4.dp))
            Text("Show QR", color = Color.White)
        }
    }
}
