package strutturedinamiche.files;

import java.io.Serializable;
import java.util.Date;

public class Computer implements Serializable {
	
	/**
	 * Serve a impostare la versione della classe
	 */
	private static final long serialVersionUID = 2L;
	
	private String modello;
	private String produttore;
	private float prezzo;
	
	// metodo costruttore
	public Computer(String modello,String produttore,float prezzo) {
		this.modello=modello;
		this.produttore=produttore;
		this.prezzo=prezzo;
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
		return modello+"/"+produttore;
	}
	
}
