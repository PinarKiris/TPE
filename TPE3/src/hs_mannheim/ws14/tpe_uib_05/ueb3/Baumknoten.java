package hs_mannheim.ws14.tpe_uib_05.ueb3;

public class Baumknoten  {
	Baumknoten links;
	Baumknoten rechts;
	String key;
	int value;
	
	
	
	public Baumknoten (Baumknoten links, Baumknoten rechts, String key, int value){
		
	
		this.links = links;
		this.rechts = rechts;
		this.key = key;
		this.value = value;
	}
	
	public final String toString (){
		return this.links + "=" + this.rechts;
	}
	
	public final Baumknoten getLinks(){
		return links;
	}
	
	public final Baumknoten getRechts(){
		return rechts;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
