package Factorymethod;

public abstract class PaymentProcessor {
    public Payment processPayment(int customerId, double amount)
    {
        IpaymentMethod paymentMethod = CreatePaymentMethod(); // factory method
        Payment payment = paymentMethod.Charge(customerId , amount);

        return payment;
    }
    protected abstract IpaymentMethod CreatePaymentMethod();
  
    // public PaymentProcessor create(String type)
    // {
    //     if(type.equals("Visa"))
    //         return new VisaPaymentProcessor();
    //     else if(type.equals("PayPal"))
    //         return new PayPalPaymentProcessor();
    //     else
    //         return null ;
    // }

}