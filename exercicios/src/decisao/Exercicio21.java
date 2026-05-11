package decisao;
import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner texto = new Scanner(System.in);
		int valorSaque, notas1=0, notas5=0, notas10=0, notas50=0, notas100=0, resto = 0;
		
		System.out.print("Informe o valor do saque: ");
		valorSaque = texto.nextInt() ;
		
		if (valorSaque >= 10 && valorSaque <= 600) {
			if (valorSaque >= 100) {
				notas100 = valorSaque / 100;
				resto = valorSaque % 100;
			}
			if ((valorSaque >= 50 && valorSaque < 100 ) || (resto > 0 && resto >= 50)) {
				if (resto == 0) {
					notas50 = valorSaque / 50;
					resto = valorSaque % 50;					
				} else {
					notas50 = resto / 50;
					resto = resto % 50;
				}
			}
			if ((valorSaque >= 10 && valorSaque < 50 )|| (resto > 0 && resto >=10)) {
				if (resto == 0) {
					notas10 = valorSaque / 10;
					resto = valorSaque % 10;
				}
				else {
					notas10 = resto / 10;
					resto = resto % 10;
					
				}
			}
			
			if (resto >= 5 && resto < 10) {
						
					notas5 = resto / 5;
					resto = resto % 5;
				
			}
			if (resto >= 1 && resto < 5) {
					notas1 = resto / 1;
			}
			System.out.printf("Para sacar a quantia de %d reais, o programa fornece\n", valorSaque);
			
			if (notas100 > 0)
				System.out.printf("%d notas de 100, \n", notas100);
			
			if (notas50 > 0)
				System.out.printf("%d notas de 50, \n", notas50);
			
			if (notas10 > 0)
				System.out.printf("%d notas de 10, \n", notas10);
			
			if (notas5 > 0)
				System.out.printf("%d notas de 5 \n", notas5);
			
			if (notas1 > 0)
				System.out.printf("%d notas de 1", notas1);
				
		} else
			System.out.println("Valor Inválido!");
		texto.close();
	}

}
