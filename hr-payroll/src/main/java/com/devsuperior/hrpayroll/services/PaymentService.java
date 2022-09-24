package com.devsuperior.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.devsuperior.hrpayroll.entities.Payment;
import com.devsuperior.hrpayroll.entities.Worker;
import com.devsuperior.hrpayroll.feignclients.WorkerFeignCliente;
@Service
public class PaymentService {
    
    @Autowired
    private WorkerFeignCliente workerFeignClient;

    public Payment getPayment(long workerId, int days){

        Worker worker = workerFeignClient.fingById(workerId).getBody();
        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    } 
}



