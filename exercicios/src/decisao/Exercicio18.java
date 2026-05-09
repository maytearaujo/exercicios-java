package decisao;
import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner texto = new Scanner(System.in);
		String data;	
		int dia, mes, ano;
		String digito;
		
		System.out.print("Informe uma data: ");
		data = texto.next();
		
		if (data.length() != 10)
			System.out.println("Data Inválida");
		else {
			
			if (data.charAt(2) == '/' && data.charAt(5) == '/') {
				digito  = Integer.toString(data.charAt(0) - 48) + Integer.toString(data.charAt(1) - 48);
				dia = Integer.parseInt(digito);
				
				digito = Integer.toString(data.charAt(3) - 48) + Integer.toString(data.charAt(4) - 48);
				mes = Integer.parseInt(digito);
				
				digito = Integer.toString(data.charAt(6) - 48) + Integer.toString(data.charAt(7)-48) +
						Integer.toString(data.charAt(8) - 48) + Integer.toString(data.charAt(9)-48);
				ano = Integer.parseInt(digito);
				
				if (ano > 0) {
					if (mes >=1 && mes <= 12){
						if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12 )
							&& (dia >= 1 && dia <= 31))
							System.out.print("Data Válida");
						else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia >=1 && dia <=30))
								System.out.print("Data Válida");
						else if (mes == 2) {
							if (ano % 400 == 0 && dia <=29)
								System.out.print("Data Válida");
							else if (ano % 4 == 0 && ano % 100 != 0 && (dia >= 1 && dia <= 29))								
								System.out.print("Data Válida");
							
							else if (dia >= 1 && dia <= 28)
								System.out.print("Data Válida");
							else
								System.out.println("Data Inválida!");
						}
						else
							System.out.println("Data Inválida!");
						
					}
					else
						System.out.println("Data Inválida");
				}
				else
					System.out.println("Data Inválida");
			}
			else
				System.out.println("Data Inválida");
		}
		texto.close();
		
	}

}
