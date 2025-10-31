package com.example.tugaspraktikum

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@Composable
fun FormDataDiriStyled(modifier: Modifier = Modifier) {
    // states
    var namaInput by remember { mutableStateOf(value = "" ) }
    var alamatInput by remember { mutableStateOf(value = "") }
    var genderInput by remember { mutableStateOf(value = "") }
    var statusInput by remember { mutableStateOf(value = "") }

    var submittedNama by remember { mutableStateOf(value = "") }
    var submittedGender by remember { mutableStateOf(value = "") }
    var submittedStatus by remember { mutableStateOf(value = "") }
    var submittedAlamat by remember { mutableStateOf(value = "") }

    var isSubmitted by remember { mutableStateOf(value = false ) }

    val genders = listOf("Laki-laki", "Perempuan")
    val statuses = listOf("Janda", "Lajang", "Duda")
