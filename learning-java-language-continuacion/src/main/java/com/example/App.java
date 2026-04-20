package com.example;

public class App {
    public static void main(String[] args) {

        /*
         * Sentencia break con etiqueta:
         * 
         * 
         * ejemplo: Apartir de un ejemplo bidimensional es decir una matriz buscar la
         * ocurrencia de un
         * valor concreto y mostrar la fila y la columna donde a sido hallado
         */

        // creacion de array bidimensinal es decir la matriz

        int[][] arrayOfInts = {
                // fila 1
                { 1, 2, 3, 4 },
                // fila 2
                { 5, 6, 7, 8, 9 },
                // fila 3
                { 10, 11, 12, 13, 14 }
        };
        // valor a buscar
        int searchfor = 12;

        // variable que indica si ha sido encontrado el valor buscado o no
        boolean foundIt = false;

        int i = 0; // indice de las filas
        int j = 0; // indice de las columnas

        int totalFilas = arrayOfInts.length;

        // la sentencia for mas exterior es para recorrer las filas del array

        search: for (i = 0; i <= totalFilas - 1; i++)
            for (j = 0; j <= arrayOfInts[i].length - 1; j++) {

                if (arrayOfInts[i][j] == searchfor) {
                    foundIt = true;
                    break;
                }
            }

        if (foundIt)
            System.out.println("el valor: " + searchfor + ", ha sido encontrado en la fila: " + (i
                    + 1) + ", columna: " + (j + 1));
        else
            System.out.println("el valor: " + "no ha sido encontrado en el array");


//------------------------------------------------------------------------------------------------------

        /*
         * ejercicio:
         * repetir el ejemplo anterior utilizando sentencia for mejorada
         */

        int[][] lista = { { 1, 4, 10 }, { 5, 20, 10 }, { 10, 20, 40 } };

        int encontrar = 5;
        boolean encontrado = false;

        int posicionFila = 0;
        int posicionColumna = 0;

        terminado: for (int[] x : lista) {
            posicionFila++;
            for (int y : x) {
                posicionColumna++;
                if (y == encontrar) {
                    encontrado = true;
                    break terminado;
                }
            }
            posicionColumna = 0;
        }

        if (encontrado) {
            System.out.println("Encontrado en la fila " + posicionFila + " y columna " + posicionColumna);
        } else {
            System.out.println("No encontrado");
        }

    }

}
