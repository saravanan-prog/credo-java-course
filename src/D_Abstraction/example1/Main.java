package D_Abstraction.example1;

import java.sql.SQLOutput;

abstract class BuildingDevelopMent{

    abstract  void legalDocumentDetails();
}

class Lawer extends BuildingDevelopMent{

     void legalDocumentDetails(){
         System.out.println("This document is valid proceed to next step");
     }
}






public class Main {
    public static void main(String[] args) {
        BuildingDevelopMent obj;
        obj = new Lawer();
        obj.legalDocumentDetails();
    }
}
