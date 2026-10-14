class A2 {
    private class B1 {
        void demo() {
            System.out.println("inner class data");


        }
    }

    void hony() {
        B1 b1 = new B1();
        b1.demo();
    }
}

public class innercls {
    public static void main(String[] args){
        A2 a=new A2();
        a.hony();

    }
}
