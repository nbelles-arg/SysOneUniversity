package com.company;

public class Main {

    public static void main(String[] args) {
        int nsocio=12354,dni = 36278564;
        if ((dni%2) == 0) {
          dni ++;
          System.out.println("Tu dni es = " + dni);
        }else{
            dni--;
            System.out.println("Su numero de documento es = " + dni);
        }

        for(int i=0;i<=5;i+=1) {
            nsocio++;
            System.out.println("Tu número de socio es ="+nsocio);
        }
    }
}
