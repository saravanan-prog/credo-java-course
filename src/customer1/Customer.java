package customer1;

import common.Taxcalculation;

public class Customer {
    public static void main(String[] args) {
        Taxcalculation obj = new Taxcalculation(1000,2.5,2.5);

        double taxedAmount = obj.getTaxamount();

        System.out.println("TaxedAmount===>"+taxedAmount);

    }
}
