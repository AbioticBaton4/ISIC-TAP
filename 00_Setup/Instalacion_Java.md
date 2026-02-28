# Guía de Instalación de Java (JDK)

Para esta materia de **Tópicos Avanzados de Programación**, es fundamental contar con el entorno de desarrollo de Java correctamente configurado.

## 1. Descarga del JDK
Recomendamos instalar el **JDK 17** o superior (LTS). Puedes descargarlo desde las siguientes fuentes oficiales:
* **Oracle JDK:** [Sitio oficial de Oracle](https://www.oracle.com/java/technologies/downloads/)
* **Adoptium (OpenJDK):** [Eclipse Temurin](https://adoptium.net/) (Recomendado por ser Open Source).

## 2. Instalación
1. Ejecuta el instalador descargado.
2. Sigue las instrucciones del asistente (Siguiente -> Siguiente).
3. **Importante:** Anota la ruta donde se instala (ejemplo: `C:\Program Files\Java\jdk-17`).

## 3. Configuración de Variables de Entorno (Windows)
Para que el sistema reconozca Java desde cualquier terminal:
1. Busca "Editar las variables de entorno del sistema" en el menú inicio.
2. Haz clic en **Variables de entorno**.
3. En "Variables del sistema", haz clic en **Nueva**:
   - Nombre: `JAVA_HOME`
   - Valor: `C:\Ruta\De\Tu\JDK`
4. Busca la variable `Path`, selecciónala y haz clic en **Editar**.
5. Añade una nueva línea con: `%JAVA_HOME%\bin`.

## 4. Verificación
Abre una terminal (CMD o PowerShell) y escribe:
```bash
java -version
javac -version