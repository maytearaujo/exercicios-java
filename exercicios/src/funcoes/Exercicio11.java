package funcoes;
import java.util.Scanner;

public class Exercicio11 {
	
	public static String dataPorextenso(String data) {
		String dataExtenso = "", sMes = "";
		int dia, mes, ano;
		
		if (data.length() != 10)
			dataExtenso = "Data inválida!";
		else {
			dia = Integer.parseInt(data.substring(0,2));
			mes = Integer.parseInt(data.substring(3,5));
			ano = Integer.parseInt(data.substring(6,10));
			
			if ((dia < 1 || dia > 31) || (mes < 1 || mes > 12)) 
				dataExtenso = "Data inválida!";
			else {
				
				if (
						(mes == 2 && (dia == 30 || dia == 31) ||						
						((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30))
					)
					dataExtenso = "Data inválida!";
				else {					
							
					switch (mes) {
					
					case 1:
						sMes = "Janeiro";
						break;
					case 2:
						sMes = "Fevereiro";
						break;
					case 3:
						sMes = "Março";
						break;
					case 4:
						sMes = "Abril";
						break;
					case 5:
						sMes = "Maio";
						break;
					case 6:
						sMes = "Junho";
						break;
					case 7:
						sMes = "Julho";
						break;
					case 8:
						sMes = "Agosto";
						break;
					case 9:
						sMes = "Setembro";
						break;
					case 10:
						sMes = "Outubro";
						break;
					case 11:
						sMes = "Novembro";
						break;
					case 12:
						sMes = "Dezembro";
						break;
					}
				
					dataExtenso = dia + " de " + sMes + " de " + ano;
				}
			}
		}
		
		return dataExtenso;
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String data;
		
		System.out.print("Informe uma data: ");
		data = input.nextLine();
		
		System.out.println(dataPorextenso(data) );
		
		input.close();
	}

}
/*
Data com mês por extenso. Construa uma função que receba uma data no formato DD/MM/AAAA e devolva uma string no formato D de mesPorExtenso de AAAA. Opcionalmente, valide a data e retorne NULL caso a data seja inválida.

*/