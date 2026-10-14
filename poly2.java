class paren
{
    void mobile(String name,String rom)
    {
        System.out.println("parents mobile"+name+" "+rom);
    }
}
class chil extends parent
{
    void mobile(String name,String rom, String ram)
    {
        System.out.println("child mobile"+ram+" "+name+" "+rom+" "+ram);
    }
}


public class poly2 {
    public static void main(String[] args){
        chil obj=new chil();
        obj.mobile("samsung","64tb","128gb");
    }
}
