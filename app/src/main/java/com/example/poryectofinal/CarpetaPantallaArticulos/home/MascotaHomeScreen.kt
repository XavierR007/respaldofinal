package com.example.poryectofinal.CarpetaPantallaArticulos.home

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.poryectofinal.CarpetaPantallaArticulos.home.navigation.AppScreens

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Home(navController: NavController) {
    Scaffold{
        BodyContentHome(navController)
    }
}

@Composable
fun BodyContentHome(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Hola esta es la pantalla Home")

        //Botones para ir a pantallas

        Button(onClick = {
            navController.navigate(route = AppScreens.PantallaMascotasCatalogo.route)
        }) {
            Text(text = "Mascotas")
        }
        Button(onClick = {
            navController.navigate(route = AppScreens.PantallaAlimentosCatalogo.route)
        }) {
            Text(text = "Alimentos")
        }
        Button(onClick = {
            navController.navigate(route = AppScreens.PantallaAccesoriosCatalogo.route)
        }) {
            Text(text = "Accesorios")
        }
    }
}

