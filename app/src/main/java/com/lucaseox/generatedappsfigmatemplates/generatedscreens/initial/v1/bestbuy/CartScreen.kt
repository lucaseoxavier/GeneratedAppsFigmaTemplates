package com.lucaseox.generatedappsfigmatemplates.generatedscreens.initial.v1.bestbuy

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lucaseox.generatedappsfigmatemplates.R

@Composable
fun CartScreen() {
    Column(modifier = Modifier.fillMaxSize()) {
        TopHeader()
        CartContent(modifier = Modifier.weight(1f))
        CheckoutButton()
    }
}

@Composable
private fun TopHeader() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Yellow)
            .padding(horizontal = 16.dp, vertical = 24.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(Icons.Default.Menu, contentDescription = "Menu")
            Text(
                text = "Cart",
                modifier = Modifier.padding(start = 16.dp),
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
        }
        Icon(Icons.Default.Close, contentDescription = "Close", Modifier.clickable { })
    }
}

@Composable
private fun CartContent(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
            .padding(top = 24.dp)
            .verticalScroll(rememberScrollState())
    ) {
        ProductItem()

        Spacer(modifier = Modifier.height(16.dp))

        Divider()

        Spacer(modifier = Modifier.height(16.dp))

        Summary()
    }
}

@Composable
private fun ProductItem() {
    Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
        Image(
            painter = painterResource(id = R.drawable.ic_placeholder),
            contentDescription = "Product Image",
            modifier = Modifier.size(80.dp)
        )

        Spacer(modifier = Modifier.width(12.dp))

        Column(modifier = Modifier.weight(1f)) {
            Text("Vivobook 17.3\" Laptop - Intel Core 10th Gen i5 12GB...")
            Text("$499", fontWeight = FontWeight.Bold, fontSize = 18.sp)
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(Icons.Default.AddCircle, "Loyalty Points", tint = Color.Yellow)
                Spacer(Modifier.width(4.dp))
                Text("10 Loyalty Points", fontSize = 12.sp, color = Color.Gray)
            }
        }
    }

    Spacer(modifier = Modifier.height(12.dp))

    Text("Protect your purchase", fontWeight = FontWeight.Bold)
    Text("Get the best value on product protection", color = Color.Gray)

    Spacer(modifier = Modifier.height(12.dp))

    Row(verticalAlignment = Alignment.CenterVertically) {
        Text("Remove", modifier = Modifier.clickable { }, color = Color.Gray)
        Spacer(modifier = Modifier.width(16.dp))
        Text("Save for later", modifier = Modifier.clickable { }, color = Color.Gray)
        Spacer(modifier = Modifier.weight(1f))
        QuantitySelector()
    }
}

@Composable
private fun QuantitySelector() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .border(1.dp, Color.Gray, RoundedCornerShape(24.dp))
            .padding(horizontal = 8.dp, vertical = 4.dp)
    ) {
        Text("—", modifier = Modifier.clickable { })
        Spacer(modifier = Modifier.width(16.dp))
        Text("1")
        Spacer(modifier = Modifier.width(16.dp))
        Text("+", modifier = Modifier.clickable { })
    }
}

@Composable
private fun Summary() {
    SummaryItem("Subtotal (2 Items)", "$499")
    SummaryItem("Taxes", "$50")
    Divider(modifier = Modifier.padding(vertical = 8.dp))
    SummaryItem("Total", "$549", bold = true)
}

@Composable
private fun SummaryItem(label: String, amount: String, bold: Boolean = false) {
    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
        Text(label, fontWeight = if (bold) FontWeight.Bold else FontWeight.Normal)
        Text(amount, fontWeight = if (bold) FontWeight.Bold else FontWeight.Normal)
    }
}

@Composable
private fun CheckoutButton() {
    Button(
        onClick = { /* TODO */ },
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color.Yellow),
        shape = RoundedCornerShape(24.dp)
    ) {
        Text("Continue to checkout", color = Color.Black)
    }
}
