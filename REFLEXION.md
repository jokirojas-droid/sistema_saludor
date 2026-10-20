# Reflexión del estudiante
**Proyecto: Sistema Saludador**

## 1. Retos

**¿Qué partes te resultaron más difíciles de entender o de explicar?**

Una de las partes que requiere más atención es comprender cómo funciona JavaFX y cómo se relacionan los botones con las acciones del programa. También es importante entender cómo se validan los datos que ingresa el usuario, especialmente la edad, porque debe convertirse a un número entero y no puede ser cero ni negativa.

**¿Cómo las resolviste o cómo las explicarías ahora?**

Para comprender estas partes, es necesario revisar el código y observar qué ocurre cuando se hace clic en cada botón. Ahora puedo explicar que los botones tienen asociadas acciones que permiten cambiar la pantalla, validar los datos o generar el saludo. También entiendo que las validaciones sirven para evitar que el programa procese información incorrecta y para indicarle al usuario cómo corregir sus datos.

## 2. Descubrimientos

**¿Qué aprendiste sobre Java, JavaFX o Maven al revisar este proyecto?**

Aprendí que Java es el lenguaje utilizado para desarrollar la lógica del programa, mientras que JavaFX permite construir la interfaz gráfica de la aplicación, incluyendo ventanas, botones, campos de texto y mensajes. También aprendí que Maven ayuda a organizar las dependencias del proyecto y facilita su compilación y ejecución.

**¿Qué archivo o clase te ayudó más a comprender el flujo del caso de uso?**

La clase principal de la aplicación fue fundamental para comprender cómo se inicia el programa y cómo se muestra la ventana. Además, la clase o los métodos encargados de gestionar los botones y validar los datos permiten entender el desarrollo del caso de uso, desde que el estudiante solicita el saludo hasta que recibe el resultado.

## 3. Sorpresas

**¿Qué te sorprendió al ejecutar o leer el programa?**

Me llamó la atención que una aplicación relativamente sencilla necesite coordinar diferentes elementos, como la interfaz gráfica, los eventos de los botones, la validación de los datos y la generación del mensaje final. También comprendí que no basta con que la interfaz se vea bien, sino que cada acción debe funcionar correctamente.

**¿El comportamiento coincidió con lo que esperabas? ¿Por qué sí o por qué no?**

El comportamiento esperado es que el estudiante pueda ingresar su nombre, edad y seleccionar AM o PM para recibir un saludo personalizado. Cuando los datos son incorrectos, el sistema debe mostrar un mensaje de error que permita corregirlos. La comparación entre el comportamiento esperado y el observado permite identificar si la aplicación cumple con los requisitos del caso de uso.

*Después de ejecutar el programa, complementa esta respuesta indicando si todas las funciones se comportaron como esperabas y si encontraste algún problema.*

## 4. Comandos y bibliotecas

**Comandos utilizados en Windows**

Registra aquí los comandos que hayas ejecutado realmente. Los siguientes son ejemplos para un proyecto que incluya Maven Wrapper:

```powershell
java -version
```

Resultado observado: [Escribe la versión de Java que apareció en tu terminal].

```powershell
.\mvnw.cmd clean javafx:run
```

Resultado observado: [Indica si el proyecto se compiló y si se abrió la ventana de la aplicación. Si hubo un error, descríbelo brevemente].

Si tu proyecto no contiene `mvnw.cmd` o utilizaste otro comando indicado en el README, reemplaza el ejemplo por el comando real.

**Bibliotecas o herramientas utilizadas**

| Nombre | Para qué sirve | Cómo la usé en este proyecto |
|---|---|---|
| Java | Lenguaje de programación utilizado para implementar la lógica de la aplicación. | Para gestionar los datos del estudiante, las validaciones y la generación del saludo. |
| JavaFX | Plataforma para crear interfaces gráficas de escritorio con Java. | Para construir la ventana, los campos de entrada, los botones y los mensajes. |
| Maven | Herramienta que permite gestionar dependencias y automatizar la compilación del proyecto. | Para configurar y facilitar la compilación y ejecución de la aplicación. |
| Maven Wrapper | Scripts que permiten ejecutar Maven utilizando la versión configurada para el proyecto, sin depender necesariamente de una instalación global de Maven. | Para ejecutar los comandos del proyecto en Windows, si el repositorio incluye el Wrapper. |
| Cursor | Editor de código con funciones de inteligencia artificial. | Para apoyar el desarrollo, revisar el código y generar o modificar archivos del proyecto. |
| Git y GitHub | Herramientas para controlar versiones y alojar el código en un repositorio remoto. | Para guardar los cambios y mantener el proyecto organizado en el repositorio. |

