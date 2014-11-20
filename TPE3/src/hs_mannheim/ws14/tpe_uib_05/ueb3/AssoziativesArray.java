package hs_mannheim.ws14.tpe_uib_05.ueb3;

/**
 * 
 * Dieses Interface traegt zur Entwicklung eines typsicheren assoziativen Arrays
 * bei, indem es die jeweiligen Methoden implementiert.
 * 
 * @author Dennis Keßler 1326697
 * @author Pınar Kırış
 * 
 */

public interface AssoziativesArray {

	public void clear();

	public boolean containsValue(Object value);

	public boolean containsKey(Object key);

	public int get(Object key);

	public boolean isEmpty();

	public void put();

	public void putAll();

	public int remove();

	public int size();

	public void update();

	public void forEach();

	public void extractAll();

	public void map();

	

}
