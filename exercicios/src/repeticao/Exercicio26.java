package repeticao;
import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		int numeroEleitores, fulano = 0, ciclano = 0, beltrano = 0,	numeroCandidato = 0, nulo = 0;
		
		do {
			
			System.out.print("Informe a quantidade de eleitores: ");
			numeroEleitores = leitor.nextInt();
		} while (numeroEleitores <= 0);
		
			System.out.println("Candidatos: \n"
					+ " 1 - Fulano\n 2 - Beltrano\n 3 - Ciclano");
			
		for (int i = 1; i <= numeroEleitores; i++) {
			System.out.print("Informe o número do seu candidato: ");
			numeroCandidato = leitor.nextInt();
			
			if (numeroCandidato == 1){
				fulano++;
				//System.out.print("Voto confirmado no candidato Fulano");
			
			}
			else if (numeroCandidato == 2){
				beltrano++;
				//System.out.print("Voto confirmado no candidato Beltrano");
			}
			else if (numeroCandidato == 3){
				ciclano++;
				//System.out.print("Voto confirmado no candidato ciclano");
			} else {
				nulo++;
				//System.out.println("Voto nulo!");
			}
			
			
		}
		System.out.printf("\n\nResultado da Eleição\nFulano: %d\nBeltrano: %d\nCiclano: %d\nNulo: %d", fulano, beltrano, ciclano, nulo);
		
		leitor.close();
	}

}
