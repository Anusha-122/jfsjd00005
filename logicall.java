import java.util.Scanner;

public class logicall {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Logical AND:" +(a>0&&b>0));
        System.out.println("Logical OR:" +(a>0||b>0));
        System.out.println("Logical NOT:" +!(a>0));
    }
}
