package repeticao;
import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		ArrayList <Float> listaPrecos = new ArrayList<>();
		float preco, total = 0, dinheiro = 0, troco;
		char resposta=' ';
		
		do {
		
			do {
				
				do {
					System.out.print("Informe o preco do produto: ");
					preco = leitor.nextFloat();
				} while (preco < 0) ;
				
				if (preco != 0)
					listaPrecos.add(preco);
				
			} while (preco != 0);
					
			for (int p = 0; p < listaPrecos.size(); p++) {
				total += listaPrecos.get(p);
			}
			
			System.out.printf("\nTotal: %.2f", total);
			
			do {
				System.out.print("\nInforme o dinheiro do cliente: ");
				dinheiro = leitor.nextFloat();
			} while (dinheiro < total);
	
			troco = dinheiro - total;
			
			System.out.println("\nLojas Tabajara");
	
			
			for (int p = 0; p < listaPrecos.size(); p++) {
				System.out.println("Produto "+ (p+1) + ": R$" + listaPrecos.get(p));
			}
			System.out.printf("Total: %.2f\n", total);
			System.out.println("Dinheiro: R$" + dinheiro);
			System.out.println("Troco: R$ " + troco);
			
			do {
				System.out.print("\nDeseja realizar outra compra? S - Sim    N - Não: ");
				resposta = leitor.next().charAt(0);
			} while (resposta != 's' && resposta != 'n');
		} while (resposta == 's');
		leitor.close();
	}

}
/*
O Sr. Manoel Joaquim expandiu seus negócios para além dos negócios de 1,99 e agora possui uma loja de conveniências. Faça um programa 
que implemente uma caixa registradora rudimentar. O programa deverá receber um número desconhecido de valores referentes aos preços das mercadorias. Um valor zero deve ser informado pelo operador para indicar o final da compra. O programa deve então mostrar o total da compra e perguntar o valor em dinheiro que o cliente forneceu, para então calcular e mostrar o valor do troco. Após esta operação, o programa deverá voltar ao ponto inicial, para registrar a próxima compra. A saída deve ser conforme o exemplo abaixo:
Lojas Tabajara 
Produto 1: R$ 2.20
Produto 2: R$ 5.80
Produto 3: R$ 0
Total: R$ 9.00
Dinheiro: R$ 20.00
Troco: R$ 11.00
...
*/