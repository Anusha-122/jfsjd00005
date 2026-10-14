class car
{
    String name;
    String colour;
    String regNo;

    car(String name,String colour,String regNo)
    {
        this.name=name;
        this.colour=colour;
        this.regNo=regNo;
    }
    void cdetails()
    {
        System.out.println(name+" "+colour+" "+regNo);


}
    public static void main(String[] args){
        car c1=new car("breeza","red","KA01AB2468");
        car c2=new car("bmw","blue","KA01AB1126");

        c1.cdetails();
        c2.cdetails();
    }
}
