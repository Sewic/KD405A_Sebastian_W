package se.mah.ke.k3lara;

public abstract class Mammal extends Animal {
	 /** Using protected here to make these variables available for my subclasses. */
	protected int gestationTime = 0;
	
	/** The constuctor inherits initializers from the abstract animal class. */
	public Mammal(int gestationTime, String latinName, String friendlyName){
		super(latinName, friendlyName);
		this.gestationTime = gestationTime;
		
	
	}
	
	public int getGestationTime(){
		return gestationTime;
		
		
	}

}
