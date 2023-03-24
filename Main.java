package it.livm.me;

public class Main {

	
	public static void main(String[] arg) {
		Fabbrica a = new Fabbrica("Echo", 200);
		Fabbrica b = new Fabbrica("Bebe", 200);
		Fabbrica c = new Fabbrica("Nene", 200);
		
		Ente ab = new Ente("sadsad");
		Ente ba = new Ente("asdsadd");
		
		a.start();
		b.start();
		c.start();
		ab.start();
		ba.start();
	}
	
}
