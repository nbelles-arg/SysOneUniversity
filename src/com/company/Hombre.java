package com.company;

import java.util.ArrayList;

public class Hombre {
    public String   nombre,apellido ;
    public  int dni;
    public Direccion direccion;
    public ArrayList<Integer> telefonos;
    public ArrayList<String> emails;
    public ArrayList<Periodo> clubes;

    public Hombre(String nombre, String apellido){
        this.nombre=nombre;
        this.apellido=apellido;
    }

    public Hombre(String nombre, String apellido,int dni, Direccion direccion, ArrayList<Integer> telefonos, ArrayList<String> emails, ArrayList<Periodo> clubes){
        this.nombre=nombre;
        this.apellido=apellido;
        this.dni=dni;
        this.direccion=direccion;
        this.telefonos=telefonos;
        this.emails=emails;
        this.clubes=clubes;
    }
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
}
