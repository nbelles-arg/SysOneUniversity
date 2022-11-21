package com.company;

public class Direccion {
    public  String calle, localidad,provincia;
    public  int numero;

    public Direccion(String calle, int numero, String localidad, String provincia){
        this.calle=calle;
        this.numero=numero;
        this.localidad=localidad;
        this.provincia=provincia;
    }

    public int getNumero() {
        return numero;
    }

    public String getCalle() {
        return calle;
    }

    public String getLocalidad() {
        return localidad;
    }

    public String getProvincia() {
        return provincia;
    }
}
