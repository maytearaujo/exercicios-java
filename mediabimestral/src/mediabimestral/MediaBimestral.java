package mediabimestral;
import  java.util.Scanner;

public class MediaBimestral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		float n1, n2, n3, n4, media;
		
		System.out.print("Informe a 1º nota: ");
		n1 = leia.nextFloat();

		System.out.print("Informe a 1º nota: ");
		n2 = leia.nextFloat();

		System.out.print("Informe a 1º nota: ");
		n3 = leia.nextFloat();

		System.out.print("Informe a 1º nota: ");
		n4 = leia.nextFloat();
		
		media = (n1 + n2 + n3 + n4) / 4;
		
		System.out.printf("A nota média é: %.2f", media);
	}

}
