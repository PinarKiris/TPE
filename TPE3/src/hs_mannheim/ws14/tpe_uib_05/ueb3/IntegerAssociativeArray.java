package hs_mannheim.ws14.tpe_uib_05.ueb3;

import java.util.ArrayList;

public class IntegerAssociativeArray implements AssoziativesArray {
	
	public static void main(String[] args) {
	//Baumknoten <Integer> i = new Baumknoten <Integer> ("1,2,3,4"); generics Baumknoten
	
	ArrayList <Integer> arrlist = new ArrayList <Integer> (100);
}
	private int size;
	
	

	@Override
	public void clear() {
		for (int i = 0, i < size, i++)
			arrlist [i] = 0;
	}
				
		
	

	@Override
	public boolean containsValue(Object value) {
		if (value == arrlist)
			return true;
		else

		return false;
	}

	@Override
	public boolean containsKey(Object key) {
	
		if(key == arrlist)
			return true;
		else
			
		return false;
	}

	@Override
	public int get(Object key) {
		

		return (int) key;
	}

	@Override
	public boolean isEmpty() {
		if (arrlist == 0)
			return true;
		else

		return false;
	}

	@Override
	public void put() {

	}

	@Override
	public void putAll() {

	}

	@Override
	public int remove() {
		arrlist.remove();

		return arrlist.remove;
	}

	@Override
	public int size() {

		return (size);
	}

	@Override
	public void update() {
	//Value und size
		

	}

	@Override
	public void forEach() {

	}

	@Override
	public void extractAll() {

	}

	@Override
	public void map() {

	}

}
