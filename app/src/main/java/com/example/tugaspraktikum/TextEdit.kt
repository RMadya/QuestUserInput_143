package com.example.tugaspraktikum

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.core.content.pm.ShortcutInfoCompat

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

    val headerGradient = Brush.verticalGradient(colors = listOf(Color(color = 0xFFCE93D8), Color(color = 0xFFE1BEE7)))
    val primaryPurple = Color(color = 0xFF8E24AA)
    val labelColorOnWhite = Color(color = 0xFF555555)
    val cardResultBg = Color(color = 0xFF222222)
    val cardResultText = Color.White

    val scrollState = rememberScrollState()

    Surface(
        modifier = modifier
            .fillMaxSize()
            .background(Color(color = 0xFFF8EAF6))
    ){
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .padding(vertical = 12.dp)
        ){
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                shape = RoundedCornerShape( size = 18.dp),
                elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
            ){
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .verticalScroll(scrollState) // semua konten di-card bisa discroll
                ){

                }
        }
    }
