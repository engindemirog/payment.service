package com.tf.payment.service.business.adapters;

import com.tf.payment.service.business.abstracts.PosService;
import com.tf.payment.service.business.outServices.HalkPosService;

public class HalkPosServiceAdapter implements PosService {
    @Override
    public boolean pay() {
        HalkPosService halkPosService=new HalkPosService();
        return halkPosService.processPayment();

    }
}
