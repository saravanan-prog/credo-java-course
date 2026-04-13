package F_Polymorphism.runtime;

class Parent {
    void display(){
        System.out.println("I am a parent class");
    }
}

class Child extends Parent {
    @Override
    void display(){
        System.out.println("I am Child class");
    }
}

public class Main {
    public static void main(String[] args) {
      Parent obj;
      obj = new Child();

      obj.display();
    }
}
