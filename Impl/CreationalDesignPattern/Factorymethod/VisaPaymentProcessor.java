package Factorymethod;

public class VisaPaymentProcessor extends PaymentProcessor {

    @Override
    protected IpaymentMethod CreatePaymentMethod() {
        return new VisaPaymentMethod();
    }

    
}