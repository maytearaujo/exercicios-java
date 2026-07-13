package classes.teste;
import classes.dominio.Retangulo;
import java.util.Scanner;

public class RetanguloPisoRodape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double largura, comprimento, areaAmbiente, areaPiso, quantidadePecas, sobra, larguraPorta, perimetro;
		Retangulo ambiente = new Retangulo();
		Retangulo piso = new Retangulo();
		char resposta;
		int qtdPortas;
		
		System.out.print("A largura do ambiente: ");
		largura = input.nextDouble();
		ambiente.setBase(largura);
		
		System.out.print("O comprimento do ambiente: ");
		comprimento = input.nextDouble();
		ambiente.setAltura(comprimento);
		
		areaAmbiente = ambiente.calcularArea();

		System.out.print("A largura do piso: ");
		largura = input.nextDouble();
		piso.setBase(largura);
		
		System.out.print("O comprimento do piso: ");
		comprimento = input.nextDouble();
		piso.setAltura(comprimento);
		
		areaPiso = piso.calcularArea();
		
		quantidadePecas = areaAmbiente / areaPiso;
		
		sobra = quantidadePecas * 0.1;
		quantidadePecas += sobra;
		
		quantidadePecas = Math.ceil(quantidadePecas);
		
		System.out.println("\nPara esse ambiente são necessários " + quantidadePecas + " pisos." );
		
		do {
			
			System.out.println("O ambiente possui portas?(S / N)");			
			resposta = Character.toUpperCase(input.next().charAt(0));
			
		} while (resposta != 'S' && resposta != 'N');
		
		perimetro = ambiente.calcularPerimetro();

		if (resposta == 'S') {
			do {
				
				System.out.print("Informe a quantidade de portas: ");
				qtdPortas = input.nextInt();	
				
			} while (qtdPortas <= 0);
			
			do {
				
				System.out.print("Informe a largura da porta: ");
				larguraPorta = input.nextDouble();	
				
			} while (larguraPorta <= 0);
			
			perimetro -= (qtdPortas * larguraPorta);
			
		} 
		
		sobra = perimetro * 0.1;
		perimetro += sobra;
		
		System.out.printf("\nPara esse ambiente são necessários %.2fm de roddapé.", perimetro);

		input.close();
	}

}
