package org.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //creamos un objeto de la clase Bicis
        Bicis bici1 = new Bicis("Btwin", "Rockrider 340", LocalDate.of(2019, 10, 10),4.90);
        //creamos un objeto de la clase Segway
        Segway segway1 = new Segway("Segway", "Ninebot One E+", LocalDate.of(2019, 10, 10), 30, 18.90);
        //creamos un objeto de la clase Giroscopio
        Giroscopio giroscopio1 = new Giroscopio("Weebot", "Echo", LocalDate.of(2019, 10, 10), 35, 9.90,  1.70);

        //mostramos los datos de la bici
        System.out.println("Bicicleta: " + bici1.getMarca() + " " + bici1.getModelo() + " " + bici1.getFechaCompra());
        //mostramos los datos del segway
        System.out.println("Segway: " + segway1.getMarca() + " " + segway1.getModelo() + " " + segway1.getFechaCompra() + " " + segway1.getAutonomia() + " " + segway1.getTarifaAlquiler());
        //mostramos los datos del giroscopio
        System.out.println("Giroscopio: " + giroscopio1.getMarca() + " " + giroscopio1.getModelo() + " " + giroscopio1.getFechaCompra() + " " + giroscopio1.getAutonomia() + " " + giroscopio1.getTarifaAlquiler() + " " + giroscopio1.getAlturaMinima());

        //mostramos la tarifa de alquiler de la bici
        System.out.println("Tarifa de alquiler de la bici: " + bici1.tarifaAlquiler());
        //mostramos la tarifa de alquiler del segway
        System.out.println("Tarifa de alquiler del segway: " + segway1.tarifaAlquiler());
        //mostramos la tarifa de alquiler del giroscopio
        System.out.println("Tarifa de alquiler del giroscopio: " + giroscopio1.tarifaAlquiler());

        //mostramos la autonomia del segway
        System.out.println("Autonomia del segway: " + segway1.autonomia());
        //mostramos la autonomia del giroscopio
        System.out.println("Autonomia del giroscopio: " + giroscopio1.autonomia());

        //mostramos la velocidad del segway
        System.out.println("Velocidad del segway: " + segway1.velocidad());
        //mostramos la velocidad del giroscopio
        System.out.println("Velocidad del giroscopio: " + giroscopio1.velocidad());

        //mostramos la altura minima del giroscopio
        System.out.println("Altura minima del giroscopio: " + giroscopio1.alturaMinima());

        //mostramos la edad del segway
        System.out.println("Edad del segway: " + segway1.edad());
        //mostramos la edad del giroscopio
        System.out.println("Edad del giroscopio: " + giroscopio1.edad());


    }
}