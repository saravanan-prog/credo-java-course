
import java.util.*;

public class AdditionProgram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a, b, c;
        String opname;

        System.out.println("Enter the operation");
        opname = sc.nextLine();

        System.out.println("Enter A value :");
        a = sc.nextDouble();

        System.out.print("Enter B value");
        b = sc.nextDouble();

        if(opname.equals("add"))
           c = a + b;
        else
            c = a - b;

        System.out.println("Result is ===>" + c);


    }
}
