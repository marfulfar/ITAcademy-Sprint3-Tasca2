package payments;

import Interfaces.IPayment;

public class CardPayment implements IPayment {
    @Override
    public void pay() {

        System.out.println("Payment by card");
    }
}
