class Cofi
{
    void prepare()
    {
        System.out.println("Preparing normal coffee");
    }
    void prepare(String type)
    {
        System.out.println("Preparing " + type + " coffee");
    }
    void prepare(String type, int sugar)
    {
        System.out.println("Preparing " + type + " coffee with " + sugar + " spoons of sugar");
    }
    void prepare(String type, int sugar, double price)
    {
        System.out.println(type + " coffee, Sugar: " + sugar + ", Price: " + price);
    }
}
public class coffee {
    public static void main(String[] args)
    {
        Cofi c = new Cofi();
        c.prepare();
        c.prepare("black coffee");
        c.prepare("americano", 2);
        c.prepare("macha", 3, 200);
    }
}

