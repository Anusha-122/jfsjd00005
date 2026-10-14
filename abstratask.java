abstract class vehii {
    abstract void start();

}
class car1 extends vehii {
    void start() {
        System.out.println("car is moving");
    }
}
class motorcycle extends vehii{
    void start() {
        System.out.println("motorcycle is moving");
    }

}

public class abstratask {
    public static void main(String[] args){
        car1 c=new car1();
        motorcycle m=new motorcycle();
        c.start();
        m.start();

    }
}

