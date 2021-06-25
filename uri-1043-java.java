import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner etn = new Scanner(System.in);
		double A = etn.nextDouble();
		double B = etn.nextDouble();
		double C = etn.nextDouble();
		   if(A + B == C || A + C == B || B + C == A){
		       double area = ((A + B)* C)/2;
		       System.out.printf("Area = %.1f\n", area);
		   }
		   else {
		       
		       double peri = A + B + C;
		       System.out.printf("Perimetro = %.1f\n", peri);
		   }
	}
}