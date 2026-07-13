package classes.teste;
import classes.dominio.PessoaExemplo;

public class PessoaExemploTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PessoaExemplo pessoa = new PessoaExemplo();
		
		pessoa.setNome("Margarida");
		pessoa.setIdade(23);
		
		System.out.printf("Nome: %s\nIdade: %d", pessoa.getNome(), pessoa.getIdade());
	}

}
