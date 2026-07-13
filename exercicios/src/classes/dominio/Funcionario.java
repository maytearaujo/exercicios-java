package classes.dominio;

public class Funcionario {
	
	private String nome;
	private int idade;
	private double[] salarios = new double[3];
	private double somaSalarios, mediaSalarios;

	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void setSalarios(double [] salarios) {
		this.salarios = salarios;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public double[] getSalarios() {
		return this.salarios;
	}
	
	public void imprimeDados() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
		System.out.print("Salarios: ");
				
		if (salarios == null) {
			return;
		}
		
		for (double salario: salarios) {
			
			System.out.print(salario + " ");
		}
		
	}
	

	public void imprimeMediaSalarial() {
				
		if (salarios == null) {
			return;
		}
		
		for (double salario: salarios) {
			somaSalarios += salario;			
		}
		
		mediaSalarios = somaSalarios / salarios.length;
		
		System.out.println("\nMedia salarios: " + mediaSalarios);
	}
	
}
