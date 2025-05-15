package Factorymethod;

public class Main {
    public static void main(String[] args) {
        String payment = "Visa";
        PaymentProcessor paymentProcessor = null;
        if(payment.equals("Visa"))
            paymentProcessor = new VisaPaymentProcessor();
        else
            paymentProcessor = new PayPalPaymentProcessor();

        paymentProcessor.getClass();

    }
}
