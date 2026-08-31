package classes.date;

public class DataTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date(9, 7, 2001);
		
		System.out.println(date.displayDate());

	}

}
/*
(Classe Date) Crie uma classe chamada Date que inclua três variáveis de instância — mês (tipo int), dia (tipo int) e ano (tipo int).
Forneça um construtor que inicializa as três variáveis de instância supondo que os valores fornecidos estejam corretos. Ofereça um método
set e um get para cada variável de instância. Apresente um método displayDate que exiba mês, dia e ano separados por barras normais
(/). Escreva um aplicativo de teste chamado DateTest que demonstre as capacidades da classe Date.
*/