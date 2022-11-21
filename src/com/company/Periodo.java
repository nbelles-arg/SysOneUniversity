package com.company;

import java.time.LocalDate;
import java.time.Period;
import java.util.concurrent.CompletableFuture;

public class Periodo {
    public String equipo;
    public LocalDate fechaInicio;
    public LocalDate fechaFin;
    public String posicion;

    public Periodo(String equipo,LocalDate fechaInicio, LocalDate fechaFin){
        this.equipo=equipo;
        this.fechaInicio=fechaInicio;
        this.fechaFin=fechaFin;
    }
    public Periodo(String equipo,LocalDate fechaInicio){
        this.equipo=equipo;
        this.fechaInicio=fechaInicio;
    }

    public Periodo(String equipo,LocalDate fechaInicio, LocalDate fechaFin, String posicion){
        this.equipo=equipo;
        this.fechaInicio=fechaInicio;
        this.fechaFin=fechaFin;
        this.posicion=posicion;
    }
    public Periodo(String equipo,LocalDate fechaInicio, String posicion){
        this.equipo=equipo;
        this.fechaInicio=fechaInicio;
        this.posicion=posicion;
    }

    public String getEquipo() {
        return equipo;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public String getPosicion() {
        return posicion;
    }
}
