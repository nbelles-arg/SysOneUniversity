package com.company;

import java.util.ArrayList;

public class Dt extends Hombre{


    public Dt(String nombre, String apellido,int dni, Direccion direccion, ArrayList<Integer> telefonos, ArrayList<String> emails, ArrayList<Periodo>clubes) {
        super( nombre, apellido, dni,  direccion, telefonos,  emails, clubes);
    }
}
