import java.util.Scanner;


class Pattern3{
    public static void main(String...args) {
        Scanner hehe = new Scanner(System.in);
        int x = hehe.nextInt(); 
        for (int i = 0; i < x; i++) {
          for (int j = 0; j < x; j++) {
            if(i==0||i==x-1 || j==0||j==x-1)
                System.out.println("* ");
            else
                System.out.println(" ");
        }
            System.out.println("");
               
            
        }
    }
}
