package decisao;
import java.util.Scanner;

public class Exercicio20 {
	public static void main(String args[]) {
		Scanner leitor = new Scanner(System.in);
		float nota1, nota2, nota3, media, situacao;
		
		System.out.print("Informe a 1ª nota: ");
		nota1 = leitor.nextFloat();
		
		System.out.print("Informe a 2ª nota: ");
		nota2 = leitor.nextFloat();
		
		System.out.print("Informe a 3ª nota: ");
		nota3 = leitor.nextFloat();
		
		media = (nota1 + nota2 + nota3) / 3;
		
		if (media >= 7 && media < 10)
			System.out.printf("Aprovado com média %.1f", media);
		else if (media < 7)
			System.out.printf("Reprovado com media %.1f", media);
		else
			System.out.print("Aprovado com distinção");
	}

}
