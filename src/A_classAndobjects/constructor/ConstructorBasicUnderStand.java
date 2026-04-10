package A_classAndobjects.constructor;

class Employee{

    private int salary;

    //default constructor
    Employee(){
        System.out.println("I am Employee class default constructor");
    }

    public Employee(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
}

public class ConstructorBasicUnderStand {
    public static void main(String[] args) {
        Employee obj = new Employee(9500);
        System.out.println(obj.getSalary());
    }
}
