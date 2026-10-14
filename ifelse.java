import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = sc.nextInt();
        if (age > 18) {
            System.out.println("eligible for vote:");
        } else {
            System.out.println("Better try next year:");

        }

    }
}
