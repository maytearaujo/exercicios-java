package classes.dominio;

public class ContaInvestimento extends ContaCorrente {

	private double taxaJuros;
	
	public ContaInvestimento(int numeroConta, String nomeCorrentista, double saldo, double taxaJuros) {
		super(numeroConta, nomeCorrentista, saldo);
		this.taxaJuros = taxaJuros;

		
	}
	
	public void adicioneJuros() {
		this.saldo += this.saldo * this.taxaJuros;
	}

	public double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	

	
	
}
