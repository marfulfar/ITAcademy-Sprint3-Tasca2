package payments;

import Interfaces.IPayment;

public class PayPalPayment implements IPayment {
    @Override
    public void pay() {

        System.out.println("Payment by paypal");
    }
}
