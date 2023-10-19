package com.tf.payment.service.business.abstracts;

public interface PaymentService {
    PaymentCreatedResponse  add(CreatePaymentRequest createPaymentRequest);
}
