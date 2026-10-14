interface l
{
    int add(int a,int b);
}
interface p
{
    int sub(int a,int b);
}


public class lambda2 {
    public static void main(String[] args) {
        l abj=(int a, int b)->a+b;
        System.out.println(abj.add(6,4));
        p obj=(int a, int b)->a-b;
        System.out.println(obj.sub(8,6));



    }
}
