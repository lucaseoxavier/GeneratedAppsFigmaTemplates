package com.lucaseox.generatedappsfigmatemplates.generatedscreens.accessiblebca

import androidx.compose.foundation.BorderStroke
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lucaseox.generatedappsfigmatemplates.R

@Composable
fun FullTransactionScreen() {
    Scaffold(
        bottomBar = { BottomNavigationBar() },
        floatingActionButton = {
            FloatingActionButton(onClick = { /* TODO */ }) {
                Icon(Icons.Default.AddCircle, contentDescription = "Add Transaction")
            }
        },
        floatingActionButtonPosition = FabPosition.Center,
        containerColor = Color(0xFFF5F8FF)
    ) { paddingValues ->
        LazyColumn(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize(),
            contentPadding = PaddingValues(16.dp)
        ) {
            item { HeaderSection() }
            item { Spacer(modifier = Modifier.height(16.dp)) }
            item { DateSelectorSection() }
            item { Spacer(modifier = Modifier.height(16.dp)) }
            item { SectionTitle(title = "Today") }
            items(todayTransactions) { TransactionItem(it) }
            item { SectionTitle(title = "Yesterday") }
            items(yesterdayTransactions) { TransactionItem(it) }
            item { SectionTitle(title = "2 days ago") }
            items(twoDaysAgoTransactions) { TransactionItem(it) }
        }
    }
}

@Composable
private fun HeaderSection() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFF0D47A1), shape = RoundedCornerShape(16.dp))
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
            color = Color.White,
            fontSize = 14.sp
        )
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.End,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(Icons.Default.AddCircle, contentDescription = "Notifications Icon", tint = Color.White)
            Spacer(modifier = Modifier.width(8.dp))
            Surface(
                modifier = Modifier.size(24.dp),
                shape = CircleShape,
                color = Color.White
            ) {}
        }
    }
}

@Composable
private fun DateSelectorSection() {
    Row(
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        modifier = Modifier.fillMaxWidth()
    ) {
        (20..26).forEach { day ->
            Surface(
                shape = RoundedCornerShape(8.dp),
                color = if (day == 26) Color(0xFF0D47A1) else Color.White,
                border = if (day != 26) BorderStroke(1.dp, Color(0xFF0D47A1)) else null
            ) {
                Text(
                    text = day.toString(),
                    modifier = Modifier
                        .padding(8.dp),
                    color = if (day == 26) Color.White else Color(0xFF0D47A1),
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}

@Composable
private fun SectionTitle(title: String) {
    Text(
        text = title,
        fontSize = 16.sp,
        fontWeight = FontWeight.SemiBold,
        color = Color(0xFF0D47A1),
        modifier = Modifier.padding(vertical = 8.dp)
    )
}

@Composable
private fun TransactionItem(transaction: Transaction) {
    Surface(
        shape = RoundedCornerShape(16.dp),
        color = Color(0xFFE8F0FF),
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(16.dp)
        ) {
            Icon(
                imageVector = Icons.Default.AddCircle,
                contentDescription = if (transaction.isIncome) "Income Icon" else "Expense Icon",
                tint = if (transaction.isIncome) Color(0xFF00C853) else Color.Red
            )
            Spacer(modifier = Modifier.width(8.dp))
            Column {
                Text(
                    text = "Rp. ${transaction.amount}",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF0D47A1)
                )
                Text(
                    text = transaction.name,
                    fontSize = 14.sp,
                    color = Color(0xFF0D47A1)
                )
            }
        }
    }
}

@Composable
private fun BottomNavigationBar() {
    NavigationBar {
        NavigationBarItem(
            icon = { Icon(Icons.Default.AddCircle, contentDescription = "Home Icon") },
            selected = false,
            onClick = { }
        )
        NavigationBarItem(
            icon = { Icon(Icons.Default.AddCircle, contentDescription = "Transaction Icon") },
            selected = true,
            onClick = { }
        )
        NavigationBarItem(
            icon = { Icon(Icons.Default.AddCircle, contentDescription = "Notification Icon") },
            selected = false,
            onClick = { }
        )
        NavigationBarItem(
            icon = { Icon(Icons.Default.AddCircle, contentDescription = "Profile Icon") },
            selected = false,
            onClick = { }
        )
    }
}

private data class Transaction(
    val amount: String,
    val name: String,
    val isIncome: Boolean
)

private val todayTransactions = listOf(
    Transaction(amount = "9.600.000", name = "PT. Kuarta Jaya", isIncome = false),
    Transaction(amount = "500.000", name = "Jessica Tanuwijaya", isIncome = true)
)

private val yesterdayTransactions = listOf(
    Transaction(amount = "8.500.000", name = "Bloom Design House", isIncome = true),
    Transaction(amount = "1.200.000", name = "Gilbert Tanjung", isIncome = true),
    Transaction(amount = "200.000", name = "Lidya Danira", isIncome = true)
)

private val twoDaysAgoTransactions = listOf(
    Transaction(amount = "750.000", name = "William Heru", isIncome = true),
    Transaction(amount = "60.000", name = "Galon Air Segar", isIncome = false),
    Transaction(amount = "500.000", name = "Go-Pay", isIncome = false)
)
