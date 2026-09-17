package decisao;
import java.util.Scanner;

public class Exercicio03Ternario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		char letra;
		
		System.out.print("Digite uma letra: ");
		letra = leia.next().charAt(0);
		
		System.out.println( 
				(letra == 'f' || letra == 'F') ? "Feminino" : 
				(letra == 'm' || letra == 'M') ? "Masculino":"Sexo Inválido");
		
		leia.close();
	}

}
