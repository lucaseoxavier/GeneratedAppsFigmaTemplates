package com.lucaseox.generatedappsfigmatemplates.generatedscreens.refactored.v1.refactoredbca

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lucaseox.generatedappsfigmatemplates.R

@Composable
fun CardSettingsScreen() {
    val scrollState = rememberScrollState()
    var domesticEnabled by remember { mutableStateOf(true) }
    var internationalEnabled by remember { mutableStateOf(false) }
    var debitOnlineEnabled by remember { mutableStateOf(true) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
            .background(Color.White)
    ) {
        TopBar()
        ProfileSection()
        CardImage()
        ToggleSection(
            domesticEnabled,
            onDomesticChange = { domesticEnabled = it },
            internationalEnabled,
            onInternationalChange = { internationalEnabled = it },
            debitOnlineEnabled,
            onDebitOnlineChange = { debitOnlineEnabled = it }
        )
        InfoCard()
        ActionButtons()
    }
}

@Composable
private fun TopBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFF0D47A1))
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = "BCA mobile",
            color = Color.White,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
        Row {
            Icon(
                imageVector = Icons.Default.AddCircle,
                contentDescription = "Notification Icon",
                tint = Color.White,
                modifier = Modifier.padding(end = 8.dp)
            )
            Icon(
                imageVector = Icons.Default.AddCircle,
                contentDescription = "Settings Icon",
                tint = Color.White
            )
        }
    }
}

@Composable
private fun ProfileSection() {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_placeholder),
            contentDescription = "Profile Picture",
            modifier = Modifier
                .size(96.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text("Andhika Putra", fontWeight = FontWeight.Bold, fontSize = 20.sp)
        Text(
            "Paspor BCA  9087890908",
            fontSize = 14.sp,
            color = Color(0xFF444444)
        )
    }
}

@Composable
private fun CardImage() {
    Image(
        painter = painterResource(id = R.drawable.ic_placeholder),
        contentDescription = "Credit Card Image",
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .height(200.dp)
            .clip(RoundedCornerShape(12.dp)),
        contentScale = ContentScale.Crop
    )
}

@Composable
private fun ToggleSection(
    domestic: Boolean,
    onDomesticChange: (Boolean) -> Unit,
    international: Boolean,
    onInternationalChange: (Boolean) -> Unit,
    debitOnline: Boolean,
    onDebitOnlineChange: (Boolean) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFF0F4FF))
            .padding(16.dp)
    ) {
        ToggleRow("Domestic Transaction", domestic, onDomesticChange, "Domestic Transaction Switch")
        Divider(modifier = Modifier.padding(vertical = 8.dp))
        ToggleRow("International Transaction", international, onInternationalChange, "International Transaction Switch")
        Divider(modifier = Modifier.padding(vertical = 8.dp))
        ToggleRow("Debit Online Transaction", debitOnline, onDebitOnlineChange, "Debit Online Transaction Switch")
    }
}

@Composable
private fun ToggleRow(label: String, value: Boolean, onToggle: (Boolean) -> Unit, description: String) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(label, fontWeight = FontWeight.Medium, fontSize = 16.sp)
        Switch(
            checked = value,
            onCheckedChange = onToggle,
            modifier = Modifier.semantics { contentDescription = description },
            colors = SwitchDefaults.colors(checkedThumbColor = Color.White, checkedTrackColor = Color(0xFF3F51B5))
        )
    }
}

@Composable
private fun InfoCard() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        colors = CardDefaults.cardColors(containerColor = Color(0xFFF0F4FF)),
        shape = RoundedCornerShape(8.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = "Domestic transactions consist of transactions using cards at ATMs and EDC machines in Indonesia",
                fontSize = 14.sp,
                color = Color(0xFF444444)
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = "More Info",
                color = Color(0xFF1565C0),
                fontWeight = FontWeight.Bold,
                fontSize = 14.sp
            )
        }
    }
}

@Composable
private fun ActionButtons() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        OutlinedButton(
            onClick = {},
            modifier = Modifier.weight(1f)
        ) {
            Text("Cancel")
        }
        Spacer(modifier = Modifier.width(16.dp))
        Button(
            onClick = {},
            modifier = Modifier.weight(1f)
        ) {
            Text("Save")
        }
    }
}
