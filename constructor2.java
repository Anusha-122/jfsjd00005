class rental
{
    String name;
    String proof;
    String days;
    double pricePerDay;

    rental(String name, String proof,String days, double pricePerDay)
    {
        this.name = name;
        this.proof = proof;
        this.days = days;
        this.pricePerDay = pricePerDay;
    }
    void details()
    {
        System.out.println(name+" "+proof+" "+days+ +pricePerDay);




    }
}
public class constructor2 {
    public static void main(String[] args){
        rental c1=new rental("rsf","adhar","6",500);
                c1.details();

    }
}
