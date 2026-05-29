package beecrowd;
import java.util.Scanner;

public class Exercise1005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	       double A, B, MEDIA;
	       Scanner input = new Scanner(System.in);
	       
	       System.out.print("Informe a 1ª nota: ");
	       A = input.nextFloat();
	       
	       System.out.print("Informe a 2ª nota: ");
	       B = input.nextFloat();
	       
	       MEDIA = ((A * 3.5) + (B * 7.5)) / (3.5 + 7.5);
	       
	       System.out.printf("MEDIA = %.5f", MEDIA);
	       
	       input.close();
	       

	}

}
