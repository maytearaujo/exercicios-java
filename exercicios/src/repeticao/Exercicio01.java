package repeticao;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		int nota;
		
		do {
			System.out.print("Informe uma nota entre entre zero e dez");
			nota = leitor.nextInt();
		}
		while (nota < 0 || nota > 10);
		
		leitor.close();
	}

}
