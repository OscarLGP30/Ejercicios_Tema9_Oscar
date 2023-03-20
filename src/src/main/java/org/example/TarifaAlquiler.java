package org.example;

public class TarifaAlquiler {
    //Es necesario conocer la tarifa de alquiler de todos los ciclos.
    //bicicleta 4,90 €
    //segway 18,90 €
    //giroscopio 29,90 €
    //Agregar a las clases anteriores los métodos abstractos y concretos, necesarios para ello.
    //También agregue un constructor y un método que será útil para mostrar estas bicis en cada uno de ellos.

    //Atributos
    private double tarifaAlquiler;

    //Constructor
    public TarifaAlquiler(double tarifaAlquiler) {
        this.tarifaAlquiler = tarifaAlquiler;
    }

    //Getters y Setters
    public double getTarifaAlquiler() {
        return tarifaAlquiler;
    }

    public void setTarifaAlquiler(double tarifaAlquiler) {
        this.tarifaAlquiler = tarifaAlquiler;
    }

    //Métodos
    public void mostrarTarifaAlquiler(){
        System.out.println("La tarifa de alquiler es de: " + tarifaAlquiler + "€");
    }

    @Override
    public String toString() {
        return "TarifaAlquiler{" +
                "tarifaAlquiler=" + tarifaAlquiler +
                '}';
    }
}
