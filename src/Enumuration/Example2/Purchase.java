package Enumuration.Example2;

enum OrderStatus {
    PENDING,
    PROCESSING,
    DELIVERY,
    REJECTED
}

public class Purchase {
    String productName;
    OrderStatus status;
    boolean paymentStatus;

    public Purchase( String productName,OrderStatus status, boolean paymentStatus) {
        this.status = status;
        this.productName = productName;
        this.paymentStatus = paymentStatus;
    }

    public static void main(String[] args) {
        Purchase person1 = new Purchase("apple",OrderStatus.PENDING,false);
        Purchase person2 = new Purchase("apple",OrderStatus.PENDING,true);

        person1.status = OrderStatus.PROCESSING;

        if(person1.paymentStatus != false)
          person1.status = OrderStatus.DELIVERY;
        else
            person1.status = OrderStatus.REJECTED;



        System.out.println("Person1 Status=======>" + person1.status);


        person2.status = OrderStatus.PROCESSING;

        if(person2.paymentStatus != false)
            person2.status = OrderStatus.DELIVERY;
        else
            person2.status = OrderStatus.REJECTED;

        System.out.println("Person2 Status=======>" + person2.status);

    }
}
