package repeticao;
import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		int [] num = new int [5];
		int soma = 0;
		float media = 0;
		
		for (int i = 0; i < num.length; i++) {
			System.out.printf("Informe o %dº número: ", i+1);
			num[i] = leitor.nextInt();
		}
		
		for(int i : num)
			soma += i;
		
		media = soma / num.length;
		System.out.printf("Soma: %d\nMedia: %.1f",soma, media);
		leitor.close();
	}

}
