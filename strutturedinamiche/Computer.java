package strutturedinamiche.pila;

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

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public String getProduttore() {
		return produttore;
	}

	public void setProduttore(String produttore) {
		this.produttore = produttore;
	}
	
	public String toString() {
		return "["+modello+"/"+produttore+"]";
	}
}
