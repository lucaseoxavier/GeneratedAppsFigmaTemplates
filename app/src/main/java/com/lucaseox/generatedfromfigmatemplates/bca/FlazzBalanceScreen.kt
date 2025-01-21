package com.lucaseox.generatedfromfigmatemplates.bca

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun FlazzBalanceScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF5F5F5))
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        HeaderSection()
        BalanceSection()
        Spacer(modifier = Modifier.height(16.dp))
        BottomDialog()
    }
}

@Composable
private fun HeaderSection() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFF1A237E), shape = RoundedCornerShape(8.dp))
            .padding(16.dp)
    ) {
        Text(
            text = "Hello,",
            color = Color.White,
            fontSize = 16.sp
        )
        Text(
            text = "Andhika Putra",
            color = Color.White,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "9087890908",
            color = Color.White.copy(alpha = 0.7f),
            fontSize = 14.sp
        )
    }
}

@Composable
private fun BalanceSection() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFBBDEFB), shape = RoundedCornerShape(8.dp))
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Current Balance",
            color = Color(0xFF1A237E),
            fontSize = 16.sp
        )
        Text(
            text = "Rp. 27.950.000",
            color = Color(0xFF1A237E),
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
private fun BottomDialog() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White, shape = RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp))
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Flazz",
            color = Color(0xFF1A237E),
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Your Current Flazz Balance",
            color = Color.Gray,
            fontSize = 14.sp
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Balance",
            color = Color(0xFF1A237E),
            fontSize = 16.sp
        )
        Text(
            text = "Rp. 240.000",
            color = Color(0xFF1A237E),
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Card Number",
            color = Color.Gray,
            fontSize = 14.sp
        )
        BasicTextField(
            value = "4567 9807 6578 3245",
            onValueChange = {},
            enabled = false,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFFF0F0F0), shape = RoundedCornerShape(8.dp))
                .padding(16.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Button(onClick = {}, colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1E88E5))) {
                Text(text = "OK", color = Color.White)
            }
            OutlinedButton(onClick = {}) {
                Text(text = "Cancel", color = Color(0xFF1E88E5))
            }
        }
    }
}
