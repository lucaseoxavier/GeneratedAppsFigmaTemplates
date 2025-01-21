package com.lucaseox.generatedfromfigmatemplates.bca

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun FlazzTopUpScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF5F5F5))
            .padding(horizontal = 16.dp, vertical = 8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        HeaderSection()
        Spacer(modifier = Modifier.height(16.dp))
        BalanceSection()
        Spacer(modifier = Modifier.height(16.dp))
        ActionButtonsSection()
        Spacer(modifier = Modifier.height(32.dp))
        TopUpDialog()
    }
}

@Composable
private fun HeaderSection() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFF1A237E), RoundedCornerShape(16.dp))
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(modifier = Modifier.weight(1f)) {
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
                color = Color.White.copy(alpha = 0.7f),
                fontSize = 12.sp
            )
        }
        Spacer(modifier = Modifier.width(8.dp))
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(
                imageVector = Icons.Filled.Notifications,
                contentDescription = null,
                tint = Color.White
            )
            Spacer(modifier = Modifier.width(16.dp))
            Box(
                modifier = Modifier
                    .size(32.dp)
                    .background(Color.Green, CircleShape)
            )
        }
    }
}

@Composable
private fun BalanceSection() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFF1A73E8), RoundedCornerShape(16.dp))
            .padding(16.dp),
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                text = "Current Balance",
                color = Color.White.copy(alpha = 0.7f),
                fontSize = 14.sp
            )
            Text(
                text = "Rp. 27.950.000",
                color = Color.White,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}

@Composable
private fun ActionButtonsSection() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        ActionButton(icon = Icons.Filled.Add, label = "Add New")
        ActionButton(icon = Icons.Filled.ArrowForward, label = "Send")
        ActionButton(icon = Icons.Filled.AccountCircle, label = "V. Account")
        ActionButton(icon = Icons.Filled.MoreVert, label = "More")
    }
}

@Composable
private fun ActionButton(icon: ImageVector, label: String) {
    Column(
        modifier = Modifier.clickable { },
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(48.dp)
                .background(Color(0xFF1A73E8), CircleShape),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = icon,
                contentDescription = null,
                tint = Color.White
            )
        }
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = label,
            fontSize = 12.sp,
            color = Color.Black
        )
    }
}

@Composable
private fun TopUpDialog() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White, RoundedCornerShape(16.dp))
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Flazz",
            color = Color(0xFF1A237E),
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Top Up",
            color = Color.Gray,
            fontSize = 14.sp
        )
        Spacer(modifier = Modifier.height(16.dp))
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFF1A73E8).copy(alpha = 0.1f), RoundedCornerShape(16.dp))
                .padding(16.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "75.000",
                color = Color(0xFF1A73E8),
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )
        }
        Spacer(modifier = Modifier.height(16.dp))
        AmountSelection()
        Spacer(modifier = Modifier.height(16.dp))
        ActionButtons()
    }
}

@Composable
private fun AmountSelection() {
    val amounts = listOf("20.000", "50.000", "75.000", "100.000", "200.000", "300.000", "500.000")
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        amounts.forEach { amount ->
            Box(
                modifier = Modifier
                    .size(48.dp)
                    .background(
                        if (amount == "75.000") Color(0xFF1A73E8).copy(alpha = 0.1f) else Color.White,
                        RoundedCornerShape(8.dp)
                    )
                    .clickable { },
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = amount,
                    color = if (amount == "75.000") Color(0xFF1A73E8) else Color.Gray,
                    fontSize = 14.sp
                )
            }
        }
    }
}

@Composable
private fun ActionButtons() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        TextButton(onClick = { }) {
            Text(
                text = "Cancel",
                color = Color(0xFF1A73E8),
                fontSize = 16.sp
            )
        }
        Button(
            onClick = { },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1A73E8))
        ) {
            Text(
                text = "OK",
                color = Color.White,
                fontSize = 16.sp
            )
        }
    }
}

@Preview
@Composable
fun PreviewFlazzTopUpScreen() {
    FlazzTopUpScreen()
}
