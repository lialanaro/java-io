package txt;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * Classe respons�vel por demonstrar a utiliza��o de leitura TXT
 * @author Nathalia Lanaro
 * @since 05 Mar�o de 2021
 * @version 1.0
 *
 */
public class LerArquivo {
	
	/*
	 * m�todo para ler um  arquivo lendo seu nome
	 */
	public void lerArquivo(String nome) {
		
		try {
			//declarar um atributo para ler e informar seu nome para leitura
			Scanner leitor = new Scanner(new FileReader(nome));
			
			//la�o de repeti��o para leitura do arquivo  com HasNext
			while (leitor.hasNext()) {
				//exibindo o conteudo no console  do arquivo txt
				System.out.println(leitor.nextLine());
			}
			
			
			
			
		} catch (FileNotFoundException e) {
			//exibindo para o usu�rio de erro 
			JOptionPane.showMessageDialog(null, "Arquivo n�o encontrado", "Leitor de Arquivo", 0);
			//exibe no console o log de erro do java
			e.printStackTrace();
		}
	}
	//m�todo principal para executar a classe 
	public static void main(String[] args) {
		new LerArquivo().lerArquivo("entrada.txt");
	}

}
