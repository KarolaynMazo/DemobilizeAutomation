# 💡 Projects Name 💡

_Example_: Web Automation Demoblaze 

URL: https://www.demoblaze.com/index.html 


# 👓 Author Information👓
|Author|Email|
|--|--|
| Karolayn Mazo |Karolaynmazo@gmail.com|

# 📋 Pre-requirements 📋

- Java 17
- Lombok
- VisualStudio Code
- Gradle 8
- browsers, Edge, Chrome
- Serenity BDD, Screenplay

# 🎨Automation Description

Web automation project.
There is a setting to select the browser of preference to run the tests, the available options are Chrome or Edge.
The choice of command is configured as an environment variable.  

Execution commands: 
Edge:
gradle clean test --tests Demoblaze -Denviroments=edge 

Chrome:
gradle clean test --tests Demoblaze -Denviroments=chrome

The general runner class is a support class for running with environment variables from vscode. 