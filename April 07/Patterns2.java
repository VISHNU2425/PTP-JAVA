import java.util.Scanner;


class Patterns2 {
    public static void main(String...args) {
        Scanner hehe = new Scanner(System.in);
        int x = hehe.nextInt(); 
        for (int i = 0; i < x; i++) {
            for (int j = 1; j <=i; j++) 
                System.out.print(j);
                System.out.println("");
            }
            for ( int i = x; i>0; i--) {
                for(int j=1;j<=i;j++)
                System.out.print(j);
            System.out.println("");
                
            }   
        }
    }

