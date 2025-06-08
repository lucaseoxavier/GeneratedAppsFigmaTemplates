package com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v1.refactoredbestbuy

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.lucaseox.generatedappsfigmatemplates.R

@Composable
fun ProductDetailScreen() {
    Scaffold(
        topBar = { ProductTopBar() },
        bottomBar = { ProductBottomBar() }
    ) { padding ->
        Column(
            modifier = Modifier
                .padding(padding)
                .verticalScroll(rememberScrollState())
                .padding(horizontal = 16.dp, vertical = 8.dp)
        ) {
            ProductInfoSection()
            ProductImageSection()
            ProductDescriptionSection()
            ProductExpandableOptions()
            RecommendedProductsSection()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun ProductTopBar() {
    TopAppBar(
        title = { Text("PC Laptops") },
        navigationIcon = {
            IconButton(onClick = {}) {
                Icon(Icons.Default.ArrowBack, contentDescription = "Back")
            }
        },
        actions = {
            IconButton(onClick = {}) {
                Icon(Icons.Default.Menu, contentDescription = "Menu")
            }
            IconButton(onClick = {}) {
                Icon(Icons.Default.Search, contentDescription = "Search")
            }
        }
    )
}

@Composable
private fun ProductInfoSection() {
    Text("ASUS", style = MaterialTheme.typography.titleMedium, color = Color(0xFF448AFF))
    Text(
        "Vivobook 17.3\" Laptop – Intel Core 10th Gen i5 12GB Memory - 1TB HDD",
        style = MaterialTheme.typography.titleMedium,
        fontWeight = FontWeight.Bold
    )
    Spacer(modifier = Modifier.height(4.dp))
    Row(verticalAlignment = Alignment.CenterVertically) {
        Text("$499", style = MaterialTheme.typography.titleLarge, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.width(8.dp))
        Text(
            "SAVE $300",
            color = Color.White,
            modifier = Modifier
                .background(Color(0xFFD50000), shape = MaterialTheme.shapes.small)
                .padding(horizontal = 6.dp, vertical = 2.dp)
        )
    }
    Row(verticalAlignment = Alignment.CenterVertically) {
        repeat(4) {
            Icon(
                Icons.Default.AddCircle,
                contentDescription = "Filled Star",
                tint = Color.Yellow
            )
        }
        Icon(
            Icons.Default.AddCircle,
            contentDescription = "Empty Star",
            tint = Color.Gray
        )
        Spacer(modifier = Modifier.width(4.dp))
        Text("(4,201)", style = MaterialTheme.typography.bodySmall)
    }
}

@Composable
private fun ProductImageSection() {
    Spacer(modifier = Modifier.height(16.dp))
    Image(
        painter = painterResource(id = R.drawable.ic_placeholder),
        contentDescription = "Main product image",
        modifier = Modifier
            .fillMaxWidth()
            .semantics { contentDescription = "Main Product Image" }
    )
    Spacer(modifier = Modifier.height(8.dp))
    Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {
        repeat(4) { index ->
            Image(
                painter = painterResource(id = R.drawable.ic_placeholder),
                contentDescription = "Thumbnail $index",
                modifier = Modifier
                    .size(64.dp)
                    .padding(4.dp)
                    .semantics { contentDescription = "Thumbnail Image $index" }
            )
        }
    }
}

@Composable
private fun ProductDescriptionSection() {
    Spacer(modifier = Modifier.height(16.dp))
    Text("Model: X712JA-212.V17WN-11", style = MaterialTheme.typography.bodyMedium)
    Text("SKU: 6469399", style = MaterialTheme.typography.bodyMedium)
    Spacer(modifier = Modifier.height(8.dp))
    Text(
        "ASUS Vivobook Laptop. Enjoy everyday activities with this ASUS notebook PC. The Intel Core i5 processor and 12GB of RAM let you run programs smoothly",
        style = MaterialTheme.typography.bodyMedium
    )
}

@Composable
private fun ProductExpandableOptions() {
    Spacer(modifier = Modifier.height(16.dp))
    listOf("Overview", "Specifications", "Reviews", "Questions & Answers", "Buying Options").forEach {
        Divider()
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 12.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(it, style = MaterialTheme.typography.bodyMedium, fontWeight = FontWeight.Bold)
            Icon(Icons.Default.AddCircle, contentDescription = "$it Expand Icon")
        }
    }
}

@Composable
private fun RecommendedProductsSection() {
    Spacer(modifier = Modifier.height(16.dp))
    Text("Frequently bought together", style = MaterialTheme.typography.bodyMedium)
    Text(
        "Our experts recommend",
        style = MaterialTheme.typography.titleMedium,
        fontWeight = FontWeight.Bold
    )
    Spacer(modifier = Modifier.height(8.dp))
    Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {
        repeat(3) { index ->
            Column(
                modifier = Modifier
                    .width(140.dp)
                    .padding(end = 8.dp)
                    .semantics { contentDescription = "Recommended Product $index" }
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_placeholder),
                    contentDescription = "Recommended Product Image $index",
                    modifier = Modifier.size(120.dp)
                )
                Text("Product Name", maxLines = 1, overflow = TextOverflow.Ellipsis)
                Text("$499", fontWeight = FontWeight.Bold)
                Row {
                    repeat(4) {
                        Icon(
                            Icons.Default.AddCircle,
                            contentDescription = "Filled Star",
                            tint = Color.Yellow
                        )
                    }
                    Icon(
                        Icons.Default.AddCircle,
                        contentDescription = "Empty Star",
                        tint = Color.Gray
                    )
                    Text("(4,201)", style = MaterialTheme.typography.bodySmall)
                }
            }
        }
    }
}

@Composable
private fun ProductBottomBar() {
    BottomAppBar(containerColor = Color(0xFFEEE5FF)) {
        Button(
            onClick = {},
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .semantics { contentDescription = "Add To Cart Button" },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFD1B3FF))
        ) {
            Icon(Icons.Default.AddCircle, contentDescription = "Cart Icon")
            Spacer(modifier = Modifier.width(4.dp))
            Text("Add To Cart")
        }
    }
}
