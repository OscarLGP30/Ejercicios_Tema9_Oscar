package org.example;

import java.time.LocalDate;

public class Bicis {
    //El objetivo es crear un programa que permita a una empresa de alquiler de bicicletas
    //Mostrar los modelos que se ofrecen en alquiler y los precios.
    //Se pueden alquilar bicicletas, segways y giroscopios.
    //Para todos, es necesario conocer su marca, modelo y fecha de compra.
    //Las bicicletas están equipadas con un sistema de cambio de marchas.
    //Algunas tienen más velocidades que otras.
    //Los segways y los giroscopios tienen cierta autonomía en kilómetros.
    //Debido a su manillar, el Segway requiere que su piloto tenga una altura mínima.
    //Puede suponer que dispone de una clase LocalDate que permite gestionar la fecha de compra.
    //Definir las clases necesarias para representar los distintos ciclos ofrecidos para el alquiler.
    //Indicar los diferentes atributos de estos últimos y el posible carácter abstracto de determinadas clases.



    //Atributos
    private String marca;
    private String modelo;
    private LocalDate fechaCompra;

    //Constructor
    public Bicis(String marca, String modelo, LocalDate fechaCompra) {
        this.marca = marca;
        this.modelo = modelo;
        this.fechaCompra = fechaCompra;
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

    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    //Métodos

    @Override

    public String toString() {
        return "Bicis{" + "marca=" + marca + ", modelo=" + modelo + ", fechaCompra=" + fechaCompra + '}';
    }
}
