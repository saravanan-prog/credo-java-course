package E_Interface.example3;
//Multiple inheritance support

interface AnimalDetails{
    void animalSound();
    void animalCost();
}

interface PriceDetails extends AnimalDetails {

    void actualPrice();
}

interface DiscountDetails extends PriceDetails  {
    void finalPrice();
}

class DogBuyer implements DiscountDetails {
    @Override
    public void animalSound() {
        System.out.println("Bow bow");
    }

    @Override
    public void animalCost() {
        System.out.println("Rs.500");
    }

    @Override
    public void actualPrice() {
        System.out.println("200");
    }

    @Override
    public void finalPrice() {
        System.out.println("200");
    }
}


public class Main {
    public static void main(String[] args) {
        DiscountDetails animal;
        animal = new DogBuyer();

        animal.animalSound();
        animal.animalCost();
        animal.finalPrice();
        animal.actualPrice();

    }
}
