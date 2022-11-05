package com.TEC.dididaji.service.impl;

import com.TEC.dididaji.entity.ShoppingCart;
import com.TEC.dididaji.mapper.ShoppingCartMapper;
import com.TEC.dididaji.service.ShoppingcartService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartServicelmpl extends ServiceImpl<ShoppingCartMapper,ShoppingCart> implements ShoppingcartService {
}
