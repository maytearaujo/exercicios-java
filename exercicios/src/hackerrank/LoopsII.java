package hackerrank;

import java.util.Scanner;

public class LoopsII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            int s = a;
            int termo = b;

            for (int j = 0; j < n; j++) {

                s = s + termo;

                System.out.print(s + " ");

                termo = termo * 2;
            }
            System.out.print("\n");
        }
        
        in.close();
	}

}
