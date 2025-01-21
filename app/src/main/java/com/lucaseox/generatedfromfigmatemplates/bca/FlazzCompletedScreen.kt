package com.lucaseox.generatedfromfigmatemplates.bca

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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun FlazzCompletedScreen() {
    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
            .verticalScroll(scrollState)
    ) {
        HeaderCard()
        Spacer(modifier = Modifier.height(16.dp))
        BodyContent()
    }
}

@Composable
private fun HeaderCard() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(160.dp)
            .padding(16.dp),
        colors = CardDefaults.cardColors(containerColor = Color(0xFF2C4FDD)),
        shape = RoundedCornerShape(16.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Hello,",
                color = Color.White,
                style = TextStyle(fontSize = 16.sp)
            )
            Text(
                text = "Andhika Putra",
                color = Color.White,
                style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold)
            )
            Text(
                text = "9087890908",
                color = Color.White,
                style = TextStyle(fontSize = 14.sp)
            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ) {
                Icon(
                    imageVector = Icons.Default.Notifications,
                    contentDescription = "Notification",
                    tint = Color.White
                )
                Spacer(modifier = Modifier.width(8.dp))
                Box(
                    modifier = Modifier
                        .size(24.dp)
                        .background(color = Color.Green, shape = CircleShape)
                )
            }
        }
    }
}

@Composable
private fun BodyContent() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Top-Up Completed",
            style = TextStyle(
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF2C4FDD)
            )
        )
        Text(
            text = "Congratulation!",
            style = TextStyle(
                fontSize = 16.sp,
                color = Color.Gray
            )
        )
        Spacer(modifier = Modifier.height(32.dp))
        Box(
            modifier = Modifier
                .size(120.dp)
                .background(color = Color(0xFF00C853), shape = CircleShape),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = Icons.Default.Check,
                contentDescription = "Check",
                tint = Color.White,
                modifier = Modifier.size(64.dp)
            )
        }
        Spacer(modifier = Modifier.height(32.dp))
        TransactionDetails()
        Spacer(modifier = Modifier.height(16.dp))
        ActionButtons()
    }
}

@Composable
private fun TransactionDetails() {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "9087890908",
                style = TextStyle(fontSize = 16.sp)
            )
            Text(
                text = "Rp. 75.000",
                style = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.Bold, color = Color(0xFF2C4FDD))
            )
        }
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = "8469550485748    15/12 18:34:54",
            style = TextStyle(fontSize = 14.sp, color = Color.Gray)
        )
        Text(
            text = "Flazz Top-Up",
            style = TextStyle(fontSize = 14.sp, color = Color.Gray)
        )
    }
}

@Composable
private fun ActionButtons() {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        OutlinedButton(
            onClick = { /* TODO: Handle Check action */ },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
        ) {
            Text(
                text = "Check",
                style = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.Bold, color = Color(0xFF2C4FDD))
            )
        }
        Spacer(modifier = Modifier.height(8.dp))
        Button(
            onClick = { /* TODO: Handle Finish action */ },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF2C4FDD))
        ) {
            Text(
                text = "Finish",
                style = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.Bold, color = Color.White)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FlazzCompletedScreenPreview() {
    FlazzCompletedScreen()
}
