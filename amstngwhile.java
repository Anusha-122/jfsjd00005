import java.util.Scanner;

public class amstngwhile {

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number");
            int n=sc.nextInt();
            int a=0;
            int original=n;
            while(n>0) {
                int num = n % 10;
                a=a+(num*num*num);
                n = n / 10;
            }
            if(a==original) {
                System.out.println(" amstang number");
            }
            else{
                System.out.println(" not amstang number");

            }

        }
}



