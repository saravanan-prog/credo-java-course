package C_Inheritance.c_hierarical.Example2;

class Birds{
    String birdName;
    String birdCountry;

    public Birds(String birdName, String birdCountry) {
        this.birdName = birdName;
        this.birdCountry = birdCountry;
    }
}
class FlyingBird extends Birds{

    public FlyingBird(String birdName, String birdCountry) {
        super(birdName, birdCountry);
    }

    void flyingBirdDisplay(){
        System.out.println("Bird Name ===>" + this.birdName+" country===>" + this.birdCountry);
    }
}
class NonFlyingBird extends Birds{

    public NonFlyingBird(String birdName, String birdCountry) {
        super(birdName, birdCountry);
    }

    void nonflyingBirdDisplay(){
        System.out.println("Bird Name ===>" + this.birdName+" country===>" + this.birdCountry);
    }

}

public class Main {
    public static void main(String[] args) {
        NonFlyingBird obj = new NonFlyingBird("cock","India");
        obj.nonflyingBirdDisplay();


        FlyingBird fobj = new FlyingBird("peacock","India");
        fobj.flyingBirdDisplay();

    }
}
