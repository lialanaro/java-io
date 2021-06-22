package txt;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import javax.swing.JOptionPane;

/**
 * Classe para demonstrar a grava��o de arquivo Txt, se o arquivo j� for
 * existente mant�m o arquivo, caso contr�rio criar� um novo arquivo
 * 
 * @author Nathalia Lanaro
 * @since 08 de Mar�o de 2021
 * @version 1.0
 */
public class GravarTxtExistente {
	/*
	 * m�todo para criar arquivo TXT recebendo o nome
	 */
	public void gravarArquivo(String nome) {
		// classe auxiliar para carregar um arquivo ou criar um novo arquivo
		File arquivo = new File(nome);

		try {
			// classe auxiliar para gerar um objeto na memoria na grava��o do arquivo
			FileOutputStream arquivoOutput = new FileOutputStream(arquivo, true);
			// classe auxiliar para carregar um arquivo ou criar um novo arquivo
			PrintStream gravador = new PrintStream(arquivoOutput);
			
			gravador.println("FileOutPutStream");
			gravador.println("utilizando FileOutputStream � possivel");
			gravador.println("Abrir o arquivo e gravar dados");
			gravador.println("Sem necess�riamente sobrescrever o arquivo existente");
			gravador.println("");
			gravador.println("Nesse exemplo � necess�rio alem de fechar o com o m�todo .close()");
			gravador.println("Tamb�m � necess�rio fechar o arquivo OutputStream");
			
			gravador.close();
			arquivoOutput.close();
			

			JOptionPane.showMessageDialog(null, "Arquivo Gravado com sucesso", "Grava��o de arquivo", 1);
			
			//encerrando processamento
			System.exit(0);
			
			
			//informando o usu�rio a finaliza��o do grava��o do arquivo
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, e.toString(), "Grava�ao de Arquivo", 0);
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/*
	 * m�todo principal para executar a classe 
	 */
	public static void main(String[] args) {
		new GravarTxtExistente().gravarArquivo("saida.txt");
	}
}
