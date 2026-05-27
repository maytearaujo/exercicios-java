package maratona_java;
// Dado o valor de um carro descubra em quantas vezes pode ser parcelado, parcela maior que 1000
public class Aula06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double  valorCarro = 30000;
		int parcela = 1;
		double valorParcela;
		
		for (int i = 1; i < 1000; i++) {
			parcela =  i;
			valorParcela = valorCarro / parcela;
			System.out.printf("%d parcela no valor de %.2f\n",  parcela, valorParcela);
			
			if (valorParcela <= 1000)
				break;
		}
			
		
	}

}
