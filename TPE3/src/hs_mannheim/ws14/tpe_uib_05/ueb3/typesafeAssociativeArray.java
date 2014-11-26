package hs_mannheim.ws14.tpe_uib_05.ueb3;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;

/**
 * Klasse zum generischen "Assoziativen Array", welches das Interface
 * "AssociativeArray" implementiert und mit einem binären Suchbaum arbeitet.
 * 
 * @author Dennis Keßler 1326697
 * @author Pınar Kırış 1332722
 * 
 * @param <K>
 *            Typ des Schluessels
 * @param <V>
 *            Typ des Wertes
 */
public class typesafeAssociativeArray<K, V> implements AssociativeArray<K, V> {

	/**
	 * Die Klasse Knoten ist eine innere Klasse des assoziativen Arrays.
	 *
	 */

	class Knoten {

		// Attribute

		private final K key;
		private V value;
		private Knoten nodeLeft;
		private Knoten nodeRight;

		/**
		 * Konstruktor, der einen neuen Knoten erzeugt
		 * 
		 * @param key
		 *            Schluessel des Knotens
		 * @param value
		 *            Wert des Knotens
		 * @param nodeLeft
		 *            linker Kinderknoten
		 * @param nodeRight
		 *            rechter Kinderknoten
		 */

		private Knoten(K key, V value, Knoten nodeLeft, Knoten nodeRight) {
			this.key = key;
			this.value = value;
			this.nodeLeft = nodeLeft;
			this.nodeRight = nodeRight;
		}

		/**
		 * Konstruktor, der einen neuen Knoten erzeugt, wobei dieser keine
		 * Kinderknoten besitzt.
		 * 
		 * @param key
		 *            Schluessel des Knotens
		 * @param value
		 *            Wert des Knotens
		 */

		private Knoten(K key, V value) {
			this(key, value, null, null);
		}

		/**
		 * Liefert den Schluessel des Knotens zurueck.
		 * 
		 * @return Gibt Schluessel des Knotens zurueck
		 */

		protected K getKey() {
			return this.key;
		}

		/**
		 * Liefert Wert des Knotens zurueck.
		 * 
		 * @return Gibt Wert des Knotens zurueck
		 */

		protected V getValue() {
			return this.value;
		}

		/**
		 * Ermoeglicht eine Aenderung des Wertes bezueglich des Knotens.
		 * 
		 * @param value
		 *            Aendert den Wert des Knotens
		 */

		private void setValue(V value) {
			this.value = value;

		}

		/**
		 * Liefert den linken Kinderknoten zurueck.
		 * 
		 * @return Gibt den linken Kinderknoten zurueck
		 */

		private Knoten getLinks() {
			return this.nodeLeft;
		}

		/**
		 * Liefert den rechten Kinderknoten zurueck.
		 * 
		 * @return Gibt den rechten Kinderknoten zurueck
		 */

		private Knoten getRechts() {
			return this.nodeRight;
		}

		/**
		 * Prueft ob der linke Kinderknoten vorhanden ist.
		 * 
		 * @return Gibt Aussage ob der linke Kinderknoten vorhanden ist zurueck.
		 * 
		 */

		private boolean hasLeftChild() {
			if (this.nodeLeft != null) {
				return true;
			}
			return false;
		}

		/**
		 * Prueft ob der rechte Kinderknoten vorhanden ist.
		 * 
		 * @return Gibt Aussage ob der rechte Kinderknoten vorhanden ist
		 *         zurueck.
		 * 
		 */

		private boolean hasRightChild() {
			if (this.nodeRight != null) {
				return true;
			}
			return false;

		}

		/**
		 * Ermoeglicht den Hashcode eines Objektes zu generieren.
		 * 
		 */

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getOuterType().hashCode();
			result = prime * result + ((key == null) ? 0 : key.hashCode());
			result = prime * result
					+ ((nodeLeft == null) ? 0 : nodeLeft.hashCode());
			result = prime * result
					+ ((nodeRight == null) ? 0 : nodeRight.hashCode());
			result = prime * result + ((value == null) ? 0 : value.hashCode());
			return result;
		}

