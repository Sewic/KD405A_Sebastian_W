package se.mah.ke.k3lara;

import java.util.ArrayList;

/**
 * initializes an ArrayList of the objecttype "Bike". Also declares a name for
 * my Bikeshop.
 */
public class BikeStore {

	private ArrayList<Bike> allBikes;
	private String name;

	/** Constructor that also sets a name for the class */
	public BikeStore(String name) {
		this.allBikes = new ArrayList<Bike>();
		this.name = name;
	}

	/** Adds the object bike to the array */
	public void addBike(String color, int size, int price) {
		Bike b = new Bike(color, size, price);
		this.allBikes.add(b);
	}

	/** This is a getter that prints all the Bike Objects */
	public String getBikes() {
		String c = this.name + "\n";
		for (Bike bike : allBikes) {
			c = c + "Cykel-nummer:" + (allBikes.indexOf(bike) + 1) + "\n" + "Size i tum: " + bike.GetSize() + "\n"
					+ "Pris i kronor: " + bike.GetPrice() + "\n" + "Färg: " + bike.GetColor() + "\n";
		}
		return c;
	}

	/** Getter */
	public String getName() {
		return name;
	}

	/** Setter */
	public void setName(String name) {
		this.name = name;
	}

}
