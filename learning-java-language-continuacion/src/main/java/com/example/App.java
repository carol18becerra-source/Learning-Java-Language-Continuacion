package com.example;

import java.time.DayOfWeek;

public class App {
    public static void main(String[] args) {
        /*
         * Sentencia switch case. esta sentencia es una alternativa al uso de una
         * sentencia if-else
         * cuando haya que evaluar muchas condiciones
         * 
         * documentacion de switch case:
         * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/switch.html
         * 
         * 
         */



        DayOfWeek today = DayOfWeek.FRIDAY;

        switch (today) {
            case MONDAY: 
                System.out.println("Vaya! Se hacen eternos los lunes"); 
                break;
            case TUESDAY:
                System.out.println("Es martes");
                break;
            case FRIDAY:
                System.out.println("Es viernes y el cuerpo lo sabe");
                break;
        
            default:
                System.out.println("No existe ninguna info para el dia introducido ");
                break;
        }

    }
}
