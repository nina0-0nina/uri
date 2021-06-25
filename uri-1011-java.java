//Marina Calheira
//URI 1011
//Esfera
//java

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner blut =  new Scanner(System.in);
        double pi = 3.14159;
        double R = blut.nextDouble();
        double X;
        X = ((4/3.0) *(pi*R*R*R));
        System.out.printf("VOLUME = %.3f\n", X);
        
    }
}
