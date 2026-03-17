# proyecto_reactivo 🚀

API REST reactiva construida con **Spring WebFlux** y un dashboard web moderno para visualizar productos en tiempo real.

## 🛠️ Tecnologías

- Java 17
- Spring Boot 3.4.3
- Spring WebFlux (programación reactiva)
- Project Reactor (Flux / Mono)
- Netty (servidor embebido)
- Maven
- HTML + CSS + JavaScript (frontend)

## 📁 Estructura del proyecto

```
src/
└── main/
    ├── java/com/example/demo/
    │   ├── ProyectoReactivoApplication.java
    │   ├── controller/
    │   │   └── ProductoController.java
    │   ├── service/
    │   │   └── ProductoService.java
    │   └── model/
    │       └── Producto.java
    └── resources/
        ├── static/
        │   └── index.html
        └── application.properties
```

## ▶️ Cómo ejecutar

### 1. Clonar el repositorio

```bash
git clone https://github.com/TuUsuario/proyecto_reactivo.git
cd proyecto_reactivo
```

### 2. Ejecutar con Maven

```bash
mvn spring-boot:run
```

### 3. Abrir en el navegador

```
http://localhost:8080
```

## 🌐 Endpoints disponibles

| Método | Endpoint | Descripción |
|--------|----------|-------------|
| GET | `/api/productos` | Retorna todos los productos |
| GET | `/api/productos/{id}` | Retorna un producto por ID |

### Ejemplo de respuesta

```json
[
  {"id":"1","nombre":"Laptop","precio":1200.0},
  {"id":"2","nombre":"Mouse","precio":25.0},
  {"id":"3","nombre":"Teclado","precio":75.0}
]
```

## 🔄 Conceptos de programación reactiva

| Tipo | Descripción |
|------|-------------|
| `Mono<T>` | Emite 0 o 1 elemento |
| `Flux<T>` | Emite 0 a N elementos |

## 📸 Vista del dashboard

El proyecto incluye un dashboard web moderno accesible desde `http://localhost:8080` que muestra:

- Total de productos en catálogo
- Precio promedio
- Valor total del inventario
- Tarjetas individuales por producto

## 📋 Requisitos

- Java 17 o superior
- Maven 3.6 o superior
- Spring Tool Suite 4 (opcional)
