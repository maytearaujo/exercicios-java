package projetos.controleCotaDiscos.service;

import projetos.controleCotaDiscos.model.Usuario;

public class RelatorioService {

	Usuario usuario = new Usuario();
	
	public double calcularTotal (double espacoMegabytes) {
		
		double total = 0;
		
		espacoMegabytes = usuario.converterBytsMegabyts(espacoMegabytes);
		
		total += espacoMegabytes;
		
		return total;
	}
	
	public double calcularMedia (double total, int quantidade) {
		double media = 0;
		
		media = total / quantidade;
		
		return media;
	}
	
	public double calcularPercentural (double espacoMegabytes, double total) {
		double percentual;
		
		percentual = (usuario.converterBytsMegabyts(espacoMegabytes) * 100) / total;
		
		return percentual;
	}
	
	public String montarTextoRelatorio(Usuario usuario, double percentualUso, int i) {
		String conteudo = "";
		
		conteudo += String.format(""
				+ "%-3d"
				+ "%-10s"
				+ "%3s"
				+ "%.2f"
				+ "%s"
				+ "%-12s"
				+ "%.2f"
				+ "%s\n",
				(i + 1), 
				usuario.getLogin(), 
				" ",
				usuario.converterBytsMegabyts(usuario.getBytesUtilizados()), 
				"MB", 
				" ",
				percentualUso, 
				"%");
		
		return conteudo;
	}
	
	public String relatorioFinal(double total, double media, String conteudo) {
		
		String titulo, rodape, conteudoFinal;
		titulo = "ACME Inc.               Uso do espaço em disco pelos usuários\r\n"
				+ "------------------------------------------------------------------------\r\n"
				+ "Nr.  Usuário  Espaço utilizado     % do uso\r\n"
				+ "";
		rodape =  String.format("\nEspaço total ocupado: %.2fMB\n"
				+ "Espaço médio ocupado: %.2fMB", total, media);
		conteudoFinal = titulo + conteudo + rodape;
		
		return conteudoFinal;
	}
	
}
