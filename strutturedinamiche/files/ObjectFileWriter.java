package strutturedinamiche.files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Scrive in un file di oggetti.
 *
 */
public class ObjectFileWriter {

	public static void main(String[] args) {
		ObjectOutputStream oos=null;
		
		// apre il file di oggetti in scrittura (output)
		try {
			// apre il file binario in scrittura
			FileOutputStream fos=new FileOutputStream("computer.dat");
			
			// apre lo stream di scrittura di oggetti nel file
			oos=new ObjectOutputStream(fos);
			
			System.out.println("File aperto.");
		} catch (IOException e) {
			System.err.println("ERRORE: impossibile aprire il file.");
			System.exit(1); // il programma termina con errore
		}
		
		try {
			// scrive un oggetto su file
			Computer c=new Computer("HP","zenbook",56.00f);
			oos.writeObject(c);
			System.out.println("Oggetto salvato.");
		} catch (IOException e) {
			// errore di scrittura nel file.
			// il programma continua con la chiusura del file.
			System.err.println("ERRORE: impossibile scrivere nel file.");
		}
		
		// chiude lo stream in output su file
		try {
			oos.close();
			System.out.println("File chiuso.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
