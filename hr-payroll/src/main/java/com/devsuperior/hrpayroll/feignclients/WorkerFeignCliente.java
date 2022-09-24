package com.devsuperior.hrpayroll.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.devsuperior.hrpayroll.entities.Worker;

@Component
@FeignClient(name = "hr-worker", path = "/workers")
public interface WorkerFeignCliente {

    @GetMapping(value = "/{id}")
    ResponseEntity<Worker> fingById(@PathVariable long id);  
}
