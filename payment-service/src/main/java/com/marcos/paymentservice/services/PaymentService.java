package com.marcos.paymentservice.services;

import com.marcos.paymentservice.model.Payment;

public interface PaymentService {

    void sendPayment(Payment payment);
}
