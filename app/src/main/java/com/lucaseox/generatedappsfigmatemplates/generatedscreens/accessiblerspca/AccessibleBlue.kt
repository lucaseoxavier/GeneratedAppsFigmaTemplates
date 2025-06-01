package com.lucaseox.generatedappsfigmatemplates.generatedscreens.accessiblerspca// Required imports

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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lucaseox.generatedappsfigmatemplates.R

private val AccessibleBlue = Color(0xFF005999) // Updated for contrast
private val LightBackground = Color(0xFFFAFAFA)

@Composable
fun WalkRecordScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .background(LightBackground)
            .padding(horizontal = 16.dp, vertical = 24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            imageVector = Icons.Default.AddCircle,
            contentDescription = "Back",
            tint = AccessibleBlue,
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
            onClick = { /* Handle Walk Record */ },
            shape = RoundedCornerShape(50),
            colors = ButtonDefaults.buttonColors(containerColor = AccessibleBlue),
            modifier = Modifier
                .fillMaxWidth()
                .height(48.dp)
        ) {
            Text(text = "Walk record", color = Color.White, fontSize = 18.sp, fontWeight = FontWeight.SemiBold)
        }

        Spacer(modifier = Modifier.height(24.dp))

        DistanceCard()

        Spacer(modifier = Modifier.height(24.dp))

        OutlinedButton(
            onClick = { /* Handle Start */ },
            shape = CircleShape,
            border = ButtonDefaults.outlinedButtonBorder.copy(
                width = 2.dp,
                brush = androidx.compose.ui.graphics.SolidColor(AccessibleBlue)
            ),
            colors = ButtonDefaults.outlinedButtonColors(containerColor = Color.White),
            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp)
        ) {
            Text(text = "Start", fontSize = 24.sp, fontWeight = FontWeight.Bold, color = Color.Black)
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
            .border(1.dp, AccessibleBlue, shape = RoundedCornerShape(12.dp))
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
        Divider(color = AccessibleBlue, thickness = 1.dp)

        Spacer(modifier = Modifier.height(12.dp))

        Text(text = "Today", fontSize = 14.sp)
        Text(
            text = "00150.70M",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(vertical = 4.dp)
        )
        Divider(color = AccessibleBlue, thickness = 1.dp)
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
        repeat(3) {
            Icon(
                imageVector = Icons.Default.AddCircle,
                contentDescription = "Navigation Icon",
                tint = AccessibleBlue,
                modifier = Modifier.size(36.dp)
            )
        }
    }
}
