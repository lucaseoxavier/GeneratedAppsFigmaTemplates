package com.lucaseox.generatedfromfigmatemplates.bcaaccessible

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun NewAccountScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        HeaderSection()
        BalanceSection()
        ActionButtons()
        NewAccountModal()
    }
}

@Composable
private fun HeaderSection() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column {
            Text("Hello,", style = TextStyle(fontSize = 16.sp, color = Color.DarkGray))
            Text("Andhika Putra", style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color.Black))
            Text("9087890908", style = TextStyle(fontSize = 14.sp, color = Color.DarkGray))
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(
                imageVector = Icons.Default.Notifications,
                contentDescription = "Notifications icon",
                tint = Color.Gray
            )
            Spacer(modifier = Modifier.width(16.dp))
            Box(
                modifier = Modifier
                    .size(32.dp)
                    .background(Color.Blue, shape = RoundedCornerShape(16.dp))
            )
        }
    }
}

@Composable
private fun BalanceSection() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFF005BBB), shape = RoundedCornerShape(8.dp))
            .padding(16.dp),
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text("Current Balance", style = TextStyle(fontSize = 16.sp, color = Color.White))
            Text(
                "Rp. 27.950.000",
                style = TextStyle(fontSize = 24.sp, fontWeight = FontWeight.Bold, color = Color.White)
            )
        }
    }
}

@Composable
private fun ActionButtons() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 16.dp),
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        ActionButton("Add New", Icons.Default.Add)
        ActionButton("Send", Icons.Default.ArrowForward)
        ActionButton("V. Account", Icons.Default.ShoppingCart)
        ActionButton("...", Icons.Default.MoreVert)
    }
}

@Composable
private fun ActionButton(label: String, icon: ImageVector) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Icon(
            imageVector = icon,
            contentDescription = "$label button",
            tint = Color.Gray,
            modifier = Modifier.size(32.dp)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(label, style = TextStyle(fontSize = 14.sp, color = Color.Gray))
    }
}

@Composable
private fun NewAccountModal() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White, shape = RoundedCornerShape(16.dp))
            .padding(16.dp)
    ) {
        Text("New Account", style = TextStyle(fontSize = 18.sp, fontWeight = FontWeight.Bold, color = Color(0xFF005BBB)))
        Text("Add new account", style = TextStyle(fontSize = 14.sp, color = Color.Gray))

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState()),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            CategoryChip("Daftar Rekening", selected = true)
            CategoryChip("Antar Rekening")
            CategoryChip("Antar Bank")
            CategoryChip("BCA")
        }

        Spacer(modifier = Modifier.height(16.dp))

        AccountField(label = "Receiver Account", value = "9087890908")
        AccountField(label = "Receiver Name", value = "Wesley Putra")

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = { /* Action */ },
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF005BBB))
        ) {
            Text("Next", style = TextStyle(color = Color.White))
        }
    }
}

@Composable
private fun CategoryChip(label: String, selected: Boolean = false) {
    Box(
        modifier = Modifier
            .background(
                if (selected) Color(0xFF005BBB) else Color.LightGray,
                shape = RoundedCornerShape(16.dp)
            )
            .padding(horizontal = 16.dp, vertical = 8.dp)
    ) {
        Text(label, style = TextStyle(color = if (selected) Color.White else Color.Gray))
    }
}

@Composable
private fun AccountField(label: String, value: String) {
    Column(modifier = Modifier.fillMaxWidth()) {
        Text(label, style = TextStyle(fontSize = 14.sp, fontWeight = FontWeight.Bold, color = Color.DarkGray))
        Spacer(modifier = Modifier.height(4.dp))
        BasicTextField(
            value = remember { TextFieldValue(value) },
            onValueChange = {},
            textStyle = TextStyle(fontSize = 16.sp, color = Color.Black),
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFFF0F0F0), shape = RoundedCornerShape(8.dp))
                .padding(8.dp)
        )
    }
}
