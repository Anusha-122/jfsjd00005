class office
{
    private String emplyname = "anu";
    private String role = "software engineer";
    private double salary = 60000;
    private int id = 268;

    public String getEmplyname ()
    {
        return emplyname;
    }

    public String getRole()
    {
        return role;
    }

    public double getSalary()
    {
        return salary;
    }

    public int getId()
    {
        return id;
    }

    public void setEmplyname(String emplyname)
    {
        this.emplyname = emplyname;
    }

    public void setRole(String role)
    {
        this.role = role;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    public void setId(int id)
    {
        this.id = id;
    }
}

public class empyy {
    public static void main(String[] args){
        office c = new office();

        c.setEmplyname("chiru");
        c.setRole("Software Developer");
        c.setSalary(80000);
        c.setId(628);

        System.out.println("Employee Name: " + c.getEmplyname());
        System.out.println("Role: " + c.getRole());
        System.out.println("Salary: " + c.getSalary());
        System.out.println("Employee ID: " + c.getId());
    }
}

