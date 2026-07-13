package classes.dominio;

public class Pessoa {
	
	private String nome;
	private int idade;
	private double peso;
	private double altura;
	

	public void envelhecer(int anos) {
		
		for (int i = 0; i < anos; ++i) {
			
			this.idade += 1;
			
			if (this.idade < 21) {
				crescer(0.005);
			}
		}
	}
	
	public void engordar(double peso) {
		this.peso += peso;
	}
	
	public void emagrecer(double peso) {
		this.peso -= peso;
	}
	
	public void crescer(double altura) {
		this.altura += altura;
	}

	public void imprimir() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
		System.out.printf("Altura: %.2f\n", this.altura);
		System.out.println("Peso: " + this.peso);
	}
	
	public final String getNome() {
		return nome;
	}
	
	public final void setNome(String nome) {
		this.nome = nome;
	}
	
	public final int getIdade() {
		return idade;
	}
	
	public final void setIdade(int idade) {
		this.idade = idade;
	}
	
	public final double getPeso() {
		return peso;
	}
	
	public final void setPeso(double peso) {
		this.peso = peso;
	}
	
	public final double getAltura() {
		return altura;
	}
	
	public final void setAltura(double altura) {
		this.altura = altura;
	}
}
