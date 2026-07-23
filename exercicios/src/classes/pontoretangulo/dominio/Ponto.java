package classes.pontoretangulo.dominio;

public class Ponto {
	private int x;
	private int y;
	
	public Ponto(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void imprimir() {
		
		System.out.println("x: " + this.x);
		System.out.println("y: " + this.y);
		
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	
}
