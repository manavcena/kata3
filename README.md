# Kata 3 - Transformación CSV a JSON

Objetivo: Leer un dataset (`libros.csv`), convertir los registros válidos en objetos de dominio, calcular metadatos (registros procesados y descartados) y generar un archivo `output.json` estructurado aislando las responsabilidades.

## Requisitos y Dependencias
- **JDK:** 27.0.1.
- **Gestor de dependencias:** Maven.
- **Bibliotecas externas:** Gson (2.10.1) para la serialización a JSON.

## Compilación y Ejecución
Asegúrate de tener el archivo `libros.csv` en la carpeta raíz del proyecto (al mismo nivel que tu `pom.xml`). Para ejecutar el proyecto:

1. Abre el proyecto en IntelliJ IDEA.
2. Si es la primera vez que lo abres, haz clic en el botón de recargar Maven (el icono flotante con la "m") para descargar Gson.
3. Navega en el panel izquierdo hasta la clase `Main` (`src/main/java/software/ulpgc/katas/Main.java`).
4. Haz clic derecho sobre el archivo `Main` y selecciona **Run 'Main.main()'**, o pulsa el triángulo verde.

## Estructura de Clases
- **Book, Metadata, JsonResult:** Records de dominio que estructuran la información.
- **CsvReader:** Recibe un flujo de datos, valida campos vacíos y transforma el texto a objetos.
- **JsonSerializer:** Recibe los objetos validados y delega en Gson su transformación a JSON.
- **Main:** Orquesta el proceso de lectura y escritura.

## Verificación
Se ha verificado el correcto funcionamiento comprobando los siguientes escenarios:
- Prueba con entrada correcta validando la salida JSON.
- Prueba con registros incompletos o mal formados (sumados a descartados).
- Prueba con dataset vacío (devuelve lista vacía y 0 procesados).
- Verificación de que la arquitectura permite cambiar el origen de datos sin alterar el parsing.

https://youtu.be/q15UKfgS3Qk
