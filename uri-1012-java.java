//Marina Calheira
//URI 1012
//Área
//java

import java.util.Scanner;


public class Main {

    
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        double A = entrada.nextDouble();
        double B = entrada.nextDouble();
        double C = entrada.nextDouble();
        double triangulo = A * C / 2.0;
        double circulo = 3.14159 *(C * C);
        double trapezio = ((A + B) * C)/ 2;
        double quadrado = B * B;
        double retangulo = A * B;
            
            System.out.printf("TRIANGULO: %.3f\n", triangulo);
            System.out.printf("CIRCULO: %.3f\n", circulo);
            System.out.printf("TRAPEZIO: %.3f\n", trapezio);
            System.out.printf("QUADRADO: %.3f\n", quadrado);
            System.out.printf("RETANGULO: %.3f\n", retangulo);
    }
}