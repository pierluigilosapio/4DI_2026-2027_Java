package strutturedinamiche.pila;

public class Automobile {
	private String targa;
	private String modello;
	
	public Automobile(String targa,String modello) {
		this.targa=targa;
		this.modello=modello;
	}
	
	public String toString() {
		return "["+targa+"/"+modello+"]";
	}
}
