import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class Escalonador {

	private static BCP[] tabelaDeProcessos;
	public static int quantum;

	public static void leArquivo() {
		try {

			File arq = new File("./processos");
<<<<<<< HEAD
=======
			String linha;
>>>>>>> branch 'master' of https://github.com/yannra95/ep1so
			String[] leituraProcessos = arq.list();
<<<<<<< HEAD
			tabelaDeProcessos = new BCP[leituraProcessos.length];
			String [] comandos = new String[21];
			
			for(int i = 0; i < leituraProcessos.length; i++){
				FileReader arquivo = new FileReader(leituraProcessos[i]);
=======
			tabelaDeProcessos = new BCP[leituraProcessos.length-1]; //-1 pq elimina-se o nome do processo, q não é comando
			String[] comandos = new String[21];
			Queue prontos = new LinkedList();
			Queue bloqueados = new LinkedList();

			for (int i = 0; i < leituraProcessos.length; i++) {

				String endereco = "./processos/" + leituraProcessos[i];

				FileReader arquivo = new FileReader(endereco);
>>>>>>> branch 'master' of https://github.com/yannra95/ep1so
				BufferedReader lerArq = new BufferedReader(arquivo);
<<<<<<< HEAD
				String linha = lerArq.readLine();
				
				int cont = 0;
				while (linha != null) {
					linha = lerArq.readLine();
					comandos[cont] = linha;
					cont++;
=======

				// Aqui a magia acontece

				// Se não for o arquivo que contém o quantum
				if (!leituraProcessos[i].equals("quantum.txt")) {
					BCP bcp = new BCP();
					tabelaDeProcessos[i] = bcp;
					tabelaDeProcessos[i].setNome(lerArq.readLine());
					tabelaDeProcessos[i].setEstado("pronto");
					int cont = 0;
					while ((linha = lerArq.readLine()) != null) {
						comandos[cont] = linha;
						cont++;
					}
					tabelaDeProcessos[i].setMemoria(comandos);
					tabelaDeProcessos[i].printBCP();
				} else {
					quantum = Integer.parseInt(lerArq.readLine());
>>>>>>> branch 'master' of https://github.com/yannra95/ep1so
				}

			}
<<<<<<< HEAD
			
			}catch (IOException e) {
			System.err.print("Erro na abertura do arquivo." + e.getMessage());
=======

		} catch (IOException e) {
			System.err.print("Erro na abertura do arquivo...");
>>>>>>> branch 'master' of https://github.com/yannra95/ep1so
		}
	}

	public static void printTabela() {
		BCP[] tabela = tabelaDeProcessos;
		System.out.println("\t\tTabela de processos");
		for (int i = 0; i < tabela.length; i++) {
			System.out.println(tabela[i].getNome());
		}
	}

	public static void main(String[] args) {
		leArquivo();
		printTabela();
		System.out.println("quantum: "+quantum);
	}
}
