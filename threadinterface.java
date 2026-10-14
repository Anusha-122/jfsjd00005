
class custm implements Runnable {
    public void run() {
        for (int i = 0; i < 2; i++) {
            System.out.println("Thread 1");


        }
    }
}
class orde implements Runnable{
    public void run(){
        for(int i=0;i<2;i++)
    {
        System.out.println("Thread 2");


    }
}
}
class deliveryPartne implements Runnable {
    public void run(){
        for(int i=0;i<2;i++)
        {
            System.out.println("Thread 3");


        }
    }
}


public class threadinterface {
    public static void main(String[] args) {
        orde ord = new orde ();
        custm cus=new custm();
        deliveryPartne deli=new deliveryPartne();
        Thread t1=new Thread(ord);
        Thread t2=new Thread(cus);
        Thread t3=new Thread(deli);
        t1.start();
        t2.start();
        t3.start();

    }

}
