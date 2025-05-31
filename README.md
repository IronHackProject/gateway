#  API Gateway
- Este microservicio actúa como punto de entrada principal al sistema. Recibe todas las solicitudes externas y las 
  enruta al microservicio correspondiente mediante rutas configuradas y descubrimiento de servicios a través de 
  Eureka.  
## 🚀 Funcionalidades
Redirección de rutas a los distintos microservicios (User, Order, Product, etc.).

Descubrimiento de servicios con Eureka Client.

## 🛠️ Tecnologías utilizadas
Java 21  

Spring Boot

Spring Cloud Gateway

Eureka Client

Maven

## ⚙️ Configuración de rutas
Las rutas están definidas en application.properties y redirigen las peticiones hacia los microservicios registrados en 
Eureka.

## ▶️ Cómo ejecutar el Gateway
```bash
    ./mvnw spring-boot:run
```
- Asegúrate de que el Eureka Server esté corriendo antes de iniciar el Gateway.

## 👨‍💻 Autor
-[DevJerryX](https://github.com/planetWeb252)
