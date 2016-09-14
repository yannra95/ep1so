public class Processos {
	private String nome;
	private String[] tabelaDeProcessos;
	private int PC;
	private String estado;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String[] getTabelaDeProcessos() {
		return tabelaDeProcessos;
	}
	public void setTabelaDeProcessos(String[] tabelaDeProcessos) {
		this.tabelaDeProcessos = tabelaDeProcessos;
	}
	public int getPC() {
		return PC;
	}
	public void setPC(int pC) {
		PC = pC;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
}
