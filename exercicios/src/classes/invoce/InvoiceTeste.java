package classes.invoce;
import javax.swing.JOptionPane;

public class InvoiceTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numero, descricao, message;
		int quantidade;
		double preco, valorFatura;
		
		numero = JOptionPane.showInputDialog("Informe o código do produto");
		descricao = JOptionPane.showInputDialog("Informe a descrição do produto");
		quantidade = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade do produto"));
		preco = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço do produto"));

		Invoice invoice = new Invoice(numero, descricao, quantidade, preco);
		valorFatura = invoice.getInvoiceAmount();
		
		message = String.format("Código: %s%nDescrição: %s%nQuantidade: %d%nPreco: %.2f%nValor Fatura: %.2f",
				invoice.getNumero(), invoice.getDescricao(), invoice.getQuantidade(), invoice.getPreco(), valorFatura);
		JOptionPane.showMessageDialog(null, message);
	}

}

/*
(Classe Invoice) Crie uma classe chamada Invoice para que uma loja de suprimentos de informática a utilize para representar uma
fatura de um item vendido nela. Uma Invoice (fatura) deve incluir quatro partes das informações como variáveis de instância — o
número (tipo String), a descrição (tipo String), a quantidade comprada de um item (tipo int) e o preço por item (double). Sua
classe deve ter um construtor que inicializa as quatro variáveis de instância. Forneça um método set e um get para cada variável de instância.
Além disso, forneça um método chamado getInvoiceAmount que calcula o valor de fatura (isto é, multiplica a quantidade pelo
preço por item) e depois retorna esse valor como double. Se a quantidade não for positiva, ela deve ser configurada como 0. Se o preço
por item não for positivo, ele deve ser configurado como 0.0. Escreva um aplicativo de teste chamado InvoiceTest que demonstra as
capacidades da classe Invoice.
*/