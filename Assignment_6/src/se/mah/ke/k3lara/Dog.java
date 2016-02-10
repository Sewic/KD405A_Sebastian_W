package se.mah.ke.k3lara;

public class Dog extends Mammal {

	private Boolean stupid = true;

	/** The constuctor inherits initializers from the abstract mammal class. */
	public Dog(String friendlyName, int gestationTime, String latinName, Boolean stupid) {

		super(gestationTime, latinName, friendlyName);

		this.stupid = stupid;

	}

	public Boolean isStupid() {
		return stupid;

	}

	/**
	 * This method is connected with the abstract method from the animal-class.
	 * The override instructs the compiler to override the method in the
	 * superclass. The boolean is set to true if the dog is stupid, else -..-
	 */
	@Override
	public String GetInfo() {
		String info;
		if (stupid == true) {
			info = "The dog: " + friendlyName + ". Latinname: " + latinName + ". Nurses for " + gestationTime
					+ " months and is very stupid." + "\n";

		} else {
			info = "The dog: " + friendlyName + ". Latinname: " + latinName + ". Nurses for " + gestationTime
					+ " months and is smart." + "\n";

		}
		return info;

	}

}
