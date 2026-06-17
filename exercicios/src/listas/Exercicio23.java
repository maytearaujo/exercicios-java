package listas;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
//import java.io.BufferedWriter;
//import java.io.FileWriter;
import java.util.ArrayList;

public class Exercicio23 {
	
	public static ArrayList <String> lerArquivo() {
		String caminho = "usuarios.txt";
		ArrayList <String> linhas = new ArrayList<>();
		String linha;
		

		try (BufferedReader leitor = new BufferedReader (new FileReader(caminho)); ) {
						
			
		    while ((linha = leitor.readLine()) != null) {
		    	linhas.add(linha);
			}			
			
		} catch (Exception erro) {
			linha = erro.getMessage();
			linhas.add(linha);

		}
		
		return linhas;

	}

	public static void gravarArquivo(String conteudo) {
		
		try {
			String caminho = "relatório.txt";
			BufferedWriter escritor = new BufferedWriter(new FileWriter(caminho, false));
			
			escritor.write(conteudo);
			
			escritor.close();
			
		} catch (Exception erro) {
			
			erro.printStackTrace();
		}
		
	}
	
	public static double converterBytsMegabyts (double valorBytes) {
		double valorMegabytes = valorBytes;
		
		for ( int i = 1; i <=2; i++) {
			valorMegabytes /= 1024;
		}
		
		return valorMegabytes;
	}
	
	public static double calcularPercentural (double espacoMegabytes, double total) {
		double percentual;
		
		percentual = (espacoMegabytes * 100) / total;
		
		return percentual;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String conteudo = "", titulo, rodape, sTotal, sEspacoMedio, conteudoFinal;		
		ArrayList <String> linhas;
		ArrayList <String> usuarios = new ArrayList<>();
		ArrayList <Double> espacoUtilizado = new ArrayList<>();
		double total = 0, espacoMedio = 0, espacoMegabytes, percentual;		
		
		linhas = lerArquivo();
				
		if (!linhas.isEmpty()) {
			for (int i = 0; i < linhas.size(); i++) {
				usuarios.add(linhas.get(i).substring(0, 16).trim());

				espacoUtilizado.add(Double.parseDouble(linhas.get(i).substring(16)));
				
				total += espacoUtilizado.get(i);
			}
			
		}
		
		espacoMedio = total / espacoUtilizado.size();
		
		for (int i = 1; i <= 2; i++) {
			total /= (double) 1024;
			espacoMedio /= (double) 1024;
		}
		
		sEspacoMedio = String.format("%.2f", espacoMedio);
		sTotal = String.format("%.2f", total);
					
		titulo = "ACME Inc.               Uso do espaço em disco pelos usuários\r\n"
				+ "------------------------------------------------------------------------\r\n"
				+ "Nr.  Usuário        Espaço utilizado     % do uso\r\n"
				+ "";

		for (int i = 0; i < espacoUtilizado.size(); i++) {
			
			String espaco, percent;
			
			espacoMegabytes = converterBytsMegabyts(espacoUtilizado.get(i));
			espaco = String.format("%.2f", espacoMegabytes);
			
			percentual = calcularPercentural(espacoMegabytes, total);
			percent = String.format("%.2f",  percentual);
						
			conteudo += String.format("%-3d %-20s %-16s %s%s\n", (i + 1), usuarios.get(i), espaco, percent, "%");
		}
		
		rodape = "\nEspaço total ocupado: " + sTotal + " MB\n"
				+ "Espaço médio ocupado: " + sEspacoMedio + " MB";
		conteudoFinal = titulo + conteudo + rodape;
		gravarArquivo(conteudoFinal);

	}

}

/*
A ACME Inc., uma empresa de 500 funcionários, está tendo problemas de espaço em disco no seu servidor de arquivos. Para tentar resolver este problema, o Administrador de Rede precisa saber qual o espaço ocupado pelos usuários, e identificar os usuários com maior espaço ocupado. Através de um programa, baixado da Internet, ele conseguiu gerar o seguinte arquivo, chamado "usuarios.txt":
alexandre       456123789
anderson        1245698456
antonio         123456456
carlos          91257581
cesar           987458
rosemary        789456125

Neste arquivo, o nome do usuário possui 15 caracteres. A partir deste arquivo, você deve criar um programa que gere um relatório, chamado "relatório.txt", no seguinte formato:
ACME Inc.               Uso do espaço em disco pelos usuários
------------------------------------------------------------------------
Nr.  Usuário        Espaço utilizado     % do uso

1    alexandre       434,99 MB             16,85%
2    anderson       1187,99 MB             46,02%
3    antonio         117,73 MB              4,56%
4    carlos           87,03 MB              3,37%
5    cesar             0,94 MB              0,04%
6    rosemary        752,88 MB             29,16%

Espaço total ocupado: 2581,57 MB
Espaço médio ocupado: 430,26 MB
*/