package classes.healthProfile;
import java.time.LocalDate;
import java.time.Period; 

public class HealthProfile {
	private String nome;
	private String sobrenome;
	private Genero genero;
	private int mesNascimento;
	private int diaNascimento;
	private int anoNascimento;
	private double altura;
	private double peso;
		
	
	public HealthProfile(String nome, String sobrenome, Genero genero, int mesNascimento, int diaNascimento,
			int anoNascimento, double altura, double peso) {
		this.setNome(nome);
		this.setSobrenome ( sobrenome);
		this.setGenero(genero);
		this.setMesNascimento(mesNascimento);
		this.setDiaNascimento (diaNascimento);
		this.setAnoNascimento(anoNascimento);
		this.setAltura(altura);
		this.setPeso ( peso);
	}
	
	public int calculaIdade() {
		int idade;
		LocalDate dataNascimento = LocalDate.of(anoNascimento, mesNascimento, diaNascimento);
		LocalDate dataHoje = LocalDate.now();
		Period periodo = Period.between(dataNascimento, dataHoje);
		idade = periodo.getYears() ;
		
		return idade;
	}

	public double calculaFrequenciaCardiacaMaxima() {
		
		double frequenciaMaxima = 220 - calculaIdade();
		
		
		return frequenciaMaxima;
	}
	
	public String calculaFrequenciaCardiacaAlvo() {
		double frequenciaAlvo50 = calculaFrequenciaCardiacaMaxima() * 0.5;
		double frequenciaAlvo85 = calculaFrequenciaCardiacaMaxima() * 0.85;
		String frequenciaAlvo = String.format("entre %.0f - %.0f", frequenciaAlvo50, frequenciaAlvo85 );
		
		return frequenciaAlvo;
	}
	
	public double calcularImc() {
		double imc = this.getPeso() / (this.getAltura() * this.getAltura());
				
		return imc;
	}
	
	public String exibirTabelaImc() {
		return "\n\n******************************\n"
				+ "        Valores de IMC"
				+ "\n******************************\n"
				+ "Abaixo do peso: menos de 18,5\r\n"
				+ "Normal: entre 18,5 e 24,9\r\n"
				+ "Sobrepeso: entre 25 e 29,9\r\n"
				+ "Obesidade: 30 ou mais"
				+"\n******************************";
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if (!nome.isBlank()) {
			this.nome = nome;
		}
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		if(!sobrenome.isEmpty()) {
			this.sobrenome = sobrenome;
		}
	}
	public Genero getGenero() {
		return genero;
	}
	public void setGenero(Genero genero) {	
			this.genero = genero;
	}
	public int getMesNascimento() {
		return mesNascimento;
	}
	public void setMesNascimento(int mesNascimento) {
		if (mesNascimento >= 1 && mesNascimento <= 12) {
			this.mesNascimento = mesNascimento;
		}
	}
	public int getDiaNascimento() {
		return diaNascimento;
	}
	public void setDiaNascimento(int diaNascimento) {
		if(diaNascimento > 0 && diaNascimento <= 31) {
			this.diaNascimento = diaNascimento;
		}
	}
	public int getAnoNascimento() {
		return anoNascimento;
	}
	public void setAnoNascimento(int anoNascimento) {
		if (anoNascimento > 0) {
			this.anoNascimento = anoNascimento;
		}
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		if (altura > 0) {			
			this.altura = altura;
		}
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		if (peso > 0) {			
			this.peso = peso;
		}
	}
	
	
}
