package classes.teste;
import classes.dominio.Jogadora;
import classes.dominio.Time;

public class JogadoraTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time time1 = new Time();
		Time time2 = new Time();
		Time time3 = new Time();
		
		time1.setNome("São Paulo");
		time2.setNome("Orlando Pride");
		time3.setNome("San Diego Wave FC");
		
		Jogadora jogadora1 = new Jogadora("Formiga", time1);
		Jogadora jogadora2 = new Jogadora("Marta", time2);
		Jogadora jogadora3 = new Jogadora("Ludmila", time3);
		
		Jogadora[] jogadoras = new Jogadora[] {jogadora1, jogadora2, jogadora3};
		
		for (Jogadora jogadora: jogadoras) {
			jogadora.imprime();
		}
	}

}
