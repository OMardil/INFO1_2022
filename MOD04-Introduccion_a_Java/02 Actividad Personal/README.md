# Instalación de Java
## Windows
### 1. Descargar Java
Abre la página [Java Platform (JDK) 13](https://www.oracle.com/technetwork/java/javase/downloads/index.html).

En la sección Java Platform (JDK) 13, haz click en DOWNLOAD.
![Image](img/img1.png)

Navega hasta la parte de abajo, y selecciona la versión de `Windows`. Acepta la ligencia y elige la versión ejecutable (con terminación .exe): 
`jdk-13_windows-x64_bin.exe`
![Image](img/img2.png)

Descarga y ejecuta el archivo descargado.

### Instalación

Ejecuta el wizard.
![Step1](img/img3.png)

Identifica el folder en el que se está realizando la instalación. Por defecto, Java propone:
`C:\Program Files\Java\jdk-13`
![Step1](img/img4.png)

![Step2](img/img5.png)
![Step3](img/img6.png)

Cierra el instalador y abre `Command Prompt` haciendo click en <kbd>Win</kbd> + <kbd>R</kbd>.

![Step4](img/img6_1.png)

En consola, escribe la instrucción
`java`

El mensaje `'java' is not recognized as an internal or external command,
operable program or batch file.` deberá aparecer.

NOTA: En este momento Java ya está instalado y es utilizable, pero no se encuentra configurado para ser utilizado directamente a través de la línea de comandos.

![Step5](img/img6_3.png)

### Editar variables de entorno
En el menú Start, busca `This PC` (`Este Equipo` en español.) Haz click derecho sobre el ícono y selecciona la opción `Properties`. 

![Step5](img/img7.png)


Selecciona la opción `Advanced System Settings`.
![Step1](img/img8.png)

Haz click sobre `Environmental Variables...`
![Step2](img/img9.png)

En la sección de `System variables`, selecciona `Path` y haz click sobre `Edit`.
![Step3](img/img10.png)

Agrega una nueva entrada en la lista de entradas haciendo click sobre `New` e insertando la ruta en donde Java está instalado, incluyendo el folder `bin`: `C:\Program Files\Java\jdk-13\bin`. **VERIFICA QUE ESTA RUTA EXISTA EN TU COMPUTADORA, pues es posible que hayas elegido una ruta distinta.**
![Step4](img/img11.png)
![Step5](img/img12.png)

Haz click en `OK` para salir.

### Verificar instalación
Vuelve a abrir `Command Prompt` haciendo click en <kbd>Win</kbd> + <kbd>R</kbd>, e insertando la instrucción `cmd`.

![Step4](img/img6_1.png)

En consola, escribe la instrucción
`javac -version`

La versión que elegiste al instalar la aplicación deberá aparecer aquí.
![Step5](img/img13.png)

**NOTA: TOMA UN SCREENSHOT DE ESTA EVIDENCIA PARA ENTREGAR MEDIANTE BLACKBOARD.**

## Mac OS X

### ¿Necesito descargar Java?
Antes de realizar los siguientes pasos, abre una sesión de Terminal. Para esto, busca el programa el Spotlight. 
![Version](img/img_mac_0_1.png)

En Terminal, escribe las siguientes instrucciones:
`javac -version`

![Version](img/img_mac_0_2.png)

Si te muestra alguna versión de Java instalada, como OpenJDK o jdk-13, no es necesario que continúes con este proceso, pues ya tienes el Java Development Kit instalado 😉. 

### Descargar
Si no tienes Java JDK instalado, te aparecera un mensaje que te dirige hacia la página de descarga del JDK. Haz click sobre `More Info` para ir a ella.
![More Info](img/mac_step1.png)

Selecciona la opción `Download` 

![Download](img/mac_step2.png)

Elige la opción `jdk-13_osx-x64_bin.dmg` para Mac OS X.

![Download](img/mac_step4.png)

Cuando termine la descarga, abre el instalador y haz doble click sobre el archivo `JDK 13.pkg`.

![Install 1](img/mac_step5.png)

Continúa con la instalación hasta terminar.

![Install 2](img/mac_step6.png)

De nuevo sobre `Terminal`, ejecuta la instrucción:  
`javac -version`

La versión de Java instalada aparecerá en pantalla de la siguiente manera:

![Verify](img/mac_step7.png)

**NOTA: TOMA UN SCREENSHOT DE ESTA EVIDENCIA PARA ENTREGAR MEDIANTE BLACKBOARD.**
