package com.company;

import java.time.LocalDate;

public class MotorSportBoat extends Boat{
    public int potenciaCV;

    public MotorSportBoat(double eslora,  String matricula , LocalDate anioFabricacion, int potenciaCV){
        super(eslora, matricula , anioFabricacion);
        this.potenciaCV=potenciaCV;
    }

    @Override
    protected double funcion() {
        return super.funcion() + potenciaCV;
    }
}
