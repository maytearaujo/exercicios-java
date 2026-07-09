package classes.teste;
import classes.dominio.Pessoa;

public class PessoaTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome("Margarida");
		pessoa.setIdade(23);
		
		System.out.printf("Nome: %s\nIdade: %d", pessoa.getNome(), pessoa.getIdade());
	}

}
