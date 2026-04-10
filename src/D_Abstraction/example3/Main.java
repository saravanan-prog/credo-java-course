package D_Abstraction.example3;

abstract class TermsofConditons{
    abstract void legalDocument();
    abstract void acklogement();
}

abstract class Laywer {
    abstract void getOpinion();
}

abstract class Allconfirmation extends TermsofConditons {
    abstract boolean buildingLifeStatus();
    abstract boolean priceStatus();
}

class Casgrand extends  Allconfirmation {
    void legalDocument(){
        System.out.println("valid");
    }
    void acklogement(){
        System.out.println("ok");
    }
    boolean buildingLifeStatus(){
        return true;
    }
    boolean priceStatus(){
        return true;
    }
}

class MpDevelopers extends Laywer {
    void getOpinion() {
        System.out.println("Explained All details");
    }
}





public class Main {
    public static void main(String[] args) {
        Allconfirmation obj;
        obj = new Casgrand();

        Laywer lobj;
        lobj = new MpDevelopers();






    }
}
