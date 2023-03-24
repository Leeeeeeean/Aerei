package it.livm.me;

import java.nio.Buffer;

public class Fabbrica extends Thread{

	private String nome;
	private double distanza;
	private int x=0;
	private Magazzino buffer = Magazzino.getInstance();
	
	public Fabbrica(String nome, double distanza) {
		this.nome = nome;
		this.distanza = distanza;
	}
	
	
	
	@Override
	public void run() {
		
		for(x=0; ; ){
			Aereo aereo = new Aereo(this.nome + x);
			buffer.addPlane(aereo);
			
			x++;
			
			System.out.println(nome + " ha prodotto " + aereo.toString());
			try {
				Thread.sleep((int) (Math.random()*500)); // Produzione
				
				Thread.sleep((int) (distanza * 0.1));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}
}
