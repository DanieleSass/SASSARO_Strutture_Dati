import static java.lang.IO.print;
import static java.lang.IO.println;

void main(){
    /*
    int nElementi = 100_000;
    List<Integer> arrayList = new ArrayList<>();
    List<Integer> linkedList = new LinkedList<>();

    long start = System.nanoTime();

    for (int i = 0; i< nElementi; i++){
        arrayList.add(i);
    }

    long end = System.nanoTime();
    println("Tempo array list -Inserimento in coda :"+ (end-start) / 1_000_000.0 + " ms");



    //
    start = System.nanoTime();

    for (int i = 0; i< nElementi; i++){
        linkedList.add(i);
    }

    end = System.nanoTime();
    println("Tempo Linked list -Inserimento in coda :"+ (end-start) / 1_000_000.0 + " ms");

    /////////Accesso casuale -> diretto

    start = System.nanoTime();

    for (int i = 0; i< 1000; i++){
        arrayList.get(nElementi/2);
    }

    end = System.nanoTime();
    println("Tempo Array list -Accesso al centro :"+ (end-start) / 1_000_000.0 + " ms");


    start = System.nanoTime();

    for (int i = 0; i< 1000; i++){
        linkedList.get(nElementi/2);
    }

    end = System.nanoTime();
    println("Tempo Linked list -Accesso al centro :"+ (end-start) / 1_000_000.0 + " ms");

    */

    ///////////HASH
    /*
    String chiave = "Utente_Ciao_2008";
    int numeroBucket = 16;

    int hashCode = chiave.hashCode();

    //funzione di hashcode
    int indiceBucket = Math.abs(hashCode) % numeroBucket;
    println("chiave: " + chiave + " hashCode: " + hashCode + " indiceBucjet : " + indiceBucket);
    */

    int nElementi = 35_000_000;
    int target = nElementi-1;   //caso pessimo da cercare

    List<Integer> arrayList =  new ArrayList<>();
    Set<Integer> treeSet = new TreeSet<>(); //set sono degli insiemi
    Set<Integer> hashSet = new HashSet<>();

    for (int i = 0; i < nElementi; i++) {
        //arrayList.add(i);
        treeSet.add(i);
        //hashSet.add(i);
    }

    /*
    // TODO ArrayList
    long start = System.nanoTime();
    boolean trovatoElemento = arrayList.contains(target);
    long end = System.nanoTime();
    double tempo = (end - start) / 1_000_000.0;

    println("ArrayList 0(n) Trovato: "+ trovatoElemento + " Tempo: " + tempo + " ms");
*/
    // TODO treeSet
    long start = System.nanoTime();
    boolean trovatoElemento = treeSet.contains(target);
    long end = System.nanoTime();
    double tempo = (end - start) / 1_000_000.0;

    println("TreeSet 0(n) Trovato: "+ trovatoElemento + " Tempo: " + tempo + " ms");
    treeSet=null;
    System.gc();
    for (int i = 0; i < nElementi; i++) {
        //arrayList.add(i);
        //treeSet.add(i);
        hashSet.add(i);
    }
    // TODO hashSet
    start = System.nanoTime();
    trovatoElemento = hashSet.contains(target);
    end = System.nanoTime();
    tempo = (end - start) / 1_000_000.0;

    println("hashSet 0(n) Trovato: "+ trovatoElemento + " Tempo: " + tempo + " ms");

}