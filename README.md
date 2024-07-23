# Prueba Tecnica Programador Jr. - Efiempresa
# Por: Leandro Perez

## Descripcion

Esta prueba técnica contiene dos desafíos de programación en Java.
A continuación se detalla cada uno de los desafíos y cómo fueron abordados.

## Requisitos
- JDK 8 o superior
- JUnit 4

## Estructura del Proyecto
El proyecto contiene las siguientes clases y sus respectivas pruebas unitarias:

- Challenge1: Contiene el primer reto.
- Challenge1Test: Pruebas unitarias para el primer reto.
- Challenge2: Contiene el segundo reto.
- Challenge2Test: Pruebas unitarias para el segundo reto.
- Student: Clase auxiliar para representar a los estudiantes.

## Reto 1:
El primer desafío consiste en determinar si es posible escribir una nota (`note`)
utilizando las palabras disponibles en una revista (`magazine`).

## Solucion
La solucion se implementa en la clase Challenge1 y realiza los siguientes pasos:

1. Convierte ambos textos a minusculas para evitar problemas con mayusculas/minusculas.
2. Divide ambos textos en palabras dentro de un arreglo usando un regex para eliminar espacios.
3. Cuenta la frecuencia de cada palabra en la revista usando un HashMap.
4. Verifica si hay suficientes palabras en la revista para escribir la nota, disminuyendo el contador de cada palabra en el HashMap a medida que se usan.

## Reto 2:
El segundo desafío consiste en enviar correos electrónicos a estudiantes de diferentes cursos
(Matemáticas, Francés y ambos) que se encuentren en el campus de Málaga, asegurándose de no enviar múltiples correos
al mismo estudiante.

## Solucion
La solución se implementa en la clase Challenge2 y realiza los siguientes pasos:

1. Filtra los estudiantes por campus y curso.
2. Envía un correo electrónico a cada estudiante filtrado, asegurándose de no enviar múltiples correos al mismo estudiante usando un HashSet.

Se han creado pruebas unitarias para el ambos desafíos utilizando JUnit.
