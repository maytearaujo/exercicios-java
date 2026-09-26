package livro;

import java.util.Arrays;

public class ArrayManipulations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [] doubleArray = {8.4, 9.3, 0.2, 7.9, 3.4};
		String description;
		
		description = "Double Array original";
		diplayArraysDouble(doubleArray, description);
		
		description ="Double Array Ordered";
		// coloca o array em ordem crescente
		Arrays.sort(doubleArray);
		diplayArraysDouble(doubleArray, description);
			
		description = "\nFill array with value 7: \nBefor";
		int [] filledIntArray = new int[10];
		
		diplayArraysInt(filledIntArray, description);
		
		description ="After";
		//preenche o array com o numero 7
		Arrays.fill(filledIntArray,7);
		diplayArraysInt(filledIntArray, description);
		
		
		int [] intArray = {1, 2, 3, 4, 5, 6, 7, 8};
		int [] intArrayCopy = new int [intArray.length];
		
		description = "\nintArray";
		diplayArraysInt(intArray, description);
		
		//copia um array para o outro
		//System.arraycopy(arrayCopiado, posicaoInicial, arrayRecebeCopia, posicaoInicial, quantidadeValoresCopiados);
		System.arraycopy(intArray, 0, intArrayCopy, 0, intArray.length);
		description = "intArrayCopy";
		diplayArraysInt(intArrayCopy, description);
		
		//Verifica se dois array são iguais
		boolean b = Arrays.equals(intArray, intArrayCopy);
		
		System.out.printf("%n%nintArray %s intArrayCopy", b ? "==" : "!=");
		
		b = Arrays.equals(intArray, filledIntArray);
		System.out.printf("%nintArray %s filledIntArray", b ? "==": "!=");
		
		//Pesquisa o valor de 5 em intArray
		int location = Arrays.binarySearch(intArray, 5);
		
		if (location >= 0)
			System.out.printf("\n\nFound 5 at element %d intArray", location);
		else
			System.out.println("5 not found in intArray");
		
		//Pesquisa o valor 8763 em intArray
		location = Arrays.binarySearch(intArray, 8673);
		
		if(location >= 0)
			System.out.printf("\n\nFound 8673 at element %d intArray", location);
		else
			System.out.println("\n\n8673 not found in intArray");
		
		
	}
	
	public static void diplayArraysInt(int [] array, String description) {
		System.out.printf("%n%s: ", description);
		for (int value: array)
			System.out.print( value + " ");
	}
	
	public static void diplayArraysDouble(double [] array, String description) {
		
		System.out.printf("%n%s: ", description);
		for (double value: array)
			System.out.print( value + "  ");
	}
	
	

}
