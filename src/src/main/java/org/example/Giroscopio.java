package org.example;

import java.time.LocalDate;

public class Giroscopio {


    //Es necesario conocer la tarifa de alquiler de todos los ciclos.
    //bicicleta 4,90 €
    //segway 18,90 €
    //giroscopio 29,90 €
    //Agregar a las clases anteriores los métodos abstractos y concretos, necesarios para ello.
    //También agregue un constructor y un método que será útil para mostrar estas bicis en cada uno de ellos.

    //Atributos
    private String marca;
    private String modelo;
    private int fechaCompra;
    private int velocidad;
    private double tarifaAlquiler;
    private int autonomia;
    private int tiempoAutonomia;
    private int alturaMinima;

    //Constructor
    public Giroscopio(String marca, String modelo, int fechaCompra, int velocidad, double tarifaAlquiler, int autonomia, int tiempoAutonomia, int alturaMinima) {
        this.marca = marca;
        this.modelo = modelo;
        this.fechaCompra = fechaCompra;
        this.velocidad = velocidad;
        this.tarifaAlquiler = tarifaAlquiler;
        this.autonomia = autonomia;
        this.tiempoAutonomia = tiempoAutonomia;
        this.alturaMinima = alturaMinima;
    }

    public Giroscopio(String giroscopio, String modelo, LocalDate of, int velocidad, double tarifaAlquiler, double alturaMinima) {

    }

    //Getters y Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(int fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public double getTarifaAlquiler() {
        return tarifaAlquiler;
    }

    public void setTarifaAlquiler(double tarifaAlquiler) {
        this.tarifaAlquiler = tarifaAlquiler;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    public int getTiempoAutonomia() {
        return tiempoAutonomia;
    }

    public void setTiempoAutonomia(int tiempoAutonomia) {
        this.tiempoAutonomia = tiempoAutonomia;
    }

    public int getAlturaMinima() {
        return alturaMinima;
    }

    public void setAlturaMinima(int alturaMinima) {
        this.alturaMinima = alturaMinima;
    }

    //Métodos
    @Override
    public String toString() {
        return "Giroscopio{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", fechaCompra=" + fechaCompra +
                ", velocidad=" + velocidad +
                ", tarifaAlquiler=" + tarifaAlquiler +
                ", autonomia=" + autonomia +
                ", tiempoAutonomia=" + tiempoAutonomia +
                ", alturaMinima=" + alturaMinima +
                '}';
    }

    public String tarifaAlquiler() {
        return "La tarifa de alquiler es de " + tarifaAlquiler + "€";
    }

    public String autonomia() {
        return "La autonomía es de " + autonomia + "km";
    }

    public String alturaMinima() {
        return "La altura mínima es de " + alturaMinima + "m";
    }

    public String velocidad() {
        return "La velocidad es de " + velocidad + "km/h";
    }

    public String edad() {
        return "La edad es de " + (LocalDate.now().getYear() - fechaCompra) + "años";
    }
}
