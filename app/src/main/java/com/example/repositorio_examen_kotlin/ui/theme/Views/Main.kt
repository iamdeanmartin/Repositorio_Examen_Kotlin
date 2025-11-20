package com.example.repositorio_examen_kotlin.ui.theme.Views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column

import androidx.compose.ui.unit.dp

import androidx.compose.runtime.Composable

import androidx.compose.ui.Modifier

import androidx.compose.foundation.layout.Row

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height

import androidx.compose.ui.unit.sp

import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

import androidx.compose.material3.Text

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.TextField
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment

@Composable

fun main(modifier:Modifier = Modifier) {

    var nombre by rememberSaveable { mutableStateOf("") }

    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {


        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                    .padding(top=30.dp),
                verticalAlignment = Alignment.Top,
                horizontalArrangement = Arrangement.Start
            ) {
                TextField(
                    value = nombre,
                    onValueChange = {nombre = it},
                    label = { Text(text = "Nom del server de la partida...") }
                )
            }

            Spacer(modifier = Modifier.height(12.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                    .padding(top=30.dp),
                verticalAlignment = Alignment.Top,
                horizontalArrangement = Arrangement.Start
            ) {
                Text(
                    text = "Quantiat de bots:",
                    fontSize = 12.sp,
                )
            }

        }
    }
}