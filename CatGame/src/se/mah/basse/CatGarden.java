package se.mah.basse;

import java.util.ArrayList;

public class CatGarden {
	private ArrayList<Katt> allCats;
	private String name;
	
	public CatGarden(String name){
		allCats = new ArrayList<Katt>();
		this.name = name;
	}
public void addKatt(Katt c){
	if(allCats.size()< 101){
		this.allCats.add(c);
	}
		
	
	
}
public void killKatt (){
	allCats.remove(0);
	
}
public String getName(){
	
	return name;
}
public void setName(String name){
	this.name = name;
	
}
public String getCats(){
	
	String s = this.name+"\n";
	for(Katt katt : allCats){
		s = s + katt.getName()+"\n";
	}
	return s;
}

}
