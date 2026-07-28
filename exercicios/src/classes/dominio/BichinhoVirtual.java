package classes.dominio;

public class BichinhoVirtual {
	private String nome;
	private int fome;
	private int saude;
	private int idade;
	

	public BichinhoVirtual(int fome) {
		this.fome = fome;
	}

	public BichinhoVirtual(String nome, int idade, int saude, int fome) {
		this.nome = nome;
		this.idade = idade;
		this.saude = saude;
		this.fome = fome;
	}
	
	/*@Override
	public String toString() {
		return String.format("%-10s %-7d %-8d %-8d\n", 
				getNome(),
				getIdade(),
				getFome(), 
				getSaude()
				);
	}*/

	public int getHumor() {
		
		return ((100 - this.fome )+ this.saude) / 2;
				
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		if (!nome.isEmpty() && nome != null && !nome.isBlank())
			this.nome = nome;
	
	}

	public int getFome() {
		return this.fome;
	}
	
	public void setFome(int fome) {
		if (fome >=0 && fome <= 100)
			this.fome = fome;
	}

	public int getSaude() {
		return this.saude;
	}
	
	public void setSaude(int saude) {
		if (saude >= 0 && saude <= 100)
			this.saude = saude;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public void setIdade(int idade) {
		if (idade >= 0)
			this.idade = idade;
	}
}
