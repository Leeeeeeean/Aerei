package it.livm.me;

import java.util.ArrayList;
import java.util.List;

public class Magazzino {
	
	private static int MAX_SIZE = 10;
	
	private static Magazzino instance;
	
	private List<Aereo> aerei = new ArrayList<Aereo>();
	
	private Magazzino() {
		
		
	}
	
	public synchronized static Magazzino getInstance() {
		if(instance == null) {
			instance = new Magazzino();
		}
		
		
        return instance;
    }
	
	
	
	
	protected synchronized void addPlane(Aereo aereo) {
			
		while (aerei.size() == MAX_SIZE) {
			try {
				wait();
			} catch (InterruptedException e) {
				;// TMCH
			}
		}
		aerei.add(aereo);
		notifyAll();
		
	}
	
	protected synchronized Aereo getPlane() {
		
		
		while(aerei.size() == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return aerei.remove(0);
		
	}
		
}
