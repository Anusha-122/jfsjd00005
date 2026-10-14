import java.util.Scanner;

public class methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Max number is "+Math.max(a,b));
        System.out.println("Min number is "+Math.min(a,b));
        System.out.println("abs number is "+Math.abs(-a));
        System.out.println("max number is "+Math.sqrt(b));

}}
