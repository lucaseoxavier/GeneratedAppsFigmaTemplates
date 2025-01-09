@file:Suppress("OPT_IN_IS_NOT_ENABLED")

package com.lucaseox.generatedfromfigmatemplates.bestbuyaccessible

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.graphics.Color.Companion.Yellow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.lucaseox.generatedfromfigmatemplates.R


@Composable
fun CheckoutScreenAccessible() {
    var selectedPayment by remember { mutableStateOf("Buy Now Pay Later") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(White)
            .padding(16.dp)
    ) {
        // Top Bar
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Default.Menu,
                contentDescription = "Open menu",
                tint = Black,
                modifier = Modifier.size(24.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = "Cart",
                style = MaterialTheme.typography.bodyLarge,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.weight(1f)
            )
            Icon(
                imageVector = Icons.Default.Close,
                contentDescription = "Close cart",
                tint = Black,
                modifier = Modifier
                    .size(24.dp)
                    .background(Yellow, CircleShape)
            )
        }
        Spacer(modifier = Modifier.height(16.dp))

        // Product Details
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.laptop_image), // Replace with your image resource
                contentDescription = "Laptop product image",
                modifier = Modifier.size(80.dp)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column {
                Text(
                    text = "Vivobook 17.3\" Laptop - Intel Core 10th Gen i5 12GB...",
                    style = MaterialTheme.typography.bodyMedium
                )
                Text(
                    text = "$549",
                    style = MaterialTheme.typography.bodyMedium,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF1A5D1A)
                )
            }
        }
        Spacer(modifier = Modifier.height(16.dp))

        // Payment Method Section
        Text(
            text = "Select Payment Method",
            style = MaterialTheme.typography.bodyLarge,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(8.dp))
        Column {
            listOf(
                "World Elite Visa" to "Card ending in 2380",
                "HSBC Master Card" to "Card ending in 8790",
                "Buy Now Pay Later" to "",
                "Paypal" to "Pay using Paypal",
                "Alipay" to "Pay using Alipay",
                "Venmo" to "Pay using Venmo"
            ).forEach { paymentOption ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp)
                        .selectable(
                            selected = selectedPayment == paymentOption.first,
                            onClick = { selectedPayment = paymentOption.first }
                        ),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    RadioButton(
                        selected = selectedPayment == paymentOption.first,
                        onClick = { selectedPayment = paymentOption.first }
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Column {
                        Text(
                            text = paymentOption.first,
                            style = MaterialTheme.typography.bodyMedium
                        )
                        if (paymentOption.second.isNotEmpty()) {
                            Text(
                                text = paymentOption.second,
                                style = MaterialTheme.typography.bodySmall,
                                color = Black // Improved contrast
                            )
                        }
                    }
                }
            }
        }
        Spacer(modifier = Modifier.height(16.dp))

        // Add Credit or Debit Card
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Default.Add,
                contentDescription = "Add credit or debit card",
                tint = Black
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = "Add a credit or debit card",
                style = MaterialTheme.typography.bodyMedium,
                fontWeight = FontWeight.Bold
            )
        }
        Spacer(modifier = Modifier.weight(1f))

        // Continue Button
        Button(
            onClick = { /* TODO: Add Checkout Logic */ },
            colors = ButtonDefaults.buttonColors(containerColor = Yellow),
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp)
        ) {
            Text(
                text = "Continue to checkout",
                style = MaterialTheme.typography.bodyLarge,
                fontWeight = FontWeight.Bold,
                color = Black
            )
        }
    }
}

@Preview
@Composable
fun CheckoutScreenPreview() {
    CheckoutScreenAccessible()
}
