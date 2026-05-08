package Interfaces.Example3;

interface Shape{
    void area();
}

public class Main {
    public static void main(String[] args) {
        Shape s = () -> {
            System.out.println("Square area is  side * side");
            System.out.println("Circle ara is pi r square");
        };

        s.area();
    }
}
