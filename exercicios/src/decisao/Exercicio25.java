package decisao;
import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		String question1, question2, question3, question4, question5;
		int accountant = 0;
				
		System.out.println("Responda as questões a seguir: ");
		
		System.out.print("a. Telefonou para a vítima?");
		question1 = reader.next();
		question1 = question1.toLowerCase();
		
		System.out.print("b. Esteve no local do crime?");
		question2 = reader.next();
		question2 = question2.toLowerCase();
		
		System.out.print("c. Mora perto da vítima?");
		question3 = reader.next();
		question3 = question3.toLowerCase();
		
		System.out.print("d. Devia para a vítima?");
		question4 = reader.next();
		question4 = question4.toLowerCase();
		
		System.out.print("e. Já trabalhou com a vítima?");
		question5 = reader.next();
		question5 = question5.toLowerCase();
		
		if (question1.equals("sim"))
			++accountant;
		if (question2.equals("sim" ))
			accountant++;
		if (question3.equals("sim"))
			accountant++;
		if (question4.equals("sim" ))
			accountant++;
		if (question5.equals("sim" ))
			accountant++;
			
		if (accountant == 2)
			System.out.println("Suspeita");
		else if (accountant >= 3 && accountant <=4)
			System.out.println( "Cúmplice");
		else if (accountant == 5)
			System.out.println("Assassino");
		else
			System.out.println("Inocente");
		
		reader.close();
			
	}

}
