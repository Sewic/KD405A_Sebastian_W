package se.mah.ke.k3lara;

public class Cat extends Mammal {

	private int numberOfLife = 0;

	/** The constuctor inherits initializers from the abstract mammal class. */
	public Cat(String friendlyName, int gestationTime, String latinName, int numberOfLife) {

		super(gestationTime, latinName, friendlyName);

		this.setNumberOfLife(numberOfLife);
		// TODO Auto-generated constructor stub
	}

	public int getNumberOfLife() {
		return numberOfLife;
	}

	public void setNumberOfLife(int numberOfLife) {
		this.numberOfLife = numberOfLife;
	}

	/**
	 * This method is connected with the abstract method from the animal-class.
	 * The override instructs the compiler to override the method in the
	 * superclass
	 */
	@Override
	public String GetInfo() {

		String info;

		info = "The cat: " + friendlyName + ". Latinname: " + latinName + ". Nurses for " + gestationTime
				+ " months and has " + numberOfLife + " lives." + "\n";

		return info;
	}
}
