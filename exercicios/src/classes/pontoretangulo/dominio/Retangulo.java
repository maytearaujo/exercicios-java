package classes.pontoretangulo.dominio;

public class Retangulo {
	private int largura;
	private int altura;	
	private Ponto ponto;
	
	public Retangulo() {
		
	}
	
	public Retangulo(int largura, int altura, Ponto ponto) {
		this.largura = largura;
		this.altura = altura;
		this.ponto = ponto;
	}
	
	public Ponto encontrarCentroRetangulo() {
		int x, y;
		Ponto centro;
		

			x = (this.largura / 2) + ponto.getX();
			y = (this.altura / 2) + ponto.getY();	
			
			centro = new Ponto(x, y);
			
			return centro;
	}

	public int getLargura() {
		return largura;
	}

	public void setLargura(int largura) {
		this.largura = largura;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	
}
