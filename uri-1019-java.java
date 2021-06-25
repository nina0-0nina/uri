//Marina Calheira
//URI 1019
//Conversão de Tempo
//java

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
    		int tempo = ent.nextInt();
    		int horas = tempo/3600;
    		tempo -= horas * 3600;
    		int minutos = tempo/60;
    		tempo -= minutos * 60;
    		int segundos = tempo;
    		
    		
    		   
    		    System.out.printf("%d:%d:%d\n", horas, minutos, segundos);
    		    
	}
}