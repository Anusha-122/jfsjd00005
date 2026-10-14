class oneee extends Thread
{
    public void run()
    {
        for(int j=0;j<4;j++) {
            System.out.println("thread 1");
            try
            {
                Thread.sleep(2000);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
class twooo extends Thread {
    public void run() {
        for (int j = 0; j < 6; j++) {
            System.out.println("thread 2");
            try
            {
                Thread.sleep(2000);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
class three extends Thread {
    public void run() {
        for (int j = 0; j < 6; j++) {
            System.out.println("thread 3");
            try
            {
                Thread.sleep(50000);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }

}

public class multithread2 {
    public static void main(String[] args) {
        oneee o=new oneee();
        twooo t=new twooo();
        three h=new three();
        o.start();
        t.start();
        h.start();
    }
}
