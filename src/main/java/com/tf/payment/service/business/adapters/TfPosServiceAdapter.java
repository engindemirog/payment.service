package com.tf.payment.service.business.adapters;

import com.tf.payment.service.business.abstracts.PosService;
import com.tf.payment.service.business.outServices.TfPosService;

public class TfPosServiceAdapter implements PosService {
    @Override
    public boolean pay() {
        TfPosService tfPosService=new TfPosService();
        return tfPosService.makePayment();
    }
}
