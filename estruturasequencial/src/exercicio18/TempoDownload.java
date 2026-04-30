package exercicio18;
import java.util.Scanner;
public class TempoDownload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		float tamanho, velocidade, tempoDownload;
		
		System.out.print("Informe o tamanho do arquivo (MB): ");
		tamanho  = leitor.nextFloat();
		
		System.out.print("Informe a velocidade do link de internet (Mbps): ");
		velocidade = leitor.nextFloat();
		
		tempoDownload =  tamanho / (velocidade  / 8);
		
		System.out.printf("O tempo de download é %.0f segundos ", tempoDownload);
		
		leitor.close();
	}

}
/*
 * Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de um link de Internet (em Mbps), 
 * calcule e informe o tempo aproximado de download do arquivo usando este link (em minutos).

 */