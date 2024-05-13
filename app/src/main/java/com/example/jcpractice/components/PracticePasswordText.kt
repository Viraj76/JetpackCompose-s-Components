package com.example.jcpractice.components

import androidx.compose.material.icons.Icons
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import com.example.jcpractice.R
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun PracticePasswordText() {

    var passwordText by rememberSaveable { mutableStateOf("") }
    var showPassword by remember { mutableStateOf(false) }
    val showIcon = if(showPassword) painterResource(id = R.drawable.baseline_visibility_24) else painterResource(id = R.drawable.baseline_visibility_off_24)

    OutlinedTextField(
        value = passwordText,
        onValueChange = { passwordText = it },
        placeholder = { Text(text = "Enter password")},
        label = { Text(text = "Enter Password")},
        readOnly = true,
        trailingIcon = {
            IconButton(onClick = { showPassword = !showPassword }) {
                Icon(
                    painter = showIcon,
                    contentDescription = "Visibility Icons"
                )
            }
        },
        visualTransformation = if(showPassword) VisualTransformation.None else PasswordVisualTransformation()
        ,
        colors = TextFieldDefaults.outlinedTextFieldColors(
            unfocusedBorderColor = Color.Blue,
            unfocusedTrailingIconColor = Color.Blue,
            unfocusedLabelColor = Color.Blue,
            placeholderColor = Color.Blue,
            focusedBorderColor = Color.Cyan,
            focusedTrailingIconColor = Color.Blue,
            cursorColor = Color.Blue,
            focusedLabelColor = Color.Blue,
        )
    )

}