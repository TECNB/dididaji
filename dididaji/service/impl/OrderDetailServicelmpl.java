package com.TEC.dididaji.service.impl;

import com.TEC.dididaji.entity.OrderDetail;
import com.TEC.dididaji.mapper.OrderDetailMapper;
import com.TEC.dididaji.service.OrderDetailService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailServicelmpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService {
}
