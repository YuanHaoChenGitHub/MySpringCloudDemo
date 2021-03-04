package com.demo.springcloud.controller;

import DTO.Payment;
import ResultMapUtil.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@RequestMapping("/consumer")
@Slf4j
public class OrderController {

    public static final String PAYMENT_URL = "http://localhost:8001";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/payment/get/{id}")
    public R  get(@PathVariable Long id){
        String url = PAYMENT_URL+"/payment/selectOne/"+id;

        System.out.println(url);


       return R.ok(restTemplate.getForObject(url,R.class));
    }
}
