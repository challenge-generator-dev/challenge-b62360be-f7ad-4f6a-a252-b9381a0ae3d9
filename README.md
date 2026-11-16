# Desarrollo de API de inventario de biblioteca

La API debe gestionar el inventario de libros en una biblioteca, permitiendo préstamos y devoluciones. Los actores involucrados son Bibliotecario y Usuario. La API debe validar los datos de entrada y manejar los errores de forma adecuada.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | api-de-inventario-de-biblioteca |
| **Nivel** | junior-l1 |
| **Tipo** | practical |
| **Tiempo estimado** | 8 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y entregará cada archivo con su ruta.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: JDK 17+, Maven 3.9+, IDE con soporte Java.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y entregará cada archivo con su ruta. Guárdalos en la carpeta donde quieras trabajar, respetando las rutas.
- Ejecuta `mvn compile` en la raíz. Si no hay errores, estás listo.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no entrega todos los archivos al terminar el análisis, escríbele: "entrégame todos los archivos con su ruta".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Implementación básica de la API

**Objetivo:** Crear las endpoints básicas para gestionar el inventario de libros.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Implementa las endpoints para añadir, eliminar y consultar libros en el inventario.
- Asegúrate de que las endpoints respondan adecuadamente a las solicitudes válidas e inválidas.

**Entregable:** Endpoints básicas para gestión de inventario funcionando.

<details>
<summary>Pistas de conocimiento</summary>

- Considera cómo estructurar la información de los libros y cómo representar los préstamos y devoluciones.
- Piensa en las posibles validaciones que se deben realizar en los datos de entrada.

</details>

### Fase 2: Adición de validaciones y manejo de errores

**Objetivo:** Incorporar validaciones y manejo de errores en las endpoints.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Añade validaciones para asegurar que los datos de entrada son correctos.
- Implementa el manejo de errores para que la API responda adecuadamente a las solicitudes inválidas.

**Entregable:** Endpoints con validaciones y manejo de errores implementados.

<details>
<summary>Pistas de conocimiento</summary>

- Considera los posibles casos de error y cómo manejarlos de forma amigable para el usuario.
- Piensa en las validaciones necesarias para asegurar la integridad de los datos.

</details>

### Fase 3: Optimización y refactorización

**Objetivo:** Optimizar y refactorizar el código para mejorar la eficiencia y mantenibilidad.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Identifica áreas de mejora en el código y realiza las optimizaciones necesarias.
- Refactoriza el código para mejorar su estructura y legibilidad.

**Entregable:** Código optimizado y refactorizado.

<details>
<summary>Pistas de conocimiento</summary>

- Considera cómo puedes mejorar la eficiencia del código sin sacrificar la legibilidad.
- Piensa en las mejores prácticas de programación y cómo aplicarlas en tu código.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es una API REST y cómo se utiliza en este contexto?
- **paraQueSirve**: ¿Para qué sirven las validaciones en una API REST?
- **comoSeUsa**: ¿Cómo se implementa el manejo de errores en una API REST?
- **erroresComunes**: ¿Cuáles son los errores comunes que pueden ocurrir en una API REST y cómo se pueden prevenir?
- **queDecisionesImplica**: ¿Qué decisiones implica la optimización y refactorización del código de una API REST?

## Criterios de Evaluacion

- Implementación de endpoints básicas para gestión de inventario.
- Incorporación de validaciones en las endpoints.
- Manejo de errores en las endpoints.
- Optimización y refactorización del código.

## Como trabajar con un asistente de IA

Hay dos caminos, elegi uno:

- **AGENTS.md** (recomendado) — instrucciones nativas del repo. Abri esta carpeta con tu agente local (Claude Code, Cursor, Codex, Copilot, Gemini) y las carga solo. Sabe que archivos faltan y con que comando se verifica, y completa el scaffold escribiendo en disco.
- **PROMPT_MEJORA.md** — para copiar y pegar en un chat (claude.ai, ChatGPT) si no tenes un agente en el IDE. Declara lo mismo que AGENTS.md; los archivos que te devuelva el chat los guardas en esta carpeta respetando las rutas.

Ninguno de los dos resuelve las fases del reto: eso es tu trabajo.

## Verificacion

El proyecto esta listo para trabajar cuando este comando corre sin errores:

```bash
mvn -q -B -DskipTests -Dspring-boot.repackage.skip=true package
```

---

*Reto generado automaticamente por Challenge Generator - Pragma*
