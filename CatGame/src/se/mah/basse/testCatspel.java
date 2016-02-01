package se.mah.basse;

public class testCatspel {

	public static void main(String[] args) {
		System.out.println("Detta är en test för catspel");
		System.out.println("**Start Test");
		Katt c = new Katt ();
		Katt a = new Katt ("Brun", "Spunken");
		System.out.println("En katt: "+ c.getName() + " och den andra katten: " + a.getName());
	}

}
