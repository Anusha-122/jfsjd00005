import java.util.Scanner;

public class nestedifstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the usernmae");
        String username = sc.nextLine();
        System.out.println("Enter the role");
        String role = sc.nextLine();
        System.out.println("Enter the password");
        String password = sc.nextLine();
        if (role.equals("admin")) {
            if (username.equals("anu")) {
                if (password.equals("6824")) {
                    System.out.println("you can access entire data");
                } else {
                    System.out.println("you are restrected to acccess data");
                }
            } else {
                System.out.println("you can access entire dat");
            }
        } else if (role.equals("developer")) {
            System.out.println("you are work is developer applications");


        }
    }
}
