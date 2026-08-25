package classes.invoce;

public class Invoice {
	private String numero;
	private String descricao;
	private int quantidade;
	private double preco;
	
	public Invoice(String numero, String descricao, int quantidade, double preco) {
		
		this.numero = numero;
		this.descricao = descricao;
		this.setQuantidade(quantidade);
		this.setPreco(preco);
	}
	
	public double getInvoiceAmount() {
		return this.preco * this.quantidade;
	}
	
	public String getNumero() {
		return this.numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public int getQuantidade() {
		return this.quantidade;
	}
	
	public void setQuantidade(int quantidade) {
		if (quantidade < 0)
			this.quantidade = 0;
		else
			this.quantidade = quantidade;
	}
	
	public double getPreco() {
		return this.preco;
	}
	
	public void setPreco(double preco) {
		if (preco < 0)
			this.preco = 0;
		else
			this.preco = preco;
	}
}
