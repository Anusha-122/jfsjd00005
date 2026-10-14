abstract class demo
{
    abstract void find();
    void great()
    {
        System.out.println("developers");

    }
}
class demo1 extends demo
{
    void find()
    {
        System.out.println("abstract methode");
    }

}
public class obstract {
    public static void main(String[] args){
        demo obj1=new demo1();
        obj1.great();
        obj1.find();

    }
}
