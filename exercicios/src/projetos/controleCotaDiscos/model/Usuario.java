package projetos.controleCotaDiscos.model;

public class Usuario {
	private String login;
	private double bytesUtilizados;
	
	public Usuario (String login, double bytesUtilizados) {
		this.login = login;
		this.bytesUtilizados = bytesUtilizados;
	}
	
	
	public double getEspacoEmMegabytes () {
		double espacoMegabytes = 0;		
		
		espacoMegabytes = this.getBytesUtilizados() / (1024 * 1024);
		
		
		return espacoMegabytes;
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
