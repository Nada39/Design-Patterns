package Factorymethod;

// SOLID Principles:
// Single resposibility: Encapsulates object creation separately from business logic
// Open/Closed: New Payment types can be added without modifying existing code
// Dependency Inversion: Decouples object creation from direct instantiation


public class Main {
    public static void main(String[] args) {
        String payment = "Visa";
        PaymentProcessor paymentProcessor = null;
        if(payment.equals("Visa"))
            paymentProcessor = new VisaPaymentProcessor();
        else
            paymentProcessor = new PayPalPaymentProcessor();

        paymentProcessor.getClass();

        // process paymnet -> createPaymentMethod() -> VisaPaymentMethod -> charge() Visa
        paymentProcessor.processPayment(1, 100);

    }
}
