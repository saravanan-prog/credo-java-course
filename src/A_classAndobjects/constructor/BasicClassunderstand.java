package A_classAndobjects.constructor;

class Student{
    private int rollnumber;
    private String studentName;

    public Student(int rollnumber, String studentName) {
        this.rollnumber = rollnumber;
        this.studentName = studentName;
    }

    void display(){
        System.out.println("Roll Number====>"+this.rollnumber);
        System.out.println("Student Name====>" +this.studentName);
    }
}

public class BasicClassunderstand {
    public static void main(String[] args) {
        Student obj = new Student(1,"Saravanan");
        obj.display();
    }
}
