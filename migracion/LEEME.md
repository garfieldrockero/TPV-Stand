# Migración a app Android nativa

Prueba de migración de TPV Stand a una app nativa en **Kotlin + Jetpack Compose**.
La web de la raíz del repositorio sigue funcionando y no se toca: esto vive aparte
hasta que la app esté a la altura.

## Estado

Esqueleto mínimo que compila y arranca, con la paleta del proyecto. Todavía no hay
lógica: el núcleo (dinero, stock, promociones, fusión, enlace compartido y QR) se
porta después, con sus pruebas, siguiendo lo que hace `../index.html`.

## Cómo se compila

**No hace falta instalar nada**: no hay SDK de Android ni Gradle en el equipo de
desarrollo. De la compilación se encarga GitHub Actions (`.github/workflows/apk.yml`)
en cada subida a la rama `pruebas-app`, y la APK queda como artefacto descargable
desde la pestaña Actions del repositorio.

## Decisiones que no se cambian sin hablarlo

- **El dinero son céntimos en enteros.** Nunca decimales.
- **El formato JSON es el mismo que el de la web**: una copia hecha en la web tiene
  que poder importarse en la app, y al revés. Esa compatibilidad es lo que permite
  migrar los datos reales con el QR o el archivo de copia que ya existen.
- **Seguridad de la cadena de suministro**: solo `google()` y `mavenCentral()`,
  versiones exactas en `gradle/libs.versions.toml`, acciones de GitHub fijadas por
  commit y, más adelante, verificación de dependencias de Gradle.
