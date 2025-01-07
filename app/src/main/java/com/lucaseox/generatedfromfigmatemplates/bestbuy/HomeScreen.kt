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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.lucaseox.generatedfromfigmatemplates.R

@Composable
fun BestBuyHomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .verticalScroll(rememberScrollState())
    ) {
        TopBar()
        DealOfTheDay()
        PopularPicks()
        SafetySection()
        MembershipSection()
        HelpSection()
        FloatingCartButton()
    }
}

@Composable
fun TopBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFF0046BE))
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background), // Placeholder for the logo
            contentDescription = "Best Buy Logo",
            modifier = Modifier.size(32.dp)
        )
        Spacer(modifier = Modifier.weight(1f))
        TextField(
            value = "",
            onValueChange = {},
            placeholder = { Text("Search BestBuy") },
            modifier = Modifier
                .fillMaxWidth(0.8f)
                .background(Color.White, MaterialTheme.shapes.small)
        )
    }
}

@Composable
fun DealOfTheDay() {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(
            text = "Deal Of The Day",
            style = MaterialTheme.typography.titleLarge.copy(fontWeight = FontWeight.Bold)
        )
        Text(text = "\u231A Time left, hurry up")
        Row(verticalAlignment = Alignment.CenterVertically) {
            TimerBox("04")
            Spacer(modifier = Modifier.width(4.dp))
            TimerBox("28")
            Spacer(modifier = Modifier.width(4.dp))
            TimerBox("28")
        }
        Spacer(modifier = Modifier.height(8.dp))
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background), // Placeholder for product image
            contentDescription = "Deal Product",
            modifier = Modifier.fillMaxWidth()
        )
        Text(text = "Microsoft Surface Pro 8", style = MaterialTheme.typography.bodyMedium)
        Text(text = "$1,299", style = MaterialTheme.typography.titleLarge)
    }
}

@Composable
fun TimerBox(time: String) {
    Box(
        modifier = Modifier
            .size(48.dp)
            .background(Color(0xFF0046BE), MaterialTheme.shapes.medium),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = time,
            color = Color.White,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
    }
}

@Composable
fun PopularPicks() {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(
            text = "Today's popular picks",
            style = MaterialTheme.typography.titleLarge.copy(fontWeight = FontWeight.Bold)
        )
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
fun ProductCard(name: String, price: String, imageRes: Int) {
    Column(
        modifier = Modifier
            .width(150.dp)
            .padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = imageRes),
            contentDescription = "$name Image",
            modifier = Modifier.fillMaxWidth()
        )
        Text(text = name, fontWeight = FontWeight.Bold)
        Text(text = price)
    }
}

@Composable
fun SafetySection() {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(
            text = "Shop safely and confidently.",
            style = MaterialTheme.typography.bodyMedium
        )
        Text(
            text = "See our safety procedures",
            color = Color.Blue
        )
    }
}

@Composable
fun MembershipSection() {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(
            text = "Best Buy Totaltech",
            style = MaterialTheme.typography.titleLarge.copy(fontWeight = FontWeight.Bold)
        )
        Text(
            text = "The membership you and your tech deserve.",
            style = MaterialTheme.typography.bodyMedium
        )
    }
}

@Composable
fun HelpSection() {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(
            text = "Get help shopping from home.",
            style = MaterialTheme.typography.bodyMedium
        )
        Text(
            text = "Shop with an Expert",
            color = Color.Blue
        )
    }
}

@Composable
fun FloatingCartButton() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        contentAlignment = Alignment.BottomEnd
    ) {
        FloatingActionButton(onClick = { /* TODO: Navigate to cart */ }) {
            Icon(
                painter = painterResource(id = R.drawable.ic_launcher_background), // Placeholder
                contentDescription = "Cart Icon"
            )
        }
    }
}
