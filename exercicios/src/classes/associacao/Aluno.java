package classes.seminarios;

public class Aluno {
	private String nome;
	private int idade;
	private Seminario seminario;
	
	public Aluno(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public Aluno(String nome, int idade, Seminario seminario, Professor professor) {
		this.nome = nome;
		this.idade = idade;
		this.seminario = seminario;
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

	public Seminario getSeminario() {
		return seminario;
	}

	public void setSeminario(Seminario seminario) {
		this.seminario = seminario;
	}
	
}
