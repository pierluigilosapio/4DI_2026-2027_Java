package files;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Scrive su un file di testo. 
 */
public class TextFileWriter {

	public static void main(String[] args) {
		// crea un oggetto di tipo studente
		Studente studente=new Studente();
		studente.setNome("Mark Di Palma");
		studente.setClasse("4DI");
		
		// 1- apre il file di testo in scrittura in accodamento
		PrintWriter fOut=null;
		try {
			FileWriter fw=new FileWriter("studenti.txt",true);
			fOut=new PrintWriter(fw);
			System.out.println("File aperto.");
		} catch (IOException e) {
			System.err.println("ERRORE: impossibile aprire "
								+ "il file.");
			// esce con errore
			System.exit(1);
		}

		// 2- scrive l'oggetto nel file
		String s=studente.getNome()+","+studente.getClasse();
		fOut.println(s);
		fOut.flush(); // effettua il flush dei dati (buffer->file)
		
		// 3- chiude il file
		try {
			fOut.close();
			System.out.println("File chiuso.");
		} catch(Exception e) {
			System.err.println("ERRORE: impossibile chiudere "
					+ "il file.");
		}
	}

}
