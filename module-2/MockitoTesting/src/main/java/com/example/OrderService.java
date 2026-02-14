package com.example;

public class OrderService {

    private PaymentService paymentService;
    private InventoryService inventoryService;

    public OrderService(PaymentService paymentService,
                        InventoryService inventoryService) {
        this.paymentService = paymentService;
        this.inventoryService = inventoryService;
    }

    public String placeOrder(String productId, double amount) {

        if (amount <= 0) {
            return "Invalid Amount";
        }

        boolean inStock = inventoryService.checkStock(productId);

        if (!inStock) {
            return "Out of Stock";
        }

        boolean paymentStatus = paymentService.processPayment(amount);

        if (paymentStatus) {
            return "Order Successful";
        } else {
            return "Payment Failed";
        }
    }
}
