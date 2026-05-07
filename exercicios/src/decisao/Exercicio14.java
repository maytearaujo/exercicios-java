package decisao;
import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		float nota1, nota2, media;
		char conceito=' ';
		String situacao = "";
		
		System.out.print("Informe a 1ª nota: ");
		nota1 = leitor.nextFloat();
		
		System.out.print("Informe a 2ª nota: ");
		nota2 = leitor.nextFloat();
		
		media = (nota1 + nota2) / 2;
		 
		if (media >= 0 && media < 4.0)
			conceito = 'E';
		if(media >= 4.0 && media < 6.0)
			conceito = 'D';
		if (media >= 6.0 && media < 7.5)
			conceito = 'C';
		if (media >= 7.5 && media < 9.0)
			conceito = 'B';
		if(media >= 9.0 && media <= 10)
			conceito = 'A';

		if (conceito == 'A'|| conceito == 'B' || conceito == 'C')
			situacao = "Aprovado";
		else if (conceito == 'D' || conceito == 'E')
			situacao = "Reprovado";
		
		System.out.printf("%n"
				+ "1ª Nota: %.1f%n"
				+ "2ª Nota: %.1f%n"
				+ "Média: %.1f%n"
				+ "Conceito: %c%n"
				+ "Situação: %s", 
				nota1, nota2, media, conceito, situacao);
		
		leitor.close();
	}

}
