package com.example.tugaspraktikum

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier

@Composable
fun FormDataDiriStyled(modifier: Modifier = Modifier) {
    // states
    var namaInput by remember { mutableStateOf(value = "" ) }
    var alamatInput by remember { mutableStateOf(value = "") }
    var genderInput by remember { mutableStateOf(value = "") }
    var statusInput by remember { mutableStateOf(value = "") }
