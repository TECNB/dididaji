package com.TEC.dididaji.service.impl;

import com.TEC.dididaji.entity.User;
import com.TEC.dididaji.mapper.UserMapper;
import com.TEC.dididaji.service.SetmealService;
import com.TEC.dididaji.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class UserServicelmpl extends ServiceImpl<UserMapper, User> implements UserService {
}
