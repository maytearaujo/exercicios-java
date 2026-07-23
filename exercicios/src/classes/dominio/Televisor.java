package classes.dominio;

public class Televisor {
	
	private int numeroCanal;
	private int volume;
	
	public Televisor() {
		
		this.numeroCanal = 1;
		this.volume = 10;
	}
		
	public boolean trocarCanal(int numeroCanal) {
		
		if (numeroCanal > 0 && numeroCanal <= 200) {
			return true;
		}
		
		return false;
	}
	
	public void aumentarVolume() {
		
		if (this.volume >= 0 && this.volume < 100) {
			
			this.volume++;
		}

	}
	
	public void diminuirVolume() {
		
		if (this.volume > 0 && this.volume <= 100) {
			
			this.volume--;
		}

	}
	
	public int getNumeroCanal() {
		
		return this.numeroCanal;
	}
	
	public int getVolume() {
		return this.volume;
	}


}
