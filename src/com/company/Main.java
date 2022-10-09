package com.company;

import java.util.*;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Port port= new Port();

        port.fillLeasings();                   //filling the list
        port.getLeasings();                 //showing the list
                                                          //printing the maximum, minimum leasing, the monthly and yearly average
        System.out.println("\n El alquiler máximo es  de " +port.getMax() + "  y el alquiler mínimo es de " + port.getMin() + " El alquiler promedio por mes es " + port.getMonthlyEverage() + " El alquiler promedio por año es " + port.getAnualAverage());
    }
}






