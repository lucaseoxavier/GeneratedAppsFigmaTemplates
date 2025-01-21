package com.lucaseox.generatedfromfigmatemplates.bca

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TransferCompletedScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        HeaderSection()
        ConfirmationSection()
        TransactionDetailsSection()
        ActionButtonsSection()
    }
}

@Composable
private fun HeaderSection() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFF0D47A1))
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column {
            Text(
                text = "Hello,",
                style = TextStyle(
                    color = Color.White,
                    fontSize = 16.sp
                )
            )
            Text(
                text = "Andhika Putra",
                style = TextStyle(
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp
                )
            )
            Text(
                text = "9087890908",
                style = TextStyle(
                    color = Color.White,
                    fontSize = 14.sp
                )
            )
        }

        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(
                painter = painterResource(id = android.R.drawable.ic_menu_info_details),
                contentDescription = "Notification",
                tint = Color.White,
                modifier = Modifier.size(24.dp)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Box(
                modifier = Modifier
                    .size(36.dp)
                    .background(Color(0xFF1E88E5), CircleShape)
            )
        }
    }
}

@Composable
private fun ConfirmationSection() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 32.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Transfer Completed",
            style = TextStyle(
                color = Color(0xFF0D47A1),
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp
            ),
            textAlign = TextAlign.Center
        )
        Text(
            text = "Congratulation!",
            style = TextStyle(
                color = Color(0xFF0D47A1),
                fontSize = 16.sp
            ),
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(16.dp))
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(Color(0xFF00E676), CircleShape),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                painter = painterResource(id = android.R.drawable.checkbox_on_background),
                contentDescription = "Check Icon",
                tint = Color.White,
                modifier = Modifier.size(64.dp)
            )
        }
    }
}

@Composable
private fun TransactionDetailsSection() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column {
                Text(
                    text = "Wesley Putra",
                    style = TextStyle(
                        color = Color(0xFF0D47A1),
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp
                    )
                )
                Text(
                    text = "9087890908",
                    style = TextStyle(
                        color = Color.Gray,
                        fontSize = 14.sp
                    )
                )
            }
            Text(
                text = "Rp. 1.320.000",
                style = TextStyle(
                    color = Color(0xFF0D47A1),
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp
                )
            )
        }
        Spacer(modifier = Modifier.height(8.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "8689550487548  15/12 18:34:54",
                style = TextStyle(
                    color = Color.Gray,
                    fontSize = 12.sp
                )
            )
            Text(
                text = "Yesterday's Dinner",
                style = TextStyle(
                    color = Color.Gray,
                    fontSize = 12.sp
                )
            )
        }
    }
}

@Composable
private fun ActionButtonsSection() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            onClick = { /* Handle Download */ },
            colors = ButtonDefaults.buttonColors(containerColor = Color.White),
            border = BorderStroke(1.dp, Color(0xFF0D47A1)),
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "Download",
                style = TextStyle(
                    color = Color(0xFF0D47A1),
                    fontSize = 16.sp
                )
            )
        }
        Spacer(modifier = Modifier.height(8.dp))
        Button(
            onClick = { /* Handle Finish */ },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF0D47A1)),
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "Finish",
                style = TextStyle(
                    color = Color.White,
                    fontSize = 16.sp
                )
            )
        }
    }
}
