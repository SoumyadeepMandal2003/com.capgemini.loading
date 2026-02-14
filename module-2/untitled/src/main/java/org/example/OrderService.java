package org.example;

public class OrderService {
    private PaymentService paymentService;

    //Constructor Injection
    public OrderService(PaymentService paymentService){
        this.paymentService = paymentService;
    }

    //method to test
    public String placeOrder(double amount){
        System.out.println("[OrderService] Placing order...");

        boolean paymentSuccess = paymentService.processPayment(amount);

        if(paymentSuccess){
            return "Order Placed";
        }
        return "Payment Failed";
    }
}
