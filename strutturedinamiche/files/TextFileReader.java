package files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Legge un file di testo in cui i dati
 * sono organizzati in righe separati da 
 * un simbolo separatore ',' . 
 */
public class TextFileReader {

	public static void main(String[] args) {
		
		// 1- apre il file di testo in lettura
		BufferedReader fIn=null;
		try {
			FileReader fr=new FileReader("studenti.txt");
			fIn=new BufferedReader(fr);
			System.out.println("File aperto.");
		} catch (IOException e) {
			System.err.println("ERRORE: impossibile "
								+ "aprire il file.");
			System.exit(1);
		}
		
		// 2- legge i dati presenti
		try {
			String s=fIn.readLine();
			
			// se la linea letta è null allora
			// il file è stato letto tutto.
			while(s!=null) {
				// divide la riga in sottostringhe (tokens)
				// separate dal simbolo ","
				String tokens[]=s.split(",");
				//System.out.printf("\nNome: %s - Classe: %s",tokens[0],tokens[1]);
				
				// ricrea un oggetto con i dati appena letti
				Studente studente=new Studente();
				studente.setNome(tokens[0]);
				studente.setClasse(tokens[1]);
				
				// visualizza l'oggetto letto
				System.out.println(studente);
				
				// legge la linea seguente
				s=fIn.readLine();
			}
		} catch (IOException e) {
			System.err.println("ERRORE: impossibile leggere il file.");
		}
		
		
		// 3- chiude il file
		try {
			fIn.close();
			System.out.println("\nFile chiuso.");
		} catch (IOException e) {
			System.err.println("ERRORE: impossibile "
					+ "chiudere il file.");
		}
	}

}
