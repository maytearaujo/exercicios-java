package strings;
import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String cpf, cpfSemCaracteresEspeciais = "";
		int somaDigitos = 0, j = 10;
		int resto1 = 0, resto2 = 0;
		
		System.out.print("Informe o CPF: ");
		cpf = input.nextLine();
		
		if (cpf.length() != 14 || cpf.charAt(3) != '.' || cpf.charAt(7) != '.' || cpf.charAt(11) != '-' ||
				cpf.equals("000.000.000-00") ||
				cpf.equals("111.111.111-11") ||
				cpf.equals("222.222.222-22") ||
				cpf.equals("333.333.333-33") ||
				cpf.equals("444.444.444-44") ||
				cpf.equals("555.555.555-55") ||
				cpf.equals("666.666.666-66") ||
				cpf.equals("777.777.777-77") ||
				cpf.equals("888.888.888-88") ||
				cpf.equals("999.999.999-99")
				) {
		
			System.out.println("CPF inválido.");
		}
		else {
			for (int i = 0; i < cpf.length(); i++) {
				if (cpf.charAt(i) != '.' && cpf.charAt(i) != '-') {
					cpfSemCaracteresEspeciais += cpf.charAt(i);
				}
			}
			
			for(int i = 0; i < 9; i++) {

				somaDigitos +=Character.getNumericValue(cpfSemCaracteresEspeciais.charAt(i)) * j--;				
				
			}
			
			resto1 = (somaDigitos * 10) % 11;
			
			if (resto1 == 10) {
				resto1 = 0;
			}
			
			somaDigitos = 0;
			j = 11;
			
			if (resto1 == Character.getNumericValue(cpfSemCaracteresEspeciais.charAt(9))) {
				
				for (int i = 0; i < 10; i++) {
					
					somaDigitos += Character.getNumericValue(cpfSemCaracteresEspeciais.charAt(i)) * j--;
				}
				
				resto2 = (somaDigitos * 10) % 11;
				
				if (resto2 == 10) {
					resto2 = 0;
				}
				
				if (resto2 == Character.getNumericValue(cpfSemCaracteresEspeciais.charAt(10))) {
					System.out.print("CPF válido.");
				} else {
					System.out.print("CPF inválido.");
					
				}
				
			}
			
			else
				System.out.println("CPF inválido.");
				
		}
		
		
		input.close();
	}

}

/*
Verificação de CPF. Desenvolva um programa que solicite a digitação de um número de CPF no formato xxx.xxx.xxx-xx e indique se é um número válido ou inválido através da validação dos dígitos verificadores edos caracteres de formatação.
*/