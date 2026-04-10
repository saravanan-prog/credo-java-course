package E_Interface.example2;

import java.sql.SQLOutput;

interface Animal{

    void sound();

    default void cost(){
        System.out.println("Rs.200");
    }
    static void animalStoreName(){
        System.out.println("Saravanan PET SHOP");
    }
}
class Dog implements Animal {
    public void sound(){
        System.out.println("Bow Bow");
    }
}

public class Main {
    public static void main(String[] args) {

        Animal animalobj;

        animalobj = new Dog();

        animalobj.sound();
        animalobj.cost();

        Animal.animalStoreName(); //Static.

    }
}
