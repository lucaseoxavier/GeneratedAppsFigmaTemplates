package com.lucaseox.generatedfromfigmatemplates.bestbuyaccessible

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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lucaseox.generatedfromfigmatemplates.R

@Composable
fun BestBuyHomeAccessible() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .verticalScroll(rememberScrollState())
    ) {
        HeaderSection()
        DealOfTheDaySection()
        PopularPicksSection()
        ShopSafelySection()
        DiscountSection()
        MembershipSection()
        ExpertHelpSection()
        CartButton()
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HeaderSection() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFF0046BE))
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_best_buy_logo),
            contentDescription = "Best Buy Logo",
            modifier = Modifier.size(32.dp)
        )
        Spacer(modifier = Modifier.width(16.dp))
        TextField(
            value = "",
            onValueChange = {},
            placeholder = { Text(text = "Search BestBuy", color = Color(0xFFE0E0E0)) },
            modifier = Modifier
                .fillMaxWidth()
                .height(48.dp),
            colors = TextFieldDefaults.textFieldColors(
                containerColor = Color.White,
//                textColor = Color.Black
            )
        )
    }
}

@Composable
fun DealOfTheDaySection() {
    Column(
        modifier = Modifier.padding(16.dp)
    ) {
        Text("Deal Of The Day", fontSize = 20.sp, fontWeight = FontWeight.Bold)
        Text("⏰ Time left, hurry up", fontSize = 14.sp, color = Color(0xFF757575))
        Row(
            modifier = Modifier.padding(vertical = 8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            TimeBox("04", "hours")
            Spacer(modifier = Modifier.width(8.dp))
            TimeBox("28", "minutes")
        }
        Spacer(modifier = Modifier.height(8.dp))
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(id = R.drawable.ic_product_image),
                contentDescription = "Product Image",
                modifier = Modifier.size(100.dp)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column {
                Text("Microsoft", fontWeight = FontWeight.Bold, fontSize = 14.sp)
                Text("Surface Pro 8 - 13\" Touch Screen Intel Evo Platform Core i7 - 16GB Memory", fontSize = 14.sp)
                Spacer(modifier = Modifier.height(4.dp))
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text("$1,299", fontSize = 20.sp, fontWeight = FontWeight.Bold)
                    Spacer(modifier = Modifier.width(8.dp))
                    Text("SAVE $300", color = Color(0xFFB00020), fontWeight = FontWeight.Bold)
                }
            }
        }
    }
}

@Composable
fun TimeBox(time: String, label: String) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .background(Color(0xFF0046BE))
            .padding(8.dp)
    ) {
        Text(time, color = Color.White, fontSize = 24.sp, fontWeight = FontWeight.Bold)
        Text(label, color = Color.White, fontSize = 12.sp)
    }
}

@Composable
fun PopularPicksSection() {
    Column(modifier = Modifier.padding(16.dp)) {
        Text("Based on what’s trending", fontSize = 16.sp, color = Color(0xFF616161))
        Text("Today’s popular picks", fontSize = 20.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(8.dp))
        Row(horizontalArrangement = Arrangement.SpaceBetween) {
            ProductCard("Samsung", "$499", R.drawable.ic_samsung)
            ProductCard("NVIDIA", "$699", R.drawable.ic_nvidia)
        }
    }
}

@Composable
fun ProductCard(title: String, price: String, imageRes: Int) {
    Column(modifier = Modifier.width(160.dp)) {
        Image(
            painter = painterResource(id = imageRes),
            contentDescription = "$title Image",
            modifier = Modifier.size(120.dp)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(title, fontSize = 14.sp, fontWeight = FontWeight.Bold)
        Text(price, fontSize = 14.sp)
    }
}

@Composable
fun ShopSafelySection() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .background(Color(0xFFF5F5F5))
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_safety_icon),
            contentDescription = "Shop Safely Icon",
            modifier = Modifier.size(40.dp)
        )
        Spacer(modifier = Modifier.width(16.dp))
        Column {
            Text("Shop safely and confidently.", fontSize = 16.sp, fontWeight = FontWeight.Bold)
            Text("See our safety procedures", fontSize = 14.sp, color = Color(0xFF0046BE))
        }
    }
}

@Composable
fun DiscountSection() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .background(Color(0xFF0046BE))
            .padding(16.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(
            "Save up to %50",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White
        )
    }
}

@Composable
fun MembershipSection() {
    Column(modifier = Modifier.padding(16.dp)) {
        Text("BEST BUY", fontSize = 20.sp, fontWeight = FontWeight.Bold)
        Text("totaltech", fontSize = 24.sp, fontWeight = FontWeight.Bold, color = Color(0xFF0046BE))
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            "Best Buy Totaltech™ provides 24/7/365 tech support, up to 24 mo. of product protection with active mem, free standard installation.",
            fontSize = 14.sp
        )
    }
}

@Composable
fun ExpertHelpSection() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .background(Color(0xFFF5F5F5))
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_expert_icon),
            contentDescription = "Expert Help Icon",
            modifier = Modifier.size(40.dp)
        )
        Spacer(modifier = Modifier.width(16.dp))
        Column {
            Text("Get help shopping from home.", fontSize = 16.sp, fontWeight = FontWeight.Bold)
            Text("Shop with an Expert", fontSize = 14.sp, color = Color(0xFF0046BE))
        }
    }
}

@Composable
fun CartButton() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        contentAlignment = Alignment.BottomEnd
    ) {
        FloatingActionButton(onClick = { /* TODO: Cart action */ }) {
            Icon(
                painter = painterResource(id = R.drawable.ic_cart_icon),
                contentDescription = "Cart Icon",
                tint = Color.White
            )
        }
    }
}
