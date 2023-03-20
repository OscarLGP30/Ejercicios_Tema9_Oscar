package org.example;

public class VelocidadMediaPlurilingue {
    //Reanudar el ejercicio del cálculo de la velocidad media para hacerlo plurilingüe.
    //El algoritmo, primero pide al usuario el idioma y luego se comunica con él en ese idioma.
    //Para hacer esto, cree una interfaz Traduccion que contenga cuatro métodos abstractos, introducirDistancia(), introducirTiempo(), inicioRespuesta() y finRespuesta().
    //Cree una clase que implemente esta interfaz para cada idioma deseado.
    //Finalmente modifique el algoritmo en consecuencia.

    //Atributos
    private double distancia;
    private double tiempo;
    private double velocidadMedia;

    //Constructor
    public VelocidadMediaPlurilingue(double distancia, double tiempo, double velocidadMedia) {
        this.distancia = distancia;
        this.tiempo = tiempo;
        this.velocidadMedia = velocidadMedia;
    }

    //Getters y Setters
    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    public double getVelocidadMedia() {
        return velocidadMedia;
    }

    public void setVelocidadMedia(double velocidadMedia) {
        this.velocidadMedia = velocidadMedia;
    }

    //Métodos
    public void calcularVelocidadMedia(){
        velocidadMedia = distancia / tiempo;
    }

    public void mostrarVelocidadMedia(){
        System.out.println("La velocidad media es de: " + velocidadMedia + "km/h");
    }

    @Override
    public String toString() {
        return "VelocidadMedia{" +
                "distancia=" + distancia +
                ", tiempo=" + tiempo +
                ", velocidadMedia=" + velocidadMedia +
                '}';
    }

    public static void main(String[] args) {
        VelocidadMediaPlurilingue velocidadMedia = new VelocidadMediaPlurilingue(300,5,120);
        velocidadMedia.calcularVelocidadMedia();
        velocidadMedia.mostrarVelocidadMedia();
    }

}
