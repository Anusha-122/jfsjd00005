class animal
{
    String type;
    String name;

    animal(String type,String name) {

        this.type = type;
        this.name = name;
    }
    void animaltypes()
    {
        System.out.println("animals details are "+type+" "+name);
    }

}
class dog extends animal
{
    String bread;

    dog(String type,String name, String bread )
    {
        super(type,name);
        this.bread = bread;
    }
    void dogdetails()
    {
        System.out.println("animals details are "+type+" "+name+" "+bread);
    }

}
class puppy extends dog{
    String colour;
    puppy(String type,String name,String colour,String bread)
    {
        super(type,name,bread);
        this.colour = colour;
    }
    void puppydetails() {


        System.out.println("animals details are " + type + " " + name+" " + bread+" " + colour);
    }

}
public class multiinheriti {
    public static void main(String[] args){
        animal a1 =  new animal("hybrid","scuby");
        dog d1 = new dog("hybrid","scuby","dabar");
        puppy p1 = new puppy("hybrid","scuby","white","dabar");
        p1.puppydetails();
    }
}
