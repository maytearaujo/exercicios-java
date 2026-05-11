package decisao;
import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner texto = new Scanner(System.in);
		float numero, numeroArredondado;
		
		System.out.print("Informe um  numero: ");
		numero = texto.nextFloat();
		
		numeroArredondado = (Math.round(numero));
		if (numeroArredondado != numero )
			System.out.println(numero + " é decimal");
		else
			System.out.println(numero + " é inteiro");

		texto.close();
	}

}
