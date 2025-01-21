package com.lucaseox.generatedfromfigmatemplates.bcaaccessible

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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicText
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.lucaseox.generatedfromfigmatemplates.R

@Composable
fun FlazzScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        HeaderSection()
        BalanceSection()
        ActionButtonsSection()
        Spacer(modifier = Modifier.height(16.dp))
        FlazzDialog()
    }
}

@Composable
private fun HeaderSection() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFF002366), RoundedCornerShape(12.dp))
            .padding(16.dp)
    ) {
        Column {
            BasicText(
                text = "Hello,",
                style = MaterialTheme.typography.bodyMedium.copy(color = Color.White)
            )
            BasicText(
                text = "Andhika Putra",
                style = MaterialTheme.typography.titleMedium.copy(color = Color.White, fontWeight = FontWeight.Bold)
            )
            BasicText(
                text = "9087890908",
                style = MaterialTheme.typography.bodySmall.copy(color = Color.White)
            )
        }
        Row(
            modifier = Modifier.align(Alignment.TopEnd),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Default.Notifications,
                contentDescription = "Notifications",
                tint = Color.White
            )
            Spacer(modifier = Modifier.width(8.dp))
            Box(
                modifier = Modifier
                    .size(32.dp)
                    .background(Color.Blue, shape = RoundedCornerShape(50))
            ) {}
        }
    }
}

@Composable
private fun BalanceSection() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 16.dp)
            .background(Color(0xFF4A90E2), RoundedCornerShape(8.dp))
            .padding(16.dp),
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            BasicText(
                text = "Current Balance",
                style = MaterialTheme.typography.bodyMedium.copy(color = Color(0xFFFFFFFF), fontWeight = FontWeight.SemiBold)
            )
            BasicText(
                text = "Rp. 27.950.000",
                style = MaterialTheme.typography.titleLarge.copy(color = Color(0xFFFFFFFF), fontWeight = FontWeight.Bold)
            )
        }
    }
}

@Composable
private fun ActionButtonsSection() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        ActionButton(icon = Icons.Default.Add, label = "Add New", description = "Add a new transaction")
        ActionButton(icon = Icons.Default.ArrowForward, label = "Send", description = "Send money")
        ActionButton(icon = Icons.Default.AccountBox, label = "V. Account", description = "View account details")
        ActionButton(icon = Icons.Default.MoreVert, label = "More", description = "More options")
    }
}

@Composable
private fun ActionButton(icon: ImageVector, label: String, description: String) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            imageVector = icon,
            contentDescription = description,
            modifier = Modifier.size(48.dp),
            tint = Color(0xFF002366)
        )
        BasicText(
            text = label,
            style = MaterialTheme.typography.bodySmall.copy(color = Color(0xFF002366))
        )
    }
}

@Composable
private fun FlazzDialog() {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            BasicText(
                text = "Flazz",
                style = MaterialTheme.typography.titleMedium.copy(
                    color = Color(0xFF002366),
                    fontWeight = FontWeight.Bold
                )
            )
            Spacer(modifier = Modifier.height(8.dp))
            BasicText(
                text = "Tap it on the NFC area of the phone",
                style = MaterialTheme.typography.bodySmall.copy(color = Color(0xFF666666), textAlign = TextAlign.Center)
            )
            Spacer(modifier = Modifier.height(16.dp))
            Image(
                painter = painterResource(id = R.drawable.nfc_icon),
                contentDescription = "Illustration showing an NFC card being tapped on a phone",
                modifier = Modifier.size(100.dp)
            )
            Spacer(modifier = Modifier.height(16.dp))
            OutlinedButton(onClick = { /* Handle cancel action */ }) {
                BasicText(
                    text = "Cancel",
                    style = MaterialTheme.typography.bodyMedium.copy(color = Color(0xFF002366))
                )
            }
        }
    }
}
