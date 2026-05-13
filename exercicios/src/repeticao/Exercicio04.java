package repeticao;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float populacaoA = 80000, populacaoB = 200000;
		float taxaCrescimentoAnualA =0.03f, taxaCrescimentoAnualB = 0.015f;
		int anos = 0;
		
		while (populacaoA < populacaoB) {
			anos++;
			populacaoA = populacaoA + (populacaoA * taxaCrescimentoAnualA);
			populacaoB += populacaoB * taxaCrescimentoAnualB;
			
		}
		System.out.printf("Em %d anos população de A iguala ou ultrapassa a população de B", anos);
	}

}

/*
Supondo que a população de um país A seja da ordem de 80000 habitantes com uma taxa anual de crescimento de 3% e 
que a população de B seja 200000 habitantes com uma taxa de crescimento de 1.5%. Faça um programa que calcule e 
escreva o número de anos necessários para que a população do país A ultrapasse ou iguale a população do país B, 
mantidas as taxas de crescimento.
*/