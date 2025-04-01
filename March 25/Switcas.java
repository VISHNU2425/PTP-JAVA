//Write a program to perform a calculation using switch case: ask the user to select 
//the operation(cases)1.Add,2.sub,3.mul,3.div,4.exit//ask the user to enter 2 values

import java.util.Scanner;
class Switcas{
	public static void main(String...args){
		System.out.println("WELCOME TO CALI CALCULATOR");
		Scanner march= new Scanner(System.in);
			System.out.println("enter the values");
		int a = march.nextInt();
		int b = march.nextInt();
		System.out.println("Select the case:");
		System.out.println( "select the1.add/n 2.sub/n 3.mul/n 4.div/n");
	   System.out.println("Select the calculation you wanna perform");
			int val = march.nextInt();
		switch(val){
	 		case 1: 	 		
	  			System.out.println("Addition=="+(a+b));
	  				break;
	  		case 2:	  		
	  		    System.out.println("Subtraction=="+(a-b));
	  				break;
	  		case 3: 	
				 System.out.println("Multiplication=="+(ab));
	  				break;
	  		case 4: 	  			
	  				System.out.println("Division=="+(a/b));
	  				break;
	  		default:
	  		System.out.println("Exit");		//}while(true);
	  		}
	}
}