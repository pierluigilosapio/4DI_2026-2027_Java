package stringhe;

public class FunzioniBaseStringhe {
    public static void main(String[] args) {
        // dichiara una costante stringa
        String s1="Casetta";
        
        // dichiara un'istanza della classe String
        String s2=new String("Casetta");
        
        System.out.printf("s1='%s'",s1);
        System.out.printf("\ns2='%s'",s2);
        
        // calcola la lunghezza della stringa
        System.out.printf("\ns1.length()=%d, s2.length()=%d",s1.length(),s2.length());
        
        // ottiene una sottostringa a partire dal carattere di posizione 1
        // fino al carattere di posizione 3 (escluso).
        System.out.printf("\ns1.substring(1,3)='%s'",s1.substring(1,3));
        
        // legge il carattere di posizione 2
        System.out.printf("\ns1.charAt(2)='%s'",s1.charAt(2));
        
        // converte tutto in minuscole
        System.out.printf("\ns1.toLowerCase()='%s'",s1.toLowerCase());
        
        // converte tutto in maiuscole
        System.out.printf("\ns1.toUpperCase()=%s",s1.toUpperCase());
        
        // confronto di uguaglianza tra due costanti stringhe
        System.out.print("\n--------------------");
        s1="Finestra"; // costante stringa
        s2="Finestra"; // costante stringa
        System.out.printf("\ns1='%s' (costante stringa)",s1);
        System.out.printf("\ns2='%s' (costante stringa)",s2);

        // La condizione (s1==s2) risulta vera perchè 
        // la JVM cerca "Finestra" tra le costanti stringa già memorizzate 
        // e, in caso positivo, associa lo stesso riferimento. 
        // Pertanto due costanti stringhe con lo stesso contenuto avranno lo
        // stesso riferimento ed confronto con l'operatore == restituirà True. 
        if(s1==s2) System.out.println("\n(s1==s2)=True: le stringhe hanno lo stesso riferimento");
        else System.out.println("\n(s1==s2)=False: le stringhe hanno con riferimenti diversi.");

        // la condizione (s1.equals(s2)) risulta vera perchè il metodo equals() effettua 
        // un confronto sul contenuto della stringa e non sul riferimento.
        if(s1.equals(s2)) System.out.println("(s1.equals(s2)): le stringhe hanno stesso contenuto.");
        else System.out.println("(s1.equals(s2)): le stringhe hanno contenuto diverso.");
        
        
        System.out.print("\n--------------------");
        s1="Porta"; // costante stringa
        s2=new String("Porta"); // nuova istanza della classe String
        System.out.printf("\ns1='%s' (costante stringa)",s1);
        System.out.printf("\ns2='%s' (istanza stringa)",s2);

        // la condizione (s1==s2) risulta falsa perchè la costante stringa s1 
        // e l'istanza della classe String s2 hanno riferimenti diversi pur
        // avendo stesso contenuto. 
        if(s1==s2) System.out.println("\n(s1==s2)=True: le stringhe hanno riferimenti uguali.");
        else System.out.println("\n(s1==s2)=False: le stringhe hanno riferimenti diversi.");

        // la condizione (s1.equals(s2)) risulta vera perchè il metodo equals() 
        // effettua un confronto sul contenuto della stringa e non sul riferimento.
        if(s1.equals(s2)) System.out.println("(s1.equals(s2))=True: le stringhe hanno lo stesso contenuto.");
        else System.out.println("(s1.equals(s2))=False: le stringhe hanno contenuto diverso.");
        
        // confronto case insensitive
        s1="Divano"; // costante stringa
        s2=new String("DivanI"); // nuova istanza della classe String
        if(s1.equalsIgnoreCase(s2)) System.out.println("\ns1.equalsIgnoreCase(s2)");
        else System.out.println("!s1.equalsIgnoreCase(s2)");
        
        // Il metodo compareTo() ritorna la differenza dei codici ASCII
        // dei primi due caratteri diversi di uguale posizione.
        // Se le stringhe sono uguali ritorna 0.
        // Ad es. s1="Poltrona" e s2="poltrona", il primo carattere
        // diverso tra le due stringhe è quello in posizione 0 ("P" e "p")
        // Il metodo s1.compareTo(s2) restituirà -32 ovvero
        // (la differenza tra ASCII('P')=80 a ASCII('p')=112 ) 
        System.out.print("\n--------------------");
        s1="Poltrona";
        s2="poltrona";
        System.out.printf("\ns1='%s'",s1);
        System.out.printf("\ns2='%s'",s2);
        System.out.printf("\ns1.compareTo(s2)=%d > 0",s1.compareTo(s2));
        System.out.printf("\n'%s'<'%s'",s1,s2);
        
        // Ad es. s1="cucinino" e s2="cucina", i primi caratteri
        // diversi tra le due stringhe sono quelli in posizione 5 ("i" e "a")
        // Il metodo s1.compareTo(s2) restituirà 8 ovvero
        // (la differenza tra ASCII('i')=105 a ASCII('a')=97 ) 
        System.out.print("\n\n--------------------");
        s1="cucinino";
        s2="cucina";
        System.out.printf("\ns1='%s'",s1);
        System.out.printf("\ns2='%s'",s2);
        System.out.printf("\ns1.compareTo(s2)=%d>0",s1.compareTo(s2));
        System.out.printf("\n'%s'>'%s'",s1,s2);
        
        
        
    }
}
