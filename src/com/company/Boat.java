package com.company;

import java.time.LocalDate;

public class  Boat {
    public   double eslora;
    public int valorFijo =2;
    public String matricula ;
    public LocalDate anioFabricacion;

    public Boat (   double eslora,  String matricula , LocalDate anioFabricacion){
        this.eslora=eslora;
        this.matricula=matricula;
        this.anioFabricacion=anioFabricacion;
    }
    protected double  funcion(){
        return  eslora*valorFijo*10;
    }
}