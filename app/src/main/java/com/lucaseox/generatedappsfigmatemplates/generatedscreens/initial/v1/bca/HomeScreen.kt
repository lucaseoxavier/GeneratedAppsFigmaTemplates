package com.lucaseox.generatedappsfigmatemplates.generatedscreens.initial.v1.bca

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
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
fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFFF0F3F9))
            .padding(16.dp)
    ) {
        HeaderSection()
        Spacer(modifier = Modifier.height(16.dp))
        BalanceSection()
        Spacer(modifier = Modifier.height(16.dp))
        FeatureGrid()
        Spacer(modifier = Modifier.height(24.dp))
        PromoSection()
        Spacer(modifier = Modifier.weight(1f))
        BottomNavigation()
    }
}

@Composable
private fun HeaderSection() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFF1947E4), RoundedCornerShape(bottomEnd = 24.dp, bottomStart = 24.dp))
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(modifier = Modifier.weight(1f)) {
            Text("Hello,", color = Color.White, fontSize = 14.sp)
            Text("Andhika Putra", color = Color.White, fontWeight = FontWeight.Bold, fontSize = 20.sp)
            Text("9087890908", color = Color.White, fontSize = 12.sp)
        }
        Icon(Icons.Default.AddCircle, contentDescription = "Notification", tint = Color.White)
    }
}

@Composable
private fun BalanceSection() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFF4F8CFF), RoundedCornerShape(16.dp))
            .padding(16.dp)
    ) {
        Text("Current Balance", color = Color.White, fontSize = 14.sp)
        Text("Rp. 27.950.000", color = Color.White, fontWeight = FontWeight.Bold, fontSize = 24.sp)
    }
}

@Composable
private fun FeatureGrid() {
    Column(modifier = Modifier.fillMaxWidth()) {
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
            FeatureIcon("M-Info")
            FeatureIcon("M-Transfer")
            FeatureIcon("M-Payment")
        }
        Spacer(modifier = Modifier.height(12.dp))
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
            FeatureIcon("M-Commerce")
            FeatureIcon("Cardless")
            FeatureIcon("M-Admin")
        }
    }
}

@Composable
private fun FeatureIcon(label: String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Icon(Icons.Default.AddCircle, contentDescription = label, tint = Color(0xFF4F8CFF), modifier = Modifier.size(40.dp))
        Spacer(modifier = Modifier.height(4.dp))
        Text(label, fontSize = 12.sp, textAlign = TextAlign.Center)
    }
}

@Composable
private fun PromoSection() {
    Column {
        Text("Promo", fontSize = 18.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(12.dp))
        Row(
            modifier = Modifier
                .horizontalScroll(rememberScrollState()),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            repeat(3) {
                Image(
                    painter = painterResource(id = R.drawable.ic_placeholder),
                    contentDescription = "Promo",
                    modifier = Modifier
                        .size(width = 250.dp, height = 120.dp)
                        .background(Color.White, RoundedCornerShape(16.dp))
                )
            }
        }
    }
}

@Composable
private fun BottomNavigation() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFF1947E4), RoundedCornerShape(16.dp))
            .padding(vertical = 12.dp),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(Icons.Default.AddCircle, contentDescription = "Home", tint = Color.White)
        Icon(Icons.Default.AddCircle, contentDescription = "Transaction", tint = Color.White.copy(alpha = 0.6f))
        Icon(Icons.Default.AddCircle, contentDescription = "Menu", tint = Color.White)
        Icon(Icons.Default.AddCircle, contentDescription = "Notification", tint = Color.White.copy(alpha = 0.6f))
        Icon(Icons.Default.AddCircle, contentDescription = "Profile", tint = Color.White.copy(alpha = 0.6f))
    }
}
