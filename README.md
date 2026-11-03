# Triangulos-Java

Programa en Java, ejecutado por consola, que determina el tipo de triángulo (equilátero, isósceles o escaleno) a partir de las longitudes de sus tres lados.

- **Autor:** Andrés Felipe Gutiérrez Rivera

## Contenido del proyecto

| Archivo | Descripción |
|---|---|
| `TriangulosJava.java` | Programa principal que clasifica triángulos. |
| `HelloWorld.java` | Programa de prueba inicial que imprime "Hello World". |
| `.gitignore` | Excluye archivos compilados (`.class`), de configuración de IDE/Java y del sistema operativo. |

## Funcionamiento

1. Solicita por teclado los tres lados del triángulo.
2. Cada lado debe ser un número mayor que cero (acepta punto o coma decimal). Si la entrada no es válida, vuelve a pedir ese lado.
3. Verifica que los lados formen un triángulo válido con la **desigualdad triangular**: cada lado debe ser menor que la suma de los otros dos. Si no se cumple, informa el error y vuelve a pedir los tres lados.
4. Clasifica el triángulo:
   - **Equilátero:** los tres lados son iguales.
   - **Isósceles:** exactamente dos lados son iguales.
   - **Escaleno:** los tres lados son diferentes.
5. Pregunta si se desea continuar (`S`) o finalizar (`N`).

### Métodos de `TriangulosJava`

| Método | Función |
|---|---|
| `main` | Controla el flujo: lectura, validación, resultado y repetición. |
| `leerLado` | Lee y valida un número positivo desde el teclado. |
| `esTrianguloValido` | Aplica la desigualdad triangular. |
| `tipoTriangulo` | Devuelve `equilatero`, `isosceles` o `escaleno`. |
| `deseaContinuar` | Pregunta si se repite el programa (`S`/`N`). |

## Requisitos

- JDK 8 o superior.

## Compilación y ejecución

```bash
javac TriangulosJava.java
java TriangulosJava
```

## Ejemplo de uso

```text
Ingrese el lado 1: 1
Ingrese el lado 2: 2
Ingrese el lado 3: 3
Los lados ingresados no forman un triangulo valido. Intente de nuevo.

Ingrese el lado 1: 3
Ingrese el lado 2: 3
Ingrese el lado 3: 4
El triangulo es isosceles.

Desea continuar? (S = si, N = no): n
Programa finalizado.
```
