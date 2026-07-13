package classes.dominio;

public class ContaCorrente {

	private int numeroConta;
	private String nomeCorrentista;
	private double saldo;

	
	public ContaCorrente(int numeroConta, String nomeCorrentista){
		
		this.numeroConta = numeroConta;
		this.nomeCorrentista = nomeCorrentista;
		this.saldo = 0;
		
	}
	
	public ContaCorrente(int numeroConta, String nomeCorrentista, double saldo){
		
		this(numeroConta, nomeCorrentista);
		this.saldo = saldo;
		
	}
	
	public void alterarNome(String novoNome){
		this.nomeCorrentista = novoNome;
	}
	
	public boolean depositar(double valorDeposito) {
		
		if (valorDeposito > 0) {
			
			this.saldo += valorDeposito;
			return true;
		}
		
		return false;
	}
	
	public boolean sacar(double valorSaque) {
		double aux;
		
		aux = this.saldo - valorSaque;
		
		if (aux >= 0) {
			
			this.saldo -= valorSaque;
			return true;
		}
		
		return false;
	}
	
	public int getNumeroConta() {
		return this.numeroConta;
	}
	
	
	public String getNomeCorrentista() {
		return this.nomeCorrentista;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
}
