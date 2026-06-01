package beecrowd;
import java.util.Scanner;

public class Exercise1006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        float A, B, C, MEDIA;
        
        System.out.print("Informe a 1ª nota: ");
        A = input.nextFloat();

        System.out.print("Informe a 2ª nota: ");
        B = input.nextFloat();
        
        System.out.print("Informe a 3ª nota: ");
        C = input.nextFloat();
        
        MEDIA = ((A * 2) + (B *3) + (C * 5)) / (2 + 3+ 5);
        
        System.out.printf("MEDIA = %.1f\n", MEDIA);
        
        input.close();
 
	}

}
