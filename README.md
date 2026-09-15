
## Lanzar app 

Ejecutar comando desde la terminal 
```
./mvnw spring-boot:run
```

## Api para consumir por cliente 

# Catalo de productos
 
```
http://localhost:8080/api/productos/catalogo
```
## Monitoreo y Métricas con Spring Boot Actuator

La aplicación cuenta con **Spring Boot Actuator** para la supervisión del estado del servicio y el análisis de rendimiento de las peticiones HTTP.

### 1. Verificación de Estado (Health Check)
Permite validar si la aplicación y sus componentes esenciales están levantados y operando con normalidad.

* **Método:** `GET`
* **URL:** `http://localhost:8080/actuator/health`
* **Respuesta esperada:**
  ```json
  {
    "status": "UP"
  }
    ```
### 2. Métricas de Peticiones del Servidor (HTTP Server Requests)
Registra la telemetría del tráfico recibido por la API, incluyendo cantidad de llamados, tiempos de respuesta y códigos de estado.

* **Método:** `GET`
* **URL:** `http://localhost:8080/actuator/metrics/http.server.requests`

**Parámetros clave analizados:**
* `measurements.COUNT`: Número total de peticiones procesadas por el servidor desde su inicialización.
* `measurements.TOTAL_TIME`: Tiempo acumulado (en segundos) empleado en responder todas las solicitudes.
* `availableTags.uri`: Rutas consultadas, validando el registro del endpoint de negocio (`/api/productos/catalogo`).
* `availableTags.status`: Códigos de respuesta HTTP registrados (por ejemplo, `200` y `404`).  