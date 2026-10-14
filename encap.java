class encp
{
    private String pname="apple";
    private int price=100;

    public String getPname()
    {
    return pname;
    }
    public int getPrice()
    {
        return price;
    }
    public void setPname(String pname){
        this.pname=pname;
    }
    public void setPrice(int price){
        this.price=price;
    }
}

    public class encap {
    public static void main(String[] args){
        encp obj1=new encp();
        obj1.setPname("kashmir apple");
        obj1.setPrice(190);
        System.out.println((obj1.getPname()+" "+obj1.getPrice()));
    }
}
