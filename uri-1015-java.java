//Marina Calheira
//URI 1015
//Distância Entre Dois Pontos
//java

import java.util.Scanner;


public class Main {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        double x1 = entrada.nextDouble(),y1 = entrada.nextDouble();
        double x2 = entrada.nextDouble(),y2 = entrada.nextDouble();
            double distancia = Math.sqrt((x2 - x1)*(x2 - x1)+(y2 - y1)*(y2 - y1));
            
            System.out.printf("%.4f\n",distancia);
    }
}