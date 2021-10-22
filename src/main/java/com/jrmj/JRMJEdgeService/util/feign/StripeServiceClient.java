package com.jrmj.JRMJEdgeService.util.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "stripe-service", url = "https://jrmj-stripe-service.herokuapp.com/")
public interface StripeServiceClient {

    @PostMapping("/charge")
    public Object chargeCard(@RequestHeader(value="token") String token, @RequestHeader(value="amount") Double amount);
}
