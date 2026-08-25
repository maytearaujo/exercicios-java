package classes.employee;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double aumento;
		Employee employee1 = new Employee("Maria", "Ramos", 5200);
		Employee employee2 = new Employee("Carla", "Barbosa", 7600);
		
		System.out.printf("%-15s%-8s%17s%n", "FUNCIONÁRIO", "SALÁRIO", "SALÁRIO ANUAL");
		System.out.printf("%s %-8s %6.2f %12.2f%n", employee1.getNome(), employee1.getSobrenome(), employee1.getSalario(), employee1.getSalario() * 12);
		System.out.printf("%s %-8s %.2f %12.2f%n", employee2.getNome(), employee2.getSobrenome(), employee2.getSalario(), employee2.getSalario() * 12);
		
		System.out.println("\nAumento de 10%");
		
		aumento = employee1.getSalario() * 0.1;
		employee1.setSalario(employee1.getSalario() + aumento);
		
		aumento = employee2.getSalario() * 0.1;
		employee2.setSalario(employee2.getSalario() + aumento);

		System.out.printf("%-15s%-8s%17s%n", "FUNCIONÁRIO", "SALÁRIO", "SALÁRIO ANUAL");
		System.out.printf("%s %-8s %6.2f %12.2f%n", employee1.getNome(), employee1.getSobrenome(), employee1.getSalario(), employee1.getSalario() * 12);
		System.out.printf("%s %-8s %.2f %12.2f%n", employee2.getNome(), employee2.getSobrenome(), employee2.getSalario(), employee2.getSalario() * 12);
	}

}
/*
(Classe Employee) Crie uma classe chamada Employee que inclua três variáveis de instância — um primeiro nome (tipo String), um
sobrenome (tipo String) e um salário mensal (double). Forneça um construtor que inicializa as três variáveis de instância. Forneça um
método set e um get para cada variável de instância. Se o salário mensal não for positivo, não configure seu valor. Escreva um aplicativo de
teste chamado EmployeeTest que demonstre as capacidades da classe Employee. Crie dois objetos Employee e exiba o salário anual
de cada objeto. Então dê a cada Employee um aumento de 10% e exiba novamente o salário anual de cada Employee.
*/