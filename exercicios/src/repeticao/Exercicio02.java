package repeticao;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		String usuario, senha;		
		
		do {
			System.out.print("Informe o usuário: ");
			usuario = leitor.next();
			
			System.out.print("Informe a senha: ");
			senha = leitor.next();
			
			if (usuario.equals(senha))
				System.out.println("Erro: usuário e senha não podem ser iguais.\n");
		}
		while (usuario.equals(senha));	
		leitor.close();

	}

}

/*
Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário, mostrando uma
 mensagem de erro e voltando a pedir as informações. 
 */
