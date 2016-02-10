package se.mah.ke.k3lara;

public class Snake extends Animal{
	
	private Boolean poison = true;
	
	/** The constuctor inherits initializers from the abstract animal class. */
	public Snake(String friendlyName, Boolean poison, String latinName){
		super(latinName, friendlyName);
		this.poison = poison;
	}
	
	public Boolean IsPoison(){
		return poison;
	}
	/**
	 * This method is connected with the abstract method from the animal-class.
	 * The override instructs the compiler to override the method in the
	 * superclass. The boolean is set to true if the snake is poisonous, else -..-
	 */
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
