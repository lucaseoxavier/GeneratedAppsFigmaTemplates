package com.lucaseox.generatedappsfigmatemplates.generatedscreens.initial.v2.bca

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lucaseox.generatedappsfigmatemplates.R

@Composable
fun TransactionScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF5F8FF))
    ) {
        LazyColumn(
            modifier = Modifier.weight(1f),
            contentPadding = PaddingValues(bottom = 80.dp)
        ) {
            item {
                HeaderSection()
                BalanceCard()
                ActionRow()
                TransactionSection()
            }
        }
        BottomNavigationBar()
    }
}

@Composable
private fun HeaderSection() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFF0C3C84))
            .padding(16.dp)
    ) {
        Column {
            Text("Hello,", color = Color.White)
            Text("Andhika Putra", fontWeight = FontWeight.Bold, fontSize = 20.sp, color = Color.White)
            Text("9087890908", fontSize = 12.sp, color = Color.White)
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.align(Alignment.TopEnd)
        ) {
            Spacer(modifier = Modifier.width(8.dp))
            Icon(imageVector = Icons.Default.AddCircle, contentDescription = null, tint = Color.White)
            Spacer(modifier = Modifier.width(8.dp))
            Surface(
                shape = CircleShape,
                color = Color(0xFF4D8CFF),
                modifier = Modifier.size(24.dp)
            ) {}
        }
    }
}

@Composable
private fun BalanceCard() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = Color(0xFF4D8CFF))
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text("Current Balance", color = Color.White)
            Text("Rp. 27.950.000", fontWeight = FontWeight.Bold, fontSize = 24.sp, color = Color.White)
        }
    }
}

@Composable
private fun ActionRow() {
    Row(
        horizontalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier.fillMaxWidth().padding(vertical = 8.dp)
    ) {
        ActionButton("Add")
        ActionButton("Send")
        ActionButton("V. Account")
        Icon(imageVector = Icons.Default.AddCircle, contentDescription = null, tint = Color(0xFF4D8CFF))
    }
}

@Composable
private fun ActionButton(label: String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Surface(
            modifier = Modifier.size(56.dp),
            shape = RoundedCornerShape(12.dp),
            color = Color(0xFFF0F4FF)
        ) {
            Icon(
                imageVector = Icons.Default.AddCircle,
                contentDescription = null,
                modifier = Modifier.align(Alignment.CenterHorizontally).padding(8.dp),
                tint = Color(0xFF4D8CFF)
            )
        }
        Spacer(modifier = Modifier.height(4.dp))
        Text(label, fontSize = 12.sp)
    }
}

@Composable
private fun TransactionSection() {
    Column(modifier = Modifier.padding(horizontal = 16.dp)) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text("Recent Transaction", fontWeight = FontWeight.Bold, fontSize = 16.sp, color = Color(0xFF0C3C84))
            Text("See All", fontSize = 12.sp, color = Color.Gray)
        }

        Spacer(modifier = Modifier.height(8.dp))
        Text("Today", fontWeight = FontWeight.Medium, fontSize = 14.sp)
        TransactionItem("Rp. 1.320.000", "Wesley Putra", Color.Red)
        TransactionItem("Rp. 500.000", "Jessica Tanuwijaya", Color.Green)

        Spacer(modifier = Modifier.height(8.dp))
        Text("Yesterday", fontWeight = FontWeight.Medium, fontSize = 14.sp)
        TransactionItem("Rp. 8.500.000", "Bloom Design House", Color.Green)
        TransactionItem("Rp. 1.200.000", "Gilbert Tanjung", Color.Green)
        TransactionItem("Rp. 200.000", "Lidya Danira", Color.Green)
    }
}

@Composable
private fun TransactionItem(amount: String, name: String, iconColor: Color) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp),
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Row(
            modifier = Modifier
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Default.AddCircle,
                contentDescription = null,
                tint = iconColor,
                modifier = Modifier.size(20.dp)
            )
            Spacer(modifier = Modifier.width(12.dp))
            Column {
                Text(amount, fontWeight = FontWeight.Bold, color = Color(0xFF0C3C84))
                Text(name, fontSize = 12.sp, color = Color.Gray)
            }
        }
    }
}

@Composable
private fun BottomNavigationBar() {
    NavigationBar(containerColor = Color(0xFF0C3C84)) {
        NavigationBarItem(
            icon = { Icon(Icons.Default.AddCircle, contentDescription = null) },
            label = { Text("Home") },
            selected = false,
            onClick = {}
        )
        NavigationBarItem(
            icon = { Icon(Icons.Default.AddCircle, contentDescription = null) },
            label = { Text("Transaction") },
            selected = true,
            onClick = {}
        )
        NavigationBarItem(
            icon = { Icon(Icons.Default.AddCircle, contentDescription = null) },
            label = { Text("") },
            selected = false,
            onClick = {},
            alwaysShowLabel = false
        )
        NavigationBarItem(
            icon = { Icon(Icons.Default.AddCircle, contentDescription = null) },
            label = { Text("Notification") },
            selected = false,
            onClick = {}
        )
        NavigationBarItem(
            icon = { Icon(Icons.Default.AddCircle, contentDescription = null) },
            label = { Text("Profile") },
            selected = false,
            onClick = {}
        )
    }
}
