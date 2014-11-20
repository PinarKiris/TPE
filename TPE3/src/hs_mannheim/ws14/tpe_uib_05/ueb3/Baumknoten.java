package hs_mannheim.ws14.tpe_uib_05.ueb3;

public class Baumknoten <L,R> {
	private L left;
	private R right;
	private int size;
	
	
	public Baumknoten (L left, R right){
	
		this.left = left;
		this.right = right;
		
	}
	
	public final String toString (){
		return this.left + "=" + this.right;
	}
	
	public final L getLeft(){
		return left;
	}
	
	public final R getRight(){
		return right;
	}
	
	public boolean containsKey (Object key){
		return Baumknoten ((left), key != null);
	
	}
	
	public boolean isEmpty (){
		return size == 0;		
	}
	
	
}
