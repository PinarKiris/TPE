package hs_mannheim.ws14.tpe_uib_05.ueb3;

/**
 * Dieses Klasse veranschaulicht eine Art Wörterbuch, welches Strings auf
 * Strings abbildet.
 * 
 * @author Dennis Keßler 1326697
 * @author Pınar Kırış 1332722
 *
 */

public class Dictionary extends typesafeAssociativeArray<String, String> {

	// Arrays
	private String[] keysArray;
	private String[] valuesArray;

	/**
	 * Konstruktor, welches ein leeres Dictionary Objekt erzeugt
	 */

	public Dictionary() {
		super();
	}

	/**
	 * Konstruktor, welches ein Dictionary Objekt mit einer Wurzel erzeugt
	 * 
	 * @param baumKnoten
	 *            Wurzel des Binärbaums
	 */

	public Dictionary(Knoten baumKnoten) {
		super(baumKnoten);
	}

	/**
	 * Diese Methode liefert ein Array zurueck, welches alle Schluessel
	 * enthaelt.
	 * 
	 * @return Gibt alle Schluessel zurueck.
	 */

	public String[] keys() {

		if (!this.isEmpty()) {

			Dictionary dic = new Dictionary(this.root);

			clearKeysArray();

			// neue initialisierung
			keysArray = new String[this.size()];
			dic.forEach((key, value) -> newKey(key));

			return keysArray;

		}
		return null;

	}

	private void newKey(String neuerWert) {
		boolean firstNull = true;
		for (int i = 0; i < keysArray.length; i++) {
			if (firstNull) {
				if (keysArray[i] == null) {
					keysArray[i] = neuerWert;
					firstNull = false;
				}
			}
		}

	}

	private void clearKeysArray() {
		keysArray = null;
	}

	/**
	 * Diese Methode liefert ein Array zurueck, welches alle Werte enthaelt.
	 * 
	 * @return Gibt alle Werte zurueck
	 * 
	 */

	public String[] values() {

		if (!this.isEmpty()) {

			Dictionary dic = new Dictionary(this.root);

			clearValuesArray();
			// neue initialisierung
			valuesArray = new String[this.size()];

			dic.forEach((key, value) -> newValue(value));

			return valuesArray;

		}
		return null;
	}

	private void newValue(String neuerWert) {
		boolean firstNull = true;
		for (int i = 0; i < valuesArray.length; i++) {
			if (firstNull) {
				if (valuesArray[i] == null) {
					valuesArray[i] = neuerWert;
					firstNull = false;
				}
			}
		}

	}

	private void clearValuesArray() {
		valuesArray = null;
	}

}
