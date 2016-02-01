package se.mah.basse;

public class Katt {
private String color = "gray";
private String name = "noname";
private int age = 0;
private static int MAX_AGE=220; //age in months

//constructors
/** Creates a cat with name burken */
public Katt(){

this.name = "burken";
	
}
public Katt(String color, String name){
	
	this.color = color;
	this.name = name;	
}

public String getColor(){
	
	return this.color;
}

public String getName(){
	
	return this.name;
}
/** Sets the age between 0 and max age (220) */
public void setAge(int age){
	if(age > 0 && age <= MAX_AGE){
		this.age = age;
	}
	
}
public int getAge(){
	
	return this.age;
}
}