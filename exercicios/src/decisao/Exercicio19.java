package decisao;
import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner texto = new Scanner(System.in);
		int numero, unidade=0, centena = 0, dezena=0;
		boolean isCentena = false, isDezena = false,  isUnidade= false;
		String centenaPlural = "centena", dezenaPlural = "dezena",  unidadePlural = "unidade";
		
		System.out.print("Informe um número inteiro menor que 1000: ");
		numero = texto.nextInt();
		
		if (numero <= 0 || numero >= 1000)
			System.out.println("Valor Inválido!");
		else {			
			if (numero >= 100 && numero < 1000) {
				centena = numero / 100;
				if (centena * 100 != numero) {
					dezena = (numero % 100) / 10;
					unidade = (numero % 100) % 10;
				}
			} else if (numero >= 10 && numero <= 99) {
				dezena = numero / 10;
				unidade = numero % 10;
			}
			else if (numero >= 1 && numero <= 9) {
				unidade = numero;
			}
		}
		
		if (centena != 0) {
			isCentena = true;
			if (centena > 1)
				centenaPlural = "centenas";
		}
		if (dezena != 0) {
			isDezena = true;
			if (dezena > 1)
				dezenaPlural = "dezenas";
		}
		
		if (unidade != 0) {
			isUnidade = true;
			if (unidade > 1)
				unidadePlural = "unidades";
		}
		
		if (isCentena && isDezena && isUnidade)
			System.out.printf("%d = %d %s, %d %s e %d %s", numero, centena, centenaPlural, dezena, dezenaPlural, unidade, unidadePlural);

		else if (isCentena && isDezena)
			System.out.printf("%d = %d %s e %d %s", numero, centena, centenaPlural, dezena, dezenaPlural);
			
		else if (isCentena && isUnidade)
			System.out.printf("%d = %d %s e %d %s", numero, centena, centenaPlural, unidade, unidadePlural);
		
		else if (isCentena)
			System.out.printf("%d = %d %s", numero, centena, centenaPlural);
		
		else if (isDezena && isUnidade)
			System.out.printf("%d = %d %s e %d %s", numero, dezena, dezenaPlural, unidade, unidadePlural);
		
		else if (isDezena)
			System.out.printf("%d = %d %s", numero, dezena, dezenaPlural);
		
		else if (isUnidade)
			System.out.printf("%d = %d %s", numero, unidade, unidadePlural);
			
			texto.close();
	}

}
