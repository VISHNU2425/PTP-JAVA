import java.util.Scanner;
class Inarr{
	public static void main(String...args){
		Scanner s = new Scanner(System.in);
		int a[]=new int[]{12,15,8,11,7,1};

		for (int i=0;i<a.length;i++){
			for (int j=0;j<a.length-i-1;j++){
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
