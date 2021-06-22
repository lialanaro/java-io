package txt;

import java.io.FileNotFoundException;
import java.io.PrintStream;

import javax.swing.JOptionPane;

/**
 * Classe respons�vel por demonstrar a grava��o de arquivos TXT, levando em
 * considera��o que a classe abaixo sempre criara um novo arquivo, sendo assim
 * sobresvendo o antigo
 * 
 * @author Nathalia Lanaro
 * @since 08 de Mar�o de 2021
 * @version 1.0
 *
 */
public class GravarNovoTXT {
	/*
	 * m�todo para gerar um arquivo TXT
	 */
	public void gerarArquivoTxt(String nome) {
		try {
			// classe auxiliar para gerar arquivo e seu conte�do
			PrintStream gravador = new PrintStream(nome);
			gravador.println("PrintStream");
			gravador.println("A classe PrintStream recebe um construtor que j�");
			gravador.println("Recebe o nome do arquivo como argumento.");
			gravador.println("");
			gravador.println("� importante lembrar que o arquivo de sa�da");
			gravador.println("Deve ser usado o m�todo .Close()");
			//comando p encerrar o arquivo
			gravador.close();
			
			JOptionPane.showMessageDialog(null, "Arquivo Gravado com sucesso", "Grava��o de arquivo", 1);
			
			System.exit(0);
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, e.toString(), "Grava�ao de Arquivo", 0);
			e.printStackTrace();
		}
		

	}
	
	//m�todo principal para executar a classe 
	public static void main(String[] args) {
		new GravarNovoTXT().gerarArquivoTxt("saida.txt");
	}
}
