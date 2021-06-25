import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		double x = ent.nextDouble();
		double y = ent.nextDouble();
		    if(x==0.0 && y==0.0)System.out.println("Origem");
		    else if(x>0 && y>0)System.out.println("Q1");//ambos positivos
		    else if(x<0 && y>0)System.out.println("Q2");//x neg y pos
		    else if(x<0 && y<0)System.out.println("Q3");//x neg y neg
		    else if(x>0 && y<0)System.out.println("Q4");//x pos y neg
		    else if(y==0.0)System.out.println("Eixo X");//x qualquer y 0
		    else if(x==0)System.out.println("Eixo Y");//y qualquer x 0
	}
}