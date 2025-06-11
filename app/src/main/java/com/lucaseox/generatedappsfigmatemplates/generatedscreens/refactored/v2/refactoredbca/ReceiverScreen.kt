package com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v2.refactoredbca// Required imports

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lucaseox.generatedappsfigmatemplates.R

@Composable
fun ReceiverScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(16.dp)
    ) {
        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Receiver",
            style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold),
            color = Color(0xFF0047AB), // Improved contrast
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )

        Text(
            text = "Select Receiver",
            fontSize = 14.sp,
            color = Color(0xFF444444), // Improved contrast
            modifier = Modifier
                .padding(top = 4.dp)
                .align(Alignment.CenterHorizontally)
        )

        Spacer(modifier = Modifier.height(16.dp))
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier.align(Alignment.CenterHorizontally)
        ) {
            ReceiverTabButton("Antar Rekening", selected = true)
            ReceiverTabButton("Antar Bank", selected = false)
            ReceiverTabButton("BCA", selected = false)
        }

        Spacer(modifier = Modifier.height(16.dp))
        SearchBar()

        Spacer(modifier = Modifier.height(12.dp))
        Text(
            text = "Receiver Account",
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF0047AB) // Improved contrast
        )

        Spacer(modifier = Modifier.height(8.dp))
        ReceiverBox("9087890908")

        Spacer(modifier = Modifier.height(16.dp))
        ReceiverCard()
        Spacer(modifier = Modifier.height(24.dp))

        Button(
            onClick = { },
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp),
            shape = RoundedCornerShape(12.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF2962FF)) // Higher contrast
        ) {
            Text(
                text = "Next",
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp
            )
        }
    }
}

@Composable
private fun ReceiverTabButton(text: String, selected: Boolean) {
    val background = if (selected) Color(0xFF2962FF) else Color.Transparent
    val textColor = if (selected) Color.White else Color(0xFF2962FF)
    val borderColor = Color(0xFF2962FF)

    TextButton(
        onClick = { },
        modifier = Modifier
            .border(1.dp, borderColor, RoundedCornerShape(8.dp))
            .background(background, RoundedCornerShape(8.dp))
            .height(36.dp)
            .padding(horizontal = 12.dp)
            .semantics { contentDescription = "Tab: $text" }
    ) {
        Text(text = text, color = textColor, fontSize = 13.sp)
    }
}

@Composable
private fun SearchBar() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .height(48.dp)
            .background(Color(0xFFF1F1F1), RoundedCornerShape(8.dp))
            .padding(horizontal = 12.dp)
    ) {
        Icon(
            imageVector = Icons.Default.AddCircle,
            contentDescription = "Search Icon",
            tint = Color.Gray
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(
            text = "Search",
            color = Color(0xFF666666), // Improved contrast
            fontSize = 14.sp
        )
    }
}

@Composable
private fun ReceiverBox(accountNumber: String) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFE0EDFF), RoundedCornerShape(8.dp))
            .padding(16.dp)
            .semantics { contentDescription = "Receiver Account Number: $accountNumber" }
    ) {
        Text(
            text = accountNumber,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF0047AB)
        )
    }
}

@Composable
private fun ReceiverCard() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFE0EDFF), RoundedCornerShape(8.dp))
            .padding(12.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "Wesley Putra",
                fontWeight = FontWeight.Bold,
                fontSize = 14.sp
            )
            Text(
                text = "NEW!",
                fontWeight = FontWeight.Bold,
                fontSize = 12.sp,
                color = Color(0xFF1C5DFF) // Improved contrast
            )
        }

        Spacer(modifier = Modifier.height(12.dp))
        Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
            ReceiverRow("Wesley Putra", "9087890908", true)
            ReceiverRow("Nieco Aldoni", "9087890908", false)
            ReceiverRow("Nicholas Kusuma", "6590800800", false)
        }
    }
}

@Composable
private fun ReceiverRow(name: String, number: String, isNew: Boolean) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .semantics { contentDescription = "Receiver $name with account $number" },
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(text = name, fontSize = 14.sp)
        Row {
            Text(text = number, fontSize = 14.sp)
            if (isNew) {
                Spacer(modifier = Modifier.width(4.dp))
                Text(
                    text = "NEW!",
                    color = Color(0xFF1C5DFF), // Better contrast
                    fontWeight = FontWeight.Bold,
                    fontSize = 12.sp,
                    modifier = Modifier.semantics { contentDescription = "Status: New for $name" }
                )
            }
        }
    }
}
