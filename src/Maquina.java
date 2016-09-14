public class Maquina {
	private int X;
	private int Y;
	
	public int getX() {
		return X;
	}
	
	public void atribuicaoX(int x) {
		X = x;
	}
	
	public int getY() {
		return Y;
	}
	
	public void atribuicaoY(int y) {
		Y = y;
	}
	
	public void entradaSaida(){
		//Temos que colocar na lista de bloqueados
		//Não é sysout, temos que escrever no logfile!
		System.out.println("E/S");
	}
	
	public void comando(){
		//Não é sysout, temos que escrever no logfile!
		System.out.println("COM");
	}
	
	public void fimDePrograma(){
		//Temos que remover o programa da memória
		//Não é sysout, temos que escrever no logfile!
		System.out.println("SAIDA");
	}
	
	
	
}
