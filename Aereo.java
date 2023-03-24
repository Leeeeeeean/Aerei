package it.livm.me;

public class Aereo {
	private String nome;
	
	public Aereo(String nome) {
		this.nome = nome;
	}
	
	
	@Override
	public String toString() {
		return nome;
	}
}
