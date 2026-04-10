package C_Inheritance.c_hierarical.Example1;

class BaseClass {
    void basePrint(){
        System.out.println("This is Base class");
    }
}

class DerivedOne extends BaseClass {
    void derivedOnePrint(){
        System.out.println("This is derieved one class");
    }
}

class DerivedTwo extends BaseClass {
    void derivedTwoPrint(){
        System.out.println("This is derieved two class");
    }
}


class DerivedThree extends BaseClass {
    void derivedThreePrint(){
        System.out.println("This is derieved three class");
    }
}


public class Main {
    public static void main(String[] args) {
        DerivedTwo obj = new DerivedTwo();
        obj.basePrint();

    }
}
