//Marina Calheira
//URI 1581
//Conversa Internacional
//java

import java.util.Scanner;


public class Main {

    public static void main(String args[]) {
        Scanner ent = new Scanner (System.in);
       int N = ent.nextInt();
       int x = 1,b;
       int K;
       String atual;
       String anterior; 
       
        while(N!=0){
            K = ent.nextInt();
            b=K;
            x = 1;
            anterior = null;
            while(K!=0){
                atual = ent.next();
                if(atual .equals(anterior) && anterior != null)x++;
                anterior = atual;
                K--;
            }
            
            if(x==b)System.out.println(anterior);
            if(x!=b)System.out.println("ingles");
            
            N--;
        }
    }
    
}