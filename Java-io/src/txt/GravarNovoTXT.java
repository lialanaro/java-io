package txt;

import java.io.FileNotFoundException;
import java.io.PrintStream;

import javax.swing.JOptionPane;

/**
 * Classe responsável por demonstrar a gravação de arquivos TXT, levando em
 * consideração que a classe abaixo sempre criara um novo arquivo, sendo assim
 * sobresvendo o antigo
 * 
 * @author Nathalia Lanaro
 * @since 08 de Março de 2021
 * @version 1.0
 *
 */
public class GravarNovoTXT {
	/*
	 * método para gerar um arquivo TXT
	 */
	public void gerarArquivoTxt(String nome) {
		try {
			// classe auxiliar para gerar arquivo e seu conteúdo
			PrintStream gravador = new PrintStream(nome);
			gravador.println("PrintStream");
			gravador.println("A classe PrintStream recebe um construtor que já");
			gravador.println("Recebe o nome do arquivo como argumento.");
			gravador.println("");
			gravador.println("É importante lembrar que o arquivo de saída");
			gravador.println("Deve ser usado o método .Close()");
			//comando p encerrar o arquivo
			gravador.close();
			
			JOptionPane.showMessageDialog(null, "Arquivo Gravado com sucesso", "Gravação de arquivo", 1);
			
			System.exit(0);
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, e.toString(), "Gravaçao de Arquivo", 0);
			e.printStackTrace();
		}
		

	}
	
	//método principal para executar a classe 
	public static void main(String[] args) {
		new GravarNovoTXT().gerarArquivoTxt("saida.txt");
	}
}
