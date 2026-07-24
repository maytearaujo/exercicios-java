package classes.carro;

public class Carro {
	
	private double quantidadeCombustivel;
	private double consumoCombustivel;
	
	public Carro( double consumoCombustivel) {
		this.quantidadeCombustivel = 0;
		this.consumoCombustivel = consumoCombustivel;
	}
	
	public void andar(double km ) {
		double litros = km / this.consumoCombustivel ;
		
		if (litros <= this.quantidadeCombustivel) {
			
			this.quantidadeCombustivel -= litros;
		} else {
			System.out.println("Combustível insuficiente.");
		}
		
	}
	
	public double obterGasolina() {
		return this.quantidadeCombustivel;
	}
	
	public void adicionarGasolina(double litros) {
		this.quantidadeCombustivel += litros;
	}

	public void setConsumoCombustivel(double consumoCombustivel) {
		this.consumoCombustivel = consumoCombustivel;
	}
	
	
}
