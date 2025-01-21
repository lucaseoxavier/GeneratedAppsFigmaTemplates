package com.lucaseox.generatedfromfigmatemplates.bcaaccessible

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun FullTransactionScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFEAF3FF))
            .verticalScroll(rememberScrollState())
    ) {
        HeaderSection()
        DateSelector()
        TransactionList()
        BottomNavigationBar()
    }
}

@Composable
private fun HeaderSection() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFF3366CC))
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column {
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
                fontSize = 12.sp
            )
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(
                imageVector = androidx.compose.material.icons.Icons.Default.Notifications,
                contentDescription = "Notification Icon",
                tint = Color.White,
                modifier = Modifier.size(24.dp)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Box(
                modifier = Modifier
                    .size(40.dp)
                    .background(Color.Blue, shape = MaterialTheme.shapes.small)
                    .semantics { contentDescription = "Profile Picture" }
            )
        }
    }
}

@Composable
private fun DateSelector() {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(
            text = "Recent Transaction",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF3366CC)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            repeat(7) { index ->
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = if (index == 6) Color(0xFF3366CC) else Color.White
                    ),
                    modifier = Modifier
                        .width(48.dp)
                        .height(48.dp)
                        .semantics { contentDescription = "Date ${20 + index}" },
                    shape = MaterialTheme.shapes.small
                ) {
                    Text(
                        text = (20 + index).toString(),
                        color = if (index == 6) Color.White else Color(0xFF3366CC)
                    )
                }
            }
        }
    }
}

@Composable
private fun TransactionList() {
    Column(modifier = Modifier.padding(16.dp)) {
        TransactionSection(title = "Today", transactions = listOf(
            TransactionItem("PT. Kuarta Jaya", "Rp. 9.600.000", true),
            TransactionItem("Jessica Tanuwijaya", "Rp. 500.000", false)
        ))
        TransactionSection(title = "Yesterday", transactions = listOf(
            TransactionItem("Bloom Design House", "Rp. 8.500.000", false),
            TransactionItem("Gilbert Tanjung", "Rp. 1.200.000", false),
            TransactionItem("Lidya Danira", "Rp. 200.000", false)
        ))
        TransactionSection(title = "2 days ago", transactions = listOf(
            TransactionItem("William Heru", "Rp. 750.000", false),
            TransactionItem("Galon Air Segar", "Rp. 60.000", true),
            TransactionItem("Go-Pay", "Rp. 500.000", true)
        ))
    }
}

@Composable
private fun TransactionSection(title: String, transactions: List<TransactionItem>) {
    Text(
        text = title,
        fontSize = 16.sp,
        fontWeight = FontWeight.Bold,
        color = Color(0xFF3366CC),
        modifier = Modifier.padding(vertical = 8.dp)
    )
    Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
        transactions.forEachIndexed { index, transaction ->
            TransactionCard(transaction, index)
        }
    }
}

@Composable
private fun TransactionCard(transaction: TransactionItem, index: Int) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFF2F6FF), shape = MaterialTheme.shapes.medium)
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(
                imageVector = androidx.compose.material.icons.Icons.Default.KeyboardArrowUp,
                contentDescription = if (transaction.isExpense) "Expense $index" else "Income $index",
                tint = if (transaction.isExpense) Color.Red else Color.Green,
                modifier = Modifier.size(24.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Column {
                Text(
                    text = transaction.amount,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF003399)
                )
                Text(
                    text = transaction.title,
                    fontSize = 14.sp,
                    color = Color(0xFF555555)
                )
            }
        }
    }
}

@Composable
private fun BottomNavigationBar() {
    BottomAppBar(
        containerColor = Color(0xFF3366CC)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            BottomNavItem("Home", 0)
            BottomNavItem("Transaction", 1)
            FloatingActionButton(onClick = { /*TODO*/ },
                containerColor = Color.White
            ) {
                Icon(
                    imageVector = androidx.compose.material.icons.Icons.Default.List,
                    contentDescription = "Transaction FAB",
                    tint = Color(0xFF3366CC)
                )
            }
            BottomNavItem("Notification", 2)
            BottomNavItem("Profile", 3)
        }
    }
}

@Composable
private fun BottomNavItem(label: String, index: Int) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Icon(
            imageVector = androidx.compose.material.icons.Icons.Default.Home,
            contentDescription = "$label $index",
            tint = Color.White,
            modifier = Modifier.size(24.dp)
        )
        Text(text = label, color = Color.White, fontSize = 12.sp)
    }
}

data class TransactionItem(
    val title: String,
    val amount: String,
    val isExpense: Boolean
)
