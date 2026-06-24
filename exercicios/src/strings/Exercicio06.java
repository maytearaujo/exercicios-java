package strings;
import java.util.Scanner;

public class Exercicio06 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leitor = new Scanner(System.in);
		String dataNascimento, mesExtenso = "";
		int dia, mes, ano;
		
		do {
			System.out.print("Informe sua data de nascimento (dd/mm/aaaa): ");
			dataNascimento = leitor.nextLine();
		}
		while (dataNascimento.length() != 10 || dataNascimento.charAt(2) != '/' || dataNascimento.charAt(5) != '/');
		
		dia = Integer.parseInt(dataNascimento.substring(0,2));
		mes = Integer.parseInt(dataNascimento.substring(3,5));
		ano = Integer.parseInt(dataNascimento.substring(6));
		
		
		if ((dia > 0 && dia <= 31) && (mes >= 1 && mes <= 12)){

			
			if (mes == 2 && dia > 29) 
				System.out.println("Data inválida!");
			else {
				if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && dia > 31)
					System.out.println("Data inválida!");
				else {
					if ((mes == 4 || mes == 6 || mes == 9 || mes == 11 ) && dia > 30)					
						System.out.println("Data inválida!");
					else {
						
						switch (mes) {
						case 1:
							mesExtenso = "Janeiro";
							break;
						case 2:
							mesExtenso = "Fevereiro";
							break;
						case 3:
							mesExtenso = "Março";
							break;
						case 4:
							mesExtenso = "Abril";
							break;
						case 5:
							mesExtenso = "Maio";
							break;
						case 6:
							mesExtenso = "Junho";
							break;
						case 7:
							mesExtenso = "Julho";
							break;
						case 8:
							mesExtenso = "Agosto";
							break;
						case 9:
							mesExtenso = "Setembro";
							break;
						case 10:
							mesExtenso = "Outubro";
							break;
						case 11:
							mesExtenso = "Novembro";
							break;
						case 12:
							mesExtenso = "Dezembro";
							break;
						}
						System.out.println("Você nasceu em " + dia + " de " + mesExtenso + " de " + ano);
					}
				}
				
			}
				
			
		} else
			System.out.println("Data inválida!");
		
		
		leitor.close();
	}

}
/*
Data por extenso. Faça um programa que solicite a data de nascimento (dd/mm/aaaa) do usuário e imprima a data com o nome do mês por extenso.

Data de Nascimento: 29/10/1973
Você nasceu em  29 de Outubro de 1973.
*/