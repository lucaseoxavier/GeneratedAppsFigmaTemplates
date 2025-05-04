package com.lucaseox.generatedappsfigmatemplates.generatedscreens.bca// Required imports

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun NewAccountScreen() {
    Surface(
        shape = RoundedCornerShape(topStart = 24.dp, topEnd = 24.dp),
        color = Color.White,
        tonalElevation = 8.dp
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp, vertical = 32.dp)
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "New Account",
                style = MaterialTheme.typography.headlineSmall.copy(
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF1D2C4B)
                )
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = "Add new account",
                style = MaterialTheme.typography.bodyMedium.copy(
                    color = Color.Gray
                )
            )

            Spacer(modifier = Modifier.height(24.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                val buttonLabels = listOf("Daftar Rekening", "Antar Rekening", "Antar Bank", "BCA")
                var selectedIndex by remember { mutableStateOf(0) }

                buttonLabels.forEachIndexed { index, label ->
                    AssistChip(
                        onClick = { selectedIndex = index },
                        label = {
                            Text(text = label, fontSize = 12.sp)
                        },
                        colors = if (selectedIndex == index) {
                            AssistChipDefaults.assistChipColors(
                                containerColor = Color(0xFF4D7EFF),
                                labelColor = Color.White
                            )
                        } else {
                            AssistChipDefaults.assistChipColors()
                        },
                        modifier = Modifier.padding(horizontal = 2.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(24.dp))

            InputLabel(text = "Receiver Account")
            StaticInputField(value = "9087890908")

            Spacer(modifier = Modifier.height(16.dp))

            InputLabel(text = "Receiver Name")
            StaticInputField(value = "Wesley Putra")

            Spacer(modifier = Modifier.height(32.dp))

            Button(
                onClick = { /* Handle next */ },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(48.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF4D7EFF),
                    contentColor = Color.White
                ),
                shape = RoundedCornerShape(12.dp)
            ) {
                Text(text = "Next")
            }
        }
    }
}

@Composable
private fun InputLabel(text: String) {
    Text(
        text = text,
        style = MaterialTheme.typography.bodyMedium.copy(
            fontWeight = FontWeight.Bold,
            color = Color(0xFF1D2C4B)
        ),
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 4.dp)
    )
}

@Composable
private fun StaticInputField(value: String) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(48.dp)
            .background(
                color = Color(0xFFF2F2F2),
                shape = RoundedCornerShape(12.dp)
            )
            .padding(horizontal = 16.dp),
        contentAlignment = Alignment.CenterStart
    ) {
        Text(
            text = value,
            style = TextStyle(
                color = Color(0xFF1D2C4B),
                fontSize = 14.sp
            )
        )
    }
}
