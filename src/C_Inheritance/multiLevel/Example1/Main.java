package C_Inheritance.multiLevel.Example1;

class A {

    void printA(){
        System.out.println("This is A class Method");
    }
}

class B extends A {
    void printB(){
        System.out.println("This is B class Method");
    }
}

class C extends B {
    void printC(){
        System.out.println("This is class method");
    }
}


public class Main {
    public static void main(String[] args) {
        C obj = new C();
        obj.printA();
    }
}
