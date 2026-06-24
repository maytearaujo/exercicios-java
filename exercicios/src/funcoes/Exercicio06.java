package funcoes;
import java.util.Scanner;

public class Exercicio06 {
	
	public static String converterHoras24para12 (int horas, int minutos) { 
		String horas12 = " ";
		
		if (horas > 12) {
			horas = horas - 12;
		} else if (horas == 0)
			horas = 12;
			
			horas12 = String.format("%d:%02d", horas, minutos);
		
		

		return horas12;
	}
	
	public static String verificarAmPm(int horas) {
		String am_pm = "";
		
		if (horas >= 12 )
			am_pm = "P";
		else 
			am_pm = "A";
		
		if (am_pm.equals("A"))
			am_pm = " AM";
		else
			am_pm = " PM";
					
		return am_pm;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int horas, minutos;
		char resposta = ' ';
		
		do {
			do {
				System.out.print("Informe as horas: ");
				horas = input.nextInt();
			}
			while(horas < 0 || horas >= 24);
			
			do {
				System.out.print("Informe os minutos: ");
				minutos = input.nextInt();
			} while (minutos < 0 || minutos > 59);
			
			System.out.println(converterHoras24para12(horas, minutos) + verificarAmPm(horas));
			
			do {
				
				System.out.print("\nDeseja realizar nova conversão S - sim    N - Não: " );
				resposta = Character.toUpperCase(input.next().charAt(0));

			} while (resposta != 'S' && resposta != 'N');
			
			System.out.println("\n");
		} while (resposta != 'N');
		
		System.out.print("Programa Finalizado!");
		input.close();
		
	}

}

/*
Faça um programa que converta da notação de 24 horas para a notação de 12 horas. Por exemplo, o programa deve converter 14:25 em 2:25 P.M. A entrada é dada em dois inteiros. Deve haver pelo menos duas funções: uma para fazer a conversão e uma para a saída. Registre a informação A.M./P.M. como um valor ‘A’ para A.M. e ‘P’ para P.M. Assim, a função para efetuar as conversões terá um parâmetro formal para registrar se é A.M. ou P.M. Inclua um loop que permita que o usuário repita esse cálculo para novos valores de entrada todas as vezes que desejar.
*/