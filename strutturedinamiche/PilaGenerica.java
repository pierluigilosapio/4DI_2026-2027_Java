package strutturedinamiche.pila;

import java.util.Vector;

/**
 * Una classe parametrica (o classe generica) in Java è una classe 
 * che non lavora con un tipo di dato specifico e fisso, ma accetta il tipo T 
 * come parametro al momento della creazione dell'oggetto.
 * Sono utili per due motivi:
 * 1. 	evitare cast espliciti continui ogni volta che si estrae un dato.
 * 2.	effettuare controllo del tipo di oggetti a tempo di compilazione evitando errori del tipo 
 * 		ClassCastException e quindi crash improvvisi.
 * 
 * T rappresenta la classe degli oggetti gestiti dalla pila.
 * 
 * @param <T> (nei generics, detto 'Type Parameter')
 */
public class PilaGenerica<T> {
	
	// dichiara un vector contenente oggetto di classe T
	// Nei generics, <T> è detto 'Type Argument'
	private Vector<T> elementi;
	
	public PilaGenerica() {
		// istanzia un vector di oggetti di tipo T
		elementi=new Vector<T>();
	}
	
	/**
	 * Inserisce un oggetto di tipo T alla pila
	 * @param el elemento da aggiungere alla pila
	 */
	public void push(T el) {
		elementi.addElement(el);
	}
	
	/**
	 * Ritorna l'ultimo elemento inserito. 
	 * T indica il tipo (classe) degli oggetti presenti nella pila. 
	 * @return ultimo elemento inserito
	 */
	public T pop() {
		T el=null;
		
		if(elementi.size()>0){
			int posUltimo=elementi.size()-1;
			el=elementi.elementAt(posUltimo);
			elementi.removeElementAt(posUltimo);
		}
		
		return el;
	}
	
	
	public static void main(String args[]) {
		// istanzia una pila di oggetti di classe Computer
		PilaGenerica<Computer> pc=new PilaGenerica<Computer>();
		
		// aggiunge nella pila un oggetto di tipo Computer
		pc.push(new Computer("hp","zexon"));
		
		// estrae dalla pila (e visualizza) l'ultimo oggetto di tipo Computer 
		// inserito nella pila. 
		// Grazie ai generics, non è necessario il cast esplicito (Computer).
		Computer c=pc.pop();
		System.out.println(c);
		
		// istanzia una pila di oggetti di tipo Automobile
		PilaGenerica<Automobile> automobili=new PilaGenerica<Automobile>();
		
		// aggiunge nella pila un oggetto di tipo Automobile 
		automobili.push(new Automobile("L38967","Yamaha R125"));
		
		// estrae dalla pila (e visualizza) l'ultimo oggetto di tipo Automobile 
		// inserito nella pila.
		// Grazie ai generics, non è necessario il cast esplicito (Automobile).
		Automobile auto=automobili.pop();
		System.out.println(auto);
		
		
	}

}
