package JavaMethods;

class Student {
    private int rollNumber;
    private String studentName;
    private String address;

    void setRollNumber(int rollNumber){
       this.rollNumber = rollNumber;
    }
    int getRollNumber(){
        return this.rollNumber;
    }
    void setStudentName(String studentName){
        this.studentName = studentName;
    }
    String getStudentName(){
        return this.studentName;
    }
    void setAddress(String address){
        this.address = address;
    }
    String getAddress(){
        return this.address;
    }
}

public class ParameterizedFunction {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.setRollNumber(1);
        obj.setStudentName("kiran kumar");
        obj.setAddress("velachery");

        System.out.println("Roll Number===>" + obj.getRollNumber());
        System.out.println("Student Name===>" + obj.getStudentName());
        System.out.println("Student Address===>" + obj.getAddress());

        obj.setRollNumber(2);
        obj.setStudentName("Sanjay");
        obj.setAddress("Adhambakkam");

        System.out.println("Roll Number===>" + obj.getRollNumber());
        System.out.println("Student Name===>" + obj.getStudentName());
        System.out.println("Student Address===>" + obj.getAddress());


    }
}
