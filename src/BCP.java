public class BCP {
	
	private String nome;
	private int X;
	private int Y;
	private int PC;
	private String estado;
	private String[] memoria;
	
	public BCP(){
		memoria = new String[21];
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getX() {
		return X;
	}
	public void setX(int x) {
		X = x;
	}
	public int getY() {
		return Y;
	}
	public void setY(int y) {
		Y = y;
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
	public String[] getMemoria() {
		return memoria;
	}
	public void setMemoria(String[] memoria) {
		this.memoria = memoria;
	}
	
}
