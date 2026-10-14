class product
{
    String name="ice cream";
    double price=100;
    int quantity=3;
    double total_price;
    void display() {
        System.out.println(name+ " " +price+ " " +quantity+" ");
    }
    void offer()
{
    if(total_price>=500) {
        System.out.println("total price after discpount:"+(total_price - 100));
    }
    else{
        System.out.println("total price after discpount:"+(total_price - 50));


    }
    double total_price = price * quantity;
    System.out.println("total price is "+total_price);


}

    }
     public class zepto {
        public static void main(String[] args){
            product p1=new product();
            p1.display();
            p1.offer();
    }




    }



