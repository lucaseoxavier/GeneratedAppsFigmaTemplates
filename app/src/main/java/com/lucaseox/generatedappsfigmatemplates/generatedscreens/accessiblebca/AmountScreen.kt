package com.lucaseox.generatedappsfigmatemplates.generatedscreens.accessiblebca

// Required imports
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lucaseox.generatedappsfigmatemplates.R

@Composable
fun AmountScreen() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.White
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(horizontal = 24.dp, vertical = 48.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Amount",
                style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF001B4E) // High contrast navy
                )
            )

            Spacer(modifier = Modifier.height(4.dp))

            Text(
                text = "Insert Transfer Amount",
                style = TextStyle(
                    fontSize = 14.sp,
                    color = Color(0xFF444444) // Dark gray for higher contrast
                )
            )

            Spacer(modifier = Modifier.height(32.dp))

            TransferAmountField()

            Spacer(modifier = Modifier.height(24.dp))

            NoteInputField()

            Spacer(modifier = Modifier.height(48.dp))

            Button(
                onClick = { /* TODO: Implement transfer action */ },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(52.dp),
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF1E6FF9), // Increased contrast
                    contentColor = Color.White
                )
            ) {
                Text(
                    text = "Next",
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
            }
        }
    }
}

@Composable
private fun TransferAmountField() {
    var amount by remember { mutableStateOf("1.320.000") }

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .height(56.dp)
            .background(Color(0xFFEAF0FF), RoundedCornerShape(12.dp))
            .padding(horizontal = 16.dp)
    ) {
        Box(
            modifier = Modifier
                .background(Color(0xFF1E6FF9), RoundedCornerShape(6.dp))
                .padding(horizontal = 10.dp, vertical = 4.dp)
        ) {
            Text(
                text = "Rp.",
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 14.sp
            )
        }

        Spacer(modifier = Modifier.width(12.dp))

        Text(
            text = amount,
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF001B4E)
            )
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun NoteInputField() {
    var note by remember { mutableStateOf(TextFieldValue("Yesterday’s Dinner")) }

    Column(modifier = Modifier.fillMaxWidth()) {
        Text(
            text = "Note",
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF001B4E)
        )

        Spacer(modifier = Modifier.height(8.dp))

        TextField(
            value = note,
            onValueChange = { note = it },
            modifier = Modifier.fillMaxWidth(),
            textStyle = TextStyle(fontSize = 14.sp, color = Color.Black),
            placeholder = {
                Text(
                    text = "Enter note here",
                    color = Color(0xFF888888) // Still readable on white background
                )
            },
            singleLine = true,
            colors = TextFieldDefaults.textFieldColors(
                containerColor = Color.Transparent,
                focusedIndicatorColor = Color.Gray,
                unfocusedIndicatorColor = Color.LightGray
            )
        )
    }
}
