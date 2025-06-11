package com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v2.refactoredbca

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lucaseox.generatedappsfigmatemplates.R

@Composable
fun SetLimitScreen() {
    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
            .background(Color.White)
            .padding(bottom = 24.dp)
    ) {
        // Top bar
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFF1447B9))
                .padding(24.dp),
            contentAlignment = Alignment.TopStart
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text("BCA mobile", color = Color.White, fontSize = 20.sp, fontWeight = FontWeight.Bold)
                Row {
                    Icon(Icons.Default.AddCircle, contentDescription = "Notification Icon", tint = Color.Red)
                    Spacer(modifier = Modifier.width(12.dp))
                    Icon(Icons.Default.AddCircle, contentDescription = "Settings Icon", tint = Color.Blue)
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Profile image
        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_placeholder),
                contentDescription = "User Profile Image",
                modifier = Modifier
                    .size(96.dp)
                    .background(Color.Gray, shape = RoundedCornerShape(16.dp))
            )
        }

        Spacer(modifier = Modifier.height(8.dp))

        // User name and info
        Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxWidth()) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text("Andhika Putra", fontSize = 18.sp, fontWeight = FontWeight.Bold, color = Color(0xFF1447B9))
                Spacer(modifier = Modifier.width(4.dp))
                Icon(Icons.Default.AddCircle, contentDescription = "Verified Icon", tint = Color(0xFF1447B9), modifier = Modifier.size(16.dp))
            }
            Spacer(modifier = Modifier.height(4.dp))
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text("Paspor BCA 9087890908", fontSize = 12.sp, color = Color(0xFF555555))
                Spacer(modifier = Modifier.width(4.dp))
                Icon(Icons.Default.AddCircle, contentDescription = "Copy Icon", tint = Color.Gray, modifier = Modifier.size(12.dp))
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Card image
        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_placeholder),
                contentDescription = "Card Image",
                modifier = Modifier
                    .fillMaxWidth(0.3f)
                    .aspectRatio(1.8f)
            )
        }

        Spacer(modifier = Modifier.height(24.dp))

        // Sliders
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFFF1F5FF), shape = RoundedCornerShape(topStart = 32.dp, topEnd = 32.dp))
                .padding(24.dp)
        ) {
            LimitSlider("Cash Withdrawal Limit", "7.000.000")
            LimitSlider("Transfer Limit (BCA)", "25.000.000")
            LimitSlider("Transfer Limit (Different Bank)", "10.000.000")
            LimitSlider("Debit Transaction Debit", "25.000.000")

            Spacer(modifier = Modifier.height(24.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                OutlinedButton(onClick = { /* Cancel logic */ }) {
                    Text("Cancel")
                }
                Button(onClick = { /* Save logic */ }) {
                    Text("Save")
                }
            }
        }
    }
}

@Composable
private fun LimitSlider(title: String, maxAmount: String) {
    val sliderPosition = remember { mutableStateOf(0.5f) }
    val inputText = remember { mutableStateOf("") }

    Column(modifier = Modifier.fillMaxWidth()) {
        Text(title, fontWeight = FontWeight.Bold, color = Color(0xFF1447B9))
        Spacer(modifier = Modifier.height(4.dp))
        Slider(
            value = sliderPosition.value,
            onValueChange = { sliderPosition.value = it },
            modifier = Modifier.semantics { contentDescription = "$title Slider" },
            colors = SliderDefaults.colors(thumbColor = Color(0xFF1447B9), activeTrackColor = Color(0xFF1447B9))
        )
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                "Min.\n10.000",
                fontSize = 12.sp,
                color = Color(0xFF555555),
                textAlign = TextAlign.Center,
                modifier = Modifier.semantics { contentDescription = "Minimum Limit" }
            )
            BasicTextField(
                value = inputText.value,
                onValueChange = { inputText.value = it },
                textStyle = TextStyle.Default.copy(fontSize = 14.sp, textAlign = TextAlign.Center),
                modifier = Modifier
                    .width(160.dp)
                    .background(Color.White, shape = RoundedCornerShape(4.dp))
                    .padding(8.dp)
                    .semantics { contentDescription = "$title Input Field" }
            )
            Text(
                "Min.\n$maxAmount",
                fontSize = 12.sp,
                color = Color(0xFF555555),
                textAlign = TextAlign.Center,
                modifier = Modifier.semantics { contentDescription = "Maximum Limit" }
            )
        }
        Spacer(modifier = Modifier.height(16.dp))
    }
}
