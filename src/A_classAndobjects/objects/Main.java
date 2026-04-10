package A_classAndobjects.objects;

class DepartmentalStore{
    int productId;
    String productName;

    public DepartmentalStore(int productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    void productDisplay(){
        System.out.println("Product ID = " + this.productId +" Product Name = " + this.productName);
    }
}

public class Main {
    public static void main(String[] args) {
        DepartmentalStore[] obj = new DepartmentalStore[5];

        obj[0] = new DepartmentalStore(1,"Maida");
        obj[1] = new DepartmentalStore(2,"Atta");
        obj[2] = new DepartmentalStore(3,"gold winner");
        obj[3] = new DepartmentalStore(4,"idhayam groundnet oil");
        obj[4] = new DepartmentalStore(5,"moong dhool");


        for(DepartmentalStore item : obj){
            item.productDisplay();
        }
    }
}
