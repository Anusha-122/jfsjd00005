class worker extends Thread
{
    String wname;
    String qualification;
    int poyear;
    double cgpa;

    worker(String wname,String qualification,int poyear,double cgpa)
    {
        this.wname=wname;
        this.qualification=qualification;
        this.poyear=poyear;
        this.cgpa=cgpa;

    }
    public void run()
    {
        System.out.println("worker name: "+ wname+ ", worker qualification: "+ qualification+ ", worker poyear: "+ poyear);
    }
}
class application extends Thread
{
     String role;
     String waddress;
     int wsalary;

    application(String role,String waddress,int wsalary)
    {
        this.role=role;
        this.waddress=waddress;
        this.wsalary=wsalary;

    }
    public void run()
    {
        System.out.println("worker rolee: "+ role+ ", worker address: "+ waddress+ ", worker salary: "+ wsalary);
    }
}
class companyy extends Thread
{
    String cname;
    String jobtype;
    String bond;

    companyy(String cname,String jobtype,String bond)
    {
        this.cname=cname;
        this.jobtype=jobtype;
        this.bond=bond;

    }
    public void run()
    {
        System.out.println("company name: "+ cname+ ", company jobtype: "+ jobtype+ ", company bond: "+bond);
    }
}
public class workerr {
    public static void main(String[] args){
        worker w=new worker("anusha k","BE",2026,7.87);
        application ap=new application("backend software","Banglore",100000);
        companyy c=new companyy("accenture","offline","2 years");
        w.start();
        ap.start();
        c.start();

    }

}
