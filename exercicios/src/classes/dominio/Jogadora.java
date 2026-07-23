package classes.dominio;

public class Jogadora {
	
	private String nome;
	private Time time;
	
	public Jogadora(String nome, Time time) {
		
		this.nome = nome;
		this.time = time;
	}
	
	public void imprime() {
		System.out.print(this.nome);
		
		if (time != null) {
			System.out.print(" - " + time.getNome() + "\n");
		}
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTime() {
		return time.getNome();
	}
	
	public void setClube(Time time) {
		this.time = time;
	}
}
