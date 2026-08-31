package beecrowd;

import java.util.Scanner;

public class Exercise1010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
        int codigo, quantidade;
        double preco, precoTotal = 0;
        
        for( int i = 0; i < 2; i++){
           codigo = input.nextInt();
           quantidade = input.nextInt();
           preco = input.nextDouble();
           
           preco = quantidade * preco;
           precoTotal += preco;
        }
        
       
        System.out.printf("VALOR A PAGAR: R$ %.2f", precoTotal);
       
       input.close();
	}

}
