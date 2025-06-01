package com.lucaseox.generatedappsfigmatemplates.generatedscreens.rspca// Required imports

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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lucaseox.generatedappsfigmatemplates.R

@Composable
fun WalkRecordScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(horizontal = 16.dp, vertical = 24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            imageVector = Icons.Default.AddCircle,
            contentDescription = "Back",
            tint = Color(0xFF00AEEF),
            modifier = Modifier
                .size(24.dp)
                .align(Alignment.Start)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Image(
            painter = painterResource(id = R.drawable.ic_placeholder),
            contentDescription = "RSPCA Logo",
            modifier = Modifier.size(width = 180.dp, height = 50.dp)
        )

        Spacer(modifier = Modifier.height(24.dp))

        Button(
            onClick = { /* Handle Walk Record button click */ },
            shape = RoundedCornerShape(50),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF00AEEF)),
            modifier = Modifier
                .fillMaxWidth()
                .height(48.dp)
        ) {
            Text(text = "Walk record", color = Color.White, fontSize = 18.sp)
        }

        Spacer(modifier = Modifier.height(24.dp))

        DistanceCard()

        Spacer(modifier = Modifier.height(24.dp))

        Button(
            onClick = { /* Handle Start button click */ },
            shape = CircleShape,
            border = ButtonDefaults.outlinedButtonBorder.copy(width = 2.dp, brush = androidx.compose.ui.graphics.SolidColor(Color(0xFF00AEEF))),
            colors = ButtonDefaults.buttonColors(containerColor = Color.White),
            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp)
        ) {
            Text(text = "Start", color = Color.Black, fontSize = 24.sp, fontWeight = FontWeight.Medium)
        }

        Spacer(modifier = Modifier.height(32.dp))

        BottomNavigationBar()
    }
}

@Composable
private fun DistanceCard() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .border(1.dp, Color(0xFF00AEEF), shape = RoundedCornerShape(12.dp))
            .padding(16.dp)
    ) {
        Text(text = "Distance", fontSize = 16.sp, fontWeight = FontWeight.Medium)

        Spacer(modifier = Modifier.height(12.dp))

        Text(text = "Yesterday", fontSize = 14.sp)
        Text(
            text = "00500.20M",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(vertical = 4.dp)
        )
        Divider(color = Color(0xFF00AEEF), thickness = 1.dp)

        Spacer(modifier = Modifier.height(12.dp))

        Text(text = "Today", fontSize = 14.sp)
        Text(
            text = "00150.70M",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(vertical = 4.dp)
        )
        Divider(color = Color(0xFF00AEEF), thickness = 1.dp)
    }
}

@Composable
private fun BottomNavigationBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 24.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Icon(
            imageVector = Icons.Default.AddCircle,
            contentDescription = "Home",
            tint = Color(0xFF00AEEF),
            modifier = Modifier.size(36.dp)
        )
        Icon(
            imageVector = Icons.Default.AddCircle,
            contentDescription = "Add",
            tint = Color(0xFF00AEEF),
            modifier = Modifier.size(36.dp)
        )
        Icon(
            imageVector = Icons.Default.AddCircle,
            contentDescription = "Help",
            tint = Color(0xFF00AEEF),
            modifier = Modifier.size(36.dp)
        )
    }
}
