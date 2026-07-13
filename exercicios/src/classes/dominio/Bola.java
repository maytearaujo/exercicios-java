package classes.dominio;

import java.util.Random;

public class Bola {
	
	private String cor;
	private int circunferencia;
	private String material;


	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void setCircunferencia(int circunferencia) {
		this.circunferencia = circunferencia;
	}
	
	public void setMaterial(String material) {
		this.material = material;
	}
	
	public String getCor() {
		return this.cor;
	}
	
	public int getCircunferencia() {
		return this.circunferencia;
	}
	
	public String getMaterial() {
		return this.material;
	}
	
	public void trocaCor() {
		
		Random gerador = new Random();
		String [] cores = {"Azul", "Laranja", "Verde", "Amarelo", "Lilás", "Preto", "Branco"};
		String novaCor;
		int indice;
		
		indice = gerador.nextInt(cores.length);
		
		novaCor = cores[indice];
		
		this.cor = novaCor;

	}
	
	public void mostraCor() {
		
	    System.out.println(this.cor);

		 
	}
}