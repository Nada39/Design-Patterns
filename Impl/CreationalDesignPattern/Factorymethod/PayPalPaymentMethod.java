package Factorymethod;

public class PayPalPaymentMethod implements IpaymentMethod {

    @Override
    public Payment Charge(int customerId, double amount) {
        return new Payment(customerId ,amount + (amount + 0.05));
    }
    
}
