package classes.dominio;

public class BichinhoVirtualPlus extends BichinhoVirtual {
	
	private int tedio;
	
	public BichinhoVirtualPlus(int fome) {
		super(fome);
	}
	
	public void ajustarFome(int qtdComida) {
		this.setFome(this.getFome() - qtdComida);
	}

	public void ajustarTedio(int tempoBrincadeira) {
		this.setTedio(this.getHumor() - tempoBrincadeira);
	}
	
	
	


	@Override
	public String toString() {
		return "BichinhoVirtualPlus ["+ "\n "
				+ "Nome: " + getNome() +"\n "
				+ "Idade: " + getIdade() + "\n "
				+ "Fome: " + getFome() + "\n "
				+ "Humor: " + getHumor() + "\n "
				+ "Saude: " + getSaude() + "\n "
				+ "tedio: " + tedio + "\n "+ "]";
	}

	public int getTedio() {
		return this.tedio;
	}
	
	public void setTedio(int tedio) {
		this.tedio = tedio;
	}
	
	
}
