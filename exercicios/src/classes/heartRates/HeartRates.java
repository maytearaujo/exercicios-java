package classes.heartRates;
import java.time.LocalDate;
import java.time.Period;

public class HeartRates {
	private String nome;
	private String sobrenome;
	private int mes;
	private int ano;
	private int dia;
	
	public HeartRates(String nome, String sobrenome, int mes, int dia, int ano) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		setMes(mes);
		setDia(dia);
		this.ano = ano;
	}
	
	public int calculaIdade() {
		
		LocalDate dataHoje = LocalDate.now();
		LocalDate dataNascimento = LocalDate.of(this.ano, this.mes, this.dia);
		Period periodo = Period.between(dataNascimento, dataHoje);
		
		int idade = periodo.getYears();
		return idade;
		
	}
	
	public double calculaFrequenciaMaxima() {
		
		double frequenciaMaxima = 220 - calculaIdade();
		
		
		return frequenciaMaxima;
	}
	
	public String calculaFrequenciaAlvo() {
		double frequenciaAlvo50 = calculaFrequenciaMaxima() * 0.5;
		double frequenciaAlvo85 = calculaFrequenciaMaxima() * 0.85;
		String frequenciaAlvo = String.format("entre %.0f - %.0f", frequenciaAlvo50, frequenciaAlvo85 );
		
		return frequenciaAlvo;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSobrenome() {
		return this.sobrenome;
	}
	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public int getMes() {
		return this.mes;
	}
	
	public void setMes(int mes) {
		if (mes > 0 && mes <= 12) {			
			this.mes = mes;
		}
	}
	
	public int getDia() {
		return this.dia;
	}
	
	public void setDia(int dia) {
		if (dia >=1 && dia <= 31 ) {			
			this.dia = dia;
		}
	}
	
	public int getAno() {
		return this.ano;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
}
