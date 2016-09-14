import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Escalonador {
	
	private BCP[] tabelaDeProcessos;
	
	public void leArquivo(){
		try {
			
			File arq = new File("./processos");
			FileReader arquivo;
			BufferedReader lerArq;
			String[] leituraProcessos = arq.list();
			tabelaDeProcessos = new BCP[leituraProcessos.length];
			String [] comandos = new String[21];
			
			for(int i = 0; i < leituraProcessos.length; i++){
				BCP bcp = new BCP();
				tabelaDeProcessos[i] = bcp;
				tabelaDeProcessos[i].setMemoria(comandos);
				
				arquivo = new FileReader(leituraProcessos[i]);
				lerArq = new BufferedReader(arquivo);
				String linha = lerArq.readLine(); 
				
				while (linha != null) {
					linha = lerArq.readLine();
					//comandos
				}
			}
			}catch (IOException e) {
			System.err.print("Erro na abertura do arquivo: ");
		}
	}
	
	
}
