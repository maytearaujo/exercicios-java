package classes.dominio;

public class Retangulo {
	private double base;
	private double altura;
	
	public void setBase(double base) {
		this.base = base;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getBase() {
		return this.base;
	}
	
	public double getAltura() {
		return this.altura;
	}
	
	public void mudarValorLados(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public String retornarValorLados() {
		String valorLados;
		
		valorLados = "Base: " + this.base + "\nAltura: " + this.altura;
		
		return valorLados;		
	}
	
	public double calcularArea() {
		double areaRetangulo;
		areaRetangulo = this.base * this.altura;
		
		return areaRetangulo;	
	}
	
	public double calcularPerimetro() {
		double perimetroRetangulo;
		
		perimetroRetangulo = 2 * (this.base + this.altura);
		
		return perimetroRetangulo;		
	}
	
}
