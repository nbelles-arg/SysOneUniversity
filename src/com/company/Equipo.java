package com.company;

import java.time.LocalDate;
import java.util.ArrayList;

public class Equipo {
    public String nombre,CategoriaActual;
    public LocalDate fechaFundacion,fechaInicialPrimera,fechaFinalPrimera;
    public Presidente presidente;
    public Direccion direccion;
    public ArrayList <Integer> telefonos;
    public ArrayList<String> emails;
    public ArrayList<Jugador> jugadores;

    public int countPlayers(){
        return jugadores.size();
    }
    public int countPlayersByPosition(String position){
        int count=0;
        for(Jugador i:jugadores){
            Periodo p=i.getPeriodo(this.nombre);
            if(p.posicion==position)    count+=1;
        }
        return count;
    }
    public int countPlayersByDate(String club, LocalDate fecha){
        int count=0;
        for(Jugador i:jugadores){
            if(i.wasInTheClub(club,fecha) )count+=1;
        }
        return count;
    }
}
