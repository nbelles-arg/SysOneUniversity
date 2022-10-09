package com.company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Port {
    List<Leasing> leasings = new ArrayList<>();

    public void fillLeasings(){                                                                                                           //This void fills out the list of leasings

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
            System.out.println("Enter the boat amarre position please");
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
                    leasings.add( new Leasing(nombreCliente,dniCliente,posicionAmarre, LocalDate.of(initialYear,initialMonth,initialDay),LocalDate.of(finalYear,finalMonth,finalDay), new SailingBoat(eslora,matricula,LocalDate.of(year,month,day),numMastiles)));
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
    }

    public void getLeasings(){
        //printing all the leasings
        for(Leasing i:leasings)
            System.out.print("\n El cliente " + i.getNombreCliente() + " con DNI = " + i.getDniCliente() + " debe " + i.getLeasing() + " por alquilar el amarre N° " + i.getPosicionAmarre());
    }

    public  double getMin(){
        double min= leasings.get(0).getLeasing();
        //getting the minimum lease
        for (Leasing i:leasings) {
            if (i.getLeasing() < min)
                min = i.getLeasing();
        }
        return min;
    }

    public  double getMax(){
        double max= leasings.get(0).getLeasing();
        //getting the maximum lease
        for (Leasing i:leasings) {
            if (i.getLeasing() < max)
                max = i.getLeasing();
        }
        return max;
    }

    public double getAnualAverage(){
        double avrg=0;
        //getting the anual average lease
        for (Leasing i:leasings) {
            avrg+= i.getLeasing()/i.daysBetween();
        }
        return (avrg/leasings.size())*365;
    }

    public double getMonthlyEverage(){
        //getting the monthly average lease
        return this.getAnualAverage()/12;
    }
}
