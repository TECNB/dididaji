package com.TEC.dididaji.service;

import com.TEC.dididaji.entity.Orders;
import com.baomidou.mybatisplus.extension.service.IService;

public interface OrderService extends IService<Orders> {
    public void submit(Orders orders);
}
