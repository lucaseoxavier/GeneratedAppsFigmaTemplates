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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lucaseox.generatedfromfigmatemplates.R

@Composable
fun SetLimitScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .background(Color(0xFFEFEFFF)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        HeaderSection()
        ProfileSection()
        CardSection()
        LimitSettingsSection()
        ButtonSection()
    }
}

@Composable
private fun HeaderSection() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFF1F4AB4)),
        contentAlignment = Alignment.Center
    ) {
        Row(
            modifier = Modifier.padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "BCA mobile",
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp
            )
            Spacer(modifier = Modifier.weight(1f))
            Icon(
                painter = painterResource(id = R.drawable.ic_notification),
                contentDescription = "Notification",
                tint = Color.White
            )
        }
    }
}

@Composable
private fun ProfileSection() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_user), // Replace with actual image resource
            contentDescription = "Profile Picture",
            modifier = Modifier
                .size(80.dp)
                .background(Color.LightGray)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Andhika Putra",
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp
        )
        Text(
            text = "Paspor BCA 9087890908",
            color = Color.DarkGray, // Increased contrast
            style = TextStyle(fontSize = 14.sp, fontFamily = FontFamily.SansSerif)
        )
    }
}

@Composable
private fun CardSection() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .background(Color.Black),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_credit_card), // Replace with actual image resource
            contentDescription = "Credit Card",
            modifier = Modifier.fillMaxWidth()
        )
    }
}

@Composable
private fun LimitSettingsSection() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        LimitSlider(label = "Cash Withdrawal Limit", maxLimit = 7000000, description = "Set your cash withdrawal limit")
        LimitSlider(label = "Transfer Limit (BCA)", maxLimit = 25000000, description = "Set your BCA transfer limit")
        LimitSlider(label = "Transfer Limit (Different Bank)", maxLimit = 10000000, description = "Set your other bank transfer limit")
        LimitSlider(label = "Debit Transaction Debit", maxLimit = 25000000, description = "Set your debit transaction limit")
    }
}

@Composable
private fun LimitSlider(label: String, maxLimit: Int, description: String) {
    Column(
        modifier = Modifier
            .padding(vertical = 8.dp)
            .semantics { contentDescription = description }
    ) {
        Text(
            text = label,
            fontWeight = FontWeight.Bold,
            fontSize = 14.sp,
            modifier = Modifier.padding(bottom = 4.dp)
        )
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Slider(
                value = 0.5f, // Example value
                onValueChange = {},
                modifier = Modifier.weight(1f)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = "Min. ${maxLimit}",
                fontSize = 14.sp,
                textAlign = TextAlign.End
            )
        }
    }
}

@Composable
private fun ButtonSection() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        OutlinedButton(
            onClick = {},
            modifier = Modifier.weight(1f)
        ) {
            Text(text = "Cancel")
        }
        Spacer(modifier = Modifier.width(16.dp))
        Button(
            onClick = {},
            modifier = Modifier.weight(1f)
        ) {
            Text(text = "Save")
        }
    }
}
