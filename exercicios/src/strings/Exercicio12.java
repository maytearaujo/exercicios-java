package strings;
import java. util.Scanner;

public class Exercicio12 {
	
	public static String corrigeTelefone(String telefone) {
		int tamanho;
		String telefoneSemFormatacao = "";
		
		tamanho = telefone.length();
		String mensagem = "" ;
		
		for (int i = 0; i < tamanho; i++) {
			
			if (telefone.charAt(i) != '-') {
				
				telefoneSemFormatacao += telefone.charAt(i);
			}
		}
		
		telefone = telefoneSemFormatacao;
		tamanho = telefone.length();
		
		try {
						
			if ( tamanho == 7) {
		
				mensagem ="\nTelefone possui 7 dígitos. Vou acrescentar o digito três na frente.\r\n";
	
				telefone = "3" + telefone;
				mensagem =
				"\nTelefone corrigido sem formatação: " + telefone + "\n" +
				"Telefone corrigido com formatação: " + telefone.substring(0,4) + "-" + telefone.substring(4,8);
			
			} else if (tamanho == 8 ) {
				if ( telefone.charAt(0) == '3') {
	
					mensagem = 
						"\nTelefone corrigido sem formatação: " + telefone + "\n" +
						"Telefone corrigido com formatação: " + telefone.substring(0,4) + "-" + telefone.substring(4,8);
				}
				
				else {
					mensagem = 
							"\nTelefone corrigido sem formatação: " + telefone + "\n" +
									"Telefone corrigido com formatação: " + telefone.substring(0,4) + "-" + telefone.substring(4,8);
					
				}
				
			} else if (telefone.length() != 7 && telefone.length() != 8) {
				mensagem = "Telefone inválido.";
			}
			
		}  catch (NumberFormatException e) {
			
			mensagem = "Telefone válido!";
		}
		
		return mensagem;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leitor = new Scanner(System.in);
		String telefone;

		
		System.out.print("Informe o telefone: ");
		telefone = leitor.nextLine();
		
		System.out.println(corrigeTelefone(telefone));
				
		leitor.close();
		
	}

}

/*
Valida e corrige número de telefone. Faça um programa que leia um número de telefone, e corrija o número no caso deste conter somente 7 dígitos, acrescentando o '3' na frente. O usuário pode informar o número com ou sem o traço separador.

Valida e corrige número de telefone
Telefone: 461-0133
Telefone possui 7 dígitos. Vou acrescentar o digito três na frente.
Telefone corrigido sem formatação: 34610133
Telefone corrigido com formatação: 3461-0133
*/