

# 💡 Nombre del Proyecto 💡

__Ejemplo: Automatización Web Demoblaze page

Url: https://www.demoblaze.com/index.html


# 👓 Informacion del Autor 👓
|Autor|
|--|
| Karolayn Mazo |

# 📋 Pre-requisitos 📋

- Java 17
- Lombok
- VisualStudio Code
- Gradle, versiones 8
- Navegadores, edge, chrome
- Serenity BDD, Screenplay

# 🎨Descripcion de la automatización

_Proyecto de automatización web de páginas públicas. 

Se tiene un configuración para elegir el navegador a ejecutar entre chrome o edge, para elegir el navegador a usar se envia como varible de entorno. 

comando de ejecución: 
Edge:
gradle clean test --tests Demoblaze -Denviroments=edge 

Chrome:
gradle clean test --tests Demoblaze -Denviroments=chrome

La clase runner general es una clase de apoyo para la ejecución con variables de entorno desde vscode. 