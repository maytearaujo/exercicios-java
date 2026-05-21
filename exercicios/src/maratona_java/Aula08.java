package maratona_java;
import java.util.Scanner;

public class Aula08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		double [] [] notasAlunos = new double [3][4];
		
		for (int i = 0; i < notasAlunos.length; i++) {
			for (int j = 0; j < notasAlunos[i].length; j++) {
				do {
				System.out.print((i+1) + "º Aluno - " + (j+1) + "ª nota: ");
				notasAlunos[i][j] = leitor.nextDouble();
				} while (notasAlunos[i][j] < 0 || notasAlunos[i][j] > 10);
			}
			System.out.println("");
		}
		
		for (double [] aluno: notasAlunos ) {
			for (double notas : aluno) {
				System.out.print(notas + "  ");
			}
			System.out.println("\n--------------------");
		}
		leitor.close();
	}

}
