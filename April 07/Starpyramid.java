import java.util.Scanner;


public class StarPyramid {
    public static void main(String[] args) {
        Scanner hehe = new Scanner(System.in);
        int rows = hehe.nextInt(); 

        for (int i = 1; i <= rows; i++) {
        
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
