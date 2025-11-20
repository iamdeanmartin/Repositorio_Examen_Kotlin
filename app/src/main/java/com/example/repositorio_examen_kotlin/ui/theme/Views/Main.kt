package com.example.repositorio_examen_kotlin.ui.theme.Views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column

import androidx.compose.ui.unit.dp

import androidx.compose.runtime.Composable

import androidx.compose.ui.Modifier

import androidx.compose.foundation.layout.Row

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height

import androidx.compose.foundation.layout.width

import androidx.compose.material3.Slider

import com.example.repositorio_examen_kotlin.R

import androidx.compose.ui.res.painterResource

import androidx.compose.foundation.Image

import androidx.compose.material3.Switch

import androidx.compose.material3.Checkbox

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

    var switchState by rememberSaveable { mutableStateOf(true) }

    var minimo by rememberSaveable { mutableStateOf(0) }

    var maximo by rememberSaveable { mutableStateOf(0) }

    var cantidadInventario by rememberSaveable { mutableStateOf(0) }

    var sandia by rememberSaveable { mutableStateOf(false) }

    var platano by rememberSaveable { mutableStateOf(false) }

    var champi by rememberSaveable { mutableStateOf(false) }

    var zanahoria by rememberSaveable { mutableStateOf(false) }

    var kiwi by rememberSaveable { mutableStateOf(false) }

    var pastel by rememberSaveable { mutableStateOf(false) }

    var cantidadMax by rememberSaveable { mutableStateOf(cantidadInventario) }

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
                    .padding(16.dp),
                verticalAlignment = Alignment.Top,
                horizontalArrangement = Arrangement.Start
            ) {
                Text(
                    text = "Quantiat de bots:",
                    fontSize = 12.sp,
                )
            }

            Spacer(modifier = Modifier.height(12.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Column(
                    modifier = Modifier
                        .padding(8.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Min:",
                        fontSize = 12.sp,
                    )

                    TextField(
                        value = nombre,
                        onValueChange = {nombre = it},
                        label = { Text(text = "0") }
                    )
                }

                Column(
                    modifier = Modifier
                        .padding(8.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Max:",
                        fontSize = 12.sp,
                    )

                    TextField(
                        value = nombre,
                        onValueChange = {nombre = it},
                        label = { Text(text = "30") }
                    )
                }
            }

            Spacer(modifier = Modifier.height(12.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Text(
                    text = "Ítems inicials a l'inventari:",
                    fontSize = 12.sp,
                )

                Text (
                    text = "$cantidadInventario"
                )
            }

            Column(
                modifier = Modifier
                    .padding(8.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Checkbox(
                        checked = sandia,
                        onCheckedChange = { sandia = it }
                    )

                    Spacer(modifier = Modifier.width(8.dp))

                    Image(
                        painter = painterResource(id = R.drawable.watermelon),
                        contentDescription = "Imagen Sandía",
                        modifier = Modifier
                            .height(25.dp)
                            .width(25.dp)
                    )

                    Checkbox(
                        checked = platano,
                        onCheckedChange = { platano = it }
                    )

                    Spacer(modifier = Modifier.width(8.dp))

                    Image(
                        painter = painterResource(id = R.drawable.banana),
                        contentDescription = "Imagen Platano",
                        modifier = Modifier
                            .height(25.dp)
                            .width(25.dp)
                    )
                }

                Spacer(modifier = Modifier.height(8.dp))

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Checkbox(
                        checked = champi,
                        onCheckedChange = { champi = it }
                    )

                    Spacer(modifier = Modifier.width(8.dp))

                    Image(
                        painter = painterResource(id = R.drawable.mushroom),
                        contentDescription = "Imagen Champi",
                        modifier = Modifier
                            .height(25.dp)
                            .width(25.dp)
                    )

                    Checkbox(
                        checked = zanahoria,
                        onCheckedChange = { zanahoria = it }
                    )

                    Spacer(modifier = Modifier.width(8.dp))

                    Image(
                        painter = painterResource(id = R.drawable.carrot),
                        contentDescription = "Imagen Zanahoria",
                        modifier = Modifier
                            .height(25.dp)
                            .width(25.dp)
                    )
                }

                Spacer(modifier = Modifier.height(8.dp))

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Checkbox(
                        checked = kiwi,
                        onCheckedChange = { kiwi = it }
                    )

                    Spacer(modifier = Modifier.width(8.dp))

                    Image(
                        painter = painterResource(id = R.drawable.kiwi),
                        contentDescription = "Imagen Kiwi",
                        modifier = Modifier
                            .height(25.dp)
                            .width(25.dp)
                    )

                    Checkbox(
                        checked = pastel,
                        onCheckedChange = { pastel = it }
                    )

                    Spacer(modifier = Modifier.width(8.dp))

                    Image(
                        painter = painterResource(id = R.drawable.cake),
                        contentDescription = "Imagen Pastel",
                        modifier = Modifier
                            .height(25.dp)
                            .width(25.dp)
                    )
                }
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Text(
                    text = "Está permés lootejar?:",
                    fontSize = 12.sp,
                )

                Switch(checked = switchState,
                    onCheckedChange = { switchState = !switchState }
                    )
            }

        }
    }
}