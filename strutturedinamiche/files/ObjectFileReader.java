package strutturedinamiche.files;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import strutturedinamiche.pila.Automobile;

/**
 * Legge un file di oggetti.
 *
 */
public class ObjectFileReader {

	public static void main(String[] args) {
		ObjectInputStream ois=null;
		
		// apre il un file di oggetti in lettura (input)
		try {
			FileInputStream fis=new FileInputStream("computer.dat");
			ois=new ObjectInputStream(fis);
			System.out.println("File aperto in lettura");
		} catch (IOException e) {
			System.exit(1); // ESCE CON ERRORE
		}
		
		// legge tutti gli oggetti presenti finchè
		// non è stata raggiunta la fine del file (EOFException).
		// in caso di eccezione, esce dal ciclo.
		// ogni eccezione indica una causa diversa. 
		try {
			while(true) {
				// legge il singolo oggetto
				Computer c=(Computer)ois.readObject();
				System.out.println(c);
			}
		} catch (ClassNotFoundException e) {
			// la classe indicata nel file non esiste  
			System.err.println("ERRORE: classe non trovata (ClassNotFoundException).");
		} catch (EOFException e) {
			// E' stata raggiunta la fine del file.
			// Questa eccezione indica che il file è stato completamente letto
			// pertanto non è possibile leggere altri dati.
		} catch (InvalidClassException e) {
			// generico errore di lettura
			System.err.println("ERRORE: versioni non compatibili (InvalidClassException).");
		} catch (IOException e) {
			// generico errore di lettura
			System.err.println("ERRORE: impossibile leggere il file (IOException).");
		}
		
		// chiude gli stream 
		try {
			ois.close();
			System.out.println("File chiuso.");
		} catch (IOException e) {
			System.err.println("ERRORE: impossibile chiudere il file.");
		}

	}

}
