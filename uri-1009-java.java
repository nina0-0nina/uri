//Marina Calheira
//URI 1009
//Salário com Bônus
//java

import java.util.Scanner;


public class Main {

    
    public static void main(String args[]) {
        Scanner O = new Scanner(System.in);
        String Nome = O.next();
        double Salario = O.nextDouble();
        double Comissao = O.nextDouble();
        double Total;
            Total = (Comissao*15)/100 + Salario;
            System.out.printf("TOTAL = R$ %.2f\n",Total);
    }
}
