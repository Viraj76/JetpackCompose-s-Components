package com.example.jcpractice.components

import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Check
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.*
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PTextFields(){

    var tvText  by remember { mutableStateOf("Type here....") }

    OutlinedTextField(
        value = tvText,
        onValueChange ={
            tvText = ""
            tvText = it
        },
        label = {
            Text(text = "Enter your email")
                },
        leadingIcon = {
            IconButton(onClick = { Log.d("CLIckec" , "email")}){
            Icon(imageVector = Icons.Outlined.Email, contentDescription = "Email Icon" )
        }
        },
        trailingIcon = {
            IconButton(onClick = { Log.d("CLIckec" , "check")}){
                Icon(imageVector = Icons.Outlined.Check, contentDescription = "Check Icon" )
            }
        },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number , imeAction = ImeAction.Done),
        keyboardActions = KeyboardActions(
            onDone = {Log.d("CLIckec" , "doneee")}
        )

    )
}