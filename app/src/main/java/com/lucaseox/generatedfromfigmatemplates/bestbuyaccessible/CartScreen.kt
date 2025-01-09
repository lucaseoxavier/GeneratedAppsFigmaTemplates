package com.lucaseox.generatedfromfigmatemplates.bestbuyaccessible

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.heading
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lucaseox.generatedfromfigmatemplates.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CartScreenAccessible() {
    val scrollState = rememberScrollState()
    var quantity by remember { mutableStateOf(1) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
    ) {
        // Header
        TopAppBar(
            title = {
                Text(
                    text = "Cart",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    modifier = Modifier.semantics { heading() }
                )
            },
            navigationIcon = {
                IconButton(onClick = { /* Handle navigation */ }) {
                    Icon(Icons.Default.Menu, contentDescription = "Menu")
                }
            },
            actions = {
                IconButton(onClick = { /* Handle close */ }) {
                    Icon(Icons.Default.Close, contentDescription = "Close")
                }
            },
            colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = Color(0xFFFFEB00))
        )

        // Product Details
        Column(modifier = Modifier.padding(16.dp)) {
            Row(modifier = Modifier.fillMaxWidth()) {
                Image(
                    painter = painterResource(id = R.drawable.laptop_image),
                    contentDescription = "Vivobook 17.3\" Laptop Image",
                    modifier = Modifier.size(80.dp)
                )
                Spacer(modifier = Modifier.width(16.dp))
                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = "Vivobook 17.3\" Laptop - Intel Core 10th Gen i5 12GB",
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp,
                        color = Color.Black,
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis
                    )
                    Text(
                        text = "$499",
                        color = Color.Black,
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp,
                        modifier = Modifier.semantics { contentDescription = "Price: $499" }
                    )
                    Text(
                        text = "10 Loyalty Points",
                        color = Color(0xFF006400),
                        fontSize = 14.sp,
                        modifier = Modifier.semantics { contentDescription = "Earn 10 Loyalty Points" }
                    )
                }
            }

            Spacer(modifier = Modifier.height(16.dp))
            Divider()
            Spacer(modifier = Modifier.height(16.dp))

            // Protection Section
            Text(
                text = "Protect your purchase",
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
                color = Color.Black
            )
            Text(
                text = "Get the best value on product protection",
                fontSize = 14.sp,
                color = Color.Gray,
                modifier = Modifier.semantics { contentDescription = "Get the best value on product protection." }
            )

            Spacer(modifier = Modifier.height(16.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                TextButton(onClick = { /* Handle remove */ }) {
                    Text(
                        text = "Remove",
                        color = Color(0xFF0000FF),
                        modifier = Modifier.semantics { contentDescription = "Remove item from cart" }
                    )
                }
                TextButton(onClick = { /* Handle save for later */ }) {
                    Text(
                        text = "Save for later",
                        color = Color(0xFF0000FF),
                        modifier = Modifier.semantics { contentDescription = "" +
                                "item for later" }
                    )
                }
                Row(verticalAlignment = Alignment.CenterVertically) {
                    IconButton(onClick = { if (quantity > 1) quantity-- }) {
                        Icon(painter = painterResource(id = R.drawable.ic_remove), contentDescription = "Decrease Quantity")
                    }
                    Text(quantity.toString(), fontWeight = FontWeight.Bold, fontSize = 16.sp, color = Color.Black)
                    IconButton(onClick = { quantity++ }) {
                        Icon(painter = painterResource(id = R.drawable.ic_add), contentDescription = "Increase Quantity")
                    }
                }
            }

            Spacer(modifier = Modifier.height(16.dp))
            Divider()
            Spacer(modifier = Modifier.height(16.dp))

            // Summary Section
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Subtotal (2 Items)",
                    color = Color.Gray,
                    fontSize = 14.sp,
                    modifier = Modifier.semantics { contentDescription = "Subtotal for 2 items" }
                )
                Text("$499", fontWeight = FontWeight.Bold, fontSize = 14.sp, color = Color.Black)
            }

            Spacer(modifier = Modifier.height(8.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Taxes",
                    color = Color.Gray,
                    fontSize = 14.sp,
                    modifier = Modifier.semantics { contentDescription = "Taxes amount" }
                )
                Text("$50", fontWeight = FontWeight.Bold, fontSize = 14.sp, color = Color.Black)
            }

            Spacer(modifier = Modifier.height(16.dp))
            Divider()
            Spacer(modifier = Modifier.height(16.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Total",
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp,
                    color = Color.Black
                )
                Text("$549", fontWeight = FontWeight.Bold, fontSize = 18.sp, color = Color.Black)
            }

            Spacer(modifier = Modifier.height(32.dp))

            // Checkout Button
            Button(
                onClick = { /* Handle checkout */ },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(48.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFFEB00))
            ) {
                Text("Continue to checkout", fontWeight = FontWeight.Bold, fontSize = 16.sp, color = Color.Black)
            }
        }
    }
}
