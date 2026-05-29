package beecrowd;
import java.util.Scanner;

public class Exercise1008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        int NUMBER, HOURS;
        double VALUE_HOURS, SALARY;
        
        System.out.print("Informe o número do funcionário: ");
        NUMBER = input.nextInt();
        
        System.out.print("Informe a quantidade de horas trabalhadas: ");
        HOURS = input.nextInt();
        
        System.out.print("Informe o valor da hora: ");
        VALUE_HOURS = input.nextDouble();
        
        SALARY = HOURS * VALUE_HOURS;
        System.out.printf("NUMBER = %d\nSALARY = U$ %.2f", NUMBER, SALARY);
        
        input.close();
	}

}
