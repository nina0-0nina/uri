//Marina Calheira
//URI 1006
//Média 2
//java

import java.util.Scanner;


public class Main {

    
    public static void main(String args[]) {
        Scanner E = new Scanner (System.in);
        double A = E.nextDouble();
        double B = E.nextDouble();
        double C = E.nextDouble();
        double X; 
                X = (A*2+B*3+C*5)/10;
                System.out.printf("MEDIA = %.1f\n",X);
    }
}