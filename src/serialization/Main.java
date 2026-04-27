package serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable {
    int empNo;
    String empName;

    public Employee( int empNo,String empName) {
        this.empName = empName;
        this.empNo = empNo;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee obj1 = new Employee(1,"saravanan");
        Employee obj2 = new Employee(2,"sanjay");
        try{
            FileOutputStream fo = new FileOutputStream("employeeFile.txt");
            ObjectOutputStream os = new ObjectOutputStream(fo);

            os.writeObject(obj1);
            os.writeObject(obj2);
            fo.close();
            os.close();

            System.out.println("Employee file is created and data added");








        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }


    }
}
