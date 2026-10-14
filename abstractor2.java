abstract class doctor {
    String name;
    int age;

    doctor(String name, int age) {
        this.name = name;
        this.age = age;

    }

    abstract void card1();

    abstract void neo1(String a, int b);

}

class cardio extends doctor
{
    cardio(String name,int age) {
        super(name, age);
    }
    void card1() {
        System.out.println("cardiologist doctor name is :" + name + " age is " + age);
    }
    void neo1(String a,int b)
    {
        System.out.println("neuro name is:"+a+" age is :"+b);

    }


}
public class abstractor2 {
    public static void main(String[] args){
        cardio c=new cardio("anu",26);
        c.card1();
        c.neo1("shuba",24);


    }
}