## 5. Aspectos que no comprendía al principio

**1. Tema: Eventos de los botones**

- **Al principio pensaba:** Que los botones simplemente permitían cambiar entre las pantallas de la aplicación.
- **Ahora entiendo:** Que cada botón puede tener asociada una acción específica que se ejecuta cuando el usuario hace clic. Esa acción puede mostrar un formulario, validar los datos, generar un mensaje o regresar a la pantalla inicial.

**2. Tema: Validación de datos**

- **Al principio pensaba:** Que bastaba con solicitar la información al usuario para utilizarla directamente.
- **Ahora entiendo:** Que los datos deben verificarse antes de utilizarlos. Por ejemplo, el nombre no puede estar vacío y la edad debe convertirse correctamente a un entero positivo. Si los datos no cumplen las condiciones, el programa debe informar el problema.

**3. Tema: JavaFX y la lógica del programa**

- **Al principio pensaba:** Que la interfaz gráfica y el funcionamiento del programa eran prácticamente lo mismo.
- **Ahora entiendo:** Que la interfaz permite al usuario interactuar con el sistema, mientras que la lógica determina qué debe suceder con los datos ingresados y qué respuesta debe mostrar el programa.

## 6. Caso de uso "Solicitar saludo"

**Describe qué ocurre al hacer clic en cada botón.**

- **`Solicitar saludo`:** Permite iniciar el caso de uso y mostrar el formulario donde el estudiante ingresa su nombre, edad y selecciona AM o PM.
- **`Aceptar`:** Recoge la información ingresada, verifica que los datos sean válidos y, si se cumplen las condiciones, genera un saludo personalizado. Si encuentra algún dato incorrecto, muestra un mensaje para que el usuario pueda corregirlo.
- **`Volver al inicio`:** Permite regresar a la pantalla inicial para comenzar nuevamente el proceso.

**¿Qué validaciones comprobaste tú mismo?**

Completa las siguientes respuestas según las pruebas que hayas realizado:

- **Nombre vacío o solo espacios:** [Indica si el sistema muestra un mensaje de error y permite corregir el nombre].
- **Edad no numérica:** [Indica qué sucede cuando ingresas letras en lugar de un número].
- **Edad cero o negativa:** [Indica si el sistema rechaza estos valores].
- **AM/PM sin seleccionar:** [Indica si el sistema impide continuar sin elegir una opción].
- **Datos válidos en AM:** [Escribe el resultado obtenido. Por ejemplo, con el nombre Ana, edad 20 y AM, se espera: "Buenos días, Ana. Tienes 20 años."].
- **Datos válidos en PM:** [Escribe el resultado obtenido. Por ejemplo, con el nombre Ana, edad 20 y PM, se espera: "Buenas tardes, Ana. Tienes 20 años."].

## 7. Preguntas para la defensa

**1. Pregunta: ¿Qué función cumple JavaFX en el proyecto?**

Respuesta: JavaFX se utiliza para construir la interfaz gráfica de la aplicación. Permite mostrar la ventana, los botones, los campos donde se ingresan los datos y los mensajes que recibe el usuario.

**2. Pregunta: ¿Por qué es necesario validar la edad antes de generar el saludo?**

Respuesta: Porque el usuario podría ingresar letras, dejar el campo vacío o escribir un número que no sea válido para el sistema. La validación permite comprobar que la edad sea un número entero positivo antes de continuar y evita procesar datos incorrectos.

**3. Pregunta: ¿Cómo determina el sistema si debe mostrar "Buenos días" o "Buenas tardes"?**

Respuesta: El sistema utiliza la opción AM o PM seleccionada por el usuario. Mediante una condición, verifica cuál fue la opción elegida y genera el saludo correspondiente.

**4. Pregunta: ¿Cuál es la función de Maven en este proyecto?**

Respuesta: Maven ayuda a gestionar las dependencias necesarias, organizar la configuración del proyecto y ejecutar tareas como la compilación. Esto facilita el desarrollo y la ejecución de la aplicación.

**5. Pregunta: ¿Qué sucede si el usuario ingresa información incorrecta?**

Respuesta: El sistema verifica los datos antes de generar el saludo. Si alguno no cumple las condiciones establecidas, muestra un mensaje de error para que el usuario pueda corregirlo sin tener que cerrar la aplicación.

## 8. Pendientes personales

Me gustaría profundizar en JavaFX y en la forma de conectar los elementos de la interfaz con la lógica del programa. También quiero practicar la validación de datos, el manejo de errores y la organización de proyectos con Maven. Finalmente, considero importante aprender a leer el código generado con ayuda de inteligencia artificial para poder modificarlo, solucionar errores y explicar las decisiones de implementación de manera autónoma.
