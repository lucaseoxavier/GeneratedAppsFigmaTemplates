package com.lucaseox.generatedappsfigmatemplates.generatedscreens.initial.v3.bca// Imports

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lucaseox.generatedappsfigmatemplates.R

@Composable
fun ReceiverSelectionScreen() {
    val tabOptions = listOf("Internal", "Other Bank", "Virtual Account")
    var selectedTab by remember { mutableStateOf("Internal") }
    var searchText by remember { mutableStateOf("") }

    val receiverList = listOf(
        Receiver("Wesley Putra", "9087890908", isNew = true),
        Receiver("Nieco Aldoni", "9087890908", isNew = false),
        Receiver("Nicholas Kusuma", "6590800800", isNew = false)
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(horizontal = 16.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Spacer(modifier = Modifier.height(32.dp))

        Text(
            text = "Receiver",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )

        Text(
            text = "Select Receiver",
            fontSize = 14.sp,
            color = Color.Gray,
            modifier = Modifier
                .padding(top = 4.dp)
                .align(Alignment.CenterHorizontally)
        )

        Spacer(modifier = Modifier.height(24.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            tabOptions.forEach { tab ->
                val isSelected = selectedTab == tab
                OutlinedButton(
                    onClick = { selectedTab = tab },
                    colors = ButtonDefaults.outlinedButtonColors(
                        containerColor = if (isSelected) Color(0xFF4D8CFF) else Color.Transparent,
                        contentColor = if (isSelected) Color.White else Color(0xFF4D8CFF)
                    ),
//                    border = ButtonDefaults.outlinedBorder.takeIf { !isSelected },
                    shape = RoundedCornerShape(12.dp),
                    modifier = Modifier.weight(1f).padding(horizontal = 4.dp)
                ) {
                    Text(text = tab)
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = searchText,
            onValueChange = { searchText = it },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.AddCircle,
                    contentDescription = "Search Icon"
                )
            },
            placeholder = { Text("Search") },
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp),
            shape = RoundedCornerShape(12.dp),
            singleLine = true
        )

        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "Receiver Account",
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF1A2C52)
        )

        Spacer(modifier = Modifier.height(12.dp))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFFEAF1FF), RoundedCornerShape(8.dp))
                .padding(16.dp)
        ) {
            Text(
                text = "9087890908",
                fontWeight = FontWeight.SemiBold,
                fontSize = 16.sp
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        ReceiverCard(name = "Wesley Putra", isNew = true)

        Spacer(modifier = Modifier.height(8.dp))

        ReceiverList(receivers = receiverList)

        Spacer(modifier = Modifier.height(24.dp))

        Button(
            onClick = { /* Handle next action */ },
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp),
            shape = RoundedCornerShape(12.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF4D8CFF)
            )
        ) {
            Text(text = "Next", color = Color.White, fontSize = 16.sp, fontWeight = FontWeight.Bold)
        }

        Spacer(modifier = Modifier.height(24.dp))
    }
}

private data class Receiver(val name: String, val accountNumber: String, val isNew: Boolean)

@Composable
private fun ReceiverCard(name: String, isNew: Boolean) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFEAF1FF), RoundedCornerShape(8.dp))
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = name,
            fontWeight = FontWeight.Medium,
            fontSize = 16.sp,
            modifier = Modifier.weight(1f)
        )
        if (isNew) {
            Text(
                text = "NEW!",
                fontWeight = FontWeight.Bold,
                fontSize = 12.sp,
                color = Color(0xFF4D8CFF)
            )
        }
    }
}

@Composable
private fun ReceiverList(receivers: List<Receiver>) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFF5F7FA), RoundedCornerShape(8.dp))
            .padding(vertical = 8.dp)
    ) {
        receivers.forEach { receiver ->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 12.dp, vertical = 8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = receiver.name,
                    modifier = Modifier.weight(1f),
                    fontSize = 14.sp
                )
                Text(
                    text = receiver.accountNumber,
                    fontSize = 12.sp,
                    color = Color.Gray
                )
                if (receiver.isNew) {
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(
                        text = "NEW!",
                        fontSize = 12.sp,
                        color = Color(0xFF4D8CFF),
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }
    }
}
