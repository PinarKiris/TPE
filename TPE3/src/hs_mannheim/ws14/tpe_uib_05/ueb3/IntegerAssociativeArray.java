package hs_mannheim.ws14.tpe_uib_05.ueb3;

import java.util.ArrayList;

public class IntegerAssociativeArray implements AssoziativesArray {
	
	public static void main(String[] args) {
	//Baumknoten <Integer> i = new Baumknoten <Integer> ("1,2,3,4"); generics Baumknoten
	
	ArrayList <Integer> list = new ArrayList <Integer> ();
	Map<Integer> map = new HashMap<>();
	private int size;
	

	public void clear() {
		for (int i = 0, i < size, i++)
			list [i] = 0;
	}
		

	public boolean containsValue(Object value) {
		if (value == list)
			return true;
		else

		return false;
	}

	
	public boolean containsKey(Object key) {
	
		if(key == list)
			return true;
		else
			
		return false;
	}


	public int get(Object key) {
		

		return (int) key;
	}


	public boolean isEmpty() {
		if (list == 0)
			return true;
		else

		return false;
	}


	public void put() {

	}

	
	public void putAll() {

	}

	
	public int remove() {
		list.remove();

		return list.remove;
	}

	
	public int size() {

		return (size);
	}


	public void update (Object value) {
		update (value);
	
	}


	public void forEach() {

	}

	
	public void extractAll() {

	}


	public void map() {

	}

}
