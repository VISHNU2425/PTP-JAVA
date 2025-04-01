//Switch fall throguh

import java.util.Scanner;
class Switdemo{
	public static void main(String...args){
		Scanner march= new Scanner(System.in);
			int val = march.nextInt();
		switch(val){
	 		case 1:System.out.println("1");
	  		case 2: System.out.println("2");
	  		case 3: System.out.println("3");
	  		case 4: System.out.println("4");
	  			break;
	  		default:
	  		System.out.println("Exit");	
	  	}
	  }
}