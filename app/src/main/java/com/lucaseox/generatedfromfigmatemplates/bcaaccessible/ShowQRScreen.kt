package com.lucaseox.generatedfromfigmatemplates.bcaaccessible

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun QRCodeScreen() {
    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
            .background(Color.White)
    ) {
        // Header
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFF1565C0))
                .padding(16.dp),
            contentAlignment = Alignment.TopStart
        ) {
            Column(modifier = Modifier.fillMaxWidth()) {
                Text(
                    text = "Hello,",
                    fontSize = 16.sp,
                    color = Color(0xFFFFFFFF) // High contrast for accessibility
                )
                Text(
                    text = "Andhika Putra",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFFFFFFFF), // High contrast for accessibility
                    modifier = Modifier.semantics { contentDescription = "User Name" }
                )
                Text(
                    text = "9087890908",
                    fontSize = 14.sp,
                    color = Color(0xFFBBDEFB) // High contrast for accessibility
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp),
                horizontalArrangement = Arrangement.End
            ) {
                Icon(
                    imageVector = Icons.Filled.Notifications,
                    contentDescription = "Notifications",
                    tint = Color.White,
                    modifier = Modifier.size(24.dp)
                )

                Spacer(modifier = Modifier.width(16.dp))

                Box(
                    modifier = Modifier
                        .size(32.dp)
                        .background(Color(0xFF64B5F6), shape = MaterialTheme.shapes.small)
                )
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // QR Code Section
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Icon(
                imageVector = Icons.Filled.Menu,
                contentDescription = "QRku Logo",
                modifier = Modifier.size(64.dp),
                tint = Color(0xFF1565C0)
            )
            Text(
                text = "QRku",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
            Text(
                text = "Scan-Transfer-Beres!",
                fontSize = 14.sp,
                color = Color(0xFF616161) // Improved contrast
            )

            Spacer(modifier = Modifier.height(16.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .aspectRatio(1f)
                    .background(Color.LightGray, shape = MaterialTheme.shapes.medium),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = Icons.Filled.Menu,
                    contentDescription = "QR Code",
                    modifier = Modifier.size(200.dp),
                    tint = Color.Black
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Andhika Putra",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF1565C0), // High contrast
                modifier = Modifier.semantics { contentDescription = "Account Holder Name" }
            )
            Text(
                text = "BCA    9087890908",
                fontSize = 14.sp,
                color = Color(0xFF616161) // Improved contrast
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "Nikmati kemudahan transaksi cukup scan QR Code-nya!",
                fontSize = 12.sp,
                color = Color(0xFF616161), // Improved contrast
                textAlign = TextAlign.Center
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Bottom Buttons
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Button(
                onClick = { /* TODO */ },
                modifier = Modifier.weight(1f),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1565C0))
            ) {
                Icon(
                    imageVector = Icons.Filled.Menu,
                    contentDescription = "Scan QR",
                    tint = Color.White
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = "Scan QR",
                    color = Color.White
                )
            }

            Spacer(modifier = Modifier.width(16.dp))

            Button(
                onClick = { /* TODO */ },
                modifier = Modifier.weight(1f),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1565C0))
            ) {
                Icon(
                    imageVector = Icons.Filled.Menu,
                    contentDescription = "Show QR",
                    tint = Color.White
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = "Show QR",
                    color = Color.White
                )
            }
        }

        Spacer(modifier = Modifier.height(16.dp))
    }
}
