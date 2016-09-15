import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Escalonador {
	
	private static BCP[] tabelaDeProcessos;
	
	public static void leArquivo(){
		try {
			
			File arq = new File("./processos");
			String linha;			
			String[] leituraProcessos = arq.list();
			tabelaDeProcessos = new BCP[leituraProcessos.length];
			String [] comandos = new String[22];
			
			for(int i = 0; i < leituraProcessos.length; i++){
				
				String endereco = "./processos/"+leituraProcessos[i];
				System.out.println(endereco);

				FileReader arquivo = new FileReader(endereco);
				BufferedReader lerArq = new BufferedReader(arquivo);
				
				int cont = 0;
				while ((linha = lerArq.readLine()) != null) {
					System.out.println("\t"+linha);
					comandos[cont] = linha;
					cont++;
				}
				
				BCP bcp = new BCP();
				tabelaDeProcessos[i] = bcp;
				tabelaDeProcessos[i].setMemoria(comandos);
			}
			
			}catch (IOException e) {
			System.err.print("Erro na abertura do arquivo...");
		}
	}
	
	public static void printTabela(){
		BCP[] tabela = tabelaDeProcessos;
		System.out.println("\tTabela de processos");
		for (int i = 0; i < tabela.length; i++) {
			System.out.println(tabela[i].getNome());
		}		
	}
	
	public static void main (String[] args){
		leArquivo();
		printTabela();
	}
}
