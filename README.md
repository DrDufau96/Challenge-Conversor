Challenger-Conversor

Descripción

Challenger-Conversor es una aplicación en Java que permite realizar conversiones de monedas utilizando la API de tasas de cambio en tiempo real. Es un proyecto diseñado para ser ejecutado desde la consola y facilita múltiples conversiones de manera eficiente.

Estructura del Proyecto

src/: Contiene el código fuente del proyecto, organizado en los siguientes paquetes:

calculos: Lógica de conversión y gestión de tasas de cambio.

modelos: Modelos para las entidades principales como monedas y vistas.

principal: Clase principal para ejecutar la aplicación.

out/: Archivos compilados generados por el IDE (puede eliminarse si es necesario).

.gitignore: Configuración para ignorar archivos no necesarios en Git.

Requisitos

Java 8 o superior

IDE compatible: IntelliJ IDEA, Eclipse, u otros compatibles con proyectos Java.

Conexión a Internet: Necesaria para las tasas de cambio.

Instalación

Clona el repositorio:

git clone https://github.com/tu-usuario/Challenger-Conversor.git

Importa el proyecto en tu IDE favorito:

Selecciona la opción de importar como proyecto de Java.

Configura las dependencias:

Si usas IntelliJ IDEA, verifica que las librerías externas necesarias estén configuradas (por ejemplo, Gson para el manejo de JSON).

Uso

Compila el proyecto:
Si estás usando la línea de comandos:

javac -d out src/com/aluracursos/conversor/principal/Principal.java

Ejecuta la aplicación:

java -cp out com.aluracursos.conversor.principal.Principal

Interacción en consola:

Sigue las instrucciones en pantalla para realizar las conversiones.

Introduce los códigos de moneda en formato ISO 4217 (como USD, EUR, etc.).

Contribución

Haz un fork del proyecto.

Crea una rama para tus cambios:

git checkout -b feature/nueva-funcionalidad

Realiza un pull request describiendo tus mejoras.


Contacto

Si tienes dudas o sugerencias, no dudes en contactar a través de tu correo o perfil de GitHub.

