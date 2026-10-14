class person implements Runnable
{
    String pname;
    int page;

    person(String pname,int page)
    {
        this.pname=pname;
        this.page=page;

    }
    public void run()
    {
        System.out.println("person name: "+ pname+ ", person age: "+ page);
    }
}
class theater implements Runnable
{
    String tname;
    String tlocation;
    String ttype;

    theater(String tname,String tlocation,String ttype)
    {
        this.tname=tname;
        this.tlocation=tlocation;
        this.ttype=ttype;

    }
    public void run()
    {
        System.out.println("theater name: "+ tname+ ", location: "+ tlocation+ ", type: "+ ttype);
    }
}
class movie implements Runnable
{
    String mname;
    int mduration;
    String mlanguage;
    double ticketprice;

    movie(String mname,int mduration,String mlanguage,double ticketprice)
    {
        this.mname=mname;
        this.mduration=mduration;
        this.mlanguage=mlanguage;
        this.ticketprice=ticketprice;

    }
    public void run()
    {
        System.out.println("movie name: "+ mname+ ", movie duration: "+ mduration+ ", movie language: "+mlanguage+ ", movie ticket amount; "+ticketprice);
    }
}
class snackes implements Runnable
{
    String sname;
    String squantity;
    int sprice;


    snackes(String sname,String squantity,int sprice)
    {
        this.sname=sname;
        this.squantity=squantity;
        this.sprice=sprice;

    }
    public void run()
    {
        System.out.println("snackes name: "+ sname+ ", snackes qantity: "+ squantity+ ", snackes sprice: "+sprice);
    }
}
public class threadmovie {
    public static void main(String[] args){
        person p=new person("ajay",26);
        theater th=new theater("inox","garudamall","prime");
        movie mo=new movie("premada oorali",2,"kannada",200);
        snackes sn=new snackes("popcorn","medium",600);
        Thread t1=new Thread(p);
        Thread t2=new Thread(th);
        Thread t3=new Thread(mo);
        Thread t4=new Thread(sn);
        t1.start();
        t2.start();
        t3.start();
        t4.start();



    }
}
