package classes.teste;
import classes.dominio.Jogadora;

public class JogadoraTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jogadora jogadora1 = new Jogadora("Formiga", "São Paulo");
		Jogadora jogadora2 = new Jogadora("Marta", "Orlando Pride");
		Jogadora jogadora3 = new Jogadora("Ludmila", "San Diego Wave FC");
		
		Jogadora[] jogadoras = new Jogadora[] {jogadora1, jogadora2, jogadora3};
		
		for (Jogadora jogadora: jogadoras) {
			jogadora.imprime();
		}
	}

}
