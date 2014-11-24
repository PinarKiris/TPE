package hs_mannheim.ws14.tpe_uib_05.ueb3;

/**
 * 
 * Dieses Interface traegt zur Entwicklung eines typsicheren assoziativen Arrays
 * bei, indem es die jeweiligen Methoden implementiert.
 * 
 * @author Dennis Keßler 1326697
 * @author Pınar Kırış 1332722
 * 
 */

public interface AssoziativesArray <K, V> {

	public void clear();

	public boolean containsValue(Object value);

	public boolean containsKey();

	public int get(Object key);

	public boolean isEmpty();

	public void put();

	public void putAll();

	public int remove();

	public int size();

	public void update(Object value);

	public void forEach();

	public void extractAll();

	public void map();


	

}
