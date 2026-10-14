class onee extends Thread
{
    public void run()
    {
        System.out.println("run 1st task");
    }
}
class twoo extends Thread
{
    public void run()
    {
        System.out.println("run 2nd task");
    }
}

public class multithred {
    public static void main(String[] args) {
        onee o=new onee();
        twoo t=new twoo();
        o.run();
        t.run();
    }

}

