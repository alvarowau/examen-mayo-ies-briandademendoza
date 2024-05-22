# IES Brianda de Mendoza - ELDAM - Programación - mayo 2024-(---)

## Ejercicio obligatorio

Desarrolla un programa que gestione una lista de productos de un inventario. Debes implementar las siguientes clases:

### Producto:
Esta clase representará un producto con los siguientes atributos: id (int), nombre (String), precio (double) y stock (int). Debe incluir métodos para acceder y modificar estos atributos.

### Producto Alimenticio:
Esta clase hereda de la clase Producto e incluye un atributo adicional fechaCaducidad (String). Además, debe sobrescribir el método toString() para incluir esta información.

### Inventario:
Contendrá un ArrayList de objetos de tipo Producto. Esta clase debe tener métodos para agregar un producto al inventario, eliminar un producto del inventario, mostrar la lista de productos en el inventario y actualizar el stock de un producto en el inventario.

### Almacen:
Esta clase tendrá el programa principal con el menú de opciones siguiente:

1. Agregar un nuevo producto al inventario.
2. Eliminar un producto del inventario.
3. Mostrar la lista de productos del inventario.
4. Actualizar el stock de un producto en el inventario.
5. Guardar la lista de productos en un fichero.
6. Recuperar la lista de productos desde un fichero.
7. Salir del programa.

En las opciones 5 y 6 debes guardar y recuperar la lista de productos desde un fichero de forma similar a lo realizado en la Tarea 9. Además del código fuente del programa, haz un comentario final que explique el diseño general del programa y cualquier decisión de diseño importante que hayas tomado.

### Cuestiones breves voluntarias
(Puedes subir nota un máximo 1,5 puntos)

1. Explica brevemente lo que implica poner static a un atributo de una clase, y a un método de una clase.
2. Comenta las características de la programación funcional y del paradigma declarativo que incorpora Java. Escribe tu opinión sobre las ventajas e inconvenientes que tiene la programación funcional y sobre alguna característica de la programación funcional de Java.
3. ¿Qué te pareció la noticia del Foro Temático 2? ¿Qué opinas sobre el tema? ¿Conoces aplicaciones de IA para programar? Dime alguna.

### Ejercicio voluntario (Puedes subir nota un máximo 2 puntos)

Se desea escribir un programa que permita operar con números naturales entre 1 y 999 ingresados por el usuario. Se estará leyendo números hasta que el usuario pulse un número no válido (menor que 1 o mayor de 999. Ese número que termina el proceso no debe procesarse). En ese momento debe mostrarnos los siguientes resultados:

- Cuántos números pares se han procesado.
- La suma de los impares procesados.
- Cuáles son el mayor y el menor de los números procesados.
- Si hemos procesado algún número perfecto (pondrá "si hay" o "no hay" usando el operador condicional).

Un número es perfecto si es igual a la suma de sus divisores (el 4 no lo es (4 != 1+2) pero el 6 sí lo es (6 = 1+2+3)). Se debe definir un subprograma que nos diga si un número es perfecto y utilizarlo en el main.
