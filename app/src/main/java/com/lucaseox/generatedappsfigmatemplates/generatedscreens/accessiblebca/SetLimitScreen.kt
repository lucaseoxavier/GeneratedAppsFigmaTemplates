package com.lucaseox.generatedappsfigmatemplates.generatedscreens.accessiblebca// Required imports

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import com.lucaseox.generatedappsfigmatemplates.R

@Composable
fun SetLimitScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .background(Color.White)
    ) {
        TopBar()
        ProfileSection()
        CardSection()
        LimitsSection()
        ActionButtons()
    }
}

@Composable
private fun TopBar() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .background(Color(0xFF1F4FCB))
            .padding(horizontal = 16.dp, vertical = 12.dp)
    ) {
        Text(
            text = "BCA mobile",
            fontSize = 20.sp,
            color = Color.White,
            modifier = Modifier.align(Alignment.CenterStart)
        )
        Row(
            modifier = Modifier.align(Alignment.CenterEnd),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Icon(imageVector = Icons.Default.AddCircle, contentDescription = "Notification Icon", tint = Color.White)
            Icon(imageVector = Icons.Default.AddCircle, contentDescription = "Settings Icon", tint = Color.White)
        }
    }
}

@Composable
private fun ProfileSection() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_placeholder),
            contentDescription = "Profile Picture",
            modifier = Modifier
                .size(96.dp)
                .padding(8.dp),
            contentScale = ContentScale.Crop
        )
        Text("Andhika Putra", fontSize = 20.sp, fontWeight = FontWeight.Bold)
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text("Paspor BCA  9087890908", fontSize = 14.sp)
            Icon(
                imageVector = Icons.Default.AddCircle,
                contentDescription = "Copy Passport Number",
                modifier = Modifier.padding(start = 4.dp)
            )
        }
    }
}

@Composable
private fun CardSection() {
    Image(
        painter = painterResource(id = R.drawable.ic_placeholder),
        contentDescription = "Credit Card Image",
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .height(180.dp),
        contentScale = ContentScale.Crop
    )
}

@Composable
private fun LimitsSection() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .background(Color(0xFFE9F0FF), RoundedCornerShape(24.dp))
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        LimitSlider("Cash Withdrawal Limit", "Cash withdrawal max: 7 million")
        LimitSlider("Transfer Limit (BCA)", "Transfer limit to BCA max: 25 million")
        LimitSlider("Transfer Limit (Different Bank)", "Transfer limit to other banks max: 10 million")
        LimitSlider("Debit Transaction Debit", "Debit transaction max: 25 million")
    }
}

@Composable
private fun LimitSlider(label: String, maxLabelDescription: String) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .semantics { contentDescription = "$label slider group" }
    ) {
        Text(label, fontSize = 16.sp, fontWeight = FontWeight.Bold, color = Color(0xFF1F4FCB))
        Slider(
            value = 0.5f,
            onValueChange = {},
            valueRange = 0f..1f,
            modifier = Modifier
                .fillMaxWidth()
                .semantics { contentDescription = "$label adjustment slider" }
        )
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text("Min. 10.000", fontSize = 12.sp, modifier = Modifier.semantics { contentDescription = "Minimum value 10 thousand" })
            Text("Min. $maxLabelDescription", fontSize = 12.sp, modifier = Modifier.semantics { contentDescription = "Maximum value $maxLabelDescription" })
        }
        OutlinedTextField(
            value = "",
            onValueChange = {},
            modifier = Modifier
                .fillMaxWidth()
                .semantics { contentDescription = "$label input field" },
            singleLine = true,
            label = { Text(text = "$label Amount") }
        )
    }
}

@Composable
private fun ActionButtons() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(24.dp),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        OutlinedButton(
            onClick = {},
            modifier = Modifier.semantics { contentDescription = "Cancel button" }
        ) {
            Text("Cancel")
        }
        Button(
            onClick = {},
            modifier = Modifier.semantics { contentDescription = "Save button" }
        ) {
            Text("Save")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewSetLimitScreen() {
    SetLimitScreen()
}
