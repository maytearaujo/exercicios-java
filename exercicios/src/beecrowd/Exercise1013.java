package beecrowd;
import java.util.Scanner;

public class Exercise1013 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		int A, B, C;
		int maiorAB, maiorABC;
		
		System.out.print("Informe o 1º número: ");
		A = leitor.nextInt();
		
		System.out.print("Informe o 2º número: ");
		B = leitor.nextInt();
		
		System.out.print("Informe o 3º número: ");
		C = leitor.nextInt();
		
		maiorAB = (A + B + Math.abs(A - B)) / 2;
		maiorABC = (maiorAB + C + Math.abs(maiorAB - C)) / 2;
		
		System.out.printf("\n%d eh o maior", maiorABC);
		leitor.close();
	}

}

/*
Faça um programa que leia três valores e apresente o maior dos três valores lidos seguido da mensagem “eh o maior”. Utilize a fórmula:

MaiorAB = (a + b + abs(a - b) / 2

Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b). Um segundo passo, portanto é necessário para chegar no resultado esperado.

Entrada
O arquivo de entrada contém três valores inteiros.

Saída
Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".

Exemplos de Entrada	Exemplos de Saída
7 14 106

106 eh o maior

217 14 6

217 eh o maior
*/