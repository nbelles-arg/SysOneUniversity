package com.company;

public class Main {

    public static void main(String[] args) {
        Port port= new Port();

        port.fillLeasings();                           //filling the list
                                                                  //printing the maximum, minimum, the monthly and yearly average leasing
        System.out.println("\n El alquiler máximo es  de " +port.getMax() + "  y el alquiler mínimo es de " + port.getMin() + " El alquiler promedio por mes es " + port.getMonthlyAverage() + " El alquiler promedio por año es " + port.getAnualAverage());
        port.getEveryMonthAverage();    //Listing the monthly average lease for every month
    }
}






