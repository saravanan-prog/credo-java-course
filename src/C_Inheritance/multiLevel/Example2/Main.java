package C_Inheritance.multiLevel.Example2;

class Husband{
    String husbandName;
    int hubandSalary;

    public Husband(String husbandName, int hubandSalary) {
        this.husbandName = husbandName;
        this.hubandSalary = hubandSalary;
    }

    void displayHusbandDetails(){
        System.out.println("husband name ===> " + this.husbandName + " husband Salary ===> " + this.hubandSalary);
    }
}

class Wife extends Husband {
    String wifeName;
    int wifeSalary;

    public Wife(String husbandName, int hubandSalary, String wifeName, int wifeSalary) {
        super(husbandName, hubandSalary);
        this.wifeName = wifeName;
        this.wifeSalary = wifeSalary;

    }

    void displayWifetDetails() {
        System.out.println("wife name ===> " + this.wifeName + " wife Salary===>" + this.wifeSalary);
    }
    double bothAveregeSalary(){
        return this.hubandSalary + this.wifeSalary / 2;
    }
}

class Childrens extends Wife{

    public Childrens(String husbandName, int hubandSalary, String wifeName, int wifeSalary) {
        super(husbandName, hubandSalary, wifeName, wifeSalary);
    }

    void print(){
        System.out.println("i am childrens");
    }
}


public class Main {
    public static void main(String[] args) {
        Childrens obj = new Childrens("Rajesh", 50000, "kavitha", 25000);
        obj.displayHusbandDetails();
        obj.displayWifetDetails();

        System.out.println("both Average Salary ===>" + obj.bothAveregeSalary());
    }
}
