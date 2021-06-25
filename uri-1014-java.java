//Marina Calheira
//URI 1014
//Consumo
//java

import java.util.Scanner;


public class Main {

    
    public static void main(String args[]) {
       Scanner blubt = new Scanner(System.in);
       int X = blubt.nextInt();
       double Y = blubt.nextDouble();
       double Consumo = X/Y;
        System.out.printf("%.3f km/l\n", Consumo);
    }
}