package com.lucaseox.generatedfromfigmatemplates.bcaaccessible

import androidx.compose.foundation.horizontalScroll
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
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(16.dp)
    ) {
        HeaderSection()
        BalanceSection()
        ActionGrid()
        PromoSection()
        BottomNavigationBar()
    }
}

@Composable
private fun HeaderSection() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column {
            Text("Hello,", style = TextStyle(fontSize = 18.sp, color = Color(0xFF000000)))
            Text("Andhika Putra", style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color(0xFF000000)))
            Text("9087890908", style = TextStyle(fontSize = 14.sp, color = Color(0xFF000000)))
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(
                Icons.Default.Notifications,
                contentDescription = "Notifications",
                tint = Color(0xFF000000)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Surface(
                shape = MaterialTheme.shapes.small,
                color = Color.Green,
                modifier = Modifier.size(12.dp)
            ) {}
        }
    }
}

@Composable
private fun BalanceSection() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Surface(
            shape = MaterialTheme.shapes.medium,
            color = Color(0xFF0056A6),
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(
                modifier = Modifier.padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text("Current Balance", style = TextStyle(fontSize = 14.sp, color = Color.White))
                Text("Rp. 27,950,000", style = TextStyle(fontSize = 24.sp, fontWeight = FontWeight.Bold, color = Color.White))
            }
        }
    }
}

@Composable
private fun ActionGrid() {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val actions = listOf(
            Icons.Default.Info to "M-Info",
            Icons.Default.ArrowForward to "M-Transfer",
//            Icons.Default.AttachMoney to "M-Payment",
            Icons.Default.ShoppingCart to "M-Commerce",
            Icons.Default.Close to "Cardless",
            Icons.Default.Settings to "M-Admin"
        )

        actions.chunked(3).forEach { row ->
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically
            ) {
                row.forEach { (icon, label) ->
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.semantics { contentDescription = label }
                    ) {
                        Icon(
                            icon,
                            contentDescription = null,
                            modifier = Modifier.size(48.dp),
                            tint = Color(0xFF0056A6)
                        )
                        Text(label, style = TextStyle(fontSize = 14.sp, color = Color.Black))
                    }
                }
            }
            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}

@Composable
private fun PromoSection() {
    Column(modifier = Modifier.fillMaxWidth()) {
        Text(
            "Promo",
            style = TextStyle(fontSize = 18.sp, fontWeight = FontWeight.Bold, color = Color.Black),
            modifier = Modifier.padding(vertical = 16.dp)
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState()),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            repeat(3) {
                Surface(
                    shape = MaterialTheme.shapes.medium,
                    color = Color.LightGray,
                    modifier = Modifier.size(200.dp, 120.dp)
                ) {
                    // Placeholder for promo content
                }
            }
        }
    }
}

@Composable
private fun BottomNavigationBar() {
    BottomAppBar(
        containerColor = Color(0xFF0056A6),
        content = {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                Icon(Icons.Default.Home, contentDescription = "Home", tint = Color.White)
                Icon(Icons.Default.ArrowForward, contentDescription = "Transaction", tint = Color.White)
//                Icon(Icons.Default.GridView, contentDescription = "Main", tint = Color.White)
                Icon(Icons.Default.Notifications, contentDescription = "Notification", tint = Color.White)
                Icon(Icons.Default.Person, contentDescription = "Profile", tint = Color.White)
            }
        }
    )
}
