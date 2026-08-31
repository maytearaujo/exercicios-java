package sequencial;
import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = 0;
		
		do {
			System.out.print("informe um número de 0 a 10: ");
			n = input.nextInt();
			
		} while(n < 0 || n > 10);
		
	    for (int i = 1; i <= n; i++){
	        
	    	for(int j = 1; j <= n -i ; j++){
	            System.out.print(" ");
	        }

	        for(int j = 1; j <= i; j++){
	       		System.out.print("#");
	       	}
	      
	        System.out.println("\n");
	    }
	    
	    input.close();
	}

}
