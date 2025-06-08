package com.lucaseox.generatedappsfigmatemplates.generatedscreens.initial.v1.bca

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ReceiverScreen() {
    val scrollState = rememberScrollState()
    val searchQuery = remember { mutableStateOf(TextFieldValue("")) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "Receiver",
            style = MaterialTheme.typography.headlineSmall.copy(fontWeight = FontWeight.Bold),
            color = Color.Black
        )

        Text(
            text = "Select Receiver",
            style = MaterialTheme.typography.bodyMedium,
            color = Color.Gray
        )

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            FilterButton(text = "Antar Rekening", selected = true)
            FilterButton(text = "Antar Bank", selected = false)
            FilterButton(text = "BCA Virtual Account", selected = false)
        }

        Spacer(modifier = Modifier.height(16.dp))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(12.dp))
                .background(Color(0xFFF5F5F5))
                .padding(horizontal = 16.dp, vertical = 12.dp)
        ) {
            if (searchQuery.value.text.isEmpty()) {
                Text(
                    text = "Search",
                    color = Color.Gray,
                    fontSize = 14.sp
                )
            }
            BasicTextField(
                value = searchQuery.value,
                onValueChange = { searchQuery.value = it },
                modifier = Modifier.fillMaxWidth(),
                textStyle = TextStyle(color = Color.Black, fontSize = 14.sp)
            )
        }

        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "Receiver Account",
            style = MaterialTheme.typography.bodyLarge.copy(fontWeight = FontWeight.Bold),
            color = Color(0xFF1A2F6F)
        )

        Spacer(modifier = Modifier.height(8.dp))

        ReceiverAccountCard(accountNumber = "9087890908")

        Spacer(modifier = Modifier.height(16.dp))

        ReceiverList()

        Spacer(modifier = Modifier.height(24.dp))

        Button(
            onClick = {},
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
            shape = RoundedCornerShape(12.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF4D8CFF))
        ) {
            Text(text = "Next", color = Color.White)
        }
    }
}

@Composable
private fun FilterButton(text: String, selected: Boolean) {
    val backgroundColor = if (selected) Color(0xFF4D8CFF) else Color.White
    val textColor = if (selected) Color.White else Color(0xFF4D8CFF)
    val borderColor = Color(0xFF4D8CFF)

    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(50))
            .background(backgroundColor)
            .border(1.dp, borderColor, RoundedCornerShape(50))
            .padding(horizontal = 16.dp, vertical = 8.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(text = text, color = textColor, fontSize = 12.sp)
    }
}

@Composable
private fun ReceiverAccountCard(accountNumber: String) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFE5EEFF), RoundedCornerShape(12.dp))
            .padding(16.dp)
    ) {
        Text(text = accountNumber, fontWeight = FontWeight.Bold, fontSize = 16.sp, color = Color(0xFF1A2F6F))
    }
}

@Composable
private fun ReceiverList() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White, RoundedCornerShape(12.dp))
            .padding(12.dp)
    ) {
        ReceiverItem(name = "Wesley Putra", accountNumber = "9087890908", isNew = true)
        ReceiverItem(name = "Nieco Aldoni", accountNumber = "9087890908")
        ReceiverItem(name = "Nicholas Kusuma", accountNumber = "6590800800")
    }
}

@Composable
private fun ReceiverItem(name: String, accountNumber: String, isNew: Boolean = false) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column {
            Text(text = name, fontWeight = FontWeight.SemiBold, fontSize = 14.sp)
            Text(text = accountNumber, fontSize = 12.sp, color = Color.Gray)
        }
        if (isNew) {
            Text(
                text = "NEW!",
                fontSize = 12.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF4D8CFF)
            )
        }
    }
}
