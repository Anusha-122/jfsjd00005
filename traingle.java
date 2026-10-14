import java.util.Scanner;
public class traingle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Rows: ");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= (2 * num - 2 * i + 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}