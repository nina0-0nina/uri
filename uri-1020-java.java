//Marina Calheira
//URI 1020
//Idade em Dias
//java

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int tempo = ent.nextInt();
		int anos = tempo/365;
		tempo -= anos * 365;
		int mes = tempo/30;
		tempo -= mes * 30;
		int dias = tempo;
		
		    System.out.printf("%d ano(s)\n", anos);
		    System.out.printf("%d mes(es)\n", mes);
		    System.out.printf("%d dia(s)\n", dias);
	}
}

