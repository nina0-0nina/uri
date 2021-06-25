//Marina Calheira
//URI 1017
//Gasto de Combustível
//java

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int tempo = ent.nextInt();
		int velocidade = ent.nextInt();
		int dista = velocidade*tempo;
		double gasolina = dista/12.0;
		   System.out.printf("%.3f\n", gasolina);
	}
}
