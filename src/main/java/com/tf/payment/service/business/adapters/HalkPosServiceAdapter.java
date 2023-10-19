package com.tf.payment.service.business.adapters;

import com.tf.payment.service.business.abstracts.PosService;

public class HalkPosServiceAdapter implements PosService {
    @Override
    public boolean pay() {
        HalkPosService halkPosService=new HalkPosService();
        return halkPosService.processPayment();

    }
}
