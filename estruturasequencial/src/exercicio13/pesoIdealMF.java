package exercicio13;
import java.util.Scanner;
import java.text.DecimalFormat;

public class pesoIdealMF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		float altura, pesoIdealM, pesoIdealF;
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("Informe a altura");
		altura = leitor.nextFloat();
		
		
		pesoIdealM = (72.7f * altura) - 58;
		pesoIdealF = (62.1f * altura) - 44.7f;
		
		System.out.println("Peso ideal para homens: " + df.format(pesoIdealM) );
		System.out.println("Peso ideal para mulheres: " + df.format(pesoIdealF) );
		
		leitor.close();

	}

}
