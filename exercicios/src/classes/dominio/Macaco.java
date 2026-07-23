package classes.dominio;
import java.util.ArrayList;

public class Macaco {
	
	private String nome;
	private ArrayList <String> estomago = new ArrayList<>();
	
	
	public void comer(String alimento) {
		
		estomago.add(alimento) ;
	}
	
	public void comer(Macaco macaco) {
		
		//estomago.add(macaco) ;
	}
 
	public ArrayList <String> verificarEstomago() {
				
		return this.estomago;
	} 
 
	public void digerir() {
		if (estomago.size() != 0)
			estomago.removeFirst();
	}

	
	public Macaco(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList <String> getEstomago() {
		return this.estomago;
	}

	/*public void setEstomago(String estomago) {
		this.estomago = estomago;
	}*/
	
	

}
