//Marina Calheira
//URI 1038
//Lanche
//java

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int pedido = ent.nextInt();
		int quant = ent.nextInt();
		double total = 0;
		    if(pedido == 1)total = quant * 4;
		    if(pedido == 2)total = quant * 4.5;
		    if(pedido == 3)total = quant * 5;
		    if(pedido == 4)total = quant * 2;
		    if(pedido == 5)total = quant * 1.5;
		    System.out.printf("Total: R$ %.2f\n", total);
	}
}