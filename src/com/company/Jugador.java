package com.company;

import java.time.LocalDate;
import java.util.ArrayList;

public class Jugador extends Hombre{
    public LocalDate fechaNacimiento,fechaDebut;
    public int partidosJugados,goles;
    public double peso,altura;


    public Jugador(String nombre, String apellido, int dni, Direccion direccion, ArrayList<Integer> telefonos, ArrayList<String> emails, ArrayList<Periodo> clubes) {
        super( nombre, apellido, dni,  direccion, telefonos,  emails,clubes);
    }
    public Periodo getPeriodo(String club){
        int j=-1;
        for(int i=0;i<= clubes.size();i++){
            if (clubes.get(i).equipo.equals(club)) j=i;
        }
        try{ clubes.get(j);

        } catch (Exception e){
            System.out.println("No existe un período que cumpla el criterio");
        }
        return clubes.get(j);
    }

    public boolean wasInTheClub(String club, LocalDate fecha){
        boolean j=false;
        for(int i=0;i<= clubes.size();i++){
            if ((clubes.get(i).equipo.equals(club))&&((clubes.get(i).fechaInicio.isEqual(fecha))||(clubes.get(i).fechaInicio.isBefore(fecha)))&&((clubes.get(i).fechaFin.isEqual(fecha))||(clubes.get(i).fechaFin.isAfter(fecha))))
                return true;
        }
        return j;
    }
}