		/**
		 * Ermoeglicht die Ueberpruefung, ob zwei Objekte identisch sind.
		 */

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Knoten other = (Knoten) obj;
			if (!getOuterType().equals(other.getOuterType()))
				return false;
			if (key == null) {
				if (other.key != null)
					return false;
			} else if (!key.equals(other.key))
				return false;
			if (nodeLeft == null) {
				if (other.nodeLeft != null)
					return false;
			} else if (!nodeLeft.equals(other.nodeLeft))
				return false;
			if (nodeRight == null) {
				if (other.nodeRight != null)
					return false;
			} else if (!nodeRight.equals(other.nodeRight))
				return false;
			if (value == null) {
				if (other.value != null)
					return false;
			} else if (!value.equals(other.value))
				return false;
			return true;
		}

		private typesafeAssociativeArray<K, V> getOuterType() {
			return typesafeAssociativeArray.this;
		}
	}

	// Wurzelknoten des assoziativen Arrays
	protected Knoten root;

	/**
	 * Konstruktor, der ein leeres assoziatives Array erzeugt.
	 */

	public typesafeAssociativeArray() {
		this.root = null;
	}

	/**
	 * Konstruktor, der ein assoziatives Array erzeugt.
	 * 
	 * @param baumKnoten
	 *            Bezeichnet den Knoten, der die Wurzel des assoziativen Arrays
	 *            symbolisiert.
	 */

	public typesafeAssociativeArray(Knoten baumKnoten) {
		this.root = baumKnoten;
	}

	// Binärbaummethoden

	/**
	 * Methode die dazu beitraegt einen neuen Knoten hinzuzufügen.
	 * 
	 * @param key
	 *            Schluessel des Knotens
	 * @param value
	 *            Wert des Knotens
	 */

	public void addKnoten(K key, V value) {

		Knoten newKnoten = new Knoten(key, value);
		setKnoten(newKnoten);

	}

	/**
	 * Diese Methode ermoeglicht das setzen eines neuen Knotens.
	 * 
	 * @param neuerKnoten
	 *            neu zu setzender Knoten
	 */

	protected void setKnoten(Knoten neuerKnoten) {

		if (this.root == null) {
			this.root = neuerKnoten;
		} else {
			setKnoten(this.root, neuerKnoten);
		}
	}

	/**
	 * Diese Methode ermoeglicht das setzen bzw. einsortieren eines neuen
	 * Knotens, indem ein Platz dafuer gesucht wird und er daraufhin eingesetzt
	 * wird (rekursiv).
	 * 
	 * @param setzePunkt
	 *            Punkt an dem der Knoten gestzt wird (Beginn: Wurzel)
	 * @param neuerKnoten
	 *            neu zu setzender Knoten
	 */

	private void setKnoten(Knoten setzePunkt, Knoten neuerKnoten) {

		/*
		 * Ist der Hashcode des einzusetzenden Knoten kleiner als der Hashcode
		 * des momentanen Knotens?
		 */

		if (neuerKnoten.key.hashCode() < setzePunkt.key.hashCode()) {

			if (setzePunkt.nodeLeft != null) {
				setKnoten(setzePunkt.nodeLeft, neuerKnoten);
			} else {
				setzePunkt.nodeLeft = neuerKnoten;
			}

		}

		/*
		 * Ist der Hashcode des einzusetzenden Knoten groesser als der Hashcode
		 * des momentanen Knotens?
		 */

		if (neuerKnoten.key.hashCode() > setzePunkt.key.hashCode()) {

			if (setzePunkt.nodeRight != null) {
				setKnoten(setzePunkt.nodeRight, neuerKnoten);
			} else {
				setzePunkt.nodeRight = neuerKnoten;
			}
		}

	}

	/**
	 * Diese Methode dient dazu, einen Knoten zu finden.
	 * 
	 * @param aktuellerKnoten
	 *            Aktueller Knoten
	 * @param gesuchterSchluessel
	 *            Schluessel des gesuchten Knotens
	 * @return Gibt den gefundenen Knoten zurueck (sofern er gefunden wurde)
	 */

	private Knoten findeKnoten(Knoten aktuellerKnoten, K gesuchterSchluessel) {

		if (containsKey(gesuchterSchluessel)) {

			if (gesuchterSchluessel.hashCode() == aktuellerKnoten.getKey()
					.hashCode()) {

				/*
				 * Diese if-Bedingung dient der Kollisionsbehandlung bei
				 * gleichem Hashcode, jedoch ungleichem Schluessel
				 */

				if (gesuchterSchluessel.equals(aktuellerKnoten.getKey())) {
					return aktuellerKnoten;
				} else {
					return findeKnoten(aktuellerKnoten.nodeRight,
							gesuchterSchluessel);
				}
			}

			// Aktueller Knoten hat einen groesseren Hashwert

			if (gesuchterSchluessel.hashCode() < aktuellerKnoten.getKey()
					.hashCode()) {
				return findeKnoten(aktuellerKnoten.nodeLeft,
						gesuchterSchluessel);
			}

			// Aktueller Knoten hat einen kleineren Hashwert

			if (gesuchterSchluessel.hashCode() > aktuellerKnoten.getKey()
					.hashCode()) {
				return findeKnoten(aktuellerKnoten.nodeRight,
						gesuchterSchluessel);
			}
		}

		return null;
	}

	/**
	 * Diese Methode gibt den jeweiligen Elternknoten zurueck.
	 * 
	 * @param schluesselDesGesuchtenKnoten
	 *            gesuchter Knoten
	 * @return Gibt den jeweiligen Elternknoten zurueck
	 */

	private Knoten getElternknoten(K schluesselDesGesuchtenKnoten) {

		return getElternknoten(this.root, schluesselDesGesuchtenKnoten);

	}

	/**
	 * Diese Methode gibt den jeweiligen Elternknoten, indem es den Baum anhand
	 * des Schluessels durchsucht.
	 * 
	 * @param aktuellerKnoten
	 *            Aktueller Knoten
	 * @param schluesselDesGesuchtenKnoten
	 *            Schluessel des gesuchten Knotens
	 * @return Gibt den gefunden Knoten zurueck
	 */

	private Knoten getElternknoten(Knoten aktuellerKnoten,
			K schluesselDesGesuchtenKnoten) {

		/*
		 * Zunächst muss überprüft werden ob der aktuelle Knoten überhaupt
		 * Kindknoten besitzt
		 */

		// Falls der Knoten eine linke Referenz hat

		if (aktuellerKnoten.hasLeftChild()) {

			/*
			 * Schluessel des linken Kindknotens gleich dem gesuchten
			 * Schluessel?
			 */

			if (aktuellerKnoten.getLinks().getKey()
					.equals(schluesselDesGesuchtenKnoten)) {
				return aktuellerKnoten;

			} else {

				// rekursive Suche

				if (schluesselDesGesuchtenKnoten.hashCode() < aktuellerKnoten
						.getKey().hashCode()) {

					return getElternknoten(aktuellerKnoten.nodeLeft,
							schluesselDesGesuchtenKnoten);
				} else {
					return getElternknoten(aktuellerKnoten.nodeRight,
							schluesselDesGesuchtenKnoten);
				}
			}
		}

		// Falls der Knoten eine rechte Referenz hat

		if (aktuellerKnoten.hasRightChild()) {
			if (aktuellerKnoten.getRechts().getKey()
					.equals(schluesselDesGesuchtenKnoten)) {
				return aktuellerKnoten;
			} else {
				if (schluesselDesGesuchtenKnoten.hashCode() < aktuellerKnoten.key
						.hashCode()) {
					return getElternknoten(aktuellerKnoten.nodeLeft,
							schluesselDesGesuchtenKnoten);
				} else {
					return getElternknoten(aktuellerKnoten.nodeRight,
							schluesselDesGesuchtenKnoten);
				}
			}
		}

		return null;

	}

	private static String zeichenkette;

	/**
	 * Liefert alle Schluessel-Wert-Paare des typesafeAssociativeArrays als
	 * Zeichenkette.
	 * 
	 * @return Gibt alle Schluessel-Wert-Paare des typesafeAssociativeArrays als
	 *         Zeichenkette zurueck
	 */

	public String toString() {
		zeichenkette = "{ ";

		if (this.isEmpty()) {
			zeichenkette += "Leer }";
		} else {

			BiConsumer<K, V> biConsumer = (key, value) -> {

				String stringSchluessel = (String.valueOf(key));
				String stringWert = String.valueOf(value);
				String result = stringSchluessel + "=" + stringWert + ", ";
				zeichenkette += result;
			};
			this.forEach(biConsumer);

			// löscht das letzte Komma und Leerzeichen
			zeichenkette = zeichenkette.substring(0, zeichenkette.length() - 2);
			zeichenkette += " }";
		}
		return zeichenkette;

	}

	// Interface Methoden

	@Override
	public void clear() {
		this.root = null;

	}

	@Override
	public boolean containsValue(V value) {
		Knoten node = this.root;
		return searchValue(node, value);
	}

	/**
	 * Ueberprueft, ob ein Knoten den uebergebenen Wert besitzt.
	 * 
	 * @param node
	 *            Knoten der ueberprueft wird
	 * @param value
	 *            Wert nach dem gesucht wird
	 * @return Gibt das jeweilige Ergebnis zurueck
	 */

	private boolean searchValue(Knoten node, V value) {
		boolean aussage = false;

		if (node != null) {

			if (node.getValue().equals(value)) {
				return aussage = true;
			}

			// Hat der Knoten ueberhaupt einen linken Kindknoten?

			if (node.hasLeftChild()) {
				aussage = searchValue(node.getLinks(), value);

			}

			// Wenn nicht suche rechts(falls es einen rechten Knoten gibt)

			if (node.hasRightChild() && aussage == false) {
				aussage = searchValue(node.getRechts(), value);
			}
		}

		return aussage;
	}

	@Override
	public boolean containsKey(K key) {
		Knoten node = this.root;
		return searchKey(node, key);
	}

	/**
	 * Ueberprueft, ob ein Knoten den uebergebenen Schluessel besitzt.
	 * 
	 * @param node
	 *            Knoten der ueberprueft wird
	 * @param key
	 *            Schluessel der gesucht wird
	 * @return Gibt das jeweilige Ergebnis zurueck
	 */

	private boolean searchKey(Knoten node, K key) {

		if (node != null) {
			if (node.getKey().equals(key)) {
				return true;
			}

			if (key.hashCode() < node.getKey().hashCode()) {
				return searchKey(node.getLinks(), key);

			} else {
				return searchKey(node.getRechts(), key);

			}
		} else {
			return false;
		}
	}

	@Override
	public V get(K key) {

		Knoten node = this.root;
		V gesuchterWert = null; // Wenn der Schluessel nicht im Baum enthalten
								// ist wird null zurueckgegeben

		if (containsKey(key) == true) {
			gesuchterWert = getValue(node, key);
		}

		return gesuchterWert;
	}

	/**
	 * Gibt den Wert der mit dem uebergebenen Schluessel verbunden ist zurueck.
	 * 
	 * @param node
	 *            Knoten der nach dem uebergebenen Schluessel ueberprueft wird
	 * @param key
	 *            Schluessel der uebergeben wird
	 * @return Gibt den Wert des uebergebenen Schluessels zurueck
	 */

	private V getValue(Knoten node, K key) {
		V gesuchterWert = null;

		if (node != null) {
			if (node.getKey().equals(key)) {
				gesuchterWert = node.getValue();
			} else {

				// Suche im linken Teilbaum fortsetzen
				gesuchterWert = getValue(node.getLinks(), key);

				/*
				 * Wenn Schluessel nicht im linken Teilbaum vorhanden ist, dann
				 * such im rechten Teilbaum weiter
				 */

				if (gesuchterWert == null) {
					gesuchterWert = getValue(node.getRechts(), key);
				}
			}
		}
		return gesuchterWert;
	}

	@Override
	public boolean isEmpty() {

		if (this.root == null) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void put(K key, V value) {

		addKnoten(key, value);

	}

	@Override
	public void putAll(typesafeAssociativeArray<K, V> uebergebenesArray) {
		// Fügt die wurzel des neuen Baumes einfach an
		if (!uebergebenesArray.isEmpty()) {
			uebergebenesArray.forEach((x, y) -> put(x, y));
		}
	}

	@Override
	public V remove(K key) {

		Knoten parentNode = null;
		Knoten removeNode = null;
		Knoten leftChild = null;
		Knoten rightChild = null;
		boolean wasLeft = false;
		boolean wasRight = false;

		// Wenn der Schluessel enthalten ist

		if (containsKey(key)) {

			// wird dessen Wert seperat gespeichert

			V value = get(key);

			// Suche nach dem Elternknoten des uebergebenen Schluessels

			if (!key.equals(root.getKey())) {

				parentNode = getElternknoten(key);

				if (parentNode != null) {

					// Ist der zu loeschende Knoten links oder rechts?
					if (key.hashCode() < parentNode.key.hashCode()) {

						// Ist der Hashcode kleiner, muss er links sein

						removeNode = parentNode.nodeLeft;
					} else {

						// ist der Hashcode größer, muss er rechts sein

						removeNode = parentNode.nodeRight;
					}
				}
			}
			// Wenn der zu löschende Knoten die wurzel ist:
			else {
				removeNode = this.root;
			}

			// Ist ein linker Kindknoten vorhanden?
			if (removeNode.hasLeftChild()) {
				leftChild = removeNode.nodeLeft;
				wasLeft = true;
			}

			// Ist ein rechter Kindknoten vorhanden?
			if (removeNode.hasRightChild()) {
				rightChild = removeNode.nodeRight;
				wasRight = true;
			}

			// Loeschung der Referenz
			if (parentNode != null) {
				if (key.hashCode() < parentNode.key.hashCode()) {
					parentNode.nodeLeft = null;
				} else {
					parentNode.nodeRight = null;
				}
			} else {
				if (key.equals(root.getKey())) {
					this.clear();
				} else {
					return null;
				}
			}

			if (wasRight) {
				// fügt den ehemaligen linken Kindknoten wieder an
				setKnoten(rightChild);
			}
			if (wasLeft) {
				// fügt den ehemaligen rechten Kindknoten wieder an
				setKnoten(leftChild);
			}

			return value;

		} else {
			return null;
		}

	}

	@Override
	public int size() {

		if (!this.isEmpty()) {
			int groesse = size(this.root);
			return groesse;
		} else {
			return 0;
		}
	}

	/**
	 * Diese Methode dient zum zaehlen der enthalten Knoten im Baum
	 * 
	 * @param aktuellerKnoten
	 *            Aktueller Knoten
	 * @return Groeße des Baums
	 */
	private int size(Knoten aktuellerKnoten) {

		if (aktuellerKnoten != null) {

			return 1 + size(aktuellerKnoten.getLinks())
					+ size(aktuellerKnoten.getRechts());
		}

		return 0;

	}

	@Override
	public void update(K key, V value) {
		Knoten gefundenerKnoten;

		if (containsKey(key) == true) {

			gefundenerKnoten = findeKnoten(root, key);

			gefundenerKnoten.setValue(value);
		}

	}

	@Override
	public void forEach(BiConsumer<K, V> biConsumer) {

		if (!this.isEmpty()) {

			forEach(this.root, biConsumer);
		}

	}

	/**
	 * Diese Methode uebergibt alle Schluessel-Wert-Paare an das
	 * BiConsumer-Interface
	 * 
	 * @param aktuellerKnoten
	 *            Aktueller Knoten
	 * @param biConsumer
	 *            BiConsumer Interface
	 */

	private void forEach(Knoten aktuellerKnoten, BiConsumer<K, V> biConsumer) {

		/*
		 * Der BiConsumer soll die Schluessel-Wert-Paare des aktuellen Knotens
		 * annehmen
		 */

		biConsumer.accept(aktuellerKnoten.getKey(), aktuellerKnoten.getValue());

		// Dies gilt auf für die weiteren Knoten im linken Teilbaum
		if (aktuellerKnoten.hasLeftChild()) {
			forEach(aktuellerKnoten.getLinks(), biConsumer);
		}

		// Und im rechten Teilbaum
		if (aktuellerKnoten.hasRightChild()) {
			forEach(aktuellerKnoten.getRechts(), biConsumer);
		}

	}

	@Override
	public void extractAll(typesafeAssociativeArray<K, V> uebergebenesArray) {

		if (this.root != null) {
			uebergebenesArray.putAll(this);
		}

	}

	@Override
	public typesafeAssociativeArray<K, V> map(BiFunction<K, V, V> biFunction) {

		typesafeAssociativeArray<K, V> neueListe = new typesafeAssociativeArray<>();

		if (!this.isEmpty()) {
			BiConsumer<K, V> biConsumer = (key, value) -> {
				value = biFunction.apply(key, value);
				neueListe.put(key, value);
			};
			this.forEach(biConsumer);
		}

		return neueListe;
	}
}
