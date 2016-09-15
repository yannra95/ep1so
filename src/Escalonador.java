import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Escalonador {
	
	private static BCP[] tabelaDeProcessos;
	
	public static void leArquivo(){
		try {
			
			File arq = new File("./processos");
			
			
			String[] leituraProcessos = arq.list();
			tabelaDeProcessos = new BCP[leituraProcessos.length];
			String [] comandos = new String[21];
			
			for(int i = 0; i < leituraProcessos.length; i++){
				System.out.println(leituraProcessos[i]);
				FileReader arquivo = new FileReader(leituraProcessos[i]);
				System.out.println(arquivo);
				BufferedReader lerArq = new BufferedReader(arquivo);
				System.out.println(lerArq);
				
				String linha = lerArq.readLine(); 
				System.out.println(linha);
				
				int cont = 0;
				while (linha != null) {
					linha = lerArq.readLine();
					comandos[cont] = linha;
					cont++;
				}
				
				BCP bcp = new BCP();
				tabelaDeProcessos[i] = bcp;
				tabelaDeProcessos[i].setMemoria(comandos);
			}
			
			}catch (IOException e) {
			System.err.print("Erro na abertura do arquivo. ");
		}
	}
	
	public static void main (String[] args){
		leArquivo();
	}
}
