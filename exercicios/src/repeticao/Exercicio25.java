package repeticao;
import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		int idade, soma = 0, i = 0;
		char resposta;
		float media;
		String faixaEtaria = "";
		
		do {
			System.out.print("Digite a idade: ");
			idade = leitor.nextInt();
			soma += idade;
			i++;
			
			do {
				System.out.println("\nDeseja digitar outra idade? (S - Sim    N - Não)");
				resposta = Character.toLowerCase(leitor.next().charAt(0));
			} while (resposta != 's' && resposta != 'n');
			
		} while (resposta == 's');
		
		media = soma / i;
		
		if (media >= 0 && media <= 25)
			faixaEtaria = "Jovens";
		else if (media >= 26 && media <= 60)
			faixaEtaria = "Adultas";
		else if (media > 60)
			faixaEtaria = "Idosas";
		
		System.out.println("A média de idades é de pessoas " + faixaEtaria);
		
		leitor.close();
	}

}
