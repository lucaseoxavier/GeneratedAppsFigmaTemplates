package com.lucaseox.generatedappsfigmatemplates.generatedscreens.accessiblefoodordering

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lucaseox.generatedappsfigmatemplates.R

private val HighContrastGray = Color(0xFF4D4D4D)
private val HighContrastMagenta = Color(0xFFB0007F)
private val HighContrastTextOnCard = Color(0xFF333333)

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(bottom = 56.dp)
    ) {
        TopBar()
        GreetingSection()
        SearchBar()
        CategoryRow()
        PopularSection()
    }
    BottomNavBar()
}

@Composable
private fun TopBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 12.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(Icons.Default.AddCircle, contentDescription = "Menu icon")
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(Icons.Default.AddCircle, contentDescription = "Location pin", tint = Color.Magenta)
            Spacer(modifier = Modifier.width(4.dp))
            Text("Abuja, NG", style = MaterialTheme.typography.bodyMedium)
        }
        Image(
            painter = painterResource(id = R.drawable.ic_placeholder),
            contentDescription = "User profile photo",
            modifier = Modifier
                .size(36.dp)
                .clip(CircleShape)
        )
    }
}

@Composable
private fun GreetingSection() {
    Column(modifier = Modifier.padding(horizontal = 16.dp)) {
        Text(
            text = "Hey Sylvester!",
            style = MaterialTheme.typography.headlineSmall.copy(fontWeight = FontWeight.Bold)
        )
        Text(
            text = "Let's get your order",
            style = MaterialTheme.typography.bodyMedium.copy(color = HighContrastGray)
        )
    }
}

@Composable
private fun SearchBar() {
    OutlinedTextField(
        value = "",
        onValueChange = {},
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        placeholder = { Text("Search our delicious burger", color = HighContrastGray) },
        shape = RoundedCornerShape(12.dp),
        leadingIcon = { Icon(Icons.Default.AddCircle, contentDescription = "Search icon") },
        singleLine = true
    )
}

@Composable
private fun CategoryRow() {
    LazyRow(contentPadding = PaddingValues(horizontal = 16.dp)) {
        item { CategoryItem("Burgers", true) }
        item { Spacer(modifier = Modifier.width(8.dp)) }
        item { CategoryItem("Pizza", false) }
        item { Spacer(modifier = Modifier.width(8.dp)) }
        item { CategoryItem("Cakes", false) }
    }
}

@Composable
private fun CategoryItem(title: String, isSelected: Boolean) {
    val textColor = if (isSelected) Color.White else Color.Black
    val backgroundColor = if (isSelected) Color(0xFFD81B60) else Color.White

    Column(
        modifier = Modifier
            .width(100.dp)
            .clip(RoundedCornerShape(16.dp))
            .background(backgroundColor)
            .clickable { }
            .padding(12.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            imageVector = Icons.Default.AddCircle,
            contentDescription = "$title icon",
            tint = textColor,
            modifier = Modifier.size(32.dp)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = title,
            color = textColor,
            fontWeight = FontWeight.Medium
        )
        Spacer(modifier = Modifier.height(4.dp))
        Icon(
            imageVector = Icons.Default.AddCircle,
            contentDescription = "$title play icon",
            tint = textColor,
            modifier = Modifier.size(16.dp)
        )
    }
}

@Composable
private fun PopularSection() {
    Column(modifier = Modifier.padding(16.dp)) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Popular",
                style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold)
            )
            Text(
                text = "View all",
                style = MaterialTheme.typography.bodyMedium,
                color = HighContrastMagenta
            )
        }
        Spacer(modifier = Modifier.height(12.dp))
        Card(
            shape = RoundedCornerShape(16.dp),
            modifier = Modifier
                .fillMaxWidth()
                .semantics { contentDescription = "Popular product card: Chipotle Cheesy Chicken" }
        ) {
            Column(modifier = Modifier.background(Color(0xFFF3EDF7))) {
                Image(
                    painter = painterResource(id = R.drawable.ic_placeholder),
                    contentDescription = "Product image of Chipotle Cheesy Chicken",
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(160.dp),
                    contentScale = ContentScale.Crop
                )
                Spacer(modifier = Modifier.height(8.dp))
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 12.dp, vertical = 8.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column {
                        Text(
                            text = "Chipotle Cheesy Chicken",
                            fontWeight = FontWeight.Bold,
                            fontSize = 16.sp,
                            color = HighContrastTextOnCard
                        )
                        Text(
                            text = "Chicken Burger",
                            color = HighContrastGray,
                            fontSize = 14.sp
                        )
                    }
                    Text(
                        text = "$20.95",
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp,
                        color = HighContrastTextOnCard
                    )
                }
            }
        }
    }
}

@Composable
private fun BottomNavBar() {
    NavigationBar(
//        modifier = Modifier.align(Alignment.CenterHorizontally)
    ) {
        NavigationBarItem(
            icon = { Icon(Icons.Default.AddCircle, contentDescription = "Home icon") },
            label = { Text("Home") },
            selected = true,
            onClick = { }
        )
        NavigationBarItem(
            icon = { Icon(Icons.Default.AddCircle, contentDescription = "Favorites icon") },
            label = { Text("Favorites") },
            selected = false,
            onClick = { }
        )
        NavigationBarItem(
            icon = { Icon(Icons.Default.AddCircle, contentDescription = "Account icon") },
            label = { Text("Account") },
            selected = false,
            onClick = { }
        )
        NavigationBarItem(
            icon = { Icon(Icons.Default.AddCircle, contentDescription = "More icon") },
            label = { Text("More") },
            selected = false,
            onClick = { }
        )
    }
}
