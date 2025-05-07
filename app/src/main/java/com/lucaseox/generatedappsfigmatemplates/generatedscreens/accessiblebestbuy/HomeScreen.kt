package com.lucaseox.generatedappsfigmatemplates.generatedscreens.accessiblebestbuy

import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material3.*
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
fun HomeScreen() {
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        TopBar()
        DealOfTheDay()
        PopularPicks()
        PromoCard(title = "Shop safely and confidently.", actionText = "See our safety procedures")
        SaleBanner()
        TotaltechMembership()
        PromoCard(title = "Get help shopping from home.", actionText = "Shop with an Expert")
    }
}

@Composable
private fun TopBar() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(Icons.Default.AddCircle, contentDescription = "Logo")
        OutlinedTextField(
            value = "",
            onValueChange = {},
            placeholder = { Text("Search BestBuy") },
            modifier = Modifier.weight(1f).padding(horizontal = 8.dp)
        )
        IconButton(onClick = { /* TODO */ }) {
            Icon(Icons.Default.AddCircle, contentDescription = "Cart")
        }
    }
}

@Composable
private fun DealOfTheDay() {
    Card(modifier = Modifier.fillMaxWidth(), shape = RoundedCornerShape(8.dp)) {
        Column(modifier = Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
            Text("Deal Of The Day", fontWeight = FontWeight.Bold)
            Text("Time left, hurry up")
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(painterResource(id = R.drawable.ic_placeholder), contentDescription = "Surface Pro 8", modifier = Modifier.size(64.dp))
                Spacer(modifier = Modifier.width(8.dp))
                Column {
                    Text("Microsoft", fontWeight = FontWeight.Bold)
                    Text("Surface Pro 8 - 13\" Touch Screen Intel Evo Platform Core i7 - 16GB Memory")
                    Text("$1,299", fontWeight = FontWeight.Bold, fontSize = 20.sp)
                    Button(onClick = {}, modifier = Modifier.padding(top = 4.dp)) {
                        Text("SAVE $300")
                    }
                }
            }
        }
    }
}

@Composable
private fun PopularPicks() {
    Column {
        Text("Today's popular picks", fontSize = 18.sp, fontWeight = FontWeight.Bold)
        Row(modifier = Modifier.horizontalScroll(rememberScrollState()), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            repeat(3) { index ->
                Card(modifier = Modifier.size(160.dp, 200.dp), shape = RoundedCornerShape(8.dp)) {
                    Column(modifier = Modifier.padding(8.dp), verticalArrangement = Arrangement.spacedBy(4.dp)) {
                        Image(painterResource(id = R.drawable.ic_placeholder), contentDescription = "Popular pick item image $index", modifier = Modifier.height(80.dp))
                        Text("Brand #${index + 1}", fontWeight = FontWeight.Bold)
                        Text("Item Description #${index + 1}")
                        Text("$${499 + index * 100}", fontWeight = FontWeight.Bold)
                    }
                }
            }
        }
    }
}

@Composable
private fun PromoCard(title: String, actionText: String) {
    Card(modifier = Modifier.fillMaxWidth(), shape = RoundedCornerShape(8.dp)) {
        Row(modifier = Modifier.padding(16.dp), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically) {
            Image(painterResource(id = R.drawable.ic_placeholder), contentDescription = null, modifier = Modifier.size(40.dp))
            Column(modifier = Modifier.weight(1f).padding(horizontal = 8.dp)) {
                Text(title, fontWeight = FontWeight.Bold)
                Text(actionText, color = MaterialTheme.colorScheme.primary)
            }
            Icon(Icons.Default.AddCircle, contentDescription = "Action")
        }
    }
}

@Composable
private fun SaleBanner() {
    Card(shape = RoundedCornerShape(8.dp)) {
        Box(contentAlignment = Alignment.BottomEnd) {
            Image(painterResource(id = R.drawable.ic_placeholder), contentDescription = "Sale banner image", modifier = Modifier.fillMaxWidth().height(120.dp))
            Text("Save up to %50", color = Color.White, modifier = Modifier.background(Color.Blue).padding(8.dp))
        }
    }
}

@Composable
private fun TotaltechMembership() {
    Card(shape = RoundedCornerShape(8.dp), modifier = Modifier.fillMaxWidth()) {
        Column(modifier = Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
            Text("BEST BUY totaltech", fontWeight = FontWeight.Bold, fontSize = 18.sp)
            Text("The membership you and your tech deserve.")
            Image(painterResource(id = R.drawable.ic_placeholder), contentDescription = "Totaltech image", modifier = Modifier.fillMaxWidth().height(80.dp))
            Text("Best Buy Totaltech™ provides 24/7/365 tech support, up to 24 mo. of product protection with active mem, free standard installation.")
        }
    }
}
