package classes.test;
import classes.dominio.Carro;

public class CarroTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro carro1 = new Carro();
		Carro carro2 = new Carro();
		
		carro1.nome = "Fusca";
		carro1.modelo = "Volkswagen";
		carro1.ano = 1983;
		
		carro2.nome = "Brasilia";
		carro2.modelo = "Volkswagen";
		carro2.ano = 1962;

		System.out.printf("%s %s %d", carro1.nome, carro1.modelo, carro1.ano);
		System.out.printf("\n%s %s %d", carro2.nome, carro2.modelo, carro2.ano);
	}

}
