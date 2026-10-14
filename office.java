package Opps;

class Employee {

    public void employee(String empName, int emp_id, double salary) {
        System.out.println("The Employee " + empName + "having id " + emp_id + " is earning salary of " + salary + " per month!");
    }
}
    class Department {
        public void department(String dept_id, String dept_name) {

            System.out.println("The Department name is "+dept_name + " having Department ID is: "+dept_id );
        }
    }

    public class office {
        public static void main(String[] args) {
            Employee emp = new Employee();
            Department dept = new Department();
            System.out.println();
            emp.employee("Anusha k",268,600000);
            System.out.println();
            dept.department("1EP22EC009", "Java Developer");
        }
    }

