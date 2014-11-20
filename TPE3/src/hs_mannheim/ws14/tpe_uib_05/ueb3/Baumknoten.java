package hs_mannheim.ws14.tpe_uib_05.ueb3;

public class Baumknoten <T> {
	private T links;
	private T rechts;
	
	public Baumknoten (T links, T rechts){
		this.links = links;
		this.rechts = rechts;
	}
	
	public String toString (){
		return this.links + "," + this.rechts;
	}
	
	public T getLinks(){
		return links;
	}
	
	public T getRechts(){
		return rechts;
	}

}
