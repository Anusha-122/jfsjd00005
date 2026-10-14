interface notification {
    void mesg(String mesg);
}
class SMS implements notification
{
    @Override
    public void mesg(String mesg)
    {
        System.out.println("order is confirmed: "+mesg);
    }
}
class whtasapp implements notification
{
    @Override
    public void mesg(String mesg)
    {
        System.out.println("you got a mesg: "+mesg);
    }
}
class gmail implements notification
{
    @Override
    public void mesg(String mesg)
    {
        System.out.println("you got gmail: "+mesg);
    }

    }




public class interface4 {
    public static void main(String[] args){
        SMS s=new SMS();
        s.mesg("shuba");
        whtasapp w=new whtasapp();
        w.mesg(" john");
        gmail g=new gmail();
        g.mesg("request");


    }
}
