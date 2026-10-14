import java.util.Scanner;

class bus{
    String name;
    String gender;
    String source;
    String destination;
    String date;
    double price;
    double totalprice;

    bus(String name,String gender,String source,String destination,String date,double price)
    {
        this.name=name;

        this.gender=gender;
        this.source=source;
        this.destination=destination;
        this.date=date;
        this.price=price;
    }
    void details(){
        System.out.println("person details: "+ name+" "+gender+" "+source+" "+destination+" "+date+" "+price);
    }

    void offer(){
        if(destination.equals("chikkaballapur")){
            totalprice=price-(price*0.20);
            System.out.println("total price after discont:"+ totalprice);
        }
        else if(destination.equals("baali")){
            totalprice=price-(price*0.05);
            System.out.println("total price after discont:"+ totalprice);
        }
        else if(destination.equals("bengaluru")){
            totalprice=price-(price*0.10);
            System.out.println("total price after discont:"+ totalprice);
        }
        else{
            System.out.println("the total price:"+ totalprice);
        }
    }
}


public class redbus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        bus b1 = new bus("anu", "female", "chikkaballapur", "baali", "26/09/2026", 600);
        bus b2 = new bus("shuba", "female", "benagaluru", "hampi", "28/09/2026", 800);
        b1.details();
        b1.offer();
        b2.details();
        b2.offer();
    }
}


