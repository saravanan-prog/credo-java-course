package C_Inheritance.a_singelLevel.Example1;

class A {
    void printA(){
        System.out.println("A class Function");
    }
}
class B extends A {
    void printB(){
        System.out.println("B class function");
    }
}
public class Main {
    public static void main(String[] args) {
        B obj = new B();
        obj.printA();
    }
}
