package com.company;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;


public class Main {

    public static void main(String[] args) {


        List<Leasing> leasings = new ArrayList<>();
        SailingBoat sailingBoat = new SailingBoat(3.5,"7BA308", LocalDate.of(1992,8,18), 4);
        leasings.add(new Leasing("Nicolas Belles",36278564,1,LocalDate.of(2022,9,10),LocalDate.of(2022,9,20),sailingBoat));
        SailingBoat sailingBoat1= new SailingBoat(10,"YB7992878", LocalDate.of(1954,9,21),7);
        leasings.add(new Leasing("Ignacio Capelli",623214,2,LocalDate.of(2022,8,22),LocalDate.of(2022,9,29),sailingBoat1));
        MotorSportBoat motorSportBoat = new MotorSportBoat(5.7,"AR7763Z",LocalDate.of(2001,9,11),60);
        leasings.add(new Leasing("Mariano Chaves",32568712,3,LocalDate.of(2022,5,1),LocalDate.of(2022,9,1),motorSportBoat));
        LuxuryYacht luxuryYacht = new LuxuryYacht(19,"IGN6789W",LocalDate.of(1989,12,31),120,5);
        leasings.add(new Leasing("Raul Parola",35789521,4,LocalDate.of(2021,11,30),LocalDate.of(2022,3,21),luxuryYacht));
        LuxuryYacht luxuryYacht1 = new LuxuryYacht(25,"NIK34509",LocalDate.of(1950,2,10),145,7);
        leasings.add(new Leasing("Agustin Latorre",31205489,5,LocalDate.of(2022,6,1),LocalDate.of(2022,10,1),luxuryYacht1));

        for (Leasing i:leasings)
            System.out.print("El cliente " + i.getNombreCliente() + " con DNI = " + i.getDniCliente() + " debe " + i.getLeasing() + " por alquilar el amarre N° " + i.getPosicionAmarre()+ "\n");
    }
}






/*Commented because i have to start a new exercise about boats
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

        /*Adding the name of the tallest and the smallest person to the last exercise

       int max =  Arrays.stream(heights).max().getAsInt();
       int min = Arrays.stream(heights).min().getAsInt();
       System.out.println("\n La altura promedio es = " +  Arrays.stream(heights).average().getAsDouble());
       for (int i=0 ; i <heights.length;i++){
           if (heights[i] == max) System.out.println("\n La persona más alta es =" + names[i] + " con una altura de " + max);
           if (heights[i]==min)System.out.println("\n La persona más pequeña es = " + names[i] + " con una altura de " + min);
           /*Nex exercise adding the average math grades of every student
           System.out.println("\n La nota promedio en Matemáticas de " + names[i] + " es = " + Arrays.stream(mathGrades[i]).average().getAsDouble());
       }*/