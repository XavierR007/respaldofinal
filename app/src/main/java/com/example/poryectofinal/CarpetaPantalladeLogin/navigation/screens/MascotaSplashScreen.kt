package com.example.poryectofinal.CarpetaPantalladeLogin.navigation.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.poryectofinal.CarpetaPantalladeLogin.navigation.MascotaScreens
import kotlinx.coroutines.delay

@Composable
fun MascotaSplashScreen(navController: NavController){
    LaunchedEffect(key1 = true){
        delay(3500L)
        navController.navigate(MascotaScreens.LoginScreen.name)
    }
    val color = MaterialTheme.colorScheme.primary
    Surface(modifier = Modifier
        .padding(15.dp)
        .size(330.dp),
        shape = CircleShape,
        color = Color.White,
        border = BorderStroke(width = 2.dp, color = color)
    ) {
        Column(modifier = Modifier
            .padding(1.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text("Mascota Feliz",
                style = MaterialTheme.typography.bodyMedium,
                color = color.copy(alpha = 0.5f)
            )
            Spacer(modifier = Modifier.height(15.dp))
            Text("Lo que tu y tu Mascota Necesitan",
                style = MaterialTheme.typography.bodyMedium,
                color = color
            )
        }
    }
}