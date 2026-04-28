package DeserializableExample;

import java.io.*;

class Student implements Serializable {
    int student_number;
    String student_name;

    public Student(int student_number, String student_name) {
        this.student_number = student_number;
        this.student_name = student_name;
    }
}

public class Main {
    public static void main(String[] args)  {
        try{
            Student obj = new Student(1,"Premkumar");

            FileOutputStream fo = new FileOutputStream("studentFile.txt");
            ObjectOutputStream os = new ObjectOutputStream(fo);
            os.writeObject(obj);

            os.close();
            fo.close();

            System.out.println("ID===>" + obj.student_number);
            obj = null;



            FileInputStream fis = new FileInputStream("studentFile.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Student s = (Student) ois.readObject();

            ois.close();
            fis.close();

            System.out.println("Student Id ====>" + s.student_number + "Student Name====>" +s.student_name);



        }
        catch(Exception e){
            System.out.println("Excepiton===>" + e.getMessage());
        }



    }
}
