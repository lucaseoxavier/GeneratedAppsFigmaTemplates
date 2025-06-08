package com.lucaseox.generatedappsfigmatemplates.generatedscreens.initial.v1.bca

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
//import androidx.compose.material.icons.filled.Receipt
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun InfoScreen() {
    Scaffold(
        bottomBar = { BottomNavigationBar() },
        containerColor = Color(0xFFF9FAFC)
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .verticalScroll(rememberScrollState())
        ) {
            HeaderSection()
            InfoSection(title = "Info Reksadana", items = listOf("NAB Reksadana", "Saldo Reksadana", "Info Kurs"))
            InfoSection(title = "Info RDN", items = listOf("Info Saldo", "Mutasi Rekening"))
            InfoSection(title = "Info KPR", items = listOf("Inquiry Pinjaman"))
            InfoSection(title = "Info Kartu Kredit", items = List(4) { "Inquiry Pinjaman" })
        }
    }
}

@Composable
private fun HeaderSection() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color(0xFF1E429F), shape = RoundedCornerShape(bottomStart = 20.dp, bottomEnd = 20.dp))
            .padding(20.dp)
    ) {
        Column {
            Text("Hello,", color = Color.White, fontSize = 14.sp)
            Text("Andhika Putra", color = Color.White, fontSize = 20.sp, fontWeight = FontWeight.Bold)
            Text("9087890908", color = Color.White, fontSize = 12.sp)
        }
        Row(
            modifier = Modifier.align(Alignment.TopEnd),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(Icons.Default.AddCircle, contentDescription = "Status Icon", tint = Color(0xFF00CC66), modifier = Modifier.size(16.dp).padding(end = 8.dp))
            Icon(Icons.Default.Notifications, contentDescription = "Notification Icon", tint = Color.White, modifier = Modifier.size(20.dp).padding(end = 8.dp))
            Box(
                modifier = Modifier
                    .size(24.dp)
                    .background(color = Color(0xFF4D74FF), shape = CircleShape)
            ) {}
        }
    }
}

@Composable
private fun InfoSection(title: String, items: List<String>) {
    Column(modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)) {
        Text(text = title, fontWeight = FontWeight.Bold, color = Color(0xFF1E429F), fontSize = 14.sp, modifier = Modifier.padding(vertical = 8.dp))
        items.forEach {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 4.dp)
                    .clickable {},
                shape = RoundedCornerShape(10.dp),
                colors = CardDefaults.cardColors(containerColor = Color(0xFFF3F3F3))
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 12.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(text = it, modifier = Modifier.weight(1f), fontSize = 14.sp)
                    Icon(Icons.Default.AddCircle, contentDescription = "Chevron Icon")
                }
            }
        }
    }
}

@Composable
private fun BottomNavigationBar() {
    NavigationBar(containerColor = Color(0xFF1E429F)) {
        NavigationBarItem(
            icon = { Icon(Icons.Default.Home, contentDescription = "Home") },
            label = { Text("Home") },
            selected = false,
            onClick = {}
        )
        NavigationBarItem(
            icon = { Icon(Icons.Default.AddCircle, contentDescription = "Transaction") },
            label = { Text("Transaction") },
            selected = true,
            onClick = {}
        )
        NavigationBarItem(
            icon = { Icon(Icons.Default.AddCircle, contentDescription = "Central Action") },
            label = { Text("") },
            selected = false,
            onClick = {}
        )
        NavigationBarItem(
            icon = { Icon(Icons.Default.Notifications, contentDescription = "Notification") },
            label = { Text("Notification") },
            selected = false,
            onClick = {}
        )
        NavigationBarItem(
            icon = { Icon(Icons.Default.Person, contentDescription = "Profile") },
            label = { Text("Profile") },
            selected = false,
            onClick = {}
        )
    }
}
