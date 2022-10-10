# SysOneUniversity

## This project collects all challanges made through the SysOne University course

### First exercises about iterative structures
package com.company;

public class Main {

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

**Challange about student's height, the maximum, mínimum and average**
    
/*Getting the average, the maximum and minimum height of an array  */
Arrays.sort(heights);
double average =  Arrays.stream(heights).average().getAsDouble();
System.out.println("\n La altura promedio es = " + average +  "\n" +
        "La altura mínima es =" + heights[0] + "\n" +
        "La altura máxima es = " + heights[9]); commented so my array don't get sorted

/*Adding the name of the tallest and the smallest person to the last exercise
int max =  Arrays.stream(heights).max().getAsInt();
int min = Arrays.stream(heights).min().getAsInt();
System.out.println("\n La altura promedio es = " +  Arrays.stream(heights).average().getAsDouble());
for (int i=0 ; i <heights.length;i++){
    if (heights[i] == max) System.out.println("\n La persona más alta es =" + names[i] + " con una altura de " + max);
    if (heights[i]==min)System.out.println("\n La persona más pequeña es = " + names[i] + " con una altura de " + min);
          
    /*Next exercise adding the average math grades of every student
    System.out.println("\n La nota promedio en Matemáticas de " + names[i] + " es = " + Arrays.stream(mathGrades[i]).average().getAsDouble());
}
} 
  ### En un puerto se alquilan amarres para  barcos  de distinto tipo. Para cada ALQUILER se guarda el nombre y DNI del cliente, las fechas  inicial  y final de  alquiler, la posición  del amarre y el barco que  lo ocupará. Un BARCO se caracteriza por su matrícula, su eslora en metros y año de fabricación. Un alquiler se calcula multiplicando el número de días de ocupación (incluyendo los días inicial y final) por un módulo función de cada barco (obtenido simplemente multiplicando por 10 los metros de eslora) y por un valor fijo (2 e en la actualidad). Sin embargo ahora se pretende diferenciar la información de algunos  tipos de barcos:
### •         Número  de mástiles para  veleros
### •         Potencia en CV para  embarcaciones deportivas a motor
### •         Potencia en CV y número de camarotes para  yates de lujo
### El módulo de los barcos  de un tipo especial se obtiene como el módulo normal  mas:
### o    El número de mástiles para  veleros
### o    La potencia en CV para  embarcaciones deportivas a motor
### o    La potencia en CV mas el número de camarotes para  yates de lujo
# Utilizando la herencia de forma  apropiada, diseñe el diagrama de clases y sus relaciones, con  detalle de atributos  y métodos necesarios. Programe en Eiffel los métodos que permitan calcular el alquiler de cualquier tipo de barco.


**Main.java**

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
    
**Port.java**

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
                    break;
                    case 3:
                    System.out.println("Enter the engine power in CV please");
                    int potenciaCV1 = scanner.nextInt();
                    System.out.println("Enter the number of cabins please");
                    int nroCamarotes = scanner.nextInt();
                    leasings.add( new Leasing(nombreCliente,dniCliente,posicionAmarre,LocalDate.of(initialYear,initialMonth,initialDay),LocalDate.of(finalYear,finalMonth,finalDay), new LuxuryYacht(eslora,matricula,LocalDate.of(year,month,day),potenciaCV1,nroCamarotes)));
                    break;
            }
        }
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
            if (i.getLeasing() > max)
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

    public double getMonthlyAverage(){
        //getting the monthly average lease
        return this.getAnualAverage()/12;
    }

    public void getEveryMonthAverage(){
        //getting the monthly average lease for every month of the year
        double months[]={0,0,0,0,0,0,0,0,0,0,0,0};
        String monthNames[]={"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto ","Septiembre","Octubre","Noviembre","Diciembre"};
        int amount []=             {0,0,0,0,0,0,0,0,0,0,0,0};

        for(Leasing i:leasings){

            if((i.getInicialMonth()<=1) && (i.getFinalMonth()>=1)) {
                months[0] += (i.getLeasing() / (i.getFinalMonth() - i.getInicialMonth()));
                amount[0]+= 1;
            }
            if((i.getInicialMonth()<=2) && (i.getFinalMonth()>=2)) {
                months[1] += (i.getLeasing() / (i.getFinalMonth() - i.getInicialMonth()));
                amount[1]+= 1;
            }
            if((i.getInicialMonth()<=3) && (i.getFinalMonth()>=3)) {
                months[2] += (i.getLeasing() / (i.getFinalMonth() - i.getInicialMonth()));
                amount[2]+= 1;
            }
            if((i.getInicialMonth()<=4) && (i.getFinalMonth()>=4)) {
                months[3] += (i.getLeasing() / (i.getFinalMonth() - i.getInicialMonth()));
                amount[3]+= 1;
            }
            if((i.getInicialMonth()<=5) && (i.getFinalMonth()>=5)) {
                months[4] += (i.getLeasing() / (i.getFinalMonth() - i.getInicialMonth()));
                amount[4]+= 1;
            }
            if((i.getInicialMonth()<=6) && (i.getFinalMonth()>=6)) {
                months[5] += (i.getLeasing() / (i.getFinalMonth() - i.getInicialMonth()));
                amount[5]+= 1;
            }
            if((i.getInicialMonth()<=7) && (i.getFinalMonth()>=7)) {
                months[6] += (i.getLeasing() / (i.getFinalMonth() - i.getInicialMonth()));
                amount[6]+= 1;
            }
            if((i.getInicialMonth()<=8) && (i.getFinalMonth()>=8)) {
                months[7] += (i.getLeasing() / (i.getFinalMonth() - i.getInicialMonth()));
                amount[7]+= 1;
            }
            if((i.getInicialMonth()<=9) && (i.getFinalMonth()>=9)) {
                months[8] += (i.getLeasing() / (i.getFinalMonth() - i.getInicialMonth()));
                amount[8]+= 1;
            }
            if((i.getInicialMonth()<=10) && (i.getFinalMonth()>=10)) {
                months[9] += (i.getLeasing() / (i.getFinalMonth() - i.getInicialMonth()));
                amount[9]+= 1;
            }
            if((i.getInicialMonth()<=11) && (i.getFinalMonth()>=11)) {
                months[10] += (i.getLeasing() / (i.getFinalMonth() - i.getInicialMonth()));
                amount[10]+= 1;
            }
            if((i.getInicialMonth()<=12) && (i.getFinalMonth()>=12)) {
                months[11] += (i.getLeasing() / (i.getFinalMonth() - i.getInicialMonth()));
                amount[11]+= 1;
            }
        }

        //Making shure thre's no NaN average and printing
        for (int i=0; i<months.length; i++) {
            if (Double.isNaN(months[i] / amount[i])) amount[i] = 1;
            System.out.println("\nEl alquiler promedio de "+ monthNames[i] + " es: " + months[i] / amount[i]);
        }
    }
}

**Boat.java**
                                       
package com.company;

import java.time.LocalDate;

public class  Boat {
    public   double eslora;
    public int valorFijo =2;
    public String matricula ;
    public LocalDate anioFabricacion;

    public Boat (   double eslora,  String matricula , LocalDate anioFabricacion){
        this.eslora=eslora;
        this.matricula=matricula;
        this.anioFabricacion=anioFabricacion;
    }
    protected double  funcion(){
        return  eslora*valorFijo*10;    //Generic math for all boats
    }
}
                                       
**LuxuryYacht.java**
                         
package com.company;

import java.time.LocalDate;

public class LuxuryYacht extends MotorSportBoat{
    public int nroCamarotes;

    public LuxuryYacht(double eslora,  String matricula , LocalDate anioFabricacion, int potenciaCV, int nroCamarotes ){
        super(eslora, matricula, anioFabricacion,potenciaCV);
        this.nroCamarotes=nroCamarotes;
    }

    @Override
    protected double  funcion(){
        return super.funcion()+nroCamarotes;    //for LuxuryYacht we have to add nroCamarotes to the MotorSportBoat function
    }
}
                                       
**MotorSportBoat.java**
                                       
 package com.company;

import java.time.LocalDate;

public class MotorSportBoat extends Boat{
    public int potenciaCV;

    public MotorSportBoat(double eslora,  String matricula , LocalDate anioFabricacion, int potenciaCV){
        super(eslora, matricula , anioFabricacion);
        this.potenciaCV=potenciaCV;
    }

    @Override
    protected double funcion() {
        return super.funcion() + potenciaCV;    //for MotorSportBoats we need to add the power to the function
    }
}
                                       
**SailingBoat.java**
                                       
package com.company;

import java.time.LocalDate;

public class SailingBoat extends Boat{
    public int numMastiles;

    public SailingBoat (double eslora, String matricula , LocalDate anioFabricacion, int numMastiles){
        super(eslora,matricula,anioFabricacion);
        this.numMastiles=numMastiles;
    }

    @Override
    protected double   funcion(){
        return  super.funcion() + numMastiles;      //SailingBoats should add the number of masts to the Boat function
    }
}
                                       
**Leasing.java**  
                                       
package com.company;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Leasing {
    public String nombreCliente;
    public int dniCliente, posicionAmarre;
    public LocalDate fechaInicial, fechaFinal;
    public Boat barco;

    public Leasing (String   nombreCliente, int dniCliente, int posicionAmarre, LocalDate fechaInicial, LocalDate fechaFinal, Boat barco){
        this.nombreCliente = nombreCliente;
        this.dniCliente = dniCliente;
        this.posicionAmarre= posicionAmarre;
        this.fechaInicial =fechaInicial;
        this.fechaFinal = fechaFinal;
        this. barco = barco;
    }

    public int getInicialMonth(){
        return this.fechaInicial.getMonthValue();
    }

    public int getFinalMonth(){
        return this.fechaFinal.getMonthValue();
    }
    public long daysBetween(){
        return ChronoUnit.DAYS.between(fechaInicial,fechaFinal);
    }
    public double getLeasing(){
        return this.daysBetween()*barco.funcion();    //leasing calculation = days of leasings*boat function
    }

}                                       
