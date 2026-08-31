package classes.healthProfile;

public class HealthProfileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HealthProfile healthProfile = new HealthProfile("Marilia", "Gabriela", Genero.FEMININO, 4, 9, 1980, 1.70, 80.0);
		
		System.out.printf(""
				+ "%nNome: %s %s%n"
				+ "Genero: %s%n"
				+ "Data de nascimento: %d/%d/%d%n"
				+ "Idade: %d anos%n"
				+ "Altura: %.2f%n"
				+ "Peso: %.2f%n"
				+ "IMC: %.1f%n"
				+ "Frequência cardíaca:%n"
				+ " - Máxima: %.2f%n"
				+ " - Alvo: %s",
				healthProfile.getNome(), healthProfile.getSobrenome(),
				healthProfile.getGenero(),
				healthProfile.getDiaNascimento(), healthProfile.getMesNascimento(), healthProfile.getAnoNascimento(),
				healthProfile.calculaIdade(),
				healthProfile.getAltura(),
				healthProfile.getPeso(),
				healthProfile.calcularImc(),
				healthProfile.calculaFrequenciaCardiacaMaxima(),
				healthProfile.calculaFrequenciaCardiacaAlvo()
				);
		System.out.println(healthProfile.exibirTabelaImc());
		
	}

}
