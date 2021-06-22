package txt;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * Classe responsável por demonstrar a utilização de leitura TXT
 * @author Nathalia Lanaro
 * @since 05 Março de 2021
 * @version 1.0
 *
 */
public class LerArquivo {
	
	/*
	 * método para ler um  arquivo lendo seu nome
	 */
	public void lerArquivo(String nome) {
		
		try {
			//declarar um atributo para ler e informar seu nome para leitura
			Scanner leitor = new Scanner(new FileReader(nome));
			
			//laço de repetição para leitura do arquivo  com HasNext
			while (leitor.hasNext()) {
				//exibindo o conteudo no console  do arquivo txt
				System.out.println(leitor.nextLine());
			}
			
			
			
			
		} catch (FileNotFoundException e) {
			//exibindo para o usuário de erro 
			JOptionPane.showMessageDialog(null, "Arquivo não encontrado", "Leitor de Arquivo", 0);
			//exibe no console o log de erro do java
			e.printStackTrace();
		}
	}
	//método principal para executar a classe 
	public static void main(String[] args) {
		new LerArquivo().lerArquivo("entrada.txt");
	}

}
