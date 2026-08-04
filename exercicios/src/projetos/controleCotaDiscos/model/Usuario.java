package projetos.controleCotaDiscos.model;

public class Usuario {
	private String login;
	private double bytesUtilizados;
	
	public Usuario (String login, double bytesUtilizados) {
		this.login = login;
		this.bytesUtilizados = bytesUtilizados;
	}
	
	
	public double converterBytsMegabyts (double valorBytes) {
		double valorMegabytes = valorBytes;
		
		for ( int i = 1; i <= 2; i++) {
			valorMegabytes /= 1024;
		}
		
		return valorMegabytes;
	}
	
	public Usuario() {
		
	}
	
	public String getLogin() {
		return this.login;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public double getBytesUtilizados() {
		return this.bytesUtilizados;
	}
	
	public void setBytesUtilizados(double bytesUtilizados) {
		this.bytesUtilizados = bytesUtilizados;
		
	}
	
}
