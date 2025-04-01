import java.util.Scanner;
class Swityeild{
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
			case 1 -> {
				yeild (a+b);
			}
			case 2 -> {
				yeild (a-b);
			}
			case 3 -> {
				yeild (a*b);
			}
			case 4 -> {
				yeild (a/b);
			}
			
			default->{ 
				yeild (0);
		       }
		};
		System.out.println("result=="+ result);
		
	  		}
	  			
	}
