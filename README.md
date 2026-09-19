# TPV Stand

[English](#english) · [Español](#español)

**App:** https://garfieldrockero.github.io/TPV-Stand/

---

## English

A simple point-of-sale app for artists selling at fairs, markets and stands. It records what you sell and how much you've earned. **It does not process payments**: it's a digital notebook for your sales, not a card terminal.

### Features

- **Quick selling:** tap products to add them to the sale, or add a custom amount.
- **Promotions**, of two kinds: a fixed bundle (1 print + 1 badge + 2 stickers for 16 €) and a pick-your-own deal (any 3 prints for 30 €, choosing which ones at the till). Selling one takes its items out of each product's stock, and it shows up as its own line in the summary and the CSV.
- **Payment method:** cash, card or Bizum. For cash, it calculates the change.
- **Stock control** (optional, per product). It won't let you sell more than you have, and warns when stock runs low.
- **Events:** tag sales with the current fair or market to see what you earned at each one.
- **Summary:** total earned, number of sales, units, average ticket, best-selling products, and breakdowns by payment method, day and event.
- **CSV export** for Excel: detailed sales, sales per ticket, and products with stock.
- **Backups:** download or share a JSON copy and restore it on any device.
- **Works offline** once opened, and can be installed on your phone like an app.

### Privacy

There are no servers, accounts, analytics or connections to third parties. **All data is stored only on the device**, in the browser's local storage. Clearing Chrome's data or changing phones deletes it, so **make regular backups** from *Ajustes → Copia de seguridad*.

### Install on Android (e.g. Pixel)

1. Open https://garfieldrockero.github.io/TPV-Stand/ in Chrome.
2. Tap **⋮ → Install app** (or *Add to Home screen*).
3. Open it from the home screen icon.

### Tech

A static web app (PWA) with no dependencies and no build step: `index.html` (HTML, CSS and JavaScript), `sw.js` (service worker for offline use) and `manifest.webmanifest`. To try it locally, serve the folder over HTTP, for example with `python3 -m http.server`, and open `http://localhost:8000`.

---

## Español

Una app sencilla de caja para artistas que venden en ferias, mercadillos y puestos. Registra lo que vendes y cuánto llevas ganado. **No cobra**: es una libreta digital de ventas, no un datáfono.

### Funciones

- **Venta rápida:** toca los productos para añadirlos a la venta, o añade un importe libre.
- **Promociones**, de dos tipos: pack fijo (1 lámina + 1 chapa + 2 pegatinas por 16 €) y promoción a elegir (3 láminas cualesquiera por 30 €, eligiendo cuáles al cobrar). Al venderla se descuentan las unidades del stock de cada producto, y aparece como línea propia en el resumen y en el CSV.
- **Método de pago:** efectivo, tarjeta o Bizum. En efectivo calcula el cambio.
- **Control de stock** (opcional, por producto). No deja vender más de lo que hay y avisa cuando queda poco.
- **Eventos:** asocia las ventas a la feria o mercado actual para ver cuánto ganaste en cada uno.
- **Resumen:** total ganado, número de ventas, unidades, ticket medio, productos más vendidos y desglose por método de pago, día y evento.
- **Exportar a CSV** para Excel: ventas detalladas, ventas por ticket, y productos con su stock.
- **Copias de seguridad:** descarga o comparte una copia en JSON y restáurala en cualquier dispositivo.
- **Funciona sin conexión** una vez abierta, y se puede instalar en el móvil como una app.

### Privacidad

No hay servidores, cuentas, analítica ni conexiones con terceros. **Todos los datos se guardan solo en el dispositivo**, en el almacenamiento local del navegador. Si se borran los datos de Chrome o se cambia de móvil, se pierden, así que **haz copias de seguridad a menudo** desde *Ajustes → Copia de seguridad*.

### Instalar en Android (p. ej. Pixel)

1. Abre https://garfieldrockero.github.io/TPV-Stand/ en Chrome.
2. Pulsa **⋮ → Instalar aplicación** (o *Añadir a pantalla de inicio*).
3. Ábrela desde el icono de la pantalla de inicio.

### Técnica

Una web estática (PWA) sin dependencias ni proceso de compilación: `index.html` (HTML, CSS y JavaScript), `sw.js` (service worker para usarla sin conexión) y `manifest.webmanifest`. Para probarla en local, sirve la carpeta por HTTP, por ejemplo con `python3 -m http.server`, y abre `http://localhost:8000`.
