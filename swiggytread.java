class custmr extends Thread {
    String cname;
    String caddress;

    custmr(String cname, String caddress) {
        this.cname = cname;
        this.caddress = caddress;
    }

    public void run() {
        System.out.println("ur order is confirmed");
        System.out.println("customer name is:" +cname+ "customer address is: " + caddress);
    }
}
    class order extends Thread {
        String id;
        String proof;
        double price;

        order(String id,String proof,double price)
        {
            this.id = id;
            this.proof = proof;
            this.price = price;
        }
        public void run()
        {
            System.out.println("customer number is: "+id+" customer card is+ "+proof+" customer amout is:" +price);
        }

}
class deliveryPartner extends Thread {
    String dname;
    String daddress;

    deliveryPartner(String dname, String daddress) {
        this.dname = dname;
        this.daddress = daddress;
    }

    public void run() {
        System.out.println("delvery name is:  " +dname+ " delvery address is:  " + daddress);
    }
}

public class swiggytread {
        public static void main(String[] args) {
            custmr cust=new custmr("anu","manyatha");
            deliveryPartner del=new deliveryPartner("arun","kolar");
            order or=new order("dg56797gh","adhar",99.5);
            cust.run();
            del.run();
            or.run();

        }



    }

