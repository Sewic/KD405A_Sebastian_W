package se.mah.ke.k3lara;

public abstract class Animal {
	
	

	protected String latinName;
	protected String friendlyName;
	
	
	
	public abstract String GetInfo();
	
	
	
	public Animal(String latinName, String friendlyName){
		
		this.latinName = latinName;
		this.friendlyName = friendlyName;
	}
	
	

	
	
	public String getFriendlyName() {
		return friendlyName;
	}

	public void setFriendlyName(String friendlyName) {
		this.friendlyName = friendlyName;
	}

}
