package hs_mannheim.ws14.tpe_uib_05.ueb3;


/**
 * Diese Klasse ist von der Klasse "typesafeAssociativeArray" abgeleitet und
 * arbeitet diesbezueglich ebenfalls mit einem binären Suchbaum, der jedoch nur
 * Integer-Werte verwaltet.
 * 
 * @author Dennis Keßler 1326697
 * @author Pınar Kırış 1332722
 * 
 * @param <K>
 *            Typ Parameter des Schluessels
 *
 */

public class IntegerAssociativeArray<K> extends
		typesafeAssociativeArray<K, Integer> {

	/**
	 * Konstruktur zum erzeugen eines leeren IntegerAssociativeArray-Obejektes.
	 */
	public IntegerAssociativeArray() {
		super();
	}

	/**
	 * Konstruktur zum erzeugen eines IntegerAssociativeArray-Objektes mit einer
	 * Wurzel.
	 * 
	 * @param baumKnoten
	 *            Wurzel des Baums
	 */
	
	public IntegerAssociativeArray(Knoten baumKnoten) {
		super(baumKnoten);

	}

}
