package projetos.controleCotaDiscos.service;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import projetos.controleCotaDiscos.model.*;

public class ArquivoService {
	
	public ArrayList<Usuario> lerArquivo() {
		String caminho = "arquivos//projetos_exercicio01_usuarios.txt";
		ArrayList <Usuario> usuarios = new ArrayList<>();
		String linha, login, linhaUsuario[];
		String sBytesUtilizados;
		double bytesUtilizados;
		Usuario usuario = new Usuario();
		
		try (BufferedReader leitor = new BufferedReader (new FileReader(caminho))) {
		    while ((linha = leitor.readLine()) != null) {
		    	linhaUsuario = linha.split("       ");
		    	
		    	login = linhaUsuario[0].trim();
		    	usuario.setLogin(login);
		    	
		    	sBytesUtilizados = linhaUsuario[1].trim();
		    	bytesUtilizados = Double.parseDouble(sBytesUtilizados);	    	
		    	usuario.setBytesUtilizados(bytesUtilizados);
		    	
		    	usuarios.add(new Usuario(login, bytesUtilizados));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return usuarios;
	}
	
	public void gravarArquivo(String conteudo) {
		
		try {
			String caminho = "arquivos\\projetos_exercicio01_relatório.txt";
			BufferedWriter escritor = new BufferedWriter(new FileWriter(caminho, false));
			
			escritor.write(conteudo);
			
			escritor.close();
			
		} catch (Exception erro) {
			
			erro.printStackTrace();
		}
		
	}
}
