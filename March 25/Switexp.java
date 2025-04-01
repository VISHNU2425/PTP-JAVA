import java.util.Scanner;
class Switexp{
	public static void main(String...args){
		System.out.println("WELCOME TO CALI CALCULATOR");
		Scanner march= new Scanner(System.in);
			
		System.out.println("Select the case:");
		int val = march.nextInt();
		if(val>=5){	
			System.out.println("Exit");
			System.exit(0);
		}
		System.out.println("enter the values");
		int a = march.nextInt();
		int b = march.nextInt();
		int result = switch(val){
			case 1 -> a+b;
			case 2-> a-b;
		case 3 -> a*b;
			case 4 -> a/b;
			default-> 0;


		};
		System.out.println("result=="+ result);
		
	  		}
	  			
	}
