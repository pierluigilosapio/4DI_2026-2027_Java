import java.util.Scanner;

public class GestioneAutomaticaMemoria {

	public static void main(String[] args) {
		// creazione di un oggetto in memoria
		Computer c1=new Computer("Pavillion","HP");
		Computer c2=c1; // crea una copia del riferimento all'oggetto c
		
		//l'oggetto "Pavillion/HP" ha due riferimenti.
		
		// cancella il riferimento all'oggetto c
		// ma rimane il solo riferimento c1
		c1=null; 
		
		// chiama manualmente il garbage collector
		// l'oggetto "Pavillion/HP" non viene deallocato
		// pertanto non viene invocato il metodo finalize()
		System.out.println("cancellazione primo riferimento");
		System.gc();
		
		// cancella l'ultimo riferimento all'oggetto "Pavillion/HP"
		// pertanto potrà essere rimosso dal GC
		System.out.println("cancellazione secondo e ultimo riferimento");
		c2=null;
		
		// segnala manualmente al garbage collector 
		// che un riferimento è stato eliminato. 
		// Il GC effettuerà la rimozione in base ai suoi tempi
		// in parallelo (thread a bassa priorità) all'applicazione.
		// Quando l'oggetto "Pavillion/HP" non sarà deallocato
		// verrà invocato il metodo finalize() della classe Computer
		System.gc();
		
		// serve per attendere l'esecuzione della pulizia della memoria
		// a cura del GC
		System.out.print("\nPress <ENTER> to terminate...");
		Scanner in=new Scanner(System.in);
		in.nextLine();
		
		in.close();
		System.out.printf("Fine");
	}

}
