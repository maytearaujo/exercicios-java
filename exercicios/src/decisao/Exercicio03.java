package decisao;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		char letra;
		
		System.out.print("Digite uma letra: ");
		letra = leia.next().charAt(0);
		
		if (letra == 'f' || letra == 'F')
			System.out.print("Feminino");
		else if (letra == 'm' || letra == 'M')
			System.out.print("Masculino");
		else
			System.out.print("Sexo Inválido");
		
		leia.close();
	}

}
