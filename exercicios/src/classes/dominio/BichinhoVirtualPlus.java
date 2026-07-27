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
	
	public int getTedio() {
		return this.tedio;
	}
	
	public void setTedio(int tedio) {
		this.tedio = tedio;
	}
	
	
}
