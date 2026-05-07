package decisao;
import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		Float preco1, preco2, preco3, menor;
		
		System.out.print("Informe o preço do 1º produto: ");
		preco1 = leitor.nextFloat();
		
		System.out.print("Informe o preço do 2º produto: ");
		preco2 = leitor.nextFloat();
		
		System.out.print("Informe o preço do 3º produto: ");
		preco3 = leitor.nextFloat();
		
		menor = preco1;
		
		if (preco2 < menor)
			menor = preco2;
		else if(preco3 < menor)
			menor = preco3;
		
		System.out.printf("%.2f é o melhor preço", menor);
		
		leitor.close();
	}

}
