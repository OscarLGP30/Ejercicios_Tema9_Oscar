package org.example;

public class Normas {
    //Todos los ciclos que se ofrecen en alquiler se almacenan en una tabla.
    //A continuación, se mostrará una vista previa de la pantalla que se genera cuando se navega por la tabla que contiene las bicis:
    //Estos son los ciclos que ofrecemos en alquiler:
    //Bicis Lapierre speed 400 (1 año) 27 velocidades 4,90 €/hora
    //Bicis Btwin riverside 900 (0 años) 10 velocidades 4,90 €/hora
    //Giroscpio Segway Nine (0 años) 40 km de autonomía [1h50 min] 9,90 €/hora
    //Giroscopio Weebot Echo (1 año) 35 km de autonomía [1h60 min] 9,90 €/hora
    //Segways Immotion v8 (0 años) 40 km de autonomía 18,90 €/hora
    //Segways Segway Ninebot One E+ (0 años) 30 km de autonomía 18,90 €/hora

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
    public Normas(String marca, String modelo, int fechaCompra, int velocidad, double tarifaAlquiler, int autonomia, int tiempoAutonomia, int alturaMinima) {
        this.marca = marca;
        this.modelo = modelo;
        this.fechaCompra = fechaCompra;
        this.velocidad = velocidad;
        this.tarifaAlquiler = tarifaAlquiler;
        this.autonomia = autonomia;
        this.tiempoAutonomia = tiempoAutonomia;
        this.alturaMinima = alturaMinima;
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

    public void mostrarNormas() {
        System.out.println("Las normas de alquiler son las siguientes:");
        System.out.println("1. El alquiler de bicicletas es para mayores de 18 años.");
        System.out.println("2. El alquiler de segways es para mayores de 16 años.");
        System.out.println("3. El alquiler de giroscopios es para mayores de 14 años.");
        System.out.println("4. El alquiler de bicicletas es para personas con una altura mínima de 1,50 m.");
        System.out.println("5. El alquiler de segways es para personas con una altura mínima de 1,60 m.");
        System.out.println("6. El alquiler de giroscopios es para personas con una altura mínima de 1,70 m.");
        System.out.println("7. El alquiler de bicicletas es para personas con un peso máximo de 100 kg.");
        System.out.println("8. El alquiler de segways es para personas con un peso máximo de 120 kg.");
        System.out.println("9. El alquiler de giroscopios es para personas con un peso máximo de 150 kg.");
    }

    public void mostrarNormasBicis() {
        System.out.println("Las normas de alquiler de bicicletas son las siguientes:");
        System.out.println("1. El alquiler de bicicletas es para mayores de 18 años.");
        System.out.println("2. El alquiler de bicicletas es para personas con una altura mínima de 1,50 m.");
        System.out.println("3. El alquiler de bicicletas es para personas con un peso máximo de 100 kg.");
    }

    public void mostrarNormasSegways() {
        System.out.println("Las normas de alquiler de segways son las siguientes:");
        System.out.println("1. El alquiler de segways es para mayores de 16 años.");
        System.out.println("2. El alquiler de segways es para personas con una altura mínima de 1,60 m.");
        System.out.println("3. El alquiler de segways es para personas con un peso máximo de 120 kg.");
    }

    public void mostrarNormasGiroscopios() {
        System.out.println("Las normas de alquiler de giroscopios son las siguientes:");
        System.out.println("1. El alquiler de giroscopios es para mayores de 14 años.");
        System.out.println("2. El alquiler de giroscopios es para personas con una altura mínima de 1,70 m.");
        System.out.println("3. El alquiler de giroscopios es para personas con un peso máximo de 150 kg.");
    }


}
