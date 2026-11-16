package strutturedinamiche.coda;

import java.util.Vector;

import strutturedinamiche.pila.Automobile;

/**
 * Esempio di gestione di coda generica:
 * Gestisce una coda di automobili in fila all'ingresso di un parcheggio aziendale.
 *
 * @param <T>
 */
public class CodaGenerica<T> {
	
	// dichiara un vector di elementi di classe T
	private Vector<T> elementi;
	
	public CodaGenerica() {
		// istanzia un vector di oggetti di classe T
		elementi=new Vector<T>();
	}
	
	/**
	 * push: aggiunge un elemento alla fine della coda
	 * @param elemento da aggiungere
	 */
	public void push(T el) {
		elementi.addElement(el);
	}
	
	/**
	 * pop: rimuove l'elemento all'inizio della coda
	 * @return elemento all'inizio della coda
	 */
	public T pop() {
		T el=null;
		
		if(elementi.size()>0) {
			el=elementi.elementAt(0);
			elementi.removeElementAt(0);
		}
		
		return el;
	}
	
	/**
	 * Restituisce il primo elemento della coda
	 * @return il primo elemento della coda
	 */
	public T begin() {
		T el=null;
		
		if(elementi.size()>0) {
			el=elementi.elementAt(0);
		}
		
		return el;
	}
	
	/**
	 * Elenca gli elementi presenti nella coda.
	 */
	public void list() {
		if(elementi.size()>0) {
			System.out.print("\nELEMENTI IN CODA: ");
			for(int i=0;i<elementi.size();i++) {
				System.out.print(elementi.elementAt(i));
			}
		} else System.out.print("\nLa coda e' vuota.");
	}
	

	public static void main(String[] args) {
		// istanzia una coda di oggetti di tipo di Automobile
		CodaGenerica<Automobile> cg=new CodaGenerica<Automobile>();
		
		cg.push(new Automobile("TARGA1","Fiat 500 Abarth"));
		cg.list();
		
		cg.push(new Automobile("TARGA2","Toyota Yaris"));
		cg.list();
		
		Automobile a=cg.begin();
		System.out.print("\nProssimo veicolo: "+a);
		
		a=cg.pop();
		System.out.print("\nVeicolo entrato: "+a);
		
		cg.list();
		
		System.out.println("\n\nProgramma terminato.");
	}

}

