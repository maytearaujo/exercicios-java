package classes.teste;
import classes.dominio.Funcionario;

public class FuncionarioTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Funcionario funcionario = new Funcionario();
		
		funcionario.setNome("Maria Madalena");
		funcionario.setIdade(33);
		funcionario.setSalarios(new double [] {3800, 45000, 9000});
		
		funcionario.imprimeDados();
		funcionario.imprimeMediaSalarial();
	}

}
