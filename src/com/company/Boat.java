package com.company;

import java.util.Date;

public abstract class  Boat {
    protected   int eslora, valorFijo =2;
    protected String matricula ;
    protected Date anioFabricacion;

    protected int  funcion(){
        return  eslora*valorFijo*10;
    }
}