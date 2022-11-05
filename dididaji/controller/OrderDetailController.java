package com.TEC.dididaji.controller;

import com.TEC.dididaji.service.OrderDetailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/OrderDetail")
public class OrderDetailController {

    @Autowired
    private OrderDetailService orderDetailService;
}
