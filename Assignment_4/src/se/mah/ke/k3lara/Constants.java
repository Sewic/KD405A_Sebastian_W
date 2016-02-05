package se.mah.ke.k3lara;

/**
 * Declares the limits for size and price, declares a bool for colorCheck to
 * false and also an arrayList with available colors.
 */

public class Constants {
	public static final int MIN_SIZE = 8;
	public static final int MAX_SIZE = 28;
	public static final int MAX_PRICE = 30000;
	public static final int MIN_PRICE = 0;
	public static boolean colorCheck = false;

	public static final String[] colorArray = new String[] { "Blue", "Green", "Black", "Indigo", "White" };

	/** Getter */
	public static int getMaxPrice() {
		return MAX_PRICE;
	}

	/** Getter */
	public static int getMinPrice() {
		return MIN_PRICE;
	}

	/** Getter */
	public static String[] getColorarray() {

		return colorArray;
	}

	/** Getter */
	public static int getMinSize() {
		return MIN_SIZE;
	}

	/** Getter */
	public static int getMaxSize() {
		return MAX_SIZE;
	}

	/** Getter that checks if a color is available in the colorArray. */
	public static boolean getCheckedColor(String testcolor) {
		for (int i = 0; i < Constants.colorArray.length; i++) {
			if (Constants.colorArray[i].equals(testcolor)) {
				colorCheck = true;
				return colorCheck;
			} else {
				colorCheck = false;
			}
		}
		return colorCheck;

	}

}
