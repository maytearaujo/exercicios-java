package classes.funcionario;
import java.util.Scanner;

public class FuncionarioTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Funcionario funcionario;
		String nome;
		double salario, porcentualDeAumento;
		
		System.out.print("Informe o nome do funcionario: ");
		nome = input.nextLine();
		
		System.out.print("Informe o salário: ");
		salario = input.nextDouble();
		
		funcionario = new Funcionario(nome, salario);
		
		System.out.println("\nDados do funcionário: ");
		System.out.println(
				"Nome: " + funcionario.getNome() + 
				"\nSalário: " + funcionario.getSalario());
		
		System.out.print("\nInforme o percentual de aumento: ");
		porcentualDeAumento = input.nextDouble();
		funcionario.aumentarSalario(porcentualDeAumento);
		
		System.out.println("Novo salário: " + funcionario.getSalario());
	}

}
/*
Classe Funcionário: Implemente a classe Funcionário. Um empregado tem um nome (um string) e um salário(um double). Escreva um construtor com dois parâmetros (nome e salário) e métodos para devolver nome e salário. Escreva um pequeno programa que teste sua classe.
*/