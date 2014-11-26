package hs_mannheim.ws14.tpe_uib_05.ueb3;

/**
 * Diese Klasse ist von der Klasse "typesafeAssociativeArray" abgeleitet und
 * arbeitet diesbezueglich ebenfalls mit einem binären Suchbaum, der jedoch nur
 * String Schluessel verwaltet.
 * 
 * @author Dennis Keßler 1326697
 * @author Pınar Kırış 1332722
 * 
 * @param <V>
 *            Typ Parameter des Wertes
 *
 */

public class StringAssociativeArray<V> extends
		typesafeAssociativeArray<String, V> {
	
	/**
     * Konstruktur zum erzeugen eines leeren StringAssociativeArray-Obejektes.
     */
	
    public StringAssociativeArray() {
        super();
    }

    /**
     * Konstruktur zum erzeugen eines StringAssociativeArray-Objektes mit
     * einer Wurzel.
     * 
     * @param baumKnoten
     *            Wurzel des Baums
     */
    public StringAssociativeArray(Knoten baumKnoten) {
        super(baumKnoten);

    }

}
