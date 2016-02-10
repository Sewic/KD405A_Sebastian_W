package se.mah.ke.k3lara;

public class Cat extends Mammal {

	


	private int numberOfLife = 0;
	
	
	public Cat(int gestationTime, String latinName, int numberOfLife) {
		
		super(gestationTime, latinName);
		
		this.setNumberOfLife(numberOfLife);
		// TODO Auto-generated constructor stub
	}


	public int getNumberOfLife() {
		return numberOfLife;
	}


	public void setNumberOfLife(int numberOfLife) {
		this.numberOfLife = numberOfLife;
	}


	@Override
	public String GetInfo() {
		
      String info;
		
		info = "The cat: " + ". Latinname: " + latinName + ". Nurses for " + gestationTime + " months and has " + numberOfLife +" lives." + "\n";
		
		return info;
	}
}
