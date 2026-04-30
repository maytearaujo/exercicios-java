package exercicio12;
import java.util.Scanner;
import java.text.DecimalFormat;

public class PesoIdeal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub;
		float altura, pesoIdeal;
		Scanner leitor = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("Informe sua altura");
		altura = leitor.nextFloat();
		
		pesoIdeal =  (72.7f * altura) - 58;
		System.out.println("O seu peso ideal é: " + df.format(pesoIdeal));

	}

}
