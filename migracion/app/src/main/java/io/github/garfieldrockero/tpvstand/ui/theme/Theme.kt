package io.github.garfieldrockero.tpvstand.ui.theme

import android.app.Activity
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

// Paleta propia: no se usan los colores dinámicos del sistema ni el morado de
// plantilla de Material, para que la app tenga identidad reconocible.
private val EsquemaClaro = lightColorScheme(
    primary = TejaAcento,
    onPrimary = CremaSuperficie,
    secondary = TintaSuave,
    background = CremaFondo,
    onBackground = TintaOscura,
    surface = CremaSuperficie,
    onSurface = TintaOscura,
    surfaceVariant = CremaSuperficie2,
    onSurfaceVariant = TintaSuave,
    outline = LineaClara,
    error = RojoPeligro,
    tertiary = VerdeOk,
)

private val EsquemaOscuro = darkColorScheme(
    primary = TejaClara,
    onPrimary = NocheFondo,
    secondary = TintaClaraSuave,
    background = NocheFondo,
    onBackground = TintaClara,
    surface = NocheSuperficie,
    onSurface = TintaClara,
    surfaceVariant = NocheSuperficie2,
    onSurfaceVariant = TintaClaraSuave,
    outline = LineaOscura,
    error = RojoPeligroClaro,
    tertiary = VerdeOkClaro,
)

@Composable
fun TemaTpvStand(oscuro: Boolean = isSystemInDarkTheme(), contenido: @Composable () -> Unit) {
    val esquema = if (oscuro) EsquemaOscuro else EsquemaClaro
    val vista = LocalView.current
    if (!vista.isInEditMode) {
        SideEffect {
            val ventana = (vista.context as Activity).window
            WindowCompat.getInsetsController(ventana, vista).isAppearanceLightStatusBars = !oscuro
        }
    }
    MaterialTheme(colorScheme = esquema, typography = TipografiaTpv, content = contenido)
}
