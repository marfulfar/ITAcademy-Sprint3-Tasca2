package payments;

import Interfaces.IPayment;

public class AccountPayment implements IPayment {
    @Override
    public void pay() {

        System.out.println("Payment by account");
    }
}
