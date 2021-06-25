import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		float N1 = ent.nextFloat();
		float N2 = ent.nextFloat();
		float N3 = ent.nextFloat();
		float N4 = ent.nextFloat();
		  float med = ((N1 * 2) + (N2 * 3) + (N3 * 4) + (N4 * 1))/10;
		    System.out.printf("Media: %.1f\n", med);
		    if(med >= 7.0){
		        System.out.println("Aluno aprovado.");
		    }
		     else if(med >= 5.0 && med <= 6.9){
		        System.out.println("Aluno em exame.");
		        float N5 = ent.nextFloat();
		        System.out.printf("Nota do exame: %.1f\n", N5);
		        med = (med + N5)/2;
		          if(med >= 5.0){
		            System.out.println("Aluno aprovado.");
		        }
		         else {
		            System.out.println("Aluno reprovado.");
		        }
		        System.out.printf("Media final: %.1f\n", med);
		    }
    		else if(med < 5.0){
    		        System.out.println("Aluno reprovado.");
    		}
	}
}