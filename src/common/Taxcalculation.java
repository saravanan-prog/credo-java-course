package common;

public class Taxcalculation {

    int productAmout;
    double cgst;
    double sgst;

    public Taxcalculation(int productAmout, double cgst, double sgst) {
        this.productAmout = productAmout;
        this.cgst = cgst;
        this.sgst = sgst;
    }

    public double getTaxamount(){
        return this.productAmout * ( cgst + sgst) / 100;
    }
}
