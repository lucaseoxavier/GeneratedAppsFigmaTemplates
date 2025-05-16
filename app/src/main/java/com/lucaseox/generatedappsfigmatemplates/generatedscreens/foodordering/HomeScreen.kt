package com.lucaseox.generatedappsfigmatemplates.generatedscreens.foodordering

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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lucaseox.generatedappsfigmatemplates.R

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(bottom = 56.dp) // Leave space for bottom nav
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
        Icon(Icons.Default.AddCircle, contentDescription = "Menu")
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(Icons.Default.AddCircle, contentDescription = "Location", tint = Color.Magenta)
            Spacer(modifier = Modifier.width(4.dp))
            Text("Abuja, NG", style = MaterialTheme.typography.bodyMedium)
        }
        Image(
            painter = painterResource(id = R.drawable.ic_placeholder),
            contentDescription = "User Profile",
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
            style = MaterialTheme.typography.bodyMedium,
            color = Color.Gray
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
        placeholder = { Text("Search our delicious burger") },
        shape = RoundedCornerShape(12.dp),
        leadingIcon = { Icon(Icons.Default.AddCircle, contentDescription = null) },
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
    Column(
        modifier = Modifier
            .width(100.dp)
            .clip(RoundedCornerShape(16.dp))
            .background(if (isSelected) Color(0xFFFF4081) else Color.White)
            .clickable { }
            .padding(12.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            imageVector = Icons.Default.AddCircle,
            contentDescription = title,
            tint = if (isSelected) Color.White else Color.Black,
            modifier = Modifier.size(32.dp)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = title,
            color = if (isSelected) Color.White else Color.Black,
            fontWeight = FontWeight.Medium
        )
        Spacer(modifier = Modifier.height(4.dp))
        Icon(
            imageVector = Icons.Default.AddCircle,
            contentDescription = null,
            tint = if (isSelected) Color.White else Color.Black,
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
                color = Color.Magenta
            )
        }
        Spacer(modifier = Modifier.height(12.dp))
        Card(
            shape = RoundedCornerShape(16.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            Column {
                Image(
                    painter = painterResource(id = R.drawable.ic_placeholder),
                    contentDescription = "Chipotle Cheesy Chicken",
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
                            fontSize = 16.sp
                        )
                        Text(
                            text = "Chicken Burger",
                            color = Color.Gray,
                            fontSize = 14.sp
                        )
                    }
                    Text(
                        text = "$20.95",
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp
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
            icon = { Icon(Icons.Default.AddCircle, contentDescription = "Home") },
            label = { Text("Home") },
            selected = true,
            onClick = { }
        )
        NavigationBarItem(
            icon = { Icon(Icons.Default.AddCircle, contentDescription = "Favorites") },
            label = { Text("Favorites") },
            selected = false,
            onClick = { }
        )
        NavigationBarItem(
            icon = { Icon(Icons.Default.AddCircle, contentDescription = "Account") },
            label = { Text("Account") },
            selected = false,
            onClick = { }
        )
        NavigationBarItem(
            icon = { Icon(Icons.Default.AddCircle, contentDescription = "More") },
            label = { Text("More") },
            selected = false,
            onClick = { }
        )
    }
}
