package nonPrimitiveType;

class Student {

    int rollNumber = 25;
    String studentName  = "vimalRaj";
    String studentLastName = "Magesh";
    int academicMark = 75;
    char grade = 'A';
}


public class classType {

    public static void main(String[] args) {

        Student obj = new Student();

        System.out.println("student Roll Number ===>" + obj.rollNumber);
        System.out.println("student Name ===>" + obj.studentName);
        System.out.println("student LastName ===>" + obj.studentLastName);
        System.out.println("student academic Mark ===>" + obj.academicMark);
        System.out.println("student grade ===>" + obj.grade);

    }
}
