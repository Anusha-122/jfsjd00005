interface anii {
    default void demo() {
        System.out.println("default is built in");

    }

    static void demo4() {
        System.out.println("static is built in");


    }
}

class rabit implements anii {

}
public class interface3 {
    public static void main(String[] args){
        anii abj4=new rabit();
        abj4.demo();
        anii.demo4();



    }
}
