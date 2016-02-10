package se.mah.ke.k3lara;

public class Dog extends Mammal {

	private Boolean stupid = true;

	

	public Dog (String friendlyName, int gestationTime, String latinName, Boolean stupid) {

		super(gestationTime, latinName, friendlyName);
		

		this.stupid = stupid;

	}

	public Boolean isStupid() {
		return stupid;

	}

	@Override
	public String GetInfo() {
		String info;
		if (stupid == true) {
			info = "The dog: " + friendlyName + ". Latinname: " + latinName + ". Nurses for " + gestationTime
					+ " months and is very stupid."+ "\n";
			
		} else{
			info = "The dog: " + friendlyName + ". Latinname: " + latinName + ". Nurses for " + gestationTime
					+ " months and is smart."+ "\n";
			
		}
		return info;
		
	}

}
