package com.company;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        List<Leasing> leasings = new ArrayList<>();


        while (true){
            Scanner scanner = new Scanner(System.in);                                                                  //Creating a Scanner object
            System.out.println("Enter the name of the client (Enter  bye to finish)");                   //Entering all the leasing information
            String nombreCliente = scanner.nextLine();
            if ("bye".equalsIgnoreCase(nombreCliente)){                                                               //The user can finish the process with Enter
                break;
            }
            System.out.println("Enter the boat's matricula please");
            String matricula = scanner.nextLine();
            System.out.println("Enter the client DNI please");
            int dniCliente = scanner.nextInt();
            System.out.println("Enter the boat amarre position pleas");
            int  posicionAmarre = scanner.nextInt();
            System.out.println("Enter the initial year of the  lease please");                                  //Getting the initial date of the lease
            int initialYear = scanner.nextInt();
            System.out.println("Enter the initial month of the  lease please");
            int initialMonth = scanner.nextInt();
            System.out.println("Enter the initial day of the lease please");
            int initialDay = scanner.nextInt();
            System.out.println("Enter the final year of the  lease please");                                      //Getting the final date of the lease
            int finalYear = scanner.nextInt();
            System.out.println("Enter the final month of the  lease please");
            int finalMonth = scanner.nextInt();
            System.out.println("Enter the final day of the lease please");
            int finalDay = scanner.nextInt();
            System.out.println("Enter the eslora dimension of a boat ");
            double eslora = scanner.nextDouble();                                                                                //Getting the parameters for all kind of boats
            System.out.println("Enter the fabrication year of the boat please ");
            int year = scanner.nextInt();
            System.out.println("Enter the fabrication month of the boat please");
            int month = scanner.nextInt();
            System.out.println("Enter the fabrication day of the boat please");
            int day = scanner.nextInt();
            //Need to know what type of boat is on the leasing
            System.out.println("Enter the type of boat of the leasing please (1 = Sailing Boat, 2 = Motor Sport Boat and 3 = LuxuryYacht)");
            int type = scanner.nextInt();
            switch (type){
                case    1:
                    System.out.println("Enter the number of mats please");
                    int numMastiles = scanner.nextInt();
                    leasings.add( new Leasing(nombreCliente,dniCliente,posicionAmarre,LocalDate.of(initialYear,initialMonth,initialDay),LocalDate.of(finalYear,finalMonth,finalDay), new SailingBoat(eslora,matricula,LocalDate.of(year,month,day),numMastiles)));
                    break;
                case 2:
                    System.out.println("Enter the engine power in CV please");
                    int potenciaCV = scanner.nextInt();
                    leasings.add( new Leasing(nombreCliente,dniCliente,posicionAmarre,LocalDate.of(initialYear,initialMonth,initialDay),LocalDate.of(finalYear,finalMonth,finalDay), new MotorSportBoat(eslora,matricula,LocalDate.of(year,month,day),potenciaCV)));
                case 3:
                    System.out.println("Enter the engine power in CV please");
                    int potenciaCV1 = scanner.nextInt();
                    System.out.println("Enter the number of cabins please");
                    int nroCamarotes = scanner.nextInt();
                    leasings.add( new Leasing(nombreCliente,dniCliente,posicionAmarre,LocalDate.of(initialYear,initialMonth,initialDay),LocalDate.of(finalYear,finalMonth,finalDay), new LuxuryYacht(eslora,matricula,LocalDate.of(year,month,day),potenciaCV1,nroCamarotes)));
            }
        }

        for (Leasing i:leasings)                        //printing all the leasings
            System.out.print("\n El cliente " + i.getNombreCliente() + " con DNI = " + i.getDniCliente() + " debe " + i.getLeasing() + " por alquilar el amarre N° " + i.getPosicionAmarre());

        //S Second way to solve the problem hardcoding the values
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
            System.out.print("\n El cliente " + i.getNombreCliente() + " con DNI = " + i.getDniCliente() + " debe " + i.getLeasing() + " por alquilar el amarre N° " + i.getPosicionAmarre());

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