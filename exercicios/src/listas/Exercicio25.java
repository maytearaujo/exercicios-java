package listas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class Exercicio25 {
	
	public static ArrayList <String> lerArquivo() {
		String caminho = "arquivos\\listas_exercicio25_listaEnderecosIp.txt";
		ArrayList <String> linhas = new ArrayList<>();
		String linha;
		

		try (BufferedReader leitor = new BufferedReader (new FileReader(caminho)) ) {
						
			
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
			String caminho = "arquivos\\listas_exercicio25_relatorioEnderecosIp.txt";
			BufferedWriter escritor = new BufferedWriter(new FileWriter(caminho, false));
			
			escritor.write(conteudo);
			
			escritor.close();
			
		} catch (Exception erro) {
			
			erro.printStackTrace();
		}
		
	}
	
	public static boolean verificaIpValido(String ip) {
		int [] indicePontos = new int [3];
		int qtdPontos = 0, subDivisoes, inicio = 0, fim = 0, cont = 0;
		boolean ipValido = false;
				

		
		for (int i = 0; i < ip.length(); i++) {
			
			if (ip.charAt(i) == '.') {
				
				if (qtdPontos < indicePontos.length) {
					indicePontos[qtdPontos] = i;
					qtdPontos++;
					
				} 
			}
		}	
		
		if (qtdPontos == indicePontos.length) {
			
			for(int i = 0; i < 4; i++) {
				
				if (i == 0) {
					
					inicio = 0;
					fim = indicePontos[i];
					
				} else if (i == indicePontos.length ) {
					
					inicio = indicePontos[i - 1];
					inicio++;
					fim = ip.length();
					
				} else {
					
					inicio = indicePontos[i - 1];
					inicio++;
					fim = indicePontos[i];
				}
				
				subDivisoes = Integer.parseInt(ip.substring(inicio, fim));
				
				if (subDivisoes >= 0 && subDivisoes <= 255) {
					cont++;
				}
				
			}
			
			if (cont == 4)
				ipValido = true;
			else
				ipValido = false;
		} else {
			ipValido = false;
			
		}
		
		return ipValido;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> enderecosIps = new ArrayList<>();
		String conteudo = "";
		String enderecosValidos =" ", enderecosInvalidos = "";

		enderecosIps = lerArquivo();
		for (int i = 0; i < enderecosIps.size(); i++ ) {
			
			if (verificaIpValido(enderecosIps.get(i))) {
				enderecosValidos += enderecosIps.get(i) +"\n";
			} else {
				enderecosInvalidos += enderecosIps.get(i) +"\n";
			}
			
		}
		
		conteudo = 		
				"[Endereços válidos:]\r\n" + enderecosValidos +
				"\n[Endereços inválidos:]\r\n" + enderecosInvalidos ;
				
		gravarArquivo(conteudo);
		System.out.print("Programa finalizado.");
	}

}
/*
Faça um programa que leia um arquivo texto contendo uma lista de endereços IP e gere um outro arquivo, contendo um relatório dos endereços IP válidos e inválidos.
O arquivo de entrada possui o seguinte formato:
200.135.80.9
192.168.1.1
8.35.67.74
257.32.4.5
85.345.1.2
1.2.3.4
9.8.234.5
192.168.0.256
O arquivo de saída possui o seguinte formato:
[Endereços válidos:]
200.135.80.9
192.168.1.1
8.35.67.74
1.2.3.4

[Endereços inválidos:]
257.32.4.5
85.345.1.2
9.8.234.5
192.168.0.256
*/


//TODO:
//- Rejeitar IPs com zeros à esquerda.
//- Simplificar a lógica usando split() em uma versão refatorada.
//- Retornar false assim que encontrar um octeto inválido.