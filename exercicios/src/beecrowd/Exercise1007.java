package beecrowd;
import java.util.Scanner;

public class Exercise1007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int A, B, C, D, DIFERENCA;
        Scanner input = new Scanner(System.in);
        
        A = input.nextInt();
        B = input.nextInt();
        C = input.nextInt();
        D = input.nextInt();
        
        DIFERENCA =(A * B - C * D);
        
        System.out.print("DIFERENCA = " + DIFERENCA + "\n");
	}

}
