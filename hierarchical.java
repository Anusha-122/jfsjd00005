class A
{
    void one()
    {
        System.out.println("parent class");
    }
}
class B extends A
{
    void two()
    {
        System.out.println("child 1");

    }
}
class C extends A {
    void three() {
        System.out.println("child 2");
    }
}
public class hierarchical {
    public static void main(String[] args) {
        A obj1 = new A();
        obj1.one();
        B obj2 = new B();
        obj1.one();
        obj2.two();
        C obj3 = new C();
        obj3.three();


    }
}