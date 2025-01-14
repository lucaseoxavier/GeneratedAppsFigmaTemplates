package com.lucaseox.generatedfromfigmatemplates.bestbuy
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
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
import com.lucaseox.generatedfromfigmatemplates.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProductDetailsScreen() {
    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
    ) {
        TopAppBar(
            title = { Text("PC Laptops", fontSize = 18.sp, fontWeight = FontWeight.Bold) },
            navigationIcon = {
                IconButton(onClick = { /* Navigate back */ }) {
                    Icon(Icons.Default.ArrowBack, contentDescription = "Back")
                }
            },
            actions = {
                IconButton(onClick = { /* Search */ }) {
                    Icon(Icons.Default.Search, contentDescription = "Search")
                }
            },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Color.Blue,
                titleContentColor = Color.White
            )
        )

        Spacer(modifier = Modifier.height(16.dp))

        Column(modifier = Modifier.padding(horizontal = 16.dp)) {
            Text(
                text = "ASUS",
                style = MaterialTheme.typography.labelLarge,
                color = Color.Blue
            )
            Text(
                text = "Vivobook 17.3\" Laptop - Intel Core 10th Gen i5\n12GB Memory - 1TB HDD",
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(8.dp))

            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(
                    text = "$499",
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = "SAVE $300",
                    style = MaterialTheme.typography.bodyMedium,
                    color = Color.Red,
                    fontWeight = FontWeight.Bold
                )
            }
            Spacer(modifier = Modifier.height(8.dp))
            Row(verticalAlignment = Alignment.CenterVertically) {
                // Placeholder for stars
                Text(
                    text = "\u2605\u2605\u2605\u2605\u2606",
                    style = MaterialTheme.typography.bodyMedium,
                    color = Color(0xFFFFC107)
                )
                Spacer(modifier = Modifier.width(4.dp))
                Text(
                    text = "(4,201)",
                    style = MaterialTheme.typography.bodyMedium,
                    color = Color.Gray
                )
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Image(
            painter = painterResource(id = R.drawable.laptop_image),
            contentDescription = "Laptop Image",
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        LazyRow(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            contentPadding = PaddingValues(horizontal = 16.dp)
        ) {
            items(4) {
                Image(
                    painter = painterResource(id = R.drawable.laptop_image),
                    contentDescription = "Thumbnail",
                    modifier = Modifier
                        .size(80.dp)
                        .padding(4.dp)
                )
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Column(modifier = Modifier.padding(horizontal = 16.dp)) {
            ProductDetailRow("Model:", "X712JA-212.V17WN-11")
            ProductDetailRow("SKU:", "6469399")
            Text(
                text = "ASUS Vivobook Laptop. Enjoy everyday activities with this ASUS notebook PC. The Intel Core i5 processor and 12GB of RAM let you run programs smoothly.",
                style = MaterialTheme.typography.bodyMedium
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        ExpandableSection("Overview") {}
        ExpandableSection("Specifications") {}
        ExpandableSection("Reviews") {}
        ExpandableSection("Questions & Answers") {}
        ExpandableSection("Buying Options") {}

        Spacer(modifier = Modifier.height(16.dp))

        Column(modifier = Modifier.padding(horizontal = 16.dp)) {
            Text(
                text = "Frequently bought together",
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "Our experts recommend",
                style = MaterialTheme.typography.bodyMedium,
                color = Color.Gray
            )
        }

        LazyRow(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            contentPadding = PaddingValues(horizontal = 16.dp)
        ) {
            items(3) {
                RecommendedProductCard()
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = { /* Add to cart */ },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
                .height(48.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Yellow)
        ) {
            Text("Add To Cart", fontWeight = FontWeight.Bold, color = Color.Black)
        }

        Spacer(modifier = Modifier.height(16.dp))
    }
}

@Composable
fun ProductDetailRow(label: String, value: String) {
    Row(modifier = Modifier.fillMaxWidth()) {
        Text(label, fontWeight = FontWeight.Bold, modifier = Modifier.weight(1f))
        Text(value, modifier = Modifier.weight(2f))
    }
}

@Composable
fun ExpandableSection(title: String, content: @Composable () -> Unit) {
    val expanded = remember { mutableStateOf(false) }

    Column(modifier = Modifier.fillMaxWidth()) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(title, fontWeight = FontWeight.Bold, modifier = Modifier.weight(1f))
            IconButton(onClick = { expanded.value = !expanded.value }) {
                Icon(
                    if (expanded.value) Icons.Default.KeyboardArrowUp else Icons.Default.KeyboardArrowDown,
                    contentDescription = "Expand/Collapse"
                )
            }
        }
        if (expanded.value) {
            content()
        }
    }
}

@Composable
fun RecommendedProductCard() {
    Column(
        modifier = Modifier
            .width(150.dp)
            .padding(8.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.laptop_image),
            contentDescription = "Recommended Product",
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
        )
        Text("Product Name", fontWeight = FontWeight.Bold)
        Text("$499", fontWeight = FontWeight.Bold, color = Color.Black)
        Text("\u2605\u2605\u2605\u2605\u2606", color = Color(0xFFFFC107))
    }
}
