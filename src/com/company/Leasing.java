package com.company;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Leasing {
    public String nombreCliente;
    public int dniCliente, posicionAmarre;
    public LocalDate fechaInicial, fechaFinal;
    public Boat barco;

    public Leasing (String   nombreCliente, int dniCliente, int posicionAmarre, LocalDate fechaInicial, LocalDate fechaFinal, Boat barco){
        this.nombreCliente = nombreCliente;
        this.dniCliente = dniCliente;
        this.posicionAmarre= posicionAmarre;
        this.fechaInicial =fechaInicial;
        this.fechaFinal = fechaFinal;
        this. barco = barco;
    }

    public String getNombreCliente(){
        return nombreCliente;
    }

    public int getDniCliente() {
        return dniCliente;
    }

    public int getPosicionAmarre() {
        return posicionAmarre;
    }

    public LocalDate getFechaFinal() {
        return fechaFinal;
    }

    public LocalDate getFechaInicial() {
        return fechaInicial;
    }

    public Boat getBarco() {
        return barco;
    }


    public double getLeasing(){
        return ChronoUnit.DAYS.between(fechaInicial,fechaFinal)*barco.funcion();
    }

}
