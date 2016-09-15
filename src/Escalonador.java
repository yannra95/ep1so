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
			String linha;
			String[] leituraProcessos = arq.list();
			tabelaDeProcessos = new BCP[leituraProcessos.length-1]; //-1 pq elimina-se o nome do processo, q não é comando
			String[] comandos = new String[21];
			Queue prontos = new LinkedList();
			Queue bloqueados = new LinkedList();

			for (int i = 0; i < leituraProcessos.length; i++) {

				String endereco = "./processos/" + leituraProcessos[i];

				FileReader arquivo = new FileReader(endereco);
				BufferedReader lerArq = new BufferedReader(arquivo);

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
				}

			}

		} catch (IOException e) {
			System.err.print("Erro na abertura do arquivo...");
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
