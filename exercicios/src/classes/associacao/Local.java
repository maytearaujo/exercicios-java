package classes.associacao;

public class Local {
	private String endereco;
	private Seminario seminario;

	public Local(String endereco) {
		this.endereco = endereco;
	}

	public final String getEndereco() {
		return endereco;
	}

	public final void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
}
