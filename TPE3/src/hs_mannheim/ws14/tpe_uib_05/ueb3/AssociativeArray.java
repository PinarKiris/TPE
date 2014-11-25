package hs_mannheim.ws14.tpe_uib_05.ueb3;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;

/**
 * 
 * Dieses Interface traegt zur Entwicklung eines generischen assoziativen Arrays
 * bei, indem es die jeweiligen Methoden / Platzhalter implementiert.
 * 
 * @author Dennis Keßler 1326697
 * @author Pınar Kırış 1332722
 * 
 * @param <K>
 *            Key des Arrays
 * @param <V>
 *            Value des Arrays
 */

public interface AssociativeArray<K, V> {

	/**
	 * Leert das assoziative Array.
	 */

	public abstract void clear();

	/**
	 * Ueberprueft ob der uebergebene Wert im assoziativen Array enthalten ist.
	 * 
	 * @param value
	 *            Wert, der ueberprueft wird
	 * @return Gibt true zurueck, sofern der Wert vorhanden ist
	 */

	public abstract boolean containsValue(V value);

	/**
	 * Ueberprueft ob der uebergebene Schluessel im assoziativen Array enthalten
	 * ist.
	 * 
	 * @param key
	 *            Schluessel, der ueberprueft wird
	 * @return Gibt true zurueck, sofern der Schluessel vorhanden ist
	 */

	public abstract boolean containsKey(K key);

	/**
	 * Liefert den passenden Wert zum uebergebenen Schluessel zurueck.
	 * 
	 * @param key
	 *            Schluessel, der uebergeben wird
	 * @return Wert des uebergebenen Schluessels
	 */

	public abstract V get(K key);

	/**
	 * Ueberprueft, ob das assoziative Array leer ist.
	 * 
	 * @return Gibt true zurueck, sofern das assoziative Array leer ist
	 */

	public abstract boolean isEmpty();

	/**
	 * Speichert uebergebenen Schluessel + Wert im assoziativen Array.
	 * 
	 * @param key
	 *            Schluessel, der im assoziativen Array gespeichert wird
	 * @param value
	 *            Wert, der im assoziativen Array gespeichert wird
	 */

	public abstract void put(K key, V value);

	/**
	 * Fuegt alle Schluessel und ihre dazugehoerigen Werte, des uebergebenen
	 * assoziativen Arrays, in das aktuelle assoziative Array hinzu.
	 * 
	 * @param uebergebenesArray
	 *            Assoziatives Array das uebergeben wird, von der die
	 *            Schluessel-Werte-Paare entnommen werden sollen
	 */

	public abstract void putAll(typesafeAssociativeArray<K, V> uebergebenesArray);

	/**
	 * Entfernt das Schluessel-Wert-Paar des uebergebenen Schluessels aus dem
	 * assoziativen Array und liefert den jeweiligen Wert zurueck.
	 * 
	 * @param key
	 *            Schluessel der zusammen mit seinem Wert aus dem assoziativen
	 *            Array entfernt werden soll
	 * @return Gibt den Wert des ubergebenen Schluessels zurueck
	 */

	public abstract V remove(K key);

	/**
	 * Liefert die Anzahl der Schluessel-Wert-Paare des assoziativen Arrays
	 * zurueck.
	 * 
	 * @return Anzahl der Schluessel-Wert-Paare
	 * 
	 */

	public abstract int size();

	/**
	 * Aktualisiert Wert(Knoten) des uebergebenen Schluessles mit dem
	 * uebergebenen Wert
	 * 
	 * @param key
	 *            Schluessel des Knotens
	 * @param value
	 *            Wert des Knotens
	 */
	public abstract void update(K key, V value);

	/**
	 * Nimmt alle Knoten des Baumes in den uebergebenen BiConsumer auf.
	 * 
	 * @param biConsumer
	 *            Uebergebener BiConsumer
	 */

	public abstract void forEach(BiConsumer<K, V> biConsumer);

	/**
	 * Fuegt alle Knoten des aktuellen Baumes dem uebergebenen Baum hinzu
	 * 
	 * @param uebergebenesArray
	 *            Baum, der alle Knoten des aktuellen Baumes erhalten soll
	 */

	public abstract void extractAll(
			typesafeAssociativeArray<K, V> uebergebenesArray);

	/**
	 * Fuehrt die BiFunction fuer alle Schluessel-Werte-Paare des
	 * typesafeAssociativeArray aus.
	 * 
	 * @param biFunction
	 *            Uebergebene BiFunction
	 * @return Gibt einen neues typesafeAssociativeArray zurueck.
	 */

	public abstract typesafeAssociativeArray<K, V> map(
			BiFunction<K, V, typesafeAssociativeArray<K, V>> biFunction);

}
