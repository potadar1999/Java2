package com.Project4;

public class Lion {
	String name;
	Boolean isHungry;
	int age;
	static int totalDeaths=0;
	
	
	public static void printKillings() {
		
		System.out.println("Total killings by lions in jungle = "+totalDeaths);
	}
	
	public void thinking() {
		
		if(isHungry==false) {
			System.out.println(name+" is sleeping");
		}
		else if(isHungry == true && age>12) {
			totalDeaths=totalDeaths+2;
			System.out.println(name+" has eaten two animal");
		}
		else if(isHungry==true && age<=12 && age>2) {
			totalDeaths=totalDeaths+1;
			System.out.println(name+" has eaten one animals");
		}
		else if(isHungry == true && age<=2) {
			System.out.println(name+" is calling Mom");
		}
	}

	public static void main(String[] args) {
		
		Lion lion1=new Lion();
		lion1.name="lion1";
		lion1.isHungry=true;
		lion1.age=14;
		lion1.thinking();
		
		
		Lion lion2=new Lion();
		lion2.name="lion2";
		lion2.isHungry=true;
		lion2.age=12;
		lion2.thinking();
		
		Lion lion3=new Lion();
		lion3.name="lion3";
		lion3.isHungry=true;
		lion3.age=2;
		lion3.thinking();
		
		
		printKillings();
		
		
		
				
		
	}

}
