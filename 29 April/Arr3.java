import java.util.Scanner;

class Arr3{
	public static void main(String...args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		//int k;
		int a[][] = new int[n][m];
		for(int i=0; i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				a[i][j] =i+j+5;
			}
		}
		for( int k=0; k<a.length;k++){
			for(int l=0;l<a[k].length;l++){
			System.out.print(	a[k][l] +" " );
			}
			System.out.println(" ");
		}


	}
}