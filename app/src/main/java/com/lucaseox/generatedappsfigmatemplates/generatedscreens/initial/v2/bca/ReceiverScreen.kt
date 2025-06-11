package com.lucaseox.generatedappsfigmatemplates.generatedscreens.initial.v2.bca// Required imports

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
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
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
            color = Color(0xFF1F4FB2),
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )

        Text(
            text = "Select Receiver",
            style = TextStyle(fontSize = 14.sp, color = Color.Gray),
            modifier = Modifier
                .padding(top = 4.dp)
                .align(Alignment.CenterHorizontally)
        )

        Spacer(modifier = Modifier.height(16.dp))
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier.align(Alignment.CenterHorizontally)
        ) {
            ReceiverTabButton("Antar Rekening", true)
            ReceiverTabButton("Antar Bank", false)
            ReceiverTabButton("BCA Virtual Account", false)
        }

        Spacer(modifier = Modifier.height(16.dp))
        SearchBar()

        Spacer(modifier = Modifier.height(12.dp))
        Text(
            text = "Receiver Account",
            style = TextStyle(fontSize = 14.sp, fontWeight = FontWeight.Bold),
            color = Color(0xFF1F4FB2)
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
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF4D8CFF)),
            shape = RoundedCornerShape(12.dp)
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
    val background = if (selected) Color(0xFF4D8CFF) else Color.Transparent
    val textColor = if (selected) Color.White else Color(0xFF4D8CFF)
    val borderColor = Color(0xFF4D8CFF)

    TextButton(
        onClick = { },
        modifier = Modifier
            .border(1.dp, borderColor, RoundedCornerShape(8.dp))
            .background(background, RoundedCornerShape(8.dp))
            .height(36.dp)
            .padding(horizontal = 12.dp)
    ) {
        Text(text = text, color = textColor, fontSize = 12.sp)
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
            color = Color.Gray,
            fontSize = 14.sp
        )
    }
}

@Composable
private fun ReceiverBox(accountNumber: String) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFE8F0FF), RoundedCornerShape(8.dp))
            .padding(16.dp)
    ) {
        Text(
            text = accountNumber,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF1F4FB2)
        )
    }
}

@Composable
private fun ReceiverCard() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFE8F0FF), RoundedCornerShape(8.dp))
            .padding(12.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
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
                color = Color(0xFF4D8CFF)
            )
        }

        Spacer(modifier = Modifier.height(8.dp))
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
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(text = name, fontSize = 14.sp)
        Row {
            Text(
                text = number,
                fontSize = 14.sp
            )
            if (isNew) {
                Spacer(modifier = Modifier.width(4.dp))
                Text(
                    text = "NEW!",
                    color = Color(0xFF4D8CFF),
                    fontWeight = FontWeight.Bold,
                    fontSize = 12.sp
                )
            }
        }
    }
}
