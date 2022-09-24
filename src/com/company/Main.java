package com.company;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.OptionalDouble;

public class Main {

    public static void main(String[] args) {
        int j = 0, nsocio=12354,dni = 36278564;
        int height[] = {176,155, 182, 147, 165, 162, 179, 150, 180, 191};
        String names[] = {"Nicolas", "Ignacio", "Martin","Santiago", "Marcio", "Sebastian", "Belen", "Matias", "Esteban", "Manuel" };

        if ((dni%2) == 0) {
          dni ++;
          System.out.println("Tu dni es = " + dni + "\n");
        }else{
            dni--;
            System.out.println("Su numero de documento es = " + dni + "\n");
        }

        for(int i=0;i<=5;i+=1) {
            nsocio++;
            System.out.println("Tu número de socio es ="+nsocio);
        }

        do {
           j ++;
           System.out.println("Iteración Número =" +j);
        }while (j<=5);

        while (j<=11){
            System.out.println("Numero de iteración = "+(j-5));
            j++;
        }
        Arrays.sort(height);
       double average =  Arrays.stream(height).average().getAsDouble();
        System.out.println("\n La altura promedio es = " + average + "\n" +
                "La altura mínima es =" + height[0] + "\n" +
                "La altura máxima es = " + height[9]);

    }
}
