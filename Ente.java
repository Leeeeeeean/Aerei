package it.livm.me;

public class Ente extends Thread{

	private String nome;
	private Magazzino buffer = Magazzino.getInstance();
	
	public Ente(String nome) {
		this.nome = nome;
	}
	
	
	
	@Override
	public void run() {
		
		while(true) {
			System.out.println(nome + " ha preso " + buffer.getPlane().toString());
			
			
			
			
		}
		
	}
}
