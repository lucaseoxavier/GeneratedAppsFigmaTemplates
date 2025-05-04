package com.lucaseox.generatedappsfigmatemplates.generatedscreens.bca

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Notifications
//import androidx.compose.material.icons.filled.QrCodeScanner
//import androidx.compose.material.icons.filled.PhotoCamera
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lucaseox.generatedappsfigmatemplates.R

@Composable
fun ScanQrScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .verticalScroll(rememberScrollState())
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        HeaderSection()
        Spacer(modifier = Modifier.height(16.dp))
        QrScannerSection()
        Spacer(modifier = Modifier.height(16.dp))
        ActionButtonsSection()
    }
}

@Composable
private fun HeaderSection() {
    Card(
        shape = RoundedCornerShape(bottomStart = 24.dp, bottomEnd = 24.dp),
        colors = CardDefaults.cardColors(containerColor = Color(0xFF234F9D)),
        modifier = Modifier.fillMaxWidth()
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {
                Column {
                    Text(
                        text = "Hello,",
                        color = Color.White,
                        fontSize = 14.sp
                    )
                    Text(
                        text = "Andhika Putra",
                        color = Color.White,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "9087890908",
                        color = Color.White,
                        fontSize = 12.sp
                    )
                }
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        Icons.Default.AddCircle,
                        contentDescription = "Status",
                        tint = Color(0xFF3FF1BE)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Icon(
                        Icons.Default.Notifications,
                        contentDescription = "Notifications",
                        tint = Color(0xFF3FF1BE)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Icon(
                        Icons.Default.AddCircle,
                        contentDescription = "Profile",
                        tint = Color(0xFF3FF1BE)
                    )
                }
            }
        }
    }
}

@Composable
private fun QrScannerSection() {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxWidth()
            .height(400.dp)
            .clip(RoundedCornerShape(16.dp))
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_placeholder),
            contentDescription = "QR Background",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        Box(
            modifier = Modifier
                .size(220.dp)
                .background(Color(0xAAFFFFFF), RoundedCornerShape(16.dp))
        )
        Icon(
            Icons.Default.AddCircle,
            contentDescription = "QR Scanner",
            modifier = Modifier.size(180.dp),
            tint = Color.Gray
        )
        Icon(
            Icons.Default.AddCircle,
            contentDescription = "Camera Icon",
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(16.dp)
                .size(32.dp),
            tint = Color.White
        )
    }
}

@Composable
private fun ActionButtonsSection() {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 32.dp)
    ) {
        Button(
            onClick = {},
            modifier = Modifier.weight(1f)
        ) {
            Icon(Icons.Default.AddCircle, contentDescription = "Scan QR")
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "Scan QR")
        }
        Spacer(modifier = Modifier.width(16.dp))
        OutlinedButton(
            onClick = {},
            modifier = Modifier.weight(1f)
        ) {
            Text(text = "Show QR")
        }
    }
}
