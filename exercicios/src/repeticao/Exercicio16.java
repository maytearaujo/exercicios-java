package repeticao;
import java.util.ArrayList;

public class Exercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0, termo1 = 1, termo2 = 0;
		ArrayList<Integer> fibonacci = new ArrayList<>();
		
		fibonacci.add(0);
		
	 while (fibonacci.get(i) <= 500) {
			fibonacci.add(termo1 + termo2);
			termo1 = termo2;
			i++;
			termo2 = fibonacci.get(i);
	 }
			
					
		for (int f : fibonacci ) {
			System.out.print(f + " ");
		}
	}

}
// A série de Fibonacci é formada pela seqüência 0,1,1,2,3,5,8,13,21,34,55,... Faça um programa que gere a série até que o valor seja maior que 500.

