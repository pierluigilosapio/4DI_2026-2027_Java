package stringhe;

public class FunzioniBaseStringhe {
    public static void main(String[] args) {
        // dichiara una costante stringa
        String s1="Civita";
        
        // dichiara un'istanza della classe String
        String s2=new String("Civita");
        
        // calcola la lunghezza della stringa
        System.out.printf("s1.length()=%d, s2.length()=%d",s1.length(),s2.length());
        
        // ottiene una sottostringa a partire dal carattere di posizione 0
        // fino al carattere di posizione 3 (escluso).
        System.out.printf("\ns1.substring(0,3)=%s",s1.substring(0,3));
        
        // legge il carattere di posizione 2
        System.out.printf("\ns1.charAt(2)=%s",s1.charAt(2));
        
        // converte tutto in minuscole
        System.out.printf("\ns1.toLowerCase()=%s",s1.toLowerCase());
        
        // converte tutto in maiuscole
        System.out.printf("\ns1.toUpperCase()=%s",s1.toUpperCase());
        
        // confronto di uguaglianza tra due stringhe
        s1="Mennea"; // costante stringa
        s2="Mennea"; // costante stringa
        if(s1==s2) System.out.println("\ns1==s2");
        else System.out.println("\ns1!=s2");
        if(s1.equals(s2)) System.out.println("\ns1.equals(s2)");
        else System.out.println("\n!s1.equals(s2)");
        
        s1="Maffei"; // costante stringa
        s2=new String("Maffei"); // nuova istanza della classe String
        if(s1==s2) System.out.println("\ns1==s2");
        else System.out.println("s1!=s2");
        if(s1.equals(s2)) System.out.println("\ns1.equals(s2)");
        else System.out.println("!s1.equals(s2)");
        
        // confronto case insensitive
        s1="Maffei"; // costante stringa
        s2=new String("MaffeI"); // nuova istanza della classe String
        if(s1.equalsIgnoreCase(s2)) System.out.println("\ns1.equalsIgnoreCase(s2)");
        else System.out.println("!s1.equalsIgnoreCase(s2)");
        
        // confronto ternario (minore,maggiore,uguale)
        s1="Mazzarella"; // costante stringa
        s2="mazzarella"; // costante stringa
        System.out.printf("\ns1.compareTo(s2)=%d",s1.compareTo(s2)); // s1<s2
        
        s1="mazzarella"; // costante stringa
        s2="mazzArella"; // costante stringa
        System.out.printf("\ns1.compareTo(s2)=%d",s1.compareTo(s2)); //
        
        
        
    }
}
