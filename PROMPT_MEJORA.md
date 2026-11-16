# Prompt para Mejorar el Codigo Base

Copia y pega el contenido del bloque de abajo en un asistente de IA (Claude, ChatGPT)
para obtener el proyecto completo y arrancable. Guarda los archivos que te devuelva en la
carpeta del repo, respetando exactamente las rutas.

Si preferis trabajar en tu editor con un agente local (Claude Code, Cursor, Copilot), usa `AGENTS.md` en vez de este archivo: dice lo mismo pero para que escriba los archivos en disco.

## Las dos reglas que no se negocian

1. **Completa el boilerplate.** Todo lo que el proyecto necesita para compilar y arrancar: manifiesto de dependencias, punto de entrada, configuracion, capa de interfaz, y las capas del patron arquitectonico declarado. Eso es andamiaje y es tu trabajo.
2. **NO resuelvas el reto.** Los entregables de las fases son el trabajo de la persona. El hueco pedagogico se deja como esta: el proyecto arranca, pero lo que el reto pide implementar NO esta implementado.

Dicho de otra forma: si algo impide compilar, arreglalo. Si algo es logica de negocio incompleta, validaciones ausentes, un secreto hardcodeado o un patron mejorable, dejalo exactamente como esta — es lo que la persona tiene que encontrar.

## Superficie de practica — NO resuelvas

Estos archivos SON el ejercicio de la persona. No los implementes; deja stubs.

- `src/main/java/aplicacion/servicios/LibroServicio.java` — La fase "Implementación básica de la API" se implementa aqui: este archivo es el ejercicio.
- `src/main/java/infraestructura/excepciones/LibroNoEncontradoException.java` — La fase "Adición de validaciones y manejo de errores" se implementa aqui: este archivo es el ejercicio.

## Como saber que terminaste

```bash
mvn -q -B -DskipTests -Dspring-boot.repackage.skip=true package
```

Ese comando corriendo sin errores es la definicion de "listo".

---

