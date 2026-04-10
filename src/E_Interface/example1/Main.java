package E_Interface.example1;

interface Animals{

     void sound(); //abstract method
     void costDetails();
}

class Dog implements Animals {
    public void sound(){
        System.out.println("Bow Bow");
    }
    public void costDetails(){
        System.out.println("Rs.500");
    }
}

public class Main {
    public static void main(String[] args) {
        Animals animal;
        animal = new Dog();
        animal.sound();
        animal.costDetails();

    }
}
