package com.example.testsjava.payments;

public interface PaymentGateway {
    PaymentResponse requestPayment(PaymentRequest request);
}
