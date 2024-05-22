# Ejercicio Obligatorio: Gestión de Inventario

Desarrolla un programa que gestione una lista de productos en un inventario. Debes implementar las siguientes clases:

## Clases

### Producto ✅

Esta clase representa un producto con los siguientes atributos:

- `id` (int)
- `nombre` (String)
- `precio` (double)
- `stock` (int)

Debe incluir métodos para acceder y modificar estos atributos.

### ProductoAlimenticio ✅

Esta clase hereda de la clase `Producto` e incluye un atributo adicional:

- `fechaCaducidad` (String)

Además, debes sobrescribir el método `toString()` para incluir esta información. 

### Inventario✅

Esta clase contiene un array de objetos de tipo `Producto`. Debe tener métodos para:

- Agregar un producto al inventario. ✅
- Eliminar un producto del inventario.✅
- Mostrar la lista de productos en el inventario. ✅
- Actualizar el stock de un producto en el inventario. ✅

### Almacen

Esta clase tiene un menú principal con las siguientes opciones:

- Agregar un nuevo producto al inventario. ✅
- Eliminar un producto del inventario. ✅
- Mostrar la lista de productos en el inventario. ✅
- Actualizar el stock de un producto en el inventario. ✅
- Guardar la lista de productos en un archivo.
- Recuperar la lista de productos desde un archivo.
- Salir del programa.

## Diseño del Programa

El programa está diseñado para gestionar un inventario de productos de manera eficiente. Se han implementado clases separadas para representar los productos y el inventario, lo que facilita la extensión y el mantenimiento del código. La clase `Almacen` proporciona una interfaz de usuario sencilla para interactuar con el inventario.

Decisiones de diseño importantes:

- Utilización de la herencia para crear `ProductoAlimenticio` a partir de `Producto`, lo que permite añadir atributos específicos sin duplicar código.
- Implementación de métodos en la clase `Inventario` para manipular los productos de manera centralizada, mejorando la cohesión y reduciendo la complejidad del código en `Almacen`.

## Cuestiones Breves Voluntarias (Máximo 1,5 puntos)

### Atributos y Métodos `static`

Poner `static` a un atributo de una clase implica que el atributo es compartido por todas las instancias de la clase, en lugar de tener una copia separada para cada instancia. De manera similar, un método `static` pertenece a la clase en sí y no a una instancia específica, por lo que puede ser llamado sin crear una instancia de la clase.

### Programación Funcional en Java

La programación funcional en Java se caracteriza por el uso de funciones como objetos de primera clase, lambdas y el uso de flujos (`streams`). Ventajas: código más conciso, facilidad para escribir código concurrente y paralelo, y mayor expresividad. Inconvenientes: puede ser menos intuitivo para aquellos acostumbrados a la programación imperativa y puede llevar a un uso excesivo de memoria si no se maneja adecuadamente.

### Aplicaciones de IA para Procesamiento de Texto

Existen numerosas aplicaciones de IA para procesamiento de texto, como correctores gramaticales (Grammarly), generadores de texto (GPT-3), y herramientas de traducción automática (Google Translate). Un ejemplo es GPT-3 de OpenAI, que puede generar texto coherente y relevante a partir de una entrada dada.

## Ejercicio Voluntario (Máximo 2 puntos)

Escribe un programa que permita operar con números naturales entre 1 y 999 ingresados por el usuario. El programa leerá números hasta que el usuario pulse un número no válido (menor que 1 o mayor que 999). A partir de ese momento, mostrará los siguientes resultados:

- Cuántos números pares se han procesado.
- La suma de los números procesados.
- El mayor y el menor de los números procesados.
- Si se ha procesado algún número perfecto (utiliza un método que determine si un número es perfecto).
