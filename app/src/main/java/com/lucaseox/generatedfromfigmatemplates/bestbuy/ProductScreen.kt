package com.lucaseox.generatedfromfigmatemplates.bestbuy

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.lucaseox.generatedfromfigmatemplates.R

@Composable
fun PCLaptopScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .verticalScroll(rememberScrollState())
    ) {
        TopBarWithBackButton()
        ProductDetailsSection()
        ExpandableSections()
        RecommendationsSection()
        AddToCartButton()
    }
}

@Composable
fun TopBarWithBackButton() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFF0046BE))
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconButton(onClick = { /* TODO: Navigate back */ }) {
            Icon(
                painter = painterResource(id = R.drawable.ic_launcher_background), // Placeholder for back icon
                contentDescription = "Back Icon",
                tint = Color.White
            )
        }
        Text(
            text = "PC Laptops",
            color = Color.White,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start = 8.dp)
        )
        Spacer(modifier = Modifier.weight(1f))
        IconButton(onClick = { /* TODO: Search */ }) {
            Icon(
                painter = painterResource(id = R.drawable.ic_launcher_background), // Placeholder for search icon
                contentDescription = "Search Icon",
                tint = Color.White
            )
        }
    }
}

@Composable
fun ProductDetailsSection() {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(
            text = "ASUS",
            style = MaterialTheme.typography.titleSmall,
            color = Color.Gray
        )
        Text(
            text = "Vivobook 17.3\" Laptop - Intel Core 10th Gen i5 12GB Memory - 1TB HDD",
            style = MaterialTheme.typography.titleLarge.copy(fontWeight = FontWeight.Bold)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(
                text = "$499",
                style = MaterialTheme.typography.titleLarge.copy(fontWeight = FontWeight.Bold)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = "SAVE $300",
                color = Color.Red,
                style = MaterialTheme.typography.bodySmall.copy(fontWeight = FontWeight.Bold)
            )
        }
        Spacer(modifier = Modifier.height(8.dp))
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background), // Placeholder for product image
            contentDescription = "Product Image",
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "Model: X712JA-212.V17WN-11")
        Text(text = "SKU: 6469399")
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "ASUS Vivobook Laptop. Enjoy everyday activities with this ASUS notebook PC. The Intel Core i5 processor and 12GB of RAM let you run programs smoothly.",
            style = MaterialTheme.typography.bodySmall
        )
    }
}

@Composable
fun ExpandableSections() {
    Column(modifier = Modifier.padding(16.dp)) {
        ExpandableSection(title = "Overview")
        ExpandableSection(title = "Specifications")
        ExpandableSection(title = "Reviews")
        ExpandableSection(title = "Questions & Answers")
        ExpandableSection(title = "Buying Options")
    }
}

@Composable
fun ExpandableSection(title: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = title,
            style = MaterialTheme.typography.bodyLarge.copy(fontWeight = FontWeight.Bold)
        )
        Icon(
            painter = painterResource(id = R.drawable.ic_launcher_background), // Placeholder for expand icon
            contentDescription = "Expand Icon",
            tint = Color.Gray
        )
    }
}

@Composable
fun RecommendationsSection() {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(
            text = "Frequently bought together",
            style = MaterialTheme.typography.bodyLarge.copy(fontWeight = FontWeight.Bold)
        )
        Text(
            text = "Our experts recommend",
            style = MaterialTheme.typography.titleLarge.copy(fontWeight = FontWeight.Bold)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            ProductCard("Samsung", "$499", R.drawable.ic_launcher_background) // Placeholder
            ProductCard("NVIDIA", "$699", R.drawable.ic_launcher_background) // Placeholder
        }
    }
}

@Composable
fun AddToCartButton() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        contentAlignment = Alignment.BottomCenter
    ) {
        Button(onClick = { /* TODO: Add to cart */ }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "Add To Cart")
        }
    }
}
