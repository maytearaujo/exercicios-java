package repeticao;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		int num = 0, termo1 = 1, termo2 = 0;
		
		do {
			System.out.print("Informe a quantidade de termos da sequência Fibonacci: ");
			num = leitor.nextInt();
		} while (num <= 0);
		
		int [] fibonacci = new int[num];

		for (int i = 0; i < num; i++) {
			fibonacci[i] = termo1 + termo2;	
			termo1 = termo2;
			termo2 = fibonacci[i];
			 //1,1,2,3,5,8,13,21,34,55
		}
		
		for(int f: fibonacci)
			System.out.print(f + " ");
		
		//outra forma de exibir todo array
		//System.out.println(Arrays.toString(fibonacci));
		
		leitor.close();
	}

}
