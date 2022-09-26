package com.Project4;

public class Java {
	
	int num;
	
	void numberCheck() {
		
		if(num < 0) {
			System.out.println("Error");
		} 
		
		else  if(num%2!=0) {
			
			System.out.println(num);
		}
		
		else if(num%2==0) {
			while(num%10 !=0) {
				num++;
			}
			System.out.println(num);
		}
		


	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Java number1=new Java();
		number1.num= 74;
		
		number1.numberCheck();
		
		

	}

}


