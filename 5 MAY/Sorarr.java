import java.util.Scanner;
class Sorarr{
	public static void main(String...args){
		Scanner s = new Scanner(System.in);
		int size =s.nextInt();
		int []a = new int[size];
		int hehe = 0;

		for (int i=0;i<size;i++)
			a[i]=s.nextInt();
		
		for (int x:a)
			System.out.println(x +" ");

		for (int i=0;i<size;i++){
			for (int j=0;j<size-i-1;j++){
		 		if(a[j]>a[j+1]){
		 			int t= a[j+1] + a[j] ;
		 			a[j] = t - a[j];
		 			a[j+1] = t - a[j+1];
		 			}
		 		}
		 	}
		 	for (int num : a)
		 	System.out.print(num + " ");
			}
		}