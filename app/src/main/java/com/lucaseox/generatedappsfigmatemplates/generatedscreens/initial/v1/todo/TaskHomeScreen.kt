package com.lucaseox.generatedappsfigmatemplates.generatedscreens.initial.v1.todo// Required imports

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lucaseox.generatedappsfigmatemplates.R

@Composable
fun TaskHomeScreen() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF1F6F5))
            .padding(bottom = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item {
            HeaderSection()
            GreetingSection()
            ClockSection()
            TaskListSection()
        }
    }
}

@Composable
private fun HeaderSection() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFF2EBEC4))
            .padding(vertical = 24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_placeholder),
            contentDescription = "Profile Picture",
            modifier = Modifier
                .size(80.dp)
                .clip(CircleShape)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Welcome Jeegar goyani",
            color = Color.White,
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp
        )
    }
}

@Composable
private fun GreetingSection() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 24.dp, vertical = 16.dp),
        horizontalArrangement = Arrangement.End
    ) {
        Text(
            text = "Good Afternoon",
            fontWeight = FontWeight.SemiBold
        )
    }
}

@Composable
private fun ClockSection() {
    Box(
        modifier = Modifier
            .padding(vertical = 8.dp)
            .size(140.dp)
            .clip(CircleShape)
            .background(Color.White),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_placeholder),
            contentDescription = "Clock Image",
            modifier = Modifier.size(120.dp)
        )
    }
}

@Composable
private fun TaskListSection() {
    Column(
        modifier = Modifier
            .padding(horizontal = 16.dp, vertical = 8.dp)
            .fillMaxWidth()
    ) {
        Text(
            text = "Task list",
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start = 4.dp)
        )

        Spacer(modifier = Modifier.height(12.dp))

        Card(
            shape = RoundedCornerShape(16.dp),
            elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(modifier = Modifier.padding(16.dp)) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Daily Task",
                        fontWeight = FontWeight.Medium
                    )
                    Icon(
                        imageVector = Icons.Default.AddCircle,
                        contentDescription = "Add Task"
                    )
                }

                Spacer(modifier = Modifier.height(16.dp))

                val tasks = listOf(
                    "Learning Programming by 12PM" to true,
                    "Learn how to cook by 1PM" to false,
                    "Learn how to play at 2PM" to false,
                    "Have lunch at 4PM" to false,
                    "Going to travel 6PM" to false
                )

                tasks.forEach { (task, checked) ->
                    TaskItem(task = task, isChecked = checked)
                }
            }
        }
    }
}

@Composable
private fun TaskItem(task: String, isChecked: Boolean) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(vertical = 4.dp)
    ) {
        Checkbox(
            checked = isChecked,
            onCheckedChange = {},
            colors = CheckboxDefaults.colors(
                checkedColor = Color(0xFF2EBEC4)
            )
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(text = task)
    }
}
