package com.lucaseox.generatedfromfigmatemplates.bcaaccessible

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lucaseox.generatedfromfigmatemplates.R

@Composable
fun BlockScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(16.dp)
            .verticalScroll(rememberScrollState())
    ) {
        HeaderSection()
        ProfileSection()
        CardDetailsSection()
        BlockageDetailsSection()
        ActionButtons()
    }
}

@Composable
private fun HeaderSection() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFF002B87))
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "BCA mobile",
            color = Color.White,
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp,
            modifier = Modifier.weight(1f)
        )
        Icon(
            painter = painterResource(id = R.drawable.ic_notification),
            contentDescription = "Notifications",
            tint = Color.White
        )
        Spacer(modifier = Modifier.width(8.dp))
        Icon(
            painter = painterResource(id = R.drawable.ic_settings),
            contentDescription = "Settings",
            tint = Color.White
        )
    }
}

@Composable
private fun ProfileSection() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 16.dp)
    ) {
        Surface(
            shape = CircleShape,
            modifier = Modifier.size(80.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.ic_user),
                contentDescription = "Profile Picture",
                modifier = Modifier.fillMaxSize()
            )
        }
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Andhika Putra",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold
        )
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Paspor BCA",
                fontSize = 14.sp,
                color = Color(0xFF555555)
            )
            Spacer(modifier = Modifier.width(4.dp))
            Text(
                text = "9087890908",
                fontSize = 14.sp,
                color = Color(0xFF555555)
            )
        }
    }
}

@Composable
private fun CardDetailsSection() {
    Surface(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(8.dp),
        color = Color.Black
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Text(text = "BCA", color = Color.White, fontWeight = FontWeight.Bold)
            Text(text = "BLACK", color = Color.White, fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.height(16.dp))
            Text(text = "4691 5112 3456 7890", color = Color.White, fontWeight = FontWeight.Bold, fontSize = 20.sp)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "ANDHIKA PUTRA", color = Color.White, fontWeight = FontWeight.Bold)
        }
    }
}

@Composable
private fun BlockageDetailsSection() {
    Column(modifier = Modifier.padding(vertical = 16.dp)) {
        Text(
            text = "Card Blockage",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Card Number",
            color = Color(0xFF555555)
        )
        Text(
            text = "4691 5112 3456 7890",
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Card Type",
            color = Color(0xFF555555)
        )
        Text(
            text = "Black Card",
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(16.dp))
        Surface(
            shape = RoundedCornerShape(8.dp),
            border = BorderStroke(1.dp, Color.Gray),
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "I hereby give instructions to BCA to block my ATM card...",
                modifier = Modifier.padding(16.dp),
                fontSize = 14.sp
            )
        }
    }
}

@Composable
private fun ActionButtons() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 16.dp),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF888888))
        ) {
            Text(text = "Cancel", color = Color.Black)
        }
        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF673AB7))
        ) {
            Text(text = "Save", color = Color.White)
        }
    }
}
