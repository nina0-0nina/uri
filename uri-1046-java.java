import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner lda = new Scanner(System.in);
		int inc = lda.nextInt();
		int fin = lda.nextInt();
		int t;
		    if(inc>fin){
		       t = inc - fin;
		       t = 24 - t;
		        System.out.printf("O JOGO DUROU %d HORA(S)\n", t);
		    }
		    if(inc<fin){
		        t = fin - inc;
		        System.out.printf("O JOGO DUROU %d HORA(S)\n", t);
		    }
		    if(inc == fin){
		        System.out.println("O JOGO DUROU 24 HORA(S)");
		    }
    }
}
