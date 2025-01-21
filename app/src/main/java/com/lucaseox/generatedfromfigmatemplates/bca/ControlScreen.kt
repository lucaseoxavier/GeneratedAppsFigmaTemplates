package com.lucaseox.generatedfromfigmatemplates.bca

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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lucaseox.generatedfromfigmatemplates.R

@Composable
fun ControlScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.surface)
            .padding(horizontal = 16.dp)
    ) {
        HeaderSection()
        Spacer(modifier = Modifier.height(16.dp))
        ProfileSection()
        Spacer(modifier = Modifier.height(16.dp))
        CardSection()
        Spacer(modifier = Modifier.height(16.dp))
        TransactionSwitches()
        Spacer(modifier = Modifier.height(16.dp))
        FooterSection()
    }
}

@Composable
private fun HeaderSection() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFF003B70)),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_bca_logo), // Substitua pelo recurso correto
            contentDescription = "BCA Logo",
            modifier = Modifier.size(100.dp)
        )
        Spacer(modifier = Modifier.weight(1f))
        IconButton(onClick = { /* TODO */ }) {
            Icon(
                painter = painterResource(id = R.drawable.ic_notification), // Substitua pelo recurso correto
                contentDescription = "Notifications",
                tint = Color.White
            )
        }
        IconButton(onClick = { /* TODO */ }) {
            Icon(
                painter = painterResource(id = R.drawable.ic_settings), // Substitua pelo recurso correto
                contentDescription = "Settings",
                tint = Color.White
            )
        }
    }
}

@Composable
private fun ProfileSection() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth()
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_user), // Substitua pelo recurso correto
            contentDescription = "User Avatar",
            modifier = Modifier
                .size(80.dp)
                .background(Color.Gray, RoundedCornerShape(40.dp))
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Andhika Putra",
            style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 20.sp)
        )
        Text(
            text = "Paspor BCA 9087890908",
            style = TextStyle(fontSize = 14.sp, color = Color.Gray)
        )
    }
}

@Composable
private fun CardSection() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Black, RoundedCornerShape(8.dp))
            .padding(16.dp)
    ) {
        Column {
            Text(
                text = "BCA BLACK",
                style = TextStyle(color = Color.White, fontWeight = FontWeight.Bold, fontSize = 18.sp)
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "4691 5112 3456 7890",
                style = TextStyle(color = Color.White, fontSize = 16.sp, fontWeight = FontWeight.Medium)
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "ANDHIKA PUTRA",
                style = TextStyle(color = Color.White, fontSize = 14.sp)
            )
        }
    }
}

@Composable
private fun TransactionSwitches() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFEFF4FF), RoundedCornerShape(8.dp))
            .padding(16.dp)
    ) {
        SwitchItem(title = "Domestic Transaction", isChecked = true)
        Divider(color = Color.LightGray, thickness = 1.dp)
        SwitchItem(title = "International Transaction", isChecked = false)
        Divider(color = Color.LightGray, thickness = 1.dp)
        SwitchItem(title = "Debit Online Transaction", isChecked = true)
    }
}

@Composable
private fun SwitchItem(title: String, isChecked: Boolean) {
    val checkedState = remember { mutableStateOf(isChecked) }

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = title,
            modifier = Modifier.weight(1f),
            style = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.Medium)
        )
        Switch(
            checked = checkedState.value,
            onCheckedChange = { checkedState.value = it }
        )
    }
}

@Composable
private fun FooterSection() {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Domestic transactions consist of transactions using cards at ATMs and EDC machines in Indonesia",
            style = TextStyle(fontSize = 12.sp, color = Color.Gray),
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(16.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Button(
                onClick = { /* TODO */ },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFEFF4FF))
            ) {
                Text(text = "Cancel", color = Color(0xFF003B70))
            }
            Button(
                onClick = { /* TODO */ },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF003B70))
            ) {
                Text(text = "Save", color = Color.White)
            }
        }
    }
}
