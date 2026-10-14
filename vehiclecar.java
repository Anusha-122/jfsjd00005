class vehicle {
    String fuel_type;
    int noofseats;

    vehicle(String fuel_type, int noofseats) {
        this.fuel_type = fuel_type;
        this.noofseats = noofseats;

    }

    void vehicle() {
        System.out.println("vehicle type" + fuel_type + " " + noofseats);


    }
}
class Car extends vehicle
{
    String modelName;
    String color;
    double price;
    Car(String fuel_type,int numOfSeats,String modelName,String color,double price)
    {
        super(fuel_type,numOfSeats);
        this.modelName=modelName;
        this.color=color;
        this.price=price;
    }
    void Cardetails()
    {
        System.out.println("Details of Car are : "+fuel_type+" "+noofseats+" "+modelName+" "+color+" "+price);
    }
}




public class vehiclecar {
    public static void main(String[] args){
        vehicle v1=new vehicle("petrole",5);
        v1.vehicle();
        Car c1 =new Car("petrol",5,"MG","Black",50000);
        c1.Cardetails();
    }
}



