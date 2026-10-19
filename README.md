# Sistema Saludador

Prototipo académico de aplicación de escritorio en **Java** y **JavaFX**. Demuestra el caso de uso **Solicitar saludo**: el estudiante abre un formulario, ingresa nombre, edad y periodo del día (AM o PM), y recibe un saludo personalizado si los datos son válidos.

## Requisitos previos (Windows)

- **JDK 25** (en este entorno se identificó OpenJDK 25.0.4 de Microsoft).
- Conexión a Internet la primera vez que se compile, para que Maven Wrapper descargue Maven y las dependencias de JavaFX.
- No es necesario instalar Maven de forma global: el proyecto incluye Maven Wrapper (`mvnw.cmd`).

Compruebe Java en PowerShell o Símbolo del sistema:

```powershell
java -version
javac -version
```

Si `java` no se reconoce, instale un JDK 25 y, si hace falta, defina `JAVA_HOME` apuntando a la carpeta del JDK. Ejemplo con la instalación detectada en este equipo:

```powershell
$env:JAVA_HOME = "C:\Program Files\Microsoft\jdk-25.0.4.7-hotspot"
$env:Path = "$env:JAVA_HOME\bin;" + $env:Path
```

## Versión de Java y configuración de JavaFX

| Elemento | Valor usado en el proyecto |
| --- | --- |
| Java (compilación) | 25 (`maven.compiler.release`) |
| JavaFX | `javafx-controls` 25.0.1 (OpenJFX) |
| Construcción | Apache Maven 3.9.11 a través de Maven Wrapper |
| Ejecución JavaFX | Plugin `javafx-maven-plugin` 0.0.8 |
| Clase principal | `com.sistemasaludador.SistemaSaludadorApp` |

JavaFX no forma parte del JDK. Maven descarga las bibliotecas OpenJFX y el plugin `javafx:run` las coloca en el módulo path al iniciar la aplicación.

## Cómo ejecutar en Windows

Abra PowerShell, entre a la carpeta del proyecto y ejecute:

```powershell
cd C:\Users\johan\Documents\sistema-saludador
.\mvnw.cmd javafx:run
```

La primera ejecución puede tardar porque descarga Maven y las dependencias.

Para **compilar** sin abrir la ventana:

```powershell
cd C:\Users\johan\Documents\sistema-saludador
.\mvnw.cmd -q compile
```

## Uso esperado

1. Se abre una ventana titulada **Sistema Saludador**.
2. Pulse **Solicitar saludo**.
3. Complete nombre, edad y AM o PM, y pulse **Aceptar**.
4. Si hay un error, aparece un mensaje en rojo y puede corregir los datos.
5. Si los datos son válidos, se muestra el saludo y puede pulsar **Volver al inicio**.

## Enlace al repositorio

Este proyecto se creó como repositorio Git **local** en:

`C:\Users\johan\Documents\sistema-saludador`

No hay un repositorio remoto configurado (no se publicó ni se inventó una URL). Cuando el profesor o el estudiante autoricen publicarlo, pueden crear el remoto y añadir el enlace aquí. Ejemplo de consulta local:

```powershell
cd C:\Users\johan\Documents\sistema-saludador
git remote -v
```

Si el comando no muestra `origin`, el enlace remoto todavía no existe. Después de crearlo (GitHub, GitLab u otro servicio), actualice este apartado con la URL real:

```text
https://...   ← pegue aquí la URL que muestre `git remote -v`
```

## Estructura del código

- `src/main/java/com/sistemasaludador/SistemaSaludadorApp.java`: ventana, pantallas y eventos de los botones.
- `src/main/java/com/sistemasaludador/ValidadorFormulario.java`: reglas de validación del formulario.
- `src/main/resources/estilos.css`: estilos visuales de la interfaz.
- `prompts/`: historial de prompts utilizados.
- `REFLEXION.md`: plantilla para documentar el aprendizaje del estudiante.
