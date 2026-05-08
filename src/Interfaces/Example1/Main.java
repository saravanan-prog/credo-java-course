package Interfaces.Example1;

interface School{
    void studentsCount();
    void schoolType();
    void academicResult();

}

class DavSchool implements School{
    @Override
    public void studentsCount(){
        System.out.println("Student count is 100");
    }
    @Override
    public void schoolType(){
        System.out.println("Student Type is CBSE");
    }
    @Override
    public void academicResult() {
        System.out.println("2026 all students is state First");
    }
}


public class Main {
    public static void main(String[] args) {
        School obj = new DavSchool();
        obj.studentsCount();
        obj.schoolType();
        obj.academicResult();
    }
}
