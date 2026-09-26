package decisao;

public class Tabuada1_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 1, num2 = 1, resultado = 0;
		
		while ( num1 <= 10) {
			while (num2 <= 10) {
				resultado = num1 * num2;
				System.out.println(num1 + " X " + num2 + " = " + resultado);
				num2++;
			}
			System.out.println("");
			num1++;
			num2 = 1;
		}
	}

}
