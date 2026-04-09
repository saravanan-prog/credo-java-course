package ClassandObjects;

import java.rmi.StubNotFoundException;

@Deprecated
class Student {
    int mark;

    void display(){
        System.out.println("Mark===>"+ this.mark);
    }
}

class UpdatedStudent{
    int tamilMark;
    int EnglishMark;
    int MathsMark;

    void displayTotalMark(){
        int result = this.EnglishMark + this.MathsMark + this.tamilMark;
        System.out.println("Your total mark is===>" + result);
    }
}

public class MainDeprecated {
    public static void main(String[] args) {
        UpdatedStudent obj;
        obj = new UpdatedStudent();

        obj.tamilMark = 100;
        obj.EnglishMark = 50;
        obj.MathsMark = 75;

        obj.displayTotalMark();
    }
}
