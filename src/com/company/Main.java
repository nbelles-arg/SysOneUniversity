package com.company;

import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        int j = 0, nsocio=12354,dni = 36278564;
        int heights[] = {176,155, 182, 147, 165, 162, 179, 150, 180, 191};
        int mathGrades [] [] = {{7,6},{8,5},{9,8},{10,9},{5,6},{7,8},{4,2},{8,10},{8,6},{10,10}};
        String names[] = {"Nicolas", "Ignacio", "Martin","Santiago", "Marcio", "Sebastian", "Belen", "Matias", "Esteban", "Manuel" };

        if ((dni%2) == 0) {
          dni ++;
          System.out.println("Tu dni es = " + dni + "\n");
        }else{
            dni--;
            System.out.println("Su numero de documento es = " + dni + "\n");
        }

        for(int i=0;i<=5;i++) {
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

        /*Getting the average, the maximum and minimum height of an array  */
        /* Arrays.sort(heights);
        double average =  Arrays.stream(heights).average().getAsDouble();
        System.out.println("\n La altura promedio es = " + average +  "\n" +
                "La altura mínima es =" + heights[0] + "\n" +
                "La altura máxima es = " + heights[9]); commented so my array don't get sorted*/

        /*Adding the name of the tallest and the smallest person to the last exercise */

       int max =  Arrays.stream(heights).max().getAsInt();
       int min = Arrays.stream(heights).min().getAsInt();
       System.out.println("\n La altura promedio es = " +  Arrays.stream(heights).average().getAsDouble());
       for (int i=0 ; i <heights.length;i++){
           if (heights[i] == max) System.out.println("\n La persona más alta es =" + names[i] + " con una altura de " + max);
           if (heights[i]==min)System.out.println("\n La persona más pequeña es = " + names[i] + " con una altura de " + min);
           /*Nex exercise adding the average math grades of every student*/
           System.out.println("\n La nota promedio en Matemáticas de " + names[i] + " es = " + Arrays.stream(mathGrades[i]).average().getAsDouble());
       }
    }
}
