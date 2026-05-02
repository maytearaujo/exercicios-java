package decisao;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		float nota1, nota2, media;
		
		System.out.print("Digite a 1ª nota: ");
		nota1 = leitor.nextFloat();
		
		
		System.out.print("Digite a 2ª nota: ");
		nota2 = leitor.nextFloat();
		
		media = (nota1 + nota2) / 2;
		
		if ( media < 7 )
			System.out.println("Reprovado");
		else if (media >= 7 && media < 10)
			System.out.println("Aprovado");
		else if (media == 10)
			System.out.println("Aprovado com Distinção");
		
		leitor.close();
		
	}

}
