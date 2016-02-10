package se.mah.ke.k3lara;

public abstract class Mammal extends Animal {
	
	protected int gestationTime = 0;
	
	
	public Mammal(int gestationTime, String latinName){
		super(latinName);
		this.gestationTime = gestationTime;
		
	
	}
	
	public int getGestationTime(){
		return gestationTime;
		
		
	}

}
