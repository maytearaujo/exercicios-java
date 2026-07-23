package classes.heranca.teste;
import classes.heranca.dominio.*;
public class HerancaTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa pessoa = new Pessoa("Maria Gabriela");
		Endereco endereco = new Endereco();
		Funcionario funcionario = new Funcionario("Carolina Maria de Jesus");
		
		endereco.setRua("Rua 31 de Janeiro");
		endereco.setCep("12356-789");
		
		//pessoa.setNome("Maria Gabriela");
		pessoa.setCpf("123.456.789.89");
		pessoa.setEndereco(endereco);

		System.out.println("--------- Pessoa ---------");
		pessoa.imprime();
		
		//funcionario.setNome("Carolina Maria de Jesus");
		funcionario.setCpf("321.654.987-89");
		funcionario.setEndereco(endereco);
		funcionario.setSalario(456359);
		
		System.out.println("\n--------- Funcionário ---------");
		funcionario.imprime();
	}

}
