package com.example.week3.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.*
import androidx.compose.ui.AbsoluteAlignment.Left
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.week3.ui.theme.Purple200

@Composable
fun Login(){
    var username by remember { mutableStateOf(value="") }
    var pw by remember { mutableStateOf(value = "") }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(600.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text ="Login",
        modifier = Modifier,
        fontSize = 36.sp,
        color = Purple200,
        )
        TextField(value = username , onValueChange = {username = it}, label = { Text(text = "Username")},
            modifier = Modifier.width(300.dp),
            trailingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "Person Icon") },
            shape = RoundedCornerShape(10.dp),
            colors = TextFieldDefaults.textFieldColors(
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent),
            singleLine = true
        )
        Spacer(modifier = Modifier.height(10.dp))
        TextField(value = pw , onValueChange = {pw = it}, label = { Text(text = "Password")},
            trailingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "Lock Icon") },
            modifier = Modifier.width(300.dp),
            shape = RoundedCornerShape(10.dp),
            colors = TextFieldDefaults.textFieldColors(
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent),
            singleLine = true,
            visualTransformation = PasswordVisualTransformation()
        )
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedButton(onClick = { /*TODO*/ }) {
            Text(
                text = "Submit")
        }
        }
    }

