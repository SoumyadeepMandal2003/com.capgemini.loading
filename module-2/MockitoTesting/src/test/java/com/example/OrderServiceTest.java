package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class OrderServiceTest {

    @Mock
    PaymentService paymentService;

    @Mock
    InventoryService inventoryService;

    @InjectMocks
    OrderService orderService;

    @BeforeEach
    void setup() {
        MockitoAnnotations.openMocks(this);
    }


    @Test
    void testOrderSuccess() {
        when(inventoryService.checkStock("P101")).thenReturn(true);
        when(paymentService.processPayment(500)).thenReturn(true);

        String result = orderService.placeOrder("P101", 500);

        assertEquals("Order Successful", result);
    }


    @Test
    void testOutOfStock() {
        when(inventoryService.checkStock("P102")).thenReturn(false);

        String result = orderService.placeOrder("P102", 500);

        assertEquals("Out of Stock", result);
    }


    @Test
    void testPaymentFailed() {
        when(inventoryService.checkStock("P103")).thenReturn(true);
        when(paymentService.processPayment(500)).thenReturn(false);

        String result = orderService.placeOrder("P103", 500);

        assertEquals("Payment Failed", result);
    }


    @Test
    void testPaymentException() {
        when(inventoryService.checkStock("P104")).thenReturn(true);
        when(paymentService.processPayment(500))
                .thenThrow(new RuntimeException("Payment error"));

        assertThrows(RuntimeException.class, () ->
                orderService.placeOrder("P104", 500));
    }


    @Test
    void testVerifyPaymentCalledOnce() {
        when(inventoryService.checkStock("P105")).thenReturn(true);
        when(paymentService.processPayment(500)).thenReturn(true);

        orderService.placeOrder("P105", 500);

        verify(paymentService, times(1)).processPayment(500);
    }


    @Test
    void testPaymentNotCalledWhenOutOfStock() {
        when(inventoryService.checkStock("P106")).thenReturn(false);

        orderService.placeOrder("P106", 500);

        verify(paymentService, never()).processPayment(anyDouble());
    }


    @Test
    void testDifferentProductIds() {
        when(inventoryService.checkStock("P201")).thenReturn(true);
        when(paymentService.processPayment(300)).thenReturn(true);

        String result = orderService.placeOrder("P201", 300);

        assertEquals("Order Successful", result);
    }


    @Test
    void testNegativeAmount() {
        String result = orderService.placeOrder("P301", -100);

        assertEquals("Invalid Amount", result);
    }
}
