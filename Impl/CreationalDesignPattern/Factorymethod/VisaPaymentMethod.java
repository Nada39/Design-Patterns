package Factorymethod;

public class VisaPaymentMethod implements IpaymentMethod {

    @Override
    public Payment Charge(int customerId, double amount) {
        return new Payment(customerId, amount);
    }
}