```
## Briefing del reto (autoridad)
Este bloque manda sobre los archivos adjuntos. El stack y el rol salen de AQUÍ, no de un topic genérico ni de markdown placeholder.

### Perfil
Chapter Backend, Especialidad Java, Tecnología Spring Boot, Junior L1

### Brecha de conocimiento
Construye APIs REST con validaciones y manejo de errores.

### Reto
- Tema: api-de-inventario-de-biblioteca
- Seniority: junior-l1
- Tipo: practical
- Título: Desarrollo de API de inventario de biblioteca
- Tiempo estimado: 8 horas

### Fases (trabajo del HUMANO — PROHIBIDO completarlas)
No implementes estos entregables. Dejalos como hueco pedagógico. El asistente solo materializa el proyecto arrancable para que el participante pueda trabajar.
- Fase 1: Implementación básica de la API — objetivo: Crear las endpoints básicas para gestionar el inventario de libros. — entregable (NO resolver): Endpoints básicas para gestión de inventario funcionando.
- Fase 2: Adición de validaciones y manejo de errores — objetivo: Incorporar validaciones y manejo de errores en las endpoints. — entregable (NO resolver): Endpoints con validaciones y manejo de errores implementados.
- Fase 3: Optimización y refactorización — objetivo: Optimizar y refactorizar el código para mejorar la eficiencia y mantenibilidad. — entregable (NO resolver): Código optimizado y refactorizado.

Eres un asistente experto en análisis, corrección y generación de archivos de cualquier tipo:
código fuente, documentación, hojas de cálculo, documentos Word, configuraciones, entre otros.
Voy a enviarte una cadena de texto que contiene uno o más archivos. Cada archivo está delimitado por un marcador con el siguiente formato:
// === ARCHIVO: ruta/del/archivo.extension ===
o también puede aparecer como:
## === ARCHIVO: ruta/del/archivo.extension ===
Lo que sigue al marcador puede ser:

El contenido real del archivo (código, texto, YAML, etc.)
Una descripción en lenguaje natural de lo que debe contener el archivo


TU TAREA
PASO 0 — ¿Esto es un proyecto o una carcasa?
Antes de extraer archivos, leé el Briefing (si está) y diagnosticá el adjunto.

Es CARCASA si ocurre CUALQUIERA de estas:
- No hay manifiesto de dependencias del stack del briefing (manifest.json de VTEX IO / package.json / pom.xml / build.gradle / requirements.txt / go.mod / *.tf / *.csproj, según corresponda)
- Hay un "binario" que en realidad es un comentario ("no puede ser mostrado como texto plano", placeholder .fig/.docx vacío)
- Los markdowns ya completan entregables de fases posteriores ("se implementó fade-in", lista de áreas ya resuelta)

Si es CARCASA:
- MATERIALIZÁ un proyecto que arranca en el stack del briefing (VTEX IO Store Framework, Angular, Terraform, pytest, Nest, etc.). Incluí manifiesto, punto de entrada y capa de interfaz reales.
- NO copies los markdowns de "solución" como si fueran el producto. Son ruido de generación.
- NO resuelvas las fases del briefing (están marcadas PROHIBIDO). Dejá el hueco pedagógico: el flujo existe, las microinteracciones/calidad/infra que el reto pide NO están hechas.
- Después seguí al PASO 5 (entrega de archivos).

Si es un proyecto REAL (manifiesto + código que compila o arranca):
- Seguí PASO 1 en adelante. 🔴 compilación sí. 🟡 pedagógico no.

PASO 1 — Detección y extracción
Identifica todos los archivos presentes en la cadena. Para cada archivo extrae:

Su ruta completa (ej: src/main/java/com/pragma/Service.java)
Su contenido o descripción

PASO 2 — Clasificación por tipo
Clasifica cada archivo en una de estas categorías:
A) Código fuente (Java, Python, TypeScript, JavaScript, Kotlin, etc.)
B) Configuración / documentación (YAML, properties, Markdown, JSON, txt, etc.)
C) Excel (.xlsx, .xls, .csv)
D) Word (.docx, .doc)
E) Otro tipo de archivo binario o especial
PASO 3 — Clasificación de errores en código fuente

Objetivo prioritario: que el proyecto compile. No corrijas flujo de negocio ni lógica funcional.

Antes de modificar cualquier archivo de código fuente, clasifica cada problema encontrado en una de estas dos categorías:
🔴 ERROR DE COMPILACIÓN — corregir siempre
Son errores que impiden que el proyecto arranque, sin valor pedagógico:

Import faltante o incorrecto
Clase, método o variable referenciada que no existe en ningún archivo del proyecto
Error de sintaxis
Anotación con atributos inválidos
Dependencia ausente en pom.xml, package.json, etc.
Archivo referenciado que no existe y debe ser creado con implementación mínima

→ CORREGIR estos errores.
🟡 PROBLEMA FUNCIONAL O DE CALIDAD — preservar siempre
Son problemas que no impiden compilar. Pueden ser intencionales para el aprendizaje:

Clave secreta hardcodeada ("secret", "password123")
API deprecada que funciona pero tiene reemplazo moderno
Lógica de negocio incorrecta o incompleta
Código redundante o de baja legibilidad
Falta de validaciones en flujo de negocio
Patrones de diseño incorrectos pero funcionales
Concurrencia no segura
Configuración funcional pero no óptima

→ PRESERVAR tal cual. No corregir, no mejorar, no comentar.
PASO 4 — Procesamiento según tipo de archivo
Tipo A — Código fuente
Aplica únicamente las correcciones clasificadas como 🔴 ERROR DE COMPILACIÓN.
No alteres ningún elemento clasificado como 🟡 PROBLEMA FUNCIONAL O DE CALIDAD.
Si falta un archivo referenciado, créalo con la implementación mínima necesaria para compilar.
Tipo B — Configuración / documentación
Extrae el contenido tal cual, sin modificaciones salvo errores evidentes de sintaxis
(ej: YAML mal indentado).
Tipo C — Excel (.xlsx)
Si viene con contenido real, genera el archivo respetando ese contenido.
Si viene con descripción en lenguaje natural, genera un archivo Excel funcional con:

Fila de encabezados en negrita con color de fondo distintivo
Columnas con ancho ajustado al contenido
Tipos de dato correctos por columna
Validaciones si la descripción lo indica
Hojas nombradas descriptivamente si hay más de una
Filas de ejemplo si no hay datos reales

Tipo D — Word (.docx)
Si viene con contenido real, genera el archivo respetando ese contenido.
Si viene con descripción en lenguaje natural, genera un documento Word funcional con:

Estilos de título (Título 1, Título 2) para jerarquía de secciones
Fuente legible (Calibri o equivalente), tamaño 11-12pt para cuerpo
Márgenes estándar
Tabla de contenido si tiene múltiples secciones
Tablas con encabezados en negrita si aplica

Tipo E — Otro
Genera el archivo con el contenido o estructura más apropiada según la descripción.
PASO 5 — Entrega de archivos
Entregá cada archivo con su ruta completa, respetando exactamente la estructura de rutas
indicada por los marcadores: un bloque por archivo, precedido por su ruta. No generes ZIPs
ni archivos adjuntos.
La entrega debe incluir:

Archivos de código con únicamente los errores de compilación corregidos
Archivos de configuración y documentación sin cambios
Archivos nuevos creados para resolver dependencias de compilación faltantes
Archivos Excel y Word generados desde descripción

IMPORTANTE: Entregá los archivos completos al finalizar. No preguntes si el usuario
quiere recibirlos. Simplemente entregalos; No debes desplegar en el chat el resumen de lo que arreglaste, solo entregá los archivos.

REGLAS IMPORTANTES

No omitas ningún archivo aunque no tenga errores ni modificaciones
Respeta los nombres y rutas exactas indicadas por los marcadores
Si un archivo no tiene marcador claro, infiere el nombre desde su contenido
Si la cadena contiene solo documentación, placeholders o binarios fake, NO la reproduzcas:
aplicá PASO 0 (materializar el proyecto del briefing). Reproducir la carcasa es un fallo.
No agregues texto después del último archivo entregado
No preguntes si el usuario quiere los archivos: simplemente entregalos siempre
Si detectas que falta un archivo de configuración necesario para compilar
(pom.xml, package.json, requirements.txt, build.gradle, etc.), créalo e inclúyelo
inferiendo su contenido desde los imports y frameworks detectados en el código
Nunca corrijas problemas 🟡 aunque parezcan obvios o fáciles de mejorar.
El participante que recibirá este proyecto los debe encontrar y resolver él mismo.


INPUT
Aquí está la cadena con los archivos:

// === ARCHIVO: src/main/java/Application.java ===
package com.pragma.biblioteca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

// === ARCHIVO: pom.xml ===
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>3.4.13</version>
        <relativePath/>
    </parent>

    <groupId>com.example</groupId>
    <artifactId>reto</artifactId>
    <version>1.0.0</version>
    <name>reto</name>

    <properties>
        <java.version>21</java.version>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    </properties>

    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.postgresql</groupId>
            <artifactId>postgresql</artifactId>
        </dependency>
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springdoc</groupId>
            <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
            <version>2.10.0</version>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-actuator</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-jpa</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-validation</artifactId>
        </dependency>
    </dependencies>

    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>
        </plugins>
    </build>
</project>

// === ARCHIVO: src/main/java/dominio/repositorios/LibroRepositorio.java ===
package dominio.repositorios;

import dominio.Libro;
import java.util.List;
import java.util.Optional;

/**
 * Puerto para operaciones de persistencia de libros.
 * Define las operaciones que el dominio necesita para interactuar con el almacenamiento de libros.
 */
public interface LibroRepositorio {

    /**
     * Guarda un libro en el repositorio.
     * @param libro el libro a guardar
     * @return el libro guardado
     */
    Libro guardar(Libro libro);

    /**
     * Busca un libro por su identificador único.
     * @param id el identificador del libro
     * @return un Optional que contiene el libro si existe, o vacío si no existe
     */
    Optional<Libro> buscarPorId(Long id);

    /**
     * Busca todos los libros disponibles en el repositorio.
     * @return una lista de todos los libros
     */
    List<Libro> buscarTodos();

    /**
     * Elimina un libro del repositorio por su identificador.
     * @param id el identificador del libro a eliminar
     */
    void eliminar(Long id);

    /**
     * Busca libros por su título.
     * @param titulo el título o parte del título a buscar
     * @return una lista de libros que coinciden con el título
     */
    List<Libro> buscarPorTitulo(String titulo);

    /**
     * Busca libros por su autor.
     * @param autor el autor o parte del autor a buscar
     * @return una lista de libros que coinciden con el autor
     */
    List<Libro> buscarPorAutor(String autor);

    /**
     * Verifica si un libro está disponible para préstamo.
     * @param id el identificador del libro
     * @return true si el libro está disponible, false en caso contrario
     */
    boolean estaDisponible(Long id);
}

// === ARCHIVO: src/main/java/infraestructura/dto/LibroDTO.java ===
package infraestructura.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import java.time.Year;

/**
 * DTO para transferir datos de libros entre capas.
 * Contiene la información básica de un libro para operaciones de lectura.
 */
public record LibroDTO(
    @NotNull(message = "El ID del libro no puede ser nulo")
    Long id,

    @NotBlank(message = "El título del libro no puede estar vacío")
    String titulo,

    @NotBlank(message = "El autor del libro no puede estar vacío")
    String autor,

    @NotBlank(message = "El ISBN del libro no puede estar vacío")
    String isbn,

    @NotNull(message = "El año de publicación no puede ser nulo")
    Year añoPublicacion,

    @NotBlank(message = "La editorial no puede estar vacía")
    String editorial,

    @Positive(message = "La cantidad disponible debe ser un número positivo")
    int cantidadDisponible
) {
    // Constructor compacto proporcionado por el record
}

// === ARCHIVO: src/main/java/infraestructura/dto/LibroRequest.java ===
package infraestructura.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import java.time.Year;

/**
 * DTO para recibir solicitudes de creación o actualización de libros.
 * Contiene los datos necesarios para crear o modificar un libro.
 */
public record LibroRequest(
    @NotBlank(message = "El título del libro no puede estar vacío")
    String titulo,

    @NotBlank(message = "El autor del libro no puede estar vacío")
    String autor,

    @NotBlank(message = "El ISBN del libro no puede estar vacío")
    String isbn,

    @NotNull(message = "El año de publicación no puede ser nulo")
    Year añoPublicacion,

    @NotBlank(message = "La editorial no puede estar vacía")
    String editorial,

    @Positive(message = "La cantidad total debe ser un número positivo")
    int cantidadTotal
) {
    // Constructor compacto proporcionado por el record
}

// === ARCHIVO: src/main/java/infraestructura/dto/PrestamoDTO.java ===
package infraestructura.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import java.time.LocalDate;

/**
 * DTO para transferir datos de préstamos entre capas.
 * Contiene la información de un préstamo de libro.
 */
public record PrestamoDTO(
    @NotNull(message = "El ID del préstamo no puede ser nulo")
    Long id,

    @NotNull(message = "El ID del libro no puede ser nulo")
    Long libroId,

    @NotBlank(message = "El nombre del usuario no puede estar vacío")
    String usuario,

    @NotNull(message = "La fecha de préstamo no puede ser nula")
    LocalDate fechaPrestamo,

    @NotNull(message = "La fecha de devolución no puede ser nula")
    LocalDate fechaDevolucion,

    @NotBlank(message = "El estado del préstamo no puede estar vacío")
    String estado
) {
    // Constructor compacto proporcionado por el record
}

// === ARCHIVO: src/main/java/aplicacion/servicios/LibroServicio.java ===
package aplicacion.servicios;

import dominio.repositorios.LibroRepositorio;
import infraestructura.dto.LibroDTO;
import infraestructura.dto.LibroRequest;

import java.util.List;

/**
 * Servicio de aplicación para gestionar operaciones de libros.
 * Coordina la lógica de negocio relacionada con el inventario de libros.
 */
public class LibroServicio {

    private final LibroRepositorio libroRepositorio;

    public LibroServicio(LibroRepositorio libroRepositorio) {
        this.libroRepositorio = libroRepositorio;
    }

    // TODO(reto): Implementar el método crearLibro que recibe un LibroRequest
    // y retorna un LibroDTO. Debe validar que no exista un libro con el mismo ISBN
    // antes de guardar. Usar el repositorio para persistir.
    public LibroDTO crearLibro(LibroRequest request) {
        throw new UnsupportedOperationException("Implementar crearLibro");
    }

    // TODO(reto): Implementar el método obtenerLibroPorId que recibe un Long id
    // y retorna un Optional<LibroDTO>. Debe usar el repositorio para buscar.
    public LibroDTO obtenerLibroPorId(Long id) {
        throw new UnsupportedOperationException("Implementar obtenerLibroPorId");
    }

    // TODO(reto): Implementar el método obtenerTodosLosLibros que retorna
    // una lista de LibroDTO con todos los libros del repositorio.
    public List<LibroDTO> obtenerTodosLosLibros() {
        throw new UnsupportedOperationException("Implementar obtenerTodosLosLibros");
    }

    // TODO(reto): Implementar el método actualizarLibro que recibe un id y un
    // LibroRequest. Debe verificar que el libro existe antes de actualizar.
    public LibroDTO actualizarLibro(Long id, LibroRequest request) {
        throw new UnsupportedOperationException("Implementar actualizarLibro");
    }

    // TODO(reto): Implementar el método eliminarLibro que recibe un id y
    // elimina el libro del repositorio si existe.
    public void eliminarLibro(Long id) {
        throw new UnsupportedOperationException("Implementar eliminarLibro");
    }

    // TODO(reto): Implementar el método buscarPorTitulo que recibe un String
    // titulo y retorna una lista de LibroDTO con los libros que coincidan.
    public List<LibroDTO> buscarPorTitulo(String titulo) {
        throw new UnsupportedOperationException("Implementar buscarPorTitulo");
    }

    // TODO(reto): Implementar el método buscarPorAutor que recibe un String
    // autor y retorna una lista de LibroDTO con los libros que coincidan.
    public List<LibroDTO> buscarPorAutor(String autor) {
        throw new UnsupportedOperationException("Implementar buscarPorAutor");
    }

    // TODO(reto): Implementar el método verificarDisponibilidad que recibe un
    // id y retorna true si el libro está disponible para préstamo.
    public boolean verificarDisponibilidad(Long id) {
        throw new UnsupportedOperationException("Implementar verificarDisponibilidad");
    }
}

// === ARCHIVO: src/main/java/infraestructura/excepciones/LibroNoEncontradoException.java ===
package infraestructura.excepciones;


import dominio.Libro;
/**
 * Excepción lanzada cuando no se encuentra un libro en el sistema.
 * Se utiliza para manejar errores 404 en las operaciones de libro.
 */
public class LibroNoEncontradoException extends RuntimeException {

    private final Long libroId;

    // TODO(reto): Implementar el constructor que recibe el ID del libro
    // y genera un mensaje descriptivo. Guardar el ID en el campo libroId.
    public LibroNoEncontradoException(Long libroId) {
        super("Libro no encontrado con ID: " + libroId);
        this.libroId = libroId;
    }

    // TODO(reto): Implementar un segundo constructor que recibe el ID y un mensaje personalizado.
    public LibroNoEncontradoException(Long libroId, String mensaje) {
        super(mensaje);
        this.libroId = libroId;
    }

    // TODO(reto): Implementar el getter para libroId.
    public Long getLibroId() {
        throw new UnsupportedOperationException("Implementar getLibroId");
    }
}

// === ARCHIVO: src/main/resources/application.yml ===
spring:
  application:
    name: biblioteca-api
  
  datasource:
    url: jdbc:postgresql://localhost:5432/biblioteca
    username: postgres
    password: postgres
    driver-class-name: org.postgresql.Driver
    hikari:
      maximum-pool-size: 10
      minimum-idle: 5
      idle-timeout: 300000
      connection-timeout: 20000
      max-lifetime: 1200000
  
  jpa:
    hibernate:
      ddl-auto: update
    show-sql: false
    properties:
      hibernate:
        dialect: org.hibernate.dialect.PostgreSQLDialect
        format_sql: true
        jdbc:
          batch_size: 20
        order_inserts: true
        order_updates: true
  
  jackson:
    serialization:
      write-dates-as-timestamps: false
    deserialization:
      fail-on-unknown-properties: false
    default-property-inclusion: non_null

server:
  port: 8080
  servlet:
    context-path: /api
    encoding:
      charset: UTF-8
      enabled: true
      force: true

management:
  endpoints:
    web:
      exposure:
        include: health,info,metrics
  endpoint:
    health:
      show-details: when_authorized

springdoc:
  api-docs:
    path: /api-docs
  swagger-ui:
    path: /swagger-ui.html
    enabled: true
    tags-sorter: alpha
    operations-sorter: alpha

logging:
  level:
    root: INFO
    com.example: DEBUG
    org.springframework.web: DEBUG
    org.hibernate.SQL: DEBUG
    org.hibernate.type.descriptor.sql.BasicBinder: TRACE
  pattern:
    console: "%d{yyyy-MM-dd HH:mm:ss} - %msg%n"
    file: "%d{yyyy-MM-dd HH:mm:ss} [%thread] %-5level %logger{36} - %msg%n"

// === ARCHIVO: src/main/java/resources/application.yml ===
spring:
  application:
    name: reto-biblioteca

  datasource:
    url: jdbc:postgresql://localhost:5432/biblioteca
    username: biblioteca_user
    password: biblioteca_pass
    driver-class-name: org.postgresql.Driver
    hikari:
      maximum-pool-size: 10
      minimum-idle: 5
      connection-timeout: 30000
      idle-timeout: 600000
      max-lifetime: 1800000

  jpa:
    hibernate:
      ddl-auto: update
    show-sql: false
    properties:
      hibernate:
        dialect: org.hibernate.dialect.PostgreSQLDialect
        format_sql: true
        jdbc:
          batch_size: 20
        order_inserts: true
        order_updates: true

  jackson:
    serialization:
      write-dates-as-timestamps: false
    deserialization:
      fail-on-unknown-properties: false
    default-property-inclusion: non_null

server:
  port: 8080
  servlet:
    context-path: /api
    encoding:
      charset: UTF-8
      enabled: true
      force: true

management:
  endpoints:
    web:
      exposure:
        include: health,info,metrics,prometheus
      base-path: /actuator
  endpoint:
    health:
      show-details: always
      show-components: always
  health:
    livenessState:
      enabled: true
    readinessState:
      enabled: true

springdoc:
  api-docs:
    path: /v3/api-docs
  swagger-ui:
    path: /swagger-ui.html
    operationsSorter: method
    tagsSorter: alpha
    tryItOutEnabled: true

logging:
  level:
    root: INFO
    com.example: DEBUG
    org.springframework.web: DEBUG
    org.hibernate.SQL: DEBUG
    org.hibernate.type.descriptor.sql.BasicBinder: TRACE
  pattern:
    console: "%d{yyyy-MM-dd HH:mm:ss} - %msg%n"
    file: "%d{yyyy-MM-dd HH:mm:ss} [%thread] %-5level %logger{36} - %msg%n"

spring:
  profiles:
    active: dev

// === ARCHIVO: src/main/java/dominio/Libro.java ===
package dominio;

import java.time.Year;
import java.util.Objects;

public class Libro {
    private Long id;
    private String titulo;
    private String autor;
    private String isbn;
    private Year añoPublicacion;
    private String editorial;
    private int cantidadTotal;
    private int cantidadDisponible;

    public Libro(Long id, String titulo, String autor, String isbn, Year añoPublicacion,
                 String editorial, int cantidadTotal) {
        this.id = id;
        this.titulo = Objects.requireNonNull(titulo, "El título no puede ser nulo");
        this.autor = Objects.requireNonNull(autor, "El autor no puede ser nulo");
        this.isbn = Objects.requireNonNull(isbn, "El ISBN no puede ser nulo");
        this.añoPublicacion = Objects.requireNonNull(añoPublicacion, "El año de publicación no puede ser nulo");
        this.editorial = Objects.requireNonNull(editorial, "La editorial no puede ser nula");
        if (cantidadTotal <= 0) {
            throw new IllegalArgumentException("La cantidad total debe ser positiva");
        }
        this.cantidadTotal = cantidadTotal;
        this.cantidadDisponible = cantidadTotal;
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public Year getAñoPublicacion() {
        return añoPublicacion;
    }

    public String getEditorial() {
        return editorial;
    }

    public int getCantidadTotal() {
        return cantidadTotal;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void prestar() {
        if (cantidadDisponible <= 0) {
            throw new IllegalStateException("No hay copias disponibles para préstamo");
        }
        cantidadDisponible--;
    }

    public void devolver() {
        if (cantidadDisponible >= cantidadTotal) {
            throw new IllegalStateException("Todas las copias ya están disponibles");
        }
        cantidadDisponible++;
    }

    public boolean estaDisponible() {
        return cantidadDisponible > 0;
    }

    public void actualizarCantidadTotal(int nuevaCantidad) {
        if (nuevaCantidad <= 0) {
            throw new IllegalArgumentException("La cantidad total debe ser positiva");
        }
        if (nuevaCantidad < (cantidadTotal - cantidadDisponible)) {
            throw new IllegalArgumentException("No se puede reducir la cantidad total por debajo de las copias prestadas");
        }
        this.cantidadTotal = nuevaCantidad;
        this.cantidadDisponible = nuevaCantidad - (cantidadTotal - cantidadDisponible);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return Objects.equals(id, libro.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
```
