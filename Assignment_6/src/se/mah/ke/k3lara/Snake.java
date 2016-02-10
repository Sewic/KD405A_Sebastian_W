package se.mah.ke.k3lara;

public class Snake extends Animal{
	
	private Boolean poison = true;
	
	
	public Snake(Boolean poison, String latinName){
		super(latinName);
		this.poison = poison;
	}
	
	public Boolean IsPoison(){
		return poison;
	}

	@Override
	public String GetInfo() {
		String info;
		if(poison == true){
		info = "The Snake has the latinname: " + latinName + " and is " + "very deadly with its poison"+ "\n";
		} else {
			info = "The Snake has the latinname: " + latinName + " and is " + "is not lethal with its poison"+ "\n";
		}
		return info;
	}

}
