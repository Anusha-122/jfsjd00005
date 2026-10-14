import java.util.Scanner;

public class fibonnaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.println("fibonacci number");

        while (a <= n) {
            System.out.println(a + " ");
            int c = a + b;
            a = b;
            b = c;


        }

    }
}