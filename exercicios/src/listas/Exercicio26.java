package listas;
import java.util.ArrayList;
import java.util.Iterator;

public class Exercicio26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> frutas = new ArrayList<String>();
		
		frutas.add("Banana");
		frutas.add("Abacaxi");
		frutas.add("Cajú");
		frutas.add("Damasco");
		
		Iterator <String> percorrer = frutas.iterator();
		
		while(percorrer.hasNext()) {
		System.out.println(percorrer.next());
		}
		
		System.out.println();
		frutas.forEach(System.out::println);
	}

}
