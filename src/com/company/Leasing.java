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

    public int getInicialMonth(){
        return this.fechaInicial.getMonthValue();
    }

    public int getFinalMonth(){
        return this.fechaFinal.getMonthValue();
    }
    public long daysBetween(){
        return ChronoUnit.DAYS.between(fechaInicial,fechaFinal);
    }
    public double getLeasing(){
        return this.daysBetween()*barco.funcion();    //leasing calculation = days of leasings*boat function
    }

}
