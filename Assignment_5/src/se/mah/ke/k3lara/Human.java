package se.mah.ke.k3lara;

public class Human {

	private Dog dog;
	private String name;

	/**
	 * Constructor
	 * 
	 * @param info
	 */
	public Human(String name) {

		this.name = name;

	}

	/** Getter that Returns the humans name */
	public String GetName() {
		return name;

	}

	/** Creates an instance of a dog within the human class */
	public Dog buyDog(Dog dog) {

		dog = new Dog(dog.GetName());
		this.dog = dog;
		return dog;

	}

	/**
	 * Returns: "Human" has no dog if "Dog" instance is null, otherwise returns
	 * that the "Human" has a dog.
	 */

	public String getInfo() {

		String s;
		if (dog == null) {
			s = GetName() + " har ingen hund";
		} else {

			s = GetName() + " äger en hund," + " hunden heter: " + dog.GetName();
		}
		return s;
	}
}
