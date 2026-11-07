import java.util.Vector;

/**
 * Operazioni fondamentali sui vector
 *
 */
public class GestoreVector {

	public static void main(String[] args) {
		
		// dichiara/alloca un array dinamico
		// di oggetti di tipo Computer con capacity 10 (predefinita)
		// La notazione <> è detta 'diamond operator'.
		Vector<Computer> lc=new Vector<Computer>();
		
		// dichiara/alloca un array dinamico
		// di oggetti di tipo Computer con capacity 10
		lc=new Vector<Computer>(10,5);
		
		// visualizza la capacity e la size del vector
		System.out.printf("capacity: %d, size: %d",lc.capacity(),lc.size());
		
		// aggiunge elementi al vector per forzare l'incremento
		// della capacità.
		for(int i=0;i<41;i++) {
			// aggiunge alla fine un oggetto di tipo Computer
			lc.addElement(new Computer("modello"+i,"produttore"+i)); 
			System.out.printf("\ncapacity: %d, size: %d",lc.capacity(),lc.size());
		}
		
		// visualizza gli elementi presenti
		System.out.printf("\n\n---VISUALIZZAZIONE ELEMENTI ---------");
		for(int i=0;i<lc.size();i++) {
			// legge l'elemento di posizione i
			Computer c=lc.elementAt(i);
			System.out.printf("\n%d: %s",i,c.getModello());
		}

		// rimuove un elemento dal vector
		Computer c=lc.elementAt(20);
		lc.removeElementAt(20);
		
		for(int i=0;i<lc.size();i++) {
			// legge l'elemento di posizione i
			c=lc.elementAt(i);
			System.out.printf("\n%d: %s",i,c.getModello());
		}
		System.out.printf("\ncapacity: %d, size: %d",lc.capacity(),lc.size());
	}

}
