package com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v1.refactoredbestbuy

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lucaseox.generatedappsfigmatemplates.R

@Composable
fun CheckoutScreen() {
    val paymentMethods = listOf(
        "World Elite Visa",
        "HSBC Master Card",
        "Buy Now Pay Later",
        "Paypal",
        "Alipay",
        "Venmo"
    )
    val (selectedMethod, onMethodSelected) = remember { mutableStateOf(paymentMethods[2]) }

    Column(modifier = Modifier.fillMaxSize().verticalScroll(rememberScrollState())) {
        TopBar()
        CartItem()
        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Select Payment Method",
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start = 16.dp, bottom = 8.dp)
        )

        Column(Modifier.selectableGroup()) {
            paymentMethods.forEach { method ->
                PaymentMethodItem(
                    method = method,
                    selected = selectedMethod == method,
                    onSelect = { onMethodSelected(method) }
                )
            }
        }

        AddCreditCardOption()

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = { /* TODO: Implement Checkout */ },
            shape = RoundedCornerShape(24.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFFEB3B))
        ) {
            Text("Continue to checkout", color = Color.Black)
        }
    }
}

@Composable
private fun TopBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(Icons.Default.Menu, contentDescription = "Menu", tint = Color.Black)
        Text("Cart", fontSize = 20.sp, fontWeight = FontWeight.Bold)
        Icon(Icons.Default.Close, contentDescription = "Close", tint = Color.Black)
    }
}

@Composable
private fun CartItem() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_placeholder),
            contentDescription = "Product Image",
            modifier = Modifier.size(64.dp)
        )
        Column(modifier = Modifier.padding(start = 12.dp)) {
            Text(
                text = "Vivobook 17.3\" Laptop - Intel Core 10th Gen i5 12GB...",
                fontSize = 14.sp
            )
            Text(
                text = "$549",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF00796B)
            )
        }
    }
}

@Composable
private fun PaymentMethodItem(method: String, selected: Boolean, onSelect: () -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .selectable(
                selected = selected,
                onClick = onSelect,
                role = Role.RadioButton
            )
            .semantics {
                contentDescription = if (selected) "$method selected" else "$method not selected"
            }
            .padding(horizontal = 16.dp, vertical = 12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        RadioButton(
            selected = selected,
            onClick = null // null recommended for accessibility with selectable
        )
        Spacer(modifier = Modifier.width(12.dp))
        Text(method, fontSize = 14.sp)
    }
    Divider()
}

@Composable
private fun AddCreditCardOption() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(
                role = Role.Button,
                onClick = { /* TODO: Add Credit or Debit Card */ }
            )
            .semantics { contentDescription = "Add a credit or debit card" }
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(Icons.Default.AddCircle, contentDescription = null)
        Spacer(modifier = Modifier.width(8.dp))
        Text("Add a credit or debit card", fontSize = 14.sp)
    }
}
