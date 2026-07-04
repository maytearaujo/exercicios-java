package classes.test;

import classes.dominio.Professor;

public class ProfessorTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Professor professor = new Professor();

		professor.nome = "Marilza";
		professor.materia = "Lingua Portuguesa";
		
		System.out.println("Professor: " + professor.nome + " Matéria: " + professor.materia);
	}

}
