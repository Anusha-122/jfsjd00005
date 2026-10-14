import java.util.Scanner;

public class logical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("bitwise and is " + (a & b));
        System.out.println("bitwise or is " + (a | b));
        System.out.println("bitwise not is " + (a ^ b));
        System.out.println("bitwise complimentary is " + (~a));
        System.out.println("bitwisw right increment " + (a >> 2));
        System.out.println("bitwisw left increment " + (a << 2));
    }
}



