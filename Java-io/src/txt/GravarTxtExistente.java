package txt;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import javax.swing.JOptionPane;

/**
 * Classe para demonstrar a gravação de arquivo Txt, se o arquivo já for
 * existente mantém o arquivo, caso contrário criará um novo arquivo
 * 
 * @author Nathalia Lanaro
 * @since 08 de Março de 2021
 * @version 1.0
 */
public class GravarTxtExistente {
	/*
	 * método para criar arquivo TXT recebendo o nome
	 */
	public void gravarArquivo(String nome) {
		// classe auxiliar para carregar um arquivo ou criar um novo arquivo
		File arquivo = new File(nome);

		try {
			// classe auxiliar para gerar um objeto na memoria na gravação do arquivo
			FileOutputStream arquivoOutput = new FileOutputStream(arquivo, true);
			// classe auxiliar para carregar um arquivo ou criar um novo arquivo
			PrintStream gravador = new PrintStream(arquivoOutput);
			
			gravador.println("FileOutPutStream");
			gravador.println("utilizando FileOutputStream é possivel");
			gravador.println("Abrir o arquivo e gravar dados");
			gravador.println("Sem necessáriamente sobrescrever o arquivo existente");
			gravador.println("");
			gravador.println("Nesse exemplo é necessário alem de fechar o com o método .close()");
			gravador.println("Também é necessário fechar o arquivo OutputStream");
			
			gravador.close();
			arquivoOutput.close();
			

			JOptionPane.showMessageDialog(null, "Arquivo Gravado com sucesso", "Gravação de arquivo", 1);
			
			//encerrando processamento
			System.exit(0);
			
			
			//informando o usuário a finalização do gravação do arquivo
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, e.toString(), "Gravaçao de Arquivo", 0);
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/*
	 * método principal para executar a classe 
	 */
	public static void main(String[] args) {
		new GravarTxtExistente().gravarArquivo("saida.txt");
	}
}
