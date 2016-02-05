package se.mah.ke.k3lara;

/** Initialize the class */
public class Bike {

	private String color;
	private int price;
	private int size;

	/** Constructor for my class */
	public Bike(String color, int size) {
		this.color = color;
		this.size = size;

	}

	/** Constructor for my class */
	public Bike(String color, int size, int price) {

		this.price = price;

		this.size = size;

		this.color = color;

	}

	/** Getter */
	public String GetColor() {

		return color;

	}

	/** Getter with values from constants to restrict price values */
	public int GetPrice() {

		if (price >= Constants.MIN_PRICE && price <= Constants.MAX_PRICE) {
			this.price = price;
		}
		return this.price;
	}

	/** Getter with values from constants to restrict size values */
	public int GetSize() {

		if (size >= Constants.MIN_SIZE && size <= Constants.MAX_SIZE) {
			this.size = size;
		}
		return this.size;
	}

	/** SETTER */
	public void SetPrice(int price) {
		this.price = price;

	}

}
