package se.mah.ke.k3lara;

public class House{ 
	private int yearBuilt;   
	private int size;    
	private static final int minSize = 10;
	private static final int maxSize = 1000;
	private static final int minYearBuilt = 1800;
	private static final int maxYearBuilt = 2015;

public House(int yearBuilt,int size){
	if(yearBuilt >= minYearBuilt && yearBuilt <= maxYearBuilt) {
	this.yearBuilt = yearBuilt;
	}
	if(size >= minSize && size <= maxSize){
	this.size = size;
	}
	
	}    
public int getYearBuilt(){       
		return this.yearBuilt;    
		
	}    
public int getSize(){       
		return this.size;  
		} 
	} 
