package com.payment.demo.controller;


import com.payment.demo.util.ResultBody;
import com.solo.springcloud.commons.entities.User;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @ClassName $ {NAME}
 * @Author $ {USER}
 **/

@RestController
public class OrderController {

    public static final String PAYMENT_URL="http://127.0.0.1:8080";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/comsumer/createuser")
    public ResultBody create(User user) {
        return restTemplate.postForObject(PAYMENT_URL + "/api/user",user,ResultBody.class);
    }

    @RequestMapping(value = "/crm/api/user/{id}", method = RequestMethod.GET)
    @GetMapping("/crm/api/user/{id}")
    public ResultBody findOneUser(@PathVariable("id") Long id) {
        return restTemplate.getForObject(PAYMENT_URL + "/crm/api/user/"+id,ResultBody.class);
    }
}
