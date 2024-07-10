# Conversor de Monedas

"Conversor de Monedas" es uno de los challenges propuestos por Alura Latam y Oracle en el programa ONE, especialización Back-End.

## Descripción

Este proyecto es un Conversor de Monedas desarrollado en Java que te permite convertir diferentes divisas utilizando la API de tasas de cambio de ExchangeRate-API. Permite realizar solicitudes a la API, analizar respuestas JSON, filtrar monedas de interés y mostrar resultados claros al usuario.

## Tecnologías Utilizadas

- Lenguaje de Programación: Java
- API de Tasas de Cambio: ExchangeRate-API para obtener tasas de cambio actualizadas.
- Biblioteca Gson: Para el manejo de respuestas JSON.
- Control de Versiones: Git/GitHub.
- Entorno de Desarrollo Integrado (IDE): IntelliJ IDEA.

## Clases y Funcionalidades

- **CalculadoraMonedas.java:** Manejo de lógica para conversiones de moneda.
- **ConsultaAPI.java:** Realización de consultas a la API externa.
- **Principal.java:** Punto de entrada del programa, gestión de interfaz de usuario.

## Desarrollado por

Facundo Araujo

## Funcionalidades

- **Obtención de Tasas de Cambio:** Solicita y actualiza tasas desde la API.
- **Conversión de Moneda:** Permite al usuario seleccionar monedas y convertir montos.
- **Interfaz de Usuario:** Implementación de una interfaz de línea de comandos.

## Requisitos Previos

- Java Development Kit (JDK) versión 17 o superior.
- Biblioteca Gson para manejo de JSON (incluida en el proyecto a través de Maven).

## Instalación y Uso

1. **Clonar el repositorio:**

   ```bash
   git clone https://github.com/araujofacu/conversor-monedas.git

2. **Compilar el proyecto:**

   Desde la raíz del proyecto:

   ```bash
   cd conversor-monedas
   mvn compile
   
3. **Ejecutar el programa:**

   Desde la raíz del proyecto

   ```bash
   mvn exec:java -Dexec.mainClass="com.sistema.conversor.Principal"

4. **Seguir las instrucciones en consola para realizar conversiones de moneda.**

## Contribuciones

¡Las contribuciones son bienvenidas! Si deseas contribuir a este proyecto, sigue estos pasos:

1. Realiza un fork del repositorio.
2. Crea una nueva rama (git checkout -b feature/nueva-funcionalidad).
3. Realiza tus cambios y haz commit (git commit -am 'Añade nueva funcionalidad').
4. Sube tus cambios a la rama (git push origin feature/nueva-funcionalidad).
5. Abre un pull request para que tus cambios sean revisados.

## Demostración

Aquí puedes ver una demostración visual de cómo funciona el proyecto:

[Conversor de Monedas - Demo](https://youtu.be/MAvhkCw2Hvk)
