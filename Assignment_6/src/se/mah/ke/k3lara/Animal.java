package se.mah.ke.k3lara;

public abstract class Animal {
	
	

	protected String latinName;
	protected String friendlyName;
	
	
	
	public abstract String GetInfo();
	
	
	
	public Animal(String latinName){
		
		this.latinName = latinName;
	}
	
	

	
	
	public String getFriendlyName() {
		return friendlyName;
	}

	public void setFriendlyName(String friendlyName) {
		this.friendlyName = friendlyName;
	}

}
