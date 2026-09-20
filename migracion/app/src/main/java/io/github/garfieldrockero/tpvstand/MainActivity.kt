package io.github.garfieldrockero.tpvstand

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.garfieldrockero.tpvstand.ui.theme.EstiloImporte
import io.github.garfieldrockero.tpvstand.ui.theme.TemaTpvStand

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent { TemaTpvStand { Arranque() } }
    }
}

// Pantalla provisional: solo sirve para comprobar que la APK se compila, se
// instala y arranca con los colores del proyecto. Las pantallas de verdad llegan
// cuando esté el núcleo portado.
@Composable
fun Arranque(modifier: Modifier = Modifier) {
    Scaffold(modifier = modifier.fillMaxSize()) { margenes ->
        Column(
            modifier = Modifier.fillMaxSize().padding(margenes).padding(24.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text("TPV Stand", style = MaterialTheme.typography.headlineSmall)
            Text("La caja del puesto", style = MaterialTheme.typography.bodyLarge)
            Text("0,00 €", style = EstiloImporte, color = MaterialTheme.colorScheme.primary)
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun VistaPreviaArranque() {
    TemaTpvStand { Arranque() }
}
