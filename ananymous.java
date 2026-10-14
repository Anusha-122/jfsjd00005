interface j
{
    void demo();
}
public class ananymous {
    public static void main(String[] args){
        j abj=new j() {
            public void demo() {
                System.out.println("software");
            }
        };
            abj.demo();
        }

        }
