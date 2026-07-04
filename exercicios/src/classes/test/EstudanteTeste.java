package classes.test;

import classes.dominio.Estudante;

public class EstudanteTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estudante estudante = new Estudante();
		
		estudante.nome = "Maria";
		estudante.idade = 33;
		estudante.sexo ='F';
		
		System.out.printf("Nome: %s\nIdade: %d\nSexo: %c", 
				estudante.nome, estudante.idade, estudante.sexo);
	}

}
