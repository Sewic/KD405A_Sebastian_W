package se.mah.ke.k3lara;

public class Dog extends Mammal {

	private Boolean stupid = true;

	public Dog(int gestationTime, String latinName, Boolean stupid) {
		super(gestationTime, latinName);
		this.stupid = stupid;
		// TODO Auto-generated constructor stub
	}

	public Dog(int gestationTime, String latinName, Boolean stupid, String friendlyName) {

		super(gestationTime, latinName);
		super.getFriendlyName();

		this.stupid = stupid;

	}

	public Boolean isStupid() {
		return stupid;

	}

	@Override
	public String GetInfo() {
		String info;
		if (stupid == true) {
			info = "The dog: " + getFriendlyName() + ". Latinname: " + latinName + ". Nurses for " + gestationTime
					+ " months and is very stupid."+ "\n";
			
		} else{
			info = "The dog: " + getFriendlyName() + ". Latinname: " + latinName + ". Nurses for " + gestationTime
					+ " months and is smart."+ "\n";
			
		}
		return info;
		
	}

}
