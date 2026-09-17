package decisao;
import java.util.Scanner;

public class Exercicio04Ternario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		char letra;
				
		System.out.println("Digite uma letra: ");
		letra = leia.next().charAt(0);
		
		letra = Character.toLowerCase(letra);
		
		System.out.println(
				(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ) ?
			"A letra letra é uma vogal" :
		(letra == 'b' || letra == 'c' || letra == 'd' || letra == 'f' || letra == 'g' || letra == 'h' || letra == 'j' || 
				letra == 'k' || letra == 'l' || letra == 'm' || letra == 'n' || letra == 'p' || letra == 'q' || letra == 'r' || 
				letra == 's' || letra == 't' || letra == 'v' || letra == 'x' || letra == 'z' || letra == 'w' || letra == 'y' ) ?
			"A letra letra é uma consoante" : "Verifique o que foi digitado");
		
		leia.close();
	}

}
