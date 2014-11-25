package hs_mannheim.ws14.tpe_uib_05.ueb3;

/**
 * Klasse zum generischen "Assoziativen Array". Diese Klasse implementiert das
 * Interface "AssociativeArray" und arbeitet mit einem binären Suchbaum.
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

	class Knoten {

		private final K key;
		private V value;
		private Knoten knotenLinks;
		private Knoten knotenRechts;

		private Knoten(K key, V value, Knoten knotenLinks, Knoten knotenRechts) {
			this.key = key;
			this.value = value;
			this.knotenLinks = knotenLinks;
			this.knotenRechts = knotenRechts;
		}

		private Knoten(K key, V value) {
			this(key, value, null, null);
		}

		protected K getKey() {
			return this.key;
		}

		protected V getValue() {
			return this.value;
		}

		private void setValue(V value) {
			this.value = value;

		}

		private Knoten getLinks() {
			return this.knotenLinks;
		}

		private Knoten getRechts() {
			return this.knotenRechts;
		}

		private boolean hasLeftChild() {
			if (this.knotenLinks != null) {
				return true;
			}
			return false;
		}

		private boolean hasRightChild() {
			if (this.knotenRechts != null) {
				return true;
			}
			return false;

		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getOuterType().hashCode();
			result = prime * result + ((key == null) ? 0 : key.hashCode());
			result = prime * result
					+ ((knotenLinks == null) ? 0 : knotenLinks.hashCode());
			result = prime * result
					+ ((knotenRechts == null) ? 0 : knotenRechts.hashCode());
			result = prime * result + ((value == null) ? 0 : value.hashCode());
			return result;
		}

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
			if (knotenLinks == null) {
				if (other.knotenLinks != null)
					return false;
			} else if (!knotenLinks.equals(other.knotenLinks))
				return false;
			if (knotenRechts == null) {
				if (other.knotenRechts != null)
					return false;
			} else if (!knotenRechts.equals(other.knotenRechts))
				return false;
			if (value == null) {
				if (other.value != null)
					return false;
			} else if (!value.equals(other.value))
				return false;
			return true;
		}

		private typesafeAssociativeArray getOuterType() {
			return typesafeAssociativeArray.this;
		}
	}
	
	protected Knoten wurzel;
	
	public typesafeAssociativeArray(){
		this.wurzel = null;
	}
	
	public typesafeAssociativeArray(Knoten baumKnoten){
		this.wurzel = baumKnoten;
	}
	
	//insert Binärbaummethoden
}
