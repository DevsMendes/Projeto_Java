# Projeto Spring Boot - HelloController

Este é um projeto simples em **Spring Boot** que expõe uma API REST no endpoint `/test`, retornando a mensagem **"Hello, World!"**.

## 🚀 Tecnologias Utilizadas
- **Java**
- **Spring Boot**
- **Maven**
- **Git**

## 📂 Estrutura do Projeto
```
demo/
├── src/
│   ├── main/
│   │   ├── java/com/seuprojeto/
│   │   │   ├── DemoApplication.java
│   │   │   ├── controller/
│   │   │   │   ├── HelloController.java
│   │   ├── resources/
│   │   │   ├── application.properties
├── pom.xml
├── README.md
```

## 📌 Como Executar o Projeto

1. **Clone o repositório**:
   ```bash
   git clone https://github.com/DevsMendes/Projeto_Java.git
   cd Projeto_Java
   ```

2. **Compile e execute com Maven**:
   ```bash
   mvn spring-boot:run
   ```

3. **Acesse a API** no navegador ou via Postman:
   ```
   http://localhost:8080/test
   ```

## 📜 Código do HelloController

```java
package com.seuprojeto.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/test")
    public String helloWorld() {
        return "Hello, World!";
    }
}
```

## 🔗 Repositório no GitHub
[GitHub - Projeto Java](https://github.com/DevsMendes/Projeto_Java)

## ✨ Personalizações (Bônus)
- Adicionei seu nome ao `README.md`
- Estruturei a explicação para facilitar a execução

Se precisar de mais algo, me avise! 😃🚀
