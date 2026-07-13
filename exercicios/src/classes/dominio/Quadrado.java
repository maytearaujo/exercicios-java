package classes.dominio;

public class Quadrado {
	
	private double tamanhoLado;
	
	public void setTamanhoLado(double tamanhoLado) {
		
		this.tamanhoLado = tamanhoLado;
	}
	
	public double getTamanhoLado() {
		return this.tamanhoLado;
	}

	public void mudarValorLado(double novoLado){		
		
		this.tamanhoLado = novoLado;
	}
	
	public double retornarValorLado() {
		return this.tamanhoLado;
	}
	
	public double calcularArea() {
		
		double area;
		
		area = this.tamanhoLado * this.tamanhoLado;
		
		return area;
	}
}
