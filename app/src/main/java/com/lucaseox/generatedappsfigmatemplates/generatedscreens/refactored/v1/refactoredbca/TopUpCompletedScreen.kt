package com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v1.refactoredbca

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun TopUpCompletedScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .background(Color(0xFFF5F5F5))
    ) {
        TopBar()
        Spacer(modifier = Modifier.height(24.dp))
        SuccessMessage()
        Spacer(modifier = Modifier.height(24.dp))
        SuccessIcon()
        Spacer(modifier = Modifier.height(32.dp))
        TransactionDetails()
        Spacer(modifier = Modifier.height(32.dp))
        ActionButtons()
    }
}

@Composable
private fun TopBar() {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .height(140.dp),
        color = Color(0xFF1E4494),
        shadowElevation = 4.dp,
        shape = RoundedCornerShape(bottomStart = 24.dp, bottomEnd = 24.dp)
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ) {
                Icon(
                    imageVector = Icons.Default.AddCircle,
                    contentDescription = "Status Active",
                    tint = Color.Green,
                    modifier = Modifier.size(16.dp)
                )
                Spacer(modifier = Modifier.width(16.dp))
                Icon(
                    imageVector = Icons.Default.AddCircle,
                    contentDescription = "Notification Bell",
                    tint = Color.White,
                    modifier = Modifier.size(24.dp)
                )
                Spacer(modifier = Modifier.width(16.dp))
                Icon(
                    imageVector = Icons.Default.AddCircle,
                    contentDescription = "Profile Icon",
                    tint = Color(0xFF5C7CFA),
                    modifier = Modifier.size(24.dp)
                )
            }
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "Hello,",
                style = MaterialTheme.typography.bodyMedium,
                color = Color.White
            )
            Text(
                text = "Andhika Putra",
                style = MaterialTheme.typography.titleLarge.copy(fontWeight = FontWeight.Bold),
                color = Color.White
            )
            Text(
                text = "Account Number: 9087890908",
                style = MaterialTheme.typography.bodySmall,
                color = Color.White
            )
        }
    }
}

@Composable
private fun SuccessMessage() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
            text = "Top-Up Completed",
            style = MaterialTheme.typography.headlineMedium.copy(fontWeight = FontWeight.Bold),
            color = Color(0xFF1E4494)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Congratulation!",
            style = MaterialTheme.typography.bodyMedium,
            color = Color(0xFF1E4494)
        )
    }
}

@Composable
private fun SuccessIcon() {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .size(200.dp)
            .background(color = Color(0xFF00B686), shape = CircleShape)
    ) {
        Icon(
            imageVector = Icons.Default.AddCircle,
            contentDescription = "Checkmark Icon",
            tint = Color.White,
            modifier = Modifier.size(100.dp)
        )
    }
}

@Composable
private fun TransactionDetails() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 32.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "9087890908",
                style = MaterialTheme.typography.bodyMedium.copy(color = Color.Black)
            )
            Text(
                text = "Rp. 75.000",
                style = MaterialTheme.typography.bodyMedium.copy(fontWeight = FontWeight.Bold, color = Color(0xFF1E4494))
            )
        }
        Divider(
            modifier = Modifier.padding(vertical = 8.dp),
            color = Color.Gray
        )
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column {
                Text(
                    text = "8695505485748",
                    style = MaterialTheme.typography.bodySmall.copy(color = Color.Black)
                )
                Text(
                    text = "15/12 18:34:54",
                    style = MaterialTheme.typography.bodySmall.copy(color = Color.Black)
                )
            }
            Text(
                text = "Flazz Top-Up",
                style = MaterialTheme.typography.bodySmall.copy(color = Color.Black)
            )
        }
    }
}

@Composable
private fun ActionButtons() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 32.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        OutlinedButton(
            onClick = { },
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(12.dp),
            border = ButtonDefaults.outlinedButtonBorder,
            colors = ButtonDefaults.outlinedButtonColors(contentColor = Color(0xFF1E4494))
        ) {
            Text(
                text = "Check",
                style = MaterialTheme.typography.bodyLarge.copy(fontWeight = FontWeight.Bold)
            )
        }
        Button(
            onClick = { },
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(12.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF4263EB))
        ) {
            Text(
                text = "Finish",
                style = MaterialTheme.typography.bodyLarge.copy(fontWeight = FontWeight.Bold),
                color = Color.White
            )
        }
    }
}