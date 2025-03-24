# JAVA BÁSICO 

![imagen java ](https://www.melit.es/wp-content/uploads/2024/01/curso-java-01.jpg)

## Introducción

Este repositorio está diseñado para aquellos que están comenzando con Java. Aprenderás los conceptos básicos del lenguaje, incluyendo operadores, estructuras de control y arrays.

Para ejecutar los ejemplos sin necesidad de instalar Java en tu equipo, utilizaremos la plataforma en línea Paiza.io, que permite compilar y ejecutar código Java directamente desde el navegador.


## Requisitos

No necesitas instalar nada para comenzar, ya que Paiza.io es suficiente para compilar y ejecutar los ejemplos en línea. 

## Temas Cubiertos

### - Operadores en Java

Java incluye varios operadores para realizar operaciones matemáticas y lógicas:

* **Aritméticos** (+, -, *, /, %)
* **De incremento y decremento** (++, --)
* **Lógicos** (&&, ||, !)
* **Relacionales** (==, !=, >, <, >=, <=)
* **Condicional o ternario** (? : )

```java
int a = 10, b = 3;
System.out.println("Suma: " + (a + b));  // 13
System.out.println("Resta: " + (a - b));  // 7
```

### - Estructuras de Control

Para la toma de decisiones, Java utiliza:

1. **if-else**: Evalúa condiciones y ejecuta bloques de código.
2. **switch**: Alternativa para evaluar múltiples casos.

```java
int numero = 5;
if (numero > 0) {
    System.out.println("El número es positivo");
} else {
    System.out.println("El número es negativo o cero");
}
```

### - Bucles en Java

Los bucles permiten repetir acciones:

1. **for**: Para iteraciones con un número conocido de repeticiones.
2. **while**: Repite mientras una condición sea verdadera.
3. **do-while**: Ejecuta al menos una vez antes de evaluar la condición.

```java
for (int i = 0; i < 5; i++) {
    System.out.println("Iteración: " + i);
}
```

### - Arrays en Java

Los arrays permiten almacenar múltiples valores en una sola variable.

```java
int[] numeros = {1, 2, 3, 4, 5};
System.out.println("Primer número: " + numeros[0]);  // 1
```

***
## Recursos Adicionales

* https://paiza.io/es
* https://www.w3schools.com/java/
