package files;

import java.io.Serializable;

/**
 * 
 * @author LOSAPIO
 *
 */
public class Studente implements Serializable {
	/**
	 * Indica le versione attuale della classe
	 */
	private static final long serialVersionUID = -8675414694325156784L;
	
	
	private String nome;
	private String classe;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getClasse() {
		return classe;
	}
	public void setClasse(String classe) {
		this.classe = classe;
	}
	
	public String toString() {
		return "[Nome:"+this.nome+", Classe: "+this.classe+"]";
	}

}
