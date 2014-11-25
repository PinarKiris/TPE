package hs_mannheim.ws14.tpe_uib_05.ueb3;

import java.util.HashMap;
import java.util.Map;

public class Baum<K, V> implements AssociativeArray<K, V> {

	public class Baumknoten<K, V> {
		Baumknoten<K, V> links;
		Baumknoten<K, V> rechts;
		private K key;
		private V value; // Wert des Knotens

		public Baumknoten(K key, V value) {
			this.key = key;
			this.value = value;
			this.links = null; // wenn auf der linken seite kein knoten mehr ist
			this.rechts = null; // wenn auf der rechten seite kein knoten mehr
								// ist

		}
	}

	Baumknoten<K, V> wurzel = null;

	public void clear() {
		wurzel = null;
	}

	public boolean containsValue(Baumknoten<K, V> node, V value) {
		boolean output;
		if (node.value.equals(value))
			return true;
		else {

			if (value.hashCode() < node.value.hashCode() && node.links != null) {
				output = containsValue(node.links, value);
			} else if (value.hashCode() > node.value.hashCode()
					&& node.rechts != null) {

				output = containsValue(node.rechts, value);

			}
		}
		return false;
	}
	
	@Override
	public boolean containsKey(K key) {
		return containsKey(wurzel, key);
	}

	public boolean containsKey(Baumknoten<K, V> node, K key) {
		boolean output;
		if (node.key.equals(key)) {
			return true;
		} else {
			if (key.hashCode() < node.key.hashCode() && node.links != null) {

				output = containsKey(node.links, key);
			} else if (key.hashCode() > node.key.hashCode()
					&& node.rechts != null) {

				output = containsKey(node.rechts, key);
			}
		}

		return false;

	}

	public int get(Object key) {

		return 0;
	}

	public void put() {

	}

	public boolean isEmpty() {
		return wurzel == null;

	}

	public void put(K key, V value) {

	}

	public void putAll() {

	}

	public int remove() {

		return 0;
	}

	public int size() {

		return 0;
	}

	public void update(Object value) {

	}

	public void forEach() {

	}

	public void extractAll() {

	}

	public void map() {

	}




}
