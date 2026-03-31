package JavaConditons;

public class NestedifStatement {
    public static void main(String[] args) {
        String productItem = "fruit";
        int price = 1000;
        boolean isProductAvaiable = true;

        /* Nested If-Stement */
        if(isProductAvaiable == true){
            if(productItem == "fruit"){
                if(price < 600){
                    System.out.println("Add my cart list");
                }
                else{
                    System.out.println("Price amount is not my meet wallet");
                }

            }
            else{
                System.out.println("This product is not fruit this is baby playing doll");
            }
        }
        else{
            System.out.println("currently product is not available");
        }











    }
}
