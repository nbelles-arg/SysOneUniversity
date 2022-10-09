package com.company;

import java.time.LocalDate;

public class LuxuryYacht extends MotorSportBoat{
    public int nroCamarotes;

    public LuxuryYacht(double eslora,  String matricula , LocalDate anioFabricacion, int potenciaCV, int nroCamarotes ){
        super(eslora, matricula, anioFabricacion,potenciaCV);
        this.nroCamarotes=nroCamarotes;
    }

    @Override
    protected double  funcion(){
        return super.funcion()+nroCamarotes;    //for LuxuryYacht we have to add nroCamarotes to the MotorSportBoat function
    }
}
