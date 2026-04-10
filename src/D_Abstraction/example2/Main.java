package D_Abstraction.example2;

abstract class Animal{
    String animalName;
    double animalCost;

    abstract void animalSound();

    void ShowAnimalDetails(){
        System.out.println("Animal Name ====> " + this.animalName);
        System.out.println("Animal Cost=====>" + this.animalCost);
    }
}

class Dog extends Animal{
    void animalSound(){
        System.out.println("Bow Bow");
    }
}

class Cat extends Animal {
    void animalSound() {
        System.out.println("Meow Meow");
    }
}


public class Main {
    public static void main(String[] args) {
        Animal obj;



        obj = new Dog();
        obj.animalName = "Julie dog";
        obj.animalCost = 0;
        obj.animalSound();
        obj.ShowAnimalDetails();

        obj = new Cat();
        obj.animalName = "lucfier cat";
        obj.animalCost = 5000;
        obj.animalSound();
        obj.ShowAnimalDetails();
    }
}
