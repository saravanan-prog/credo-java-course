package JavaMethods;

class Employee {
    private int empNumber;
    private String empName;
    private double empSalary;

    public int getEmpNumber() {
        return empNumber;
    }

    public void setEmpNumber(int empNumber) {
        this.empNumber = empNumber;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        Employee eobj = new Employee();
        eobj.setEmpNumber(1);
        eobj.setEmpName("Prem");
        eobj.setEmpSalary(50000);

        System.out.println("Emp Number===>" + eobj.getEmpNumber());
        System.out.println("Emp Name===>" + eobj.getEmpName());
        System.out.println("Emp Salary===>" + eobj.getEmpSalary());

    }
}
