package hs_mannheim.ws14.tpe_uib_05.ueb3;

	public class Baum <K, V> implements AssoziativesArray <K,V>{
		
		public class Baumknoten <K, V>{
			Baumknoten <K,V> links;
			Baumknoten <K, V> rechts;
			private K key;
			private V value;
			
		


	
		public Baumknoten (K key, V value){
			this.key = key;
			this.value = value;
			this.links = null;
			this.rechts = null;
			
		
		}
		}
		Baumknoten <K, V> wurzel = null;

	
	public void clear() {
		wurzel = null;
	}
	
	public boolean containsValue(Object value) {
	
		return false;
	}
	
	
	public boolean containsKey(Object key) {
		
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
	
	
	

