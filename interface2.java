interface puppi
{
    public void demo();
    public void cat2();
}
interface elephant {
    void kushii();
}

class dog5 implements puppi, elephant
{
    @Override
    public void demo()
    {
        System.out.println("java developer");
    }
    public void cat2()
    {
        System.out.println("cat is smiling");

    }
    public void kushii()
    {
        System.out.println("elephant is beautiful animal");

    }
}


public class interface2 {
    public static void main(String[] args){
        dog5 obj4=new dog5();
        obj4.demo();
        obj4.cat2();
        obj4.kushii();
    }


}
