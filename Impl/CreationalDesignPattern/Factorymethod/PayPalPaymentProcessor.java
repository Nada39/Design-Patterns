package Factorymethod;

public class PayPalPaymentProcessor extends PaymentProcessor{

    @Override
    protected IpaymentMethod CreatePaymentMethod() {
       return new PayPalPaymentMethod();
    }
    
}
