package com.company;

import java.time.LocalDate;

public class SailingBoat extends Boat{
    public int numMastiles;

    public SailingBoat (double eslora, String matricula , LocalDate anioFabricacion, int numMastiles){
        super(eslora,matricula,anioFabricacion);
        this.numMastiles=numMastiles;
    }

    @Override
    protected double   funcion(){
        return  super.funcion() + numMastiles;
    }
}
