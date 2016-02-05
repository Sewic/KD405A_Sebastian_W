package se.mah.ke.k3lara;

public class TestBikeStore {
private static BikeStore store;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		store = new BikeStore("Basses cykelaffär");
		for(int i = 0; i < 10; i++){
			Bike b = new Bike("Black", 22, 1700 );
		
		}
		System.out.println(store.getBikes());

	}

}
