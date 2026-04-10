package A_classAndobjects.innerclass;

class School{
    class Teacher{
        class Student{
            void StudentInformation(){
                System.out.println("Student Name is Premkumar");
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        School sobj = new School();
        School.Teacher tobj = sobj.new Teacher();
        School.Teacher.Student stu = tobj.new Student();

        stu.StudentInformation();

    }
}
