package com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v1.refactoredbca

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
            .background(color = Color(0xFFE7EBF5))
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
            .background(Color(0xFF0F36B7), RoundedCornerShape(bottomEnd = 24.dp, bottomStart = 24.dp))
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(modifier = Modifier.weight(1f)) {
            Text("Hello,", color = Color.White, fontSize = 14.sp)
            Text("Andhika Putra", color = Color.White, fontWeight = FontWeight.Bold, fontSize = 20.sp)
            Text("9087890908", color = Color.White, fontSize = 12.sp)
        }
        Icon(Icons.Default.AddCircle, contentDescription = "Notifications Icon", tint = Color.White)
    }
}

@Composable
private fun BalanceSection() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFF2D6FEA), RoundedCornerShape(16.dp))
            .padding(16.dp)
    ) {
        Text("Current Balance", color = Color.White, fontSize = 14.sp, fontWeight = FontWeight.SemiBold)
        Text("Rp. 27.950.000", color = Color.White, fontWeight = FontWeight.Bold, fontSize = 24.sp)
    }
}

@Composable
private fun FeatureGrid() {
    Column(modifier = Modifier.fillMaxWidth()) {
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
            FeatureIcon("M-Info", "M-Info Feature")
            FeatureIcon("M-Transfer", "M-Transfer Feature")
            FeatureIcon("M-Payment", "M-Payment Feature")
        }
        Spacer(modifier = Modifier.height(12.dp))
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
            FeatureIcon("M-Commerce", "M-Commerce Feature")
            FeatureIcon("Cardless", "Cardless Feature")
            FeatureIcon("M-Admin", "M-Admin Feature")
        }
    }
}

@Composable
private fun FeatureIcon(label: String, description: String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Icon(Icons.Default.AddCircle, contentDescription = description, tint = Color(0xFF2D6FEA), modifier = Modifier.size(40.dp))
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
                    contentDescription = "Promo Banner \${it + 1}",
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
            .background(Color(0xFF0F36B7), RoundedCornerShape(16.dp))
            .padding(vertical = 12.dp),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(Icons.Default.AddCircle, contentDescription = "Home Navigation", tint = Color.White)
        Icon(Icons.Default.AddCircle, contentDescription = "Transaction Navigation", tint = Color.White.copy(alpha = 0.6f))
        Icon(Icons.Default.AddCircle, contentDescription = "Menu Navigation", tint = Color.White)
        Icon(Icons.Default.AddCircle, contentDescription = "Notifications Navigation", tint = Color.White.copy(alpha = 0.6f))
        Icon(Icons.Default.AddCircle, contentDescription = "Profile Navigation", tint = Color.White.copy(alpha = 0.6f))
    }
}
