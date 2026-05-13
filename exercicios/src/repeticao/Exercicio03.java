package repeticao;
import java.util.Scanner;
public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leitor = new Scanner(System.in);
		String nome = "";
		int idade = 0;
		float salario = 0;
		char sexo = ' ', estadoCivil = ' ';
		
		do {
			System.out.print("Informe seu nome: ");	
			nome = leitor.nextLine();
			if (nome.length() <=3)
				System.out.println("Informe um nome com mais de 3 caracteres\n");
		} while (nome.length() <= 3);
		
		do {
			System.out.print("Informe sua idade: ");
			idade = leitor.nextInt();
			if (idade < 0 || idade > 150)
				System.out.println("Informe uma idade entre 0 e 150\n");
		} while (idade < 0 || idade > 150);
		
		do {
			System.out.print("Infome seu salário: ");
			salario = leitor.nextFloat();
			if (salario <= 0)
				System.out.println("Infome um salário maior que zero\n");
		} while (salario <= 0);
		do {
			System.out.print("Infome seu sexo\n f - feminino   \n m - masculino:\n ");
			sexo = leitor.next().charAt(0);
			if (sexo != 'f' && sexo != 'm')
				System.out.println("Verifique o sexo digitado\n");
		} while (sexo != 'f' && sexo != 'm');
		do {
			System.out.print("Infome seu estado civil\n s - Solteiro\n c - Casado\n v - Víuvo\n d - Divorciado\n");
			estadoCivil = leitor.next().charAt(0);
			if (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd')
				System.out.print("Verifique o estado civil digitado\n");
		} while (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd');
		
		System.out.printf("Dados Pessoais: \n"
				+ "Nome: %s\n"
				+ "Idade: %d\n"
				+ "Salário: %.2f\n"
				+ "Sexo: %c\n"
				+ "Estado Civil: %c\n",
				nome, idade, salario, sexo, estadoCivil);
		
		leitor.close();
	}

}

/*
 Faça um programa que leia e valide as seguintes informações:
Nome: maior que 3 caracteres;
Idade: entre 0 e 150;
Salário: maior que zero;
Sexo: 'f' ou 'm';
Estado Civil: 's', 'c', 'v', 'd';
 */