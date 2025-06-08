package com.lucaseox.generatedappsfigmatemplates.generatedscreens.initial.v1.bca

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun FlazzTopUpScreen() {
    val selectedAmount = remember { mutableStateOf(75000) }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Flazz",
            style = MaterialTheme.typography.titleLarge.copy(
                color = Color(0xFF003366),
                fontWeight = FontWeight.Bold
            )
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = "Top Up",
            style = MaterialTheme.typography.bodyMedium.copy(
                color = Color.Gray
            )
        )
        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFFE6EEFF), RoundedCornerShape(12.dp))
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .background(Color(0xFF3366FF), RoundedCornerShape(6.dp))
                    .padding(horizontal = 8.dp, vertical = 4.dp)
            ) {
                Text(
                    text = "Rp.",
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 14.sp
                )
            }
            Spacer(modifier = Modifier.width(16.dp))
            Text(
                text = "${selectedAmount.value / 1000}.${(selectedAmount.value % 1000).toString().padStart(3, '0')}",
                style = MaterialTheme.typography.headlineMedium.copy(
                    color = Color(0xFF003366),
                    fontWeight = FontWeight.Bold
                )
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            val amounts = listOf(20000, 50000, 75000, 100000, 200000, 300000, 500000)
            Row(horizontalArrangement = Arrangement.Center) {
                amounts.take(4).forEach { amount ->
                    AmountButton(amount = amount, selectedAmount = selectedAmount.value) {
                        selectedAmount.value = amount
                    }
                    Spacer(modifier = Modifier.width(8.dp))
                }
            }
            Spacer(modifier = Modifier.height(8.dp))
            Row(horizontalArrangement = Arrangement.Center) {
                amounts.drop(4).forEach { amount ->
                    AmountButton(amount = amount, selectedAmount = selectedAmount.value) {
                        selectedAmount.value = amount
                    }
                    Spacer(modifier = Modifier.width(8.dp))
                }
            }
        }

        Spacer(modifier = Modifier.height(32.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Button(
                onClick = { /* Handle Cancel */ },
                colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
                border = ButtonDefaults.outlinedButtonBorder,
                modifier = Modifier
                    .weight(1f)
                    .height(50.dp)
            ) {
                Text(text = "Cancel", color = Color(0xFF3366FF))
            }
            Spacer(modifier = Modifier.width(16.dp))
            Button(
                onClick = { /* Handle OK */ },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF3366FF)),
                modifier = Modifier
                    .weight(1f)
                    .height(50.dp)
            ) {
                Text(text = "OK", color = Color.White)
            }
        }
    }
}

@Composable
private fun AmountButton(amount: Int, selectedAmount: Int, onClick: () -> Unit) {
    Surface(
        shape = RoundedCornerShape(24.dp),
        color = if (amount == selectedAmount) Color(0xFF3366FF) else Color.Transparent,
        border = if (amount != selectedAmount) ButtonDefaults.outlinedButtonBorder else null,
        modifier = Modifier
            .clickable { onClick() }
            .padding(vertical = 4.dp, horizontal = 8.dp)
    ) {
        Row(
            modifier = Modifier
                .padding(horizontal = 12.dp, vertical = 8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "${amount / 1000}.000 +",
                color = if (amount == selectedAmount) Color.White else Color(0xFF3366FF),
                fontWeight = FontWeight.Medium
            )
        }
    }
}
