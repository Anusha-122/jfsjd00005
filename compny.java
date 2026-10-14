abstract class company
{
    String empname;
    int noofyears;
    String role;
    double bonus;
    company(String empname, int noofyears, String role, double bonus)
    {
        this.empname = empname;
        this.noofyears = noofyears;
        this.role = role;
        this.bonus = bonus;
    }
    void details()
    {
        System.out.println("Employee Name: " + empname);
        System.out.println("Years of Experience: " + noofyears);
        System.out.println("Role: " + role);
        System.out.println("Bonus: " + bonus);
    }
    abstract void bonusDetails();
}
class employe extends company
{
    employe(String empname, int noofyears, String role, double bonus)
    {
        super(empname, noofyears, role, bonus);
    }
    void bonusDetails()
    {
        if(noofyears > 5)
        {
            bonus = 40000;
        }
        else
        {
            bonus = 30000;
        }
        System.out.println("Bonus is " + bonus);
    }
}
public class compny {
    public static void main(String[] args)
    {
        employe e = new employe("kushii", 4, "software", 80000);
        e.details();
        e.bonusDetails();
    }
}

