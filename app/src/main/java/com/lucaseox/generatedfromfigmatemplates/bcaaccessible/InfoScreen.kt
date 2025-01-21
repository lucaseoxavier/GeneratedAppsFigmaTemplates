package com.lucaseox.generatedfromfigmatemplates.bcaaccessible

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun InfoScreen() {
    Column(modifier = Modifier.fillMaxSize().background(Color(0xFF3366CC))) {
        HeaderSection()
        Spacer(modifier = Modifier.height(16.dp))
        ContentSection()
        Spacer(modifier = Modifier.height(16.dp))
        BottomNavigationBar()
    }
}

@Composable
private fun HeaderSection() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = "Hello,",
                style = MaterialTheme.typography.bodyMedium,
                color = Color.White
            )
            Text(
                text = "Andhika Putra",
                style = MaterialTheme.typography.bodyLarge.copy(fontSize = 20.sp, fontWeight = FontWeight.Bold),
                color = Color.White
            )
            Text(
                text = "9087890908",
                style = MaterialTheme.typography.bodyMedium,
                color = Color.White
            )
        }

        IconButton(onClick = { /* Handle notification */ }) {
            Icon(
                imageVector = Icons.Default.Notifications,
                contentDescription = "Notifications",
                tint = Color.White
            )
        }

        Box(
            modifier = Modifier
                .size(40.dp)
                .background(Color(0xFF006400), CircleShape), // Changed contrast color
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = Icons.Default.AccountCircle,
                contentDescription = "Profile",
                tint = Color.White
            )
        }
    }
}

@Composable
private fun ContentSection() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
            .padding(horizontal = 16.dp)
            .verticalScroll(rememberScrollState())
    ) {
        InfoSection("Info Reksadana", listOf("NAB Reksadana", "Saldo Reksadana", "Info Kurs"))
        InfoSection("Info RDN", listOf("Info Saldo", "Mutasi Rekening"))
        InfoSection("Info KPR", listOf("Inquiry Pinjaman - KPR"))
        InfoSection("Info Kartu Kredit", listOf("Inquiry Pinjaman - Crédito 1", "Inquiry Pinjaman - Crédito 2", "Inquiry Pinjaman - Crédito 3", "Inquiry Pinjaman - Crédito 4"))
    }
}

@Composable
private fun InfoSection(title: String, items: List<String>) {
    Text(
        text = title,
        style = MaterialTheme.typography.bodyLarge.copy(fontWeight = FontWeight.Bold),
        modifier = Modifier.padding(vertical = 8.dp)
    )
    items.forEach { item ->
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 4.dp),
            shape = RoundedCornerShape(8.dp),
            elevation = CardDefaults.cardElevation(4.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = item,
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier
                        .weight(1f)
                        .semantics { contentDescription = item }
                )
                Icon(
                    imageVector = Icons.Default.KeyboardArrowRight,
                    contentDescription = null,
                    tint = Color.Gray
                )
            }
        }
    }
}

@Composable
private fun BottomNavigationBar() {
    BottomAppBar(
        modifier = Modifier.fillMaxWidth(),
        contentPadding = PaddingValues(0.dp)
    ) {
        BottomNavigationItem(icon = Icons.Default.Home, label = "Home")
        BottomNavigationItem(icon = Icons.Default.ShoppingCart, label = "Transaction")
        BottomNavigationItem(icon = Icons.Default.Menu, label = "Dashboard")
        BottomNavigationItem(icon = Icons.Default.Notifications, label = "Notification")
        BottomNavigationItem(icon = Icons.Default.AccountCircle, label = "Profile")
    }
}

@Composable
private fun BottomNavigationItem(icon: ImageVector, label: String) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Icon(
            imageVector = icon,
            contentDescription = label,
            tint = Color.White
        )
        Text(
            text = label,
            style = MaterialTheme.typography.labelSmall.copy(color = Color.White, textAlign = TextAlign.Center)
        )
    }
}
