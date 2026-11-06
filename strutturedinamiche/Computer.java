package strutturedinamiche;

import java.util.Date;

public class Computer {
	private String modello;
	private String produttore;
	
	// metodo costruttore
	public Computer(String modello,String produttore) {
		this.modello=modello;
		this.produttore=produttore;
	}
	
	// metodo distruttore: consente di eseguire alcune operazioni
	// prima della distruzione dell'oggetto in memoria
	public void finalize() {
		System.out.printf("\nDistruzione oggetto %s %s %s",modello,produttore,new Date());
	}
	
}
