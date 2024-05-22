package com.alvarowau.ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Esta clase contiene la lógica para procesar una lista de números ingresados por el usuario.
 */
public class Logica {

    /**
     * Inicia el proceso de recoger números del usuario y realizar cálculos sobre ellos.
     */
    public static void inicio() {
        ArrayList<Integer> lista = recogerNumeros();
        System.out.println("Se han procesado " + contadorPares(lista) + " números pares");
        System.out.println("La suma de los números impares es: " + sumaNumerosImpares(lista));
        System.out.println(elNumeroMayorYmenor(lista));
        System.out.println("¿Hay números perfectos? " + (esNumeroPerfecto(lista) ? "sí hay." : "no hay."));
    }

    /**
     * Encuentra el número mayor y el número menor en la lista de números.
     *
     * @param lista La lista de números.
     * @return Una cadena que contiene el número mayor y el número menor.
     */
    private static String elNumeroMayorYmenor(ArrayList<Integer> lista) {
        if (lista.isEmpty()) {
            return "La lista está vacía.";
        }
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (Integer integer : lista) {
            max = Math.max(max, integer);
            min = Math.min(min, integer);
        }
        return "El número mayor introducido es: " + max + ". El número menor introducido es: " + min + ".";
    }

    /**
     * Calcula la suma de los números impares en la lista.
     *
     * @param lista La lista de números.
     * @return La suma de los números impares.
     */
    private static int sumaNumerosImpares(ArrayList<Integer> lista) {
        int suma = 0;
        for (Integer integer : lista) {
            if (integer % 2 != 0) {
                suma += integer;
            }
        }
        return suma;
    }

    /**
     * Recoge números del usuario hasta que se introduce un número no válido.
     *
     * @return Una lista de números válidos introducidos por el usuario.
     */
    private static ArrayList<Integer> recogerNumeros() {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        int numeroRecogido = 0;
        do {
            System.out.print("Digite un número entre 1 y 999: ");
            numeroRecogido = entrada.nextInt();
            if (numeroRecogido > 0 && numeroRecogido <= 999) {
                entrada.nextLine();
                lista.add(numeroRecogido);
            } else {
                break;
            }
        } while (true);
        entrada.close();
        return lista;
    }

    /**
     * Cuenta la cantidad de números pares en la lista.
     *
     * @param lista La lista de números.
     * @return La cantidad de números pares.
     */
    private static int contadorPares(ArrayList<Integer> lista) {
        int contadorPares = 0;
        for (Integer integer : lista) {
            if (integer % 2 == 0) {
                contadorPares++;
            }
        }
        return contadorPares;
    }

    /**
     * Calcula la suma de los divisores de un número.
     *
     * @param numero El número del cual se calculan los divisores.
     * @return La suma de los divisores del número.
     */
    private static int calcularSumaDivisores(int numero) {
        int suma = 0;
        for (int i = 1; i <= numero / 2; i++) {
            if (numero % i == 0) {
                suma += i;
            }
        }
        return suma;
    }

    /**
     * Verifica si algún número en la lista es un número perfecto.
     *
     * @param lista La lista de números.
     * @return true si hay algún número perfecto en la lista, false de lo contrario.
     */
    private static boolean esNumeroPerfecto(ArrayList<Integer> lista) {
        for (Integer integer : lista) {
            if (integer == calcularSumaDivisores(integer)) {
                return true;
            }
        }
        return false;
    }
}
