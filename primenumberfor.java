public class primenumberfor {
    public static void main(String[] args){
        int n = 6;
        boolean num = true;
        for(int i=2; i<n; i++)
        {
            if (n % i == 0) {
                num = false;
                break;
            }
        }
        if(num) {
            System.out.println("number is prime");
        }
        else
            {
                System.out.println("number is  not prime");


            }
            }
        }


