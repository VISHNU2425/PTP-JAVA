import java.util.Scanner;
class Sumarr{
	public static void main(String...args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int s = sc.nextInt();
		int a[]= new int[s];

		for(int i=0;i<s;i++)
			a[i] = sc.nextInt();
		
		int sum = 0 ;
		for(int j=0;j<s;j++){
			sum+=a[j];
			
		}
		System.out.println(sum);
	}
}