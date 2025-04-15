import java.util.Scanner;


 class Numpyra {
    public static void main(String...args) {
        Scanner hehe = new Scanner(System.in);
        int x = hehe.nextInt(); 
        for (int i = 1; i <= x; i++) {
            for (int j = i; j < x; j++) {
                System.out.print(j);
            }
            for (int k = 1; k <= (i-1); k++) {
                System.out.print("");
            }
            System.out.println();
        }
        for (int p = 1; p <= x; p++) {
            for (int j = p; j < p; j++) {
                System.out.print("");
            }
            for (int k = 1; k <= (p-1); k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
