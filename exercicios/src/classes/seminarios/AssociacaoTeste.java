package classes.seminarios;

public class AssociacaoTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Local local = new Local("Rua das Laranjeiras");
		
		Aluno aluno = new Aluno("Rita Lee", 43);
		Aluno[] alunosSeminario = {aluno};
		
		Professor professor = new Professor("Barba branca", "Pirata");
		
		Seminario seminario = new Seminario("Onde achar One Piece", alunosSeminario, local);
		Seminario [] seminariosDisponiveis = {seminario};
		
		professor.setSeminarios(seminariosDisponiveis);
		
		professor.imprime();
	}

}
/*
Crie um sistema que gerencie seminários

O Sistema deverá cadastrar seminários, estudantes, professores e Local onde será realizado

Um aluno poderá estar em apenas um seminário
Um seminário poderá ter nenhum ou vários alunos
Um professor poderá ministrar vários seminários
Um seminário deve ter um local

Campos básicos (Excluindo relacionamento)
seminário: título
aluno: nome e idade
professor: nome e especialidade
local: endereço
*/