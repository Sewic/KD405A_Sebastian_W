package se.mah.ke.k3lara;

public class Snake extends Animal{
	
	private Boolean poison = true;
	
	
	public Snake(String friendlyName, Boolean poison, String latinName){
		super(latinName, friendlyName);
		this.poison = poison;
	}
	
	public Boolean IsPoison(){
		return poison;
	}

	@Override
	public String GetInfo() {
		String info;
		if(poison == true){
		info = "The Snake: " + friendlyName + " has the latinname: " + latinName + " and is " + "very deadly with its poison."+ "\n";
		} else {
			info = "The Snake: " + friendlyName + " has the latinname: " + latinName + " and is " + "is not lethal with its poison."+ "\n";
		}
		return info;
	}

}
