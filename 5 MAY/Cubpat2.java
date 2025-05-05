import java.util.Scanner;

class Cubpat2{
    public static void main(String... args) {
        Scanner v = new Scanner(System.in);
        int s = v.nextInt();
        int l = v.nextInt();
        char a[][]  = new char[s][l];
         for (int i = 0; i < s; i++) {
            for (int j = 0; j < l; j++) {
                a[i][j] = '-';
            }
        }
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < l; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}
//------
//------
//------
//------
//------
//expected